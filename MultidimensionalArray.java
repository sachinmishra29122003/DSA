
public class MultidimensionalArray{
    public static void main(String[] args){
        // Jagged Array 2d array with each column of different size  for every  row 
        int arr[][]={{1,2,3},{1,2,3,4,5},{1,2,3}};
        for(int i=0;i<arr.length;i++){
            
            for(int j=0;j<arr[i].length;j++){
                
                System.out.print(arr[i][j]);
            }System.out.println();
        }
        
        
        
        
        
        // three dimesional array 
        // int arr[][][]={{{1,2,3},{1,2,3},{1,2,3}},{{1,2,3}}};
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         for(int k=0;k<arr[i][j].length;k++){
        //             System.out.print(" "+arr[i][j][k]);
        //         }System.out.println();
        //     }System.out.println();
        //     System.out.println();
        // }
    }
}