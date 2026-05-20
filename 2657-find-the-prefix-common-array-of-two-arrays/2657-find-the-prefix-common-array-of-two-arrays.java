class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int C[] = new int[A.length];
        
        int x=0;

        while (x< A.length) {
            int c=0;
            for (int i=0; i<=x;i++) {
                for (int j=0; j<=x;j++) {
                    if (A[i]==B[j]) {
                        c++;
                    }
                }
            }

            C[x] = c;
            x++;
        }

        return C;
    }
}