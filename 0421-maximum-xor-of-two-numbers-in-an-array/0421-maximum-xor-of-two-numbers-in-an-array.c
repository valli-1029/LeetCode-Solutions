// int findMaximumXOR(int* nums, int numsSize){
//     int sum=0;
//     for(int i=0;i<numsSize;i++){
//         for(int j=i+1;j<numsSize;j++){
//             if((nums[i]^nums[j])>sum){
//                 sum=nums[i]^nums[j];
//             }
//         }
//     }
//     return sum;

// }
#define MAX_BITS 32
#define MAX_NODES 320001 * MAX_BITS  // ~10M nodes safe for n=2e4

typedef struct TrieNode {
    struct TrieNode* children[2];
} TrieNode;

TrieNode* trie_new() {
    TrieNode* node = malloc(sizeof(TrieNode));
    node->children[0] = node->children[1] = NULL;
    return node;
}

void insert(TrieNode* root, int num) {
    TrieNode* node = root;
    for (int i = MAX_BITS - 1; i >= 0; i--) {
        int bit = (num >> i) & 1;
        if (!node->children[bit]) {
            node->children[bit] = trie_new();
        }
        node = node->children[bit];
    }
}

int query_max_xor(TrieNode* root, int num) {
    TrieNode* node = root;
    int max_xor = 0;
    for (int i = MAX_BITS - 1; i >= 0; i--) {
        int bit = (num >> i) & 1;
        int opp = 1 - bit;
        if (node->children[opp]) {
            max_xor |= (1 << i);
            node = node->children[opp];
        } else if (node->children[bit]) {
            node = node->children[bit];
        } else {
            return 0;  // Should not happen
        }
    }
    return max_xor;
}

int findMaximumXOR(int* nums, int numsSize) {
    TrieNode* root = trie_new();
    int max_xor = 0;
    for (int i = 0; i < numsSize; i++) {
        int curr = query_max_xor(root, nums[i]);
        if (curr > max_xor) max_xor = curr;
        insert(root, nums[i]);
    }
    // Free trie memory if needed (omitted for brevity)
    return max_xor;
}
