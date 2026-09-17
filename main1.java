import java.util.*;
public class main1{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int target= sc.nextInt();
        int result= arr[0];
        int mindiff=Math.abs(arr[0]-target);
        int diff=0;
        for(int i=1;i<n;i++){
             diff=Math.abs(arr[i]-target);
            if(diff<mindiff){
                mindiff=diff;
                result=arr[i];
            }
       if (mindiff == diff) {
           if(arr[i]>result){
               result=arr[i];
           }
        }
        }
        System.out.println(result);
    }
}