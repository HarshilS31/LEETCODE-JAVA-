class Solution {
    public int findDuplicate(int[] arr) {
        Arrays.sort(arr);
        int i=0,j=1;
        while(i<=j) {
            if(arr[i++]==arr[j++]) return arr[i];
        
        }
        return -1;

       
        
    }
}