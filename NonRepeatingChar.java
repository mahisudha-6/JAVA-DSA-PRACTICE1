import java.util.*;
class NonRepeatingChar{
    public static char firstuniquechar(String s){
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch:s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        // for(char ch:s.toCharArray()){ 
        //     if(hm.get(ch)==1){ 
        //         return s.indexOf(ch); 
        //     }
        //  } 
        for(char ch:s.toCharArray()){
            if(hm.get(ch)==1){
                return  ch;
            }
        }
        //  return -1;
        return '-';
     }
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        char result = firstuniquechar(s);
        System.out.println(result);
    }
}