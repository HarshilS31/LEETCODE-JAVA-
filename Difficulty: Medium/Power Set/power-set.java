class Solution {
    List<String> list = new ArrayList<>();  
    
    public List<String> AllPossibleStrings(String s) {
        helper("", s, 0);
        Collections.sort(list);  
        return list;
    }
    
    public void helper(String ans, String s, int idx) {
        if (idx == s.length()) {
            if (ans.length() > 0) { 
                list.add(ans);
            }
            return;
        }
        
       
        helper(ans + s.charAt(idx), s, idx + 1);  
        
        
        helper(ans, s, idx + 1);  
    }
}