class Solution {
    boolean checkPrime(int n){
        if(n < 2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        int c=0;
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
            }

        int arr[]= new int[max+1];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        boolean flag=false;

        for(int i =0;i<=max;i++){
            if(arr[i]>0 && checkPrime(arr[i])){
                return true;
            }
        }
        return flag;
    }
}