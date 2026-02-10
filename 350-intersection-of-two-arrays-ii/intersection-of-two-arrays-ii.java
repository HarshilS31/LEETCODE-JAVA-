class Solution {
    public int[] intersect(int[] arr1, int[] arr2) {
       
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int i = 0, j = 0, k = 0;
        
        
        int[] temp = new int[Math.min(arr1.length, arr2.length)];
        
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                temp[k++] = arr1[i];  
                i++;
                j++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                i++;
            }
        }
        
        
        int[] result = new int[k];
        for (int idx = 0; idx < k; idx++) {
            result[idx] = temp[idx];
        }
        
        return result;
        
       
    } 
}