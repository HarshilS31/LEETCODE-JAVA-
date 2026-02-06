import java.util.ArrayList;

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        int lo = 0, hi = n - 1;
        int first = -1, last = -1;
        
        
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (x < arr[mid]) {
                hi = mid - 1;
            } else if (x > arr[mid]) {
                lo = mid + 1;
            } else {
                first = mid;
                hi = mid - 1; 
            }
        }
        
        
        lo = 0;
        hi = n - 1;
        
       
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (x < arr[mid]) {
                hi = mid - 1;
            } else if (x > arr[mid]) {
                lo = mid + 1;
            } else {
                last = mid;
                lo = mid + 1; 
            }
        }
        
        result.add(first);
        result.add(last);
        return result;
    }
}  
       
   
