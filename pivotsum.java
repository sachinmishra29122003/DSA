public class pivotsum {
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public static int findPivotIndex(int[] arr) {
        int totalSum = 0, leftSum = 0;
    
        // Calculate total sum
        for (int num : arr) {
            totalSum += num;
        }
    
        // Iterate to find the pivot index
        for (int i = 0; i < arr.length; i++) {
            // Right sum = totalSum - leftSum - arr[i]
            if (leftSum == totalSum - leftSum - arr[i]) {
                return i;  // Pivot index found
            }
            leftSum += arr[i];  // Update left sum
        }
    
        return -1;  // Return -1 if no pivot index found
    }
    public static int pivotIndex(int[] arr){
        int[] leftSum=new int[arr.length];
        int[] rightSum=new int[arr.length];
        // int pivot=-1;
        leftSum[0]=arr[0];
        rightSum[arr.length-1]=arr[arr.length-1];
        for(int i=1;i<arr.length;i++){
            leftSum[i]=leftSum[i-1]+arr[i];
        }
        for(int i=arr.length-2;i>=0;i--){
            rightSum[i]=rightSum[i+1]+arr[i];
        }
        int n=arr.length;
        // print(rightSum);
        // print(leftSum);
        for(int i=0;i<arr.length;i++){
            int left = (i == 0) ? 0 : leftSum[i - 1];
            int right = (i == n - 1) ? 0 : rightSum[i + 1];
            if(left==right){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] arr={1,2,3};
        int res =pivotIndex(arr);
        System.out.println(res);
    }
}
