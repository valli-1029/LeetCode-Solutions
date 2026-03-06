int mySqrt(int x) {
    if (x==1|| x==0) return x;
    int low=1, high=x, res=0;
    long long mid;

    while(low<=high){
        mid = low+(high-low)/2;
        if(mid*mid==x){
            return mid;
        }
        else if(mid*mid<x){
            res=mid;
            low=mid+1;
        }
        else {
            high=mid-1;
        }

    }
    return res;

}