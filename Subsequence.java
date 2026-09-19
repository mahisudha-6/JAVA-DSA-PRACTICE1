import java.util.*;
class Subsequence{
    public static boolean isSubsequence(int[] main,int[] subseq){
        int j=0;
        for(int i=0;i<main.length;i++){
            if(j<subseq.length && main[i]==subseq[j]){
                j++;
            }
        }
        return j==subseq.length;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] main = new int[n];
        for(int i=0;i<main.length;i++){
            main[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] subseq = new int[m];
        for(int i=0;i<subseq.length;i++){
            subseq[i] = sc.nextInt();
        }
        System.out.println(isSubsequence(main, subseq));
    }
}