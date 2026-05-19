class Solution {
    boolean checkPrime(int n){
        if (n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public long splitArray(int[] nums) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(checkPrime(i)){
                a.add(nums[i]);
            }
            else{
                b.add(nums[i]);
            }
        }

        long suma=0, sumb=0;
        for(int i:a){
            suma+=i;
        }
         for(int i:b){
            sumb+=i;
        }
        return Math.abs(suma-sumb);
    }
}