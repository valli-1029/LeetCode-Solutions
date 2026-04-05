/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
 void backtrack(char *current, int pos, int open, int close, int n,
               char **result, int *returnSize) {
    
    if (pos == 2 * n) {
        current[pos] = '\0';
        result[*returnSize] = strdup(current);
        (*returnSize)++;
        return;
    }
    if (open < n) {
        current[pos] = '(';
        backtrack(current, pos + 1, open + 1, close, n, result, returnSize);
    }
    if (close < open) {
        current[pos] = ')';
        backtrack(current, pos + 1, open, close + 1, n, result, returnSize);
    }
}
char** generateParenthesis(int n, int* returnSize) {
    char **result = (char**)malloc(10000 * sizeof(char*));
    char *current = (char*)malloc((2 * n + 1) * sizeof(char));
    *returnSize = 0;
    backtrack(current, 0, 0, 0, n, result, returnSize);

    return result;
}