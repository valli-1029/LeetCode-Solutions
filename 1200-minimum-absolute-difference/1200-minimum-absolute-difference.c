/**
 * Return an array of arrays of size *returnSize.
 * The sizes of the arrays are returned as *returnColumnSizes array.
 * Note: Both returned array and *columnSizes array must be malloced, assume caller calls free().
 */
#include <limits.h>
int compare(const void*a, const void*b){
    return (*(int*)a-*(int*)b);
}
int** minimumAbsDifference(int* arr, int arrSize, int* returnSize, int** returnColumnSizes) {
    qsort(arr,arrSize,sizeof(int),compare);

    int min=INT_MAX;
    for(int i=1;i<arrSize;i++){
        if(min>(arr[i]-arr[i-1])){
            min=(arr[i]-arr[i-1]);
        }
    }

    int c=0;
    for(int i=1;i<arrSize;i++){
        if((arr[i]-arr[i-1])==min){
            c++;
        }
    }

    int **result=(int **)malloc(c *sizeof(int *));
    *returnColumnSizes=(int*)malloc(c * sizeof(int));
    *returnSize=c;
    int idx = 0; 
     for (int i = 1; i < arrSize; i++) { 
        if (arr[i] - arr[i - 1] == min) { 
          result[idx] = (int*)malloc(2 * sizeof(int)); 
          result[idx][0] = arr[i - 1]; 
          result[idx][1] = arr[i]; 
          (*returnColumnSizes)[idx] = 2; 
          idx++; 
        } 
    } 
    return result;
}