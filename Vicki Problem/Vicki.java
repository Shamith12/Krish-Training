
import java.util.*;

public class Vicki{

public static void main(String[] args) {
        
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the Frog Jump Distance");
       
       int distance = in .nextInt();
       System.out.println("Wait time "+jump(distance)+"s");
    }
    
    public static int jump(int length){

    int step = 0;
    int wait = 0;
    int[] jumpLen = {5,3,1};
    int[] waitTime = {1,2,3};

    while(true){
        length -= jumpLen[step%3];
        if(length <=0){
            return wait;        
        }
        wait += waitTime[step%3];
        step++;
    }
    }

}

