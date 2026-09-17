import java.util.*;
public class nonrepeatingcharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == ch) {
                    count++;
                }
            }
            if(count == 1) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
        sc.close();
    }
}
