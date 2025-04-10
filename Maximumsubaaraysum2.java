public class Maximumsubaaraysum2{
    // bruteforce
    // public static void printSubarrays(int[] numbers){
    //   int max_sum=Integer.MIN_VALUE;
    //   int min_sum=Integer.MAX_VALUE;
    //   for(int i=0;i<numbers.length;i++){
    //     for(int j=i;j<numbers.length;j++){
    //       int sum=0;
    //       for(int k=i;k<=j;k++){
    //         sum=sum+numbers[k];
    //       }
    //       if(max_sum<sum){
    //         max_sum=sum;
    //       }
    //       if(min_sum>sum){
    //         min_sum=sum;
    //       }
    //     }
    //   }
    //   System.out.println("Max Sum is : "+max_sum+"   Min sum is : "+min_sum);
  
    // }
    // prefix array sum
    // public static void printSubarraySum(int arr[]){
    //   int max_sum=Integer.MIN_VALUE;
    //   int prefix[]=new int[arr.length];
    //   prefix[0]=arr[0];
    //   for(int i=1;i<arr.length;i++){
    //     prefix[i]=prefix[i-1]+arr[i];
    //   }
    //   for(int i=0;i<arr.length;i++){
    //     for(int j=i;j<arr.length;j++){
    //       int sum=0;
    //       sum=i==0?prefix[j]:prefix[j]-prefix[i-1];
    //       if(max_sum<sum){
    //         max_sum=sum;
    //       }
    //     }
    //   }
    //   System.out.println(max_sum);
    // }
  
    // kadanes algorithm
    public static void printSubarraySum(int[] arr){
      int curr=0;
      int max=Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++){
        if(curr<0){
          curr=0;
        }
        curr+=arr[i];
        if(max<curr){
          max=curr;
        }
      }
      System.out.println(max);
    }
    public static void main(String args[]){
      // int[] numbers ={1,-2,6,-1,3};
      int[] numbers ={2,4,6,8,10};
      printSubarraySum(numbers);
    }
  }