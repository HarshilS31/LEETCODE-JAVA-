class Solution {
    public int singleNonDuplicate(int[] arr) {
        if(arr.length==1) return arr[0];
        else if(arr[0]!=arr[1]) return arr[0];
        if(arr[arr.length-1]!=arr[arr.length-2]) return arr[arr.length-1];
        int lo=0,hi=arr.length-1,p=0,d=0;
        while(hi>=lo) {
            int m=lo+(hi-lo)/2,f=0,s=0;
            if (arr[m]!=arr[m+1] && arr[m]!=arr[m-1]) return arr[m];
            if(arr[m-1]==arr[m])  {
                 f=m-1;
                 s=m;
            }
               
            else {
                f=m;
                s=m+1;
            }
            int dleft=f-lo;
            int dright=hi-s;
            if(dleft%2==0) lo=s+1;
            else  hi=f-1;
            
            }
        return -1;

        }
    }
