public class LonggestCommonPrefix14 {
    public static StringBuilder commonPrefix(String str[]){
        StringBuilder ans=new StringBuilder("");
        int smallest=0;
        int i;
        for( i=0;i<str.length-1;i++){
            if(str[i].length()<str[i+1].length()){
                smallest=i;
            }
            else{
                smallest=i+1;
            }
        }
        int index=0;
        for( i=0;i<str.length;i++){
            for(int j=0;j<str[i].length();j++){
                if(str[smallest].charAt(index)!=str[i].charAt(j)){
                    break;
                }
                if(str[smallest].charAt(i)==str[i].charAt(j) ){
                    ans.insert(index,str[smallest].charAt(j));
                    index++;
                }
            }
        }
        System.out.println(smallest);
        return ans;
    }
    public static void main(String args[]){
        String arr[]={"flower","flow","flight"};
        // String arr[]={"dog","racecar","car"};
        System.out.println(commonPrefix(arr));

        
    }
}
