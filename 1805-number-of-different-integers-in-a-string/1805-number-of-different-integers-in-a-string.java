class Solution {
    public int numDifferentIntegers(String word) {
        String s="";
        int i=0,n=word.length();
        HashSet<String> h=new HashSet<>();
        while(i<n){
            char c=word.charAt(i);
            if(Character.isDigit(c)){
                s+=c;
            }
            else {
                if(!s.isEmpty()){
                    int j=0;
                    while(j<s.length()-1&&s.charAt(j)=='0'){
                        j++;
                    }
                    h.add(s.substring(j));
                    s="";
                }
            }
            i++;
        }
        if(!s.isEmpty()){
            int j=0;
            while(j<s.length()-1&&s.charAt(j)=='0'){
                j++;
            }
            h.add(s.substring(j));
        }
        return h.size();
    }
}