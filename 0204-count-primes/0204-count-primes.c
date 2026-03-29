int countPrimes(int n){
    if(n <= 2) return 0;

    int *prime = (int*)malloc(n * sizeof(int));

    for(int i = 0; i < n; i++)
        prime[i] = 1;

    prime[0] = prime[1] = 0;

    for(int i = 2; i * i < n; i++){
        if(prime[i]){
            for(int j = i * i; j < n; j += i){
                prime[j] = 0;
            }
        }
    }

    int count = 0;
    for(int i = 3; i < n; i += 2){ 
        if(prime[i]) count++;
    }

    return count + 1;
}