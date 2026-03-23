int* grayCode(int n, int* returnSize) {
    int size=(1<<n);
    *returnSize = size;
    int* a = (int*)malloc(size * sizeof(int));

    for(int i=0;i<size;i++){
         int gray = i ^ (i >> 1);
         a[i]=gray;

    }
    return a;
}