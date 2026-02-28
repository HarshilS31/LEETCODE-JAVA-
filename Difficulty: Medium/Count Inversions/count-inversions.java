class Solution {
    static int inversionCount(int arr[]) {
        return mergesort(arr);
    }

    public static int mergesort(int []arr) {
        int n = arr.length;
        if (n == 1) return 0;
        
        int []a = new int[n/2];
        int []b = new int[n-n/2];
        int idx = 0;
        
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[idx++];
        }
        for(int j = 0; j < b.length; j++) {
            b[j] = arr[idx++];
        }
        
        int leftCount = mergesort(a);
        int rightCount = mergesort(b);
        int mergeCount = helper(a, b, arr);
        
        return leftCount + rightCount + mergeCount;
    }

    public static int helper(int []a, int []b, int []c) {
        int count = 0;
        int i = 0, j = 0, k = 0;
        
        while(i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                count += a.length - i;
                c[k++] = b[j++];
            }
        }
        
        while(i < a.length) {
            c[k++] = a[i++];
        }
        while(j < b.length) {
            c[k++] = b[j++];
        }
        
        return count;
    }
}