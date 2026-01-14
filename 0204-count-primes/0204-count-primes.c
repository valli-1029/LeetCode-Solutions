int countPrimes(int n){
    if(n<=2) return 0;

    int odds=(n+1)/2;
    int prime[odds];
    for(int i=0;i<odds;i++){
        prime[i]=1;
    }
for (int i=3; i*i<n; i+=2) {
        if (prime[i/2]) {
            for (int j=i*i;j<n;j+=2*i) {
                prime[j/2]=0;
            }
        }
    }

    int count=1;
    for (int i=3;i<n;i+=2) {
        if (prime[i/2]) count++;
    }

    return count;
}