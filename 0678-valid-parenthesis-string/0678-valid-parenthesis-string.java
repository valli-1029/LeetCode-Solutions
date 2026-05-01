// class Solution {
//     public boolean checkValidString(String s) {
//         int flag=0;
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)=='('){
//                  flag=0;
//                 for(int j=i+1;j<s.length();j++){
//                   if(s.charAt(j)==')' || s.charAt(j)=='*'){
//                     flag=1;
//                     break;
//                    }
//                 }
//                 if (flag==0){
//                     return false;
//                 }
//             }
//         }
//         return flag==1;
//     }
// }
class Solution {
    public boolean checkValidString(String s) {
        int low = 0;
        int high = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                low++;
                high++;
            }
            else if (ch == ')') {
                low--;
                high--;
            }
            else {
                low--;
                high++;
            }

            if (high < 0) {
                return false;
            }

            if (low < 0) {
                low = 0;
            }
        }

        return low == 0;
    }
}