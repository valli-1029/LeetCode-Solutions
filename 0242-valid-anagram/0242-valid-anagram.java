class Solution {
    public boolean isAnagram(String s, String t) {
    int []c=new int[150];
    if (s.length() != t.length()) return false;
    for(char x:s.toCharArray()){
           ++c[x];
    }
    for(char x:t.toCharArray()){
           if(--c[x]<0){
            return false;
           }
    }
    return true;
    
    }
}