public class LC14 {

    // class Solution {
    //     public String longestCommonPrefix(String[] strs) {
    //         if(strs == null || strs.length == 0){
    //             return "";
    //         }
            
    //         int length = strs[0].length();
    //         for (int i = 0; i < length; i++){
    //             char ch = strs[0].charAt(i);
    //             for (int j = 1; j < strs.length; j++){
    //                 if (ch != strs[j].charAt(i) || i >= strs[j].length()){
    //                     return strs[0].substring(0,i);
    //                 }
    //             }
    //         }
    //         return strs[0];
    //     }
    // }
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if(strs.length==0)
                return "";
            String s =strs[0];
            if(strs.length==1)
                return strs[0];      
            for(int i=1;i<strs.length;i++){
                if(!strs[i].startsWith(s)){
                    s =s.substring(0,s.length()-1);
                    i--;
                }
            }
              return s;  
        }
    }
}
