class Solution {
    public char nonRepeatingChar(String s) {
        int [] freq = new int[256];
        for(int i =0;i<=s.length()-1;i++) {
            freq[s.charAt(i)]++;
        }
         for(int i =0;i<=s.length()-1;i++) {
             if(freq[s.charAt(i)]==1) return s.charAt(i);
             
         }
         return '$';
         
         
         
        
        
        
     
        
        
       
        
    }
}
