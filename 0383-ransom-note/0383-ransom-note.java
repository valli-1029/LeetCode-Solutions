class Solution {
    public boolean canConstruct(String ran, String magazine) {
       HashMap<String, Integer> h = new HashMap<>();
       int []c=new int[150];
        for(char x: magazine.toCharArray()){
            ++c[x];
        }

        for(char x: ran.toCharArray()){
            if(--c[x]<0){
                return false;
            }
        }
        return true;

    }
}