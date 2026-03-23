char* getPermutation(int n, int k) {
    int fact=1;
    for(int i=1;i<n;i++) fact=fact*i;

    int *num =(int *)malloc (n* sizeof(int));
    for(int i=0;i<n;i++) num[i]=i+1;

    char *res=(char * )malloc((n+1) * sizeof(char));
    res[n]='\0';
    k--;

    for (int i=0;i<n;i++) {
        int index=k/fact;
        res[i]=num[index]+'0';
        for (int j=index;j<n-i-1;j++) {
            num[j] = num[j + 1];
        }
        k%=fact;

        if (n-i-1>0)
            fact/=(n-i-1);
    }
    free(num);
    return res;
}