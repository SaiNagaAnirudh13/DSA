class Solution {
    public String removeOuterParentheses(String s) {
        String res = "";
   int count = 0;
   for(int i=0;i<s.length();i++)
   {
       if(s.charAt(i) == '(')
       {
           count++; 
           if(count != 1)   
           {
               res = res + '('; 
           }
       }
       else if(s.charAt(i) == ')')
       {
           count--; 
           if(count != 0)  
           {
               res = res + ')';
           }
       }
   }
    return res;
    }
}