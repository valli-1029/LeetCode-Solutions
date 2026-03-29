void rotate(int* a, int n, int k) {
    int temp[n];
    k=k%n;

    for(int i=0;i<n;i++) {
        temp[(i+k)%n]=a[i];
    }

    for(int i = 0; i < n; i++) {
        a[i] = temp[i];
    }
    for(int i=0;i<n;i++){
        printf("%d ",a[i]);
    }
}