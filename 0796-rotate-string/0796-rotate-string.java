class Solution {
    public boolean rotateString(String s, String goal) {
        String str = goal+goal;
        if (goal.length() != s.length()){
            return false ;
        } return (str.contains(s));
    }
}