#include <stdlib.h>
int cmp(const void*a,const void*b){
    return(*(int*)a-*(int*)b);
    }
int minPairSum(int* nums, int n){
    qsort(nums,n,sizeof(int),cmp);
    int max=0;
    for (int i=0;i<n/2;i++) {
        int pair=nums[i]+nums[n-1-i];
        if (pair>max) {
            max=pair;
        }
    }
    return max;
}