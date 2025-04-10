public class RotateanArray {
        public static void print(int[] arr){
          for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
          }
        }
        public static void rotate(int[] arr,int d){
          if(d>arr.length){
            d=d%arr.length;
          }
          int temp[]=new int[d];
          // adding in new array
          for(int i=0;i<d;i++){
            temp[i]=arr[i];
          }
          // shift
          int start=0;
          for(int i=d;i<arr.length;i++){
            arr[start]=arr[i];
            start++;
          }
          // reputing value of arr
          for(int i=0;i<temp.length;i++){
            arr[start]=temp[i];
            start++;
          }
          print(arr);
        }
        public static void main(String args[]){
          int[] arr={-1,-100,3,99};
          rotate(arr, 2);
        }
      
}
