class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n=arr.length;
        int [] nge = new int[n];
        nge[n-1]=-1;
        Stack<Integer> temp=new Stack<>();
        temp.push(arr[n-1]);
        for(int i=n-2;i>=0;i--) {
            while(temp.size()>0  && arr[i]>=temp.peek()) temp.pop();
            if(temp.size()==0) nge[i]=-1;
            else nge[i]=temp.peek();
            temp.push(arr[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>(n);
        for(int i=0;i<n;i++) {
            ans.add(nge[i]);
            
        }
        return ans;
    }
}