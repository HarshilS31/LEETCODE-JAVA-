class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        for (int i =0;i<=arr.length-1;i++) {
            for (int j =0;j<=arr[0].length-1;j++) {
                if (arr[i][j]==target) {
                    return true;
                }
                             
            }
            
        }
        return false;

        
    }
}