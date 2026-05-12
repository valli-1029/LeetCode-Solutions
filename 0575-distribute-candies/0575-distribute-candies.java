class Solution {
    public int distributeCandies(int[] a) {
       HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<a.length;i++){
            h.add(a[i]);
        }
        int max= a.length/2;
        int size= h.size();
        if(size >max){
            return max;
        }
        return h.size();

    }
}