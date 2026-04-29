int gcd(int a, int b) { 
    if (b == 0) return a; 
    return gcd(b, a % b); 
    }

bool isGoodArray(int* nums, int numsSize) {
    int val=nums[0];
    for(int i=1;i<numsSize;i++){
        val=gcd(val,nums[i]);
    }
    return val==1;
}