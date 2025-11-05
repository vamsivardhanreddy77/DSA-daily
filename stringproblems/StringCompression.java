package stringproblems;
import java.util.*;
public class StringCompression {
    public static String StrComp(String str){
        StringBuilder st=new StringBuilder();
        int count=1;
        for(int i=0;i<str.length();i++){
            if(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
                count++;

            }else{
                st.append(str.charAt(i));
                if(count>1){
                    st.append(count);
                }
                count=1;
            }
        }
        return st.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String res=StrComp(str);
        System.out.println(res);
    }
    
}
