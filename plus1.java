public class plus1{
    public static int[] plusOne(int[] digits) {
        for(int i = digits.length-1 ; i>=0 ; i--){
            if(digits[i] + 1 != 10 ){ 
                 digits[i] = digits[i]+ 1 ; 
                 return digits ; 
            }
            digits[i] = 0 ; 
        }
        int [] newDigits = new int [digits.length+1] ; 
        newDigits[0] = 1 ; 
        return newDigits ; 
    }
    // public static int[] zerocase(int[] arr){
    //     if((arr[0]+1)>=10){
    //         System.out.println("in if");
    //         int[] res=new int[arr.length+1];
    //         res[0]=1;
    //         arr[0]++;
    //         res[1]=(arr[0])%10;
    //         for(int i=2;i<=res.length-1;i++){
    //             res[i]=arr[i-1];
    //         }
    //         return res;
    //     }
    //     arr[0]++;
    //     return  arr; 
    // }
    // public static int[] plusOne(int arr[]){
    //     int carry=1;
    //     int i=arr.length-1;
    //     System.out.println(i);
    //     while(carry!=0){
    //         if(i==0){
    //             int[] res=zerocase(arr);
    //             return res;
    //         }
    //         arr[i]+=carry;
    //         if(arr[i]>=10){
    //             arr[i]=arr[i]%10;
    //             carry =1;
    //         }
    //         else{
    //         carry =0;
    //         break;
    //     }
    //         i--; 
    //     }
    //     return arr;
    // }
    public static void main(String args[]){
        int[] arr={8,9,9,9};
        int res[]=plusOne(arr);
        for(int i=0;i<res.length;i++){
            System.out.print( " "+res[i]);
        }

    }
}