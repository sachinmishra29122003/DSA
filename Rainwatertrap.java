import java.lang.Math;
public class Rainwatertrap{
    public static int waterTrap(int[] arr){
        // store maximum left boundary
        int leftBuild[]=new int[arr.length];
        // store maximum right boundary
        int rightBuild[]=new int[arr.length];
        int waterTrap=0;
        leftBuild[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            leftBuild[i]=Math.max(arr[i], leftBuild[i-1]);
        }
        rightBuild[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rightBuild[i]=Math.max(arr[i], rightBuild[i+1]);
        }
        for(int i=0;i<arr.length;i++){
            waterTrap+=(Math.min(leftBuild[i],rightBuild[i])-arr[i]);
        }
        return waterTrap;
    }
    public static void main(String args[]){
        int arr[]={4,2,0,3,2,5};
        System.out.println(waterTrap(arr));
    }
}