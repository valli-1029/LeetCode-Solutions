class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result=new ArrayList<>();
        String s1="Push", s2="Pop";
        int curr=1;
        for(int i=0;i<target.length;i++){
            while(curr<target[i]){
                result.add(s1);
                result.add(s2);
                curr++;
            }
            result.add(s1);
            curr++;
           
        }
        return result;
    }
}