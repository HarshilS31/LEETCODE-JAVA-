class Solution {
    public int findDuplicate(int[] arr) {
        int i=0;
        int l=arr.length;
        if(l==2) return 1;

        while (i<l) {
            if(arr[i]==i+1) i++;
            else {
                int idx=arr[i]-1;
                if (arr[i]==arr[idx]) return arr[i];
                else swap(arr,i,idx);
                
            }
            

        }
        return -1;     
    }
    public static void swap(int []arr,int i,int idx) {
        int temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
      

        

    }
}