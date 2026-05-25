class Solution {
    public boolean isPalindrome(String s) {
        String t="";
        boolean res=false;
        for(int i=0;i<s.length();i++){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                continue;
            }
            t+=s.charAt(i);
        }
        t = t.toLowerCase();
        String o="";
        for(int i=t.length()-1;i>=0;i--){
            o+=t.charAt(i);
        }
        if(t.equals(o)){
            res=true;
        }
        return res;
    }
}
