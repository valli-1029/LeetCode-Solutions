class Solution {
    public int myAtoi(String s) {
        String newStr=s.trim();

        if(newStr.length()==0){
            return 0;
        }

        int i=0,n=newStr.length();
        int sign=1;
        String res="";

        if(newStr.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if(newStr.charAt(i)=='+'){
            i++;
        }

        while(i<n&&Character.isDigit(newStr.charAt(i))){
            res+=newStr.charAt(i);
            i++;
        }

        if(res.length()==0){
            return 0;
        }

        try{
            return sign*Integer.parseInt(res);
        }
        catch(NumberFormatException e){
            return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
        }
    }
}