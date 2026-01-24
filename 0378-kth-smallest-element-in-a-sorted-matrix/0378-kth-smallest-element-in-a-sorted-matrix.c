#include<stdlib.h>

int cmp(const void*a,const void*b){
    return(*(int*)a-*(int*)b);
}

int kthSmallest(int**matrix,int matrixSize,int*matrixColSize,int k){
    int n=matrixSize;
    int m=matrixColSize[0];
    int a[n*m];
    int x=0;

    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            a[x++]=matrix[i][j];
        }
    }

    qsort(a,x,sizeof(int),cmp);
    return a[k-1];
}
