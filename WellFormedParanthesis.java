import java.util.*;
class WellFormedParanthesis{
    public static List<String> generateParenthesis(int n) {
       List<String>result=new ArrayList<>();
       backtrack(result,"",0,0,n);
       return result;
    }
    public  static void backtrack(List<String> result,String current,int open ,int close,int n){
        if(open==n &&close==n){
            result.add(current);
            return;

        }
        if(open<n){
            backtrack(result,current+'(',open+1,close,n);
        }
        if(close<open){
            backtrack(result,current+')',open,close+1,n);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<String> result = generateParenthesis(n);
        System.out.println(result);
    }
}