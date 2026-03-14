bool isHappy(int n) {
    long long sum=0,rem;
    if(n==1) return true;
    while(n!=1 && n!=4){
        sum=0;
        while(n>0){
            
            rem=n%10;
            sum=sum+(rem*rem);
            n=n/10;
        }
   n=sum;
    }
    if(sum==1) return true;
return false;
}