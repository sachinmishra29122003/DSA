public class Roman_to_int {
    // Needs improvement of hash map
    public static int romanToInteger(String str){
        int num=0;
        for(int i=0;i<str.length();i++){
            switch( str.charAt(i)){
                case'I':
                    num+=1;
                    break;
                case'V':
                    num+=5;
                    break;
                case'X':
                    num+=10;
                    break;
                case'L':
                    num+=50;
                    break;
                case'C':
                    num+=100;
                    break;
                case'D':
                    num+=500;
                    break;
                case'M':
                    num+=1000;
                    break;
                default:
                    continue;
            }
        }
        return num;
    }
    public static void main(String args[]){
        String str="MCMXCIV";
        System.out.println(romanToInteger(str));
    }
}
