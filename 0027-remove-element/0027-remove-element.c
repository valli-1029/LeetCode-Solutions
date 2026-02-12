#include <stdlib.h>
int removeElement(int* nums, int numsSize, int val) {
    int count=0, m=0;
    int *res=(int *)malloc(numsSize * sizeof(int));

    for(int i=0;i<numsSize;i++){
        if(nums[i]!=val){
            nums[count++]=nums[i];
        }
    }
return count;
}