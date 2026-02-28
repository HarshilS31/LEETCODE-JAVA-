class Solution {
    int missingNum(int arr[]) {
        Arrays.sort(arr);
        int result=0;
       
        int n=arr.length;
        if (arr[0]!=1) return 1;
        
        for (int i=0;i<n-1;i++) {
            if(arr[i+1]-arr[i]>1) return arr[i]+1;
  
        }
        return arr[n-1]+1;
        
        
        
        
        
    }
}