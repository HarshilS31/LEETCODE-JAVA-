class Solution {
    static boolean counterpart(char a,char b) {
        if(a=='(' && b==')') return true;
        if(a=='[' && b==']') return true;
        if(a=='{' && b=='}') return true;
        return false;

    }
    public boolean isBalanced(String s) {
        if (s.length()%2!=0) return false;
        Stack<Character> s1= new Stack<>();  
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{') s1.push(ch);
            else {// if ch is the closing bracket
                if(s1.size()==0) return false;
                char top=s1.peek();
                if(counterpart(top,ch)) s1.pop();
                else return false;
            }    
            
        }
        return (s1.size()==0);//if stack is empty then true!
        
  
    }
}
