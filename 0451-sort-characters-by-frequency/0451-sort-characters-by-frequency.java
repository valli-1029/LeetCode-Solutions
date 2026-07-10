class Solution {
    public String frequencySort(String str) {
        String res="";
        int[] frq=new int[128];
        for(int i=0;i<str.length();i++){
            frq[str.charAt(i)]++;
        }
        while(true){
            int max=0;
            int idx=-1;
            for(int i=0;i<128;i++){
                if(frq[i]>max){
                    max=frq[i];
                    idx=i;
                }
            }
            if(idx==-1){
                break;
            }
            for(int i=0;i<max;i++){
                res+=(char)idx;
            }
            frq[idx]=0;
        }
        return res;
    }
}