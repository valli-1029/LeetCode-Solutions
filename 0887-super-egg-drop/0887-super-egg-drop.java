class Solution {
    public int superEggDrop(int k, int n) {
        int a[]=new int[k+1];
        int m=0;
        while(a[k]<n){
            m++;
            for(int i=k;i>=1;i--){
                a[i]=a[i]+a[i-1]+1;
            }
        }
        return m;
    }
}