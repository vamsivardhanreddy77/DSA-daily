package stringproblems;
import java.util.*;
public class ReplaceCharCase  {
    public static String Replace(String str,char cha){
        StringBuilder st=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==cha){
                if(Character.isLowerCase(cha)){
                    st.append(Character.toUpperCase(ch));
                }else st.append(Character.toLowerCase(ch));
            }else st.append(ch);
        }
        return st.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch=sc.next().charAt(0);
        String res=Replace(str,ch);
        System.out.println(res);
    }
    
}
