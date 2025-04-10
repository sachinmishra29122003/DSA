public class RotateAnArray2 {
    public static void reverseSubArray(int[] arr,int start,int end){
        int j=end;
        int i=start;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        
    }
    public  static void rotate(int[] nums,int k){
        // reverse whole array
         k=k%nums.length;// for k>nums.length
        reverseSubArray(nums, 0, nums.length-1);
        // reverse array till k-1
        reverseSubArray(nums, 0, k-1);
        // reverse array till k-1to end
        reverseSubArray(nums, k, nums.length-1);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String args[]){
        int[] arr={-1,-100,3,99};
        rotate(arr,2);
    }
}
