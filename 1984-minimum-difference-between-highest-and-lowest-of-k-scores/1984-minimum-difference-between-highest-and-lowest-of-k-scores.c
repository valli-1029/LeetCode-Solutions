#include <limits.h>
int compare(const void *a,const void *b){
    return (*(int*)a - *(int*)b);
}
int minimumDifference(int* nums, int numsSize, int k) {
    qsort(nums,numsSize,sizeof(int),compare);

    int min=INT_MAX,diff;

    for(int i=0;i+k-1<numsSize;i++){
        diff=nums[i+k-1]-nums[i];

        if(diff<min){
            min=diff;
        }
    }
    return min;
}