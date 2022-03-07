package NumberOf;
import java.util.*;

public class Occurences {

    static void count(String input){

        HashMap<Character,Integer> map=new HashMap<Character,Integer>();

        int c= 0;

        for(int i=0;i<input.length();i++){
            char key = input.charAt(i);

            for(int j=0;j<input.length();j++){
                if(key == input.charAt(j)){
                    c++;
                }
            }
            map.put(key,c);
            c = 0;
        }
        System.out.print(map);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Word");
        String word = in.next();
        count(word);
    }
}
