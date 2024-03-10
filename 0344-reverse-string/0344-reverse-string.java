
class Solution {
    public void reverseString(char[] s) {
      recursion ( s , 0 ,s.length-1);  
    }
    public char[] recursion (char[] arr ,int s, int e){
        if (s>=e){
            return arr;
        }
        char temp =arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        return recursion (arr ,s+1,e-1);
    }
}
    