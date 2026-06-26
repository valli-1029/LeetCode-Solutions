class Solution {
    public int lengthOfLongestSubstring(String s) {
        String res1="";
        String res2="";
        for(int i=0;i<s.length();i++){
            res1="";
            for(int j=i;j<s.length();j++){
                if(res1.contains(""+s.charAt(j))){
                    break;
                }
                else{
                    res1=res1+s.charAt(j);
                }
                if (res1.length() > res2.length()) {
                res2 = res1;
            }
            }
        }
        return res2.length();
    }
}