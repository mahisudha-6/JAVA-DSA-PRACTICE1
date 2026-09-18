import java.util.*;
class ReversetheWordsByPreservingPunctuations{
    public static void reversewords(String s){
        String s1[] =s.split("[^a-zA-Z]+");
        int n=s1.length-1;
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!Character.isLetter(ch)){
                res.append(ch);
            }
            else{
                res.append(s1[n]);
                n--;
                while(i+1<s.length() &&  Character.isLetter(s.charAt(i+1))){
                    i++;
                }
            }
        }
        System.out.println(res);
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
         reversewords(s);
    }
}