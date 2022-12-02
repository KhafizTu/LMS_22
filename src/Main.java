import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();

        ArrayList<Integer>number1=new ArrayList<>();
        ArrayList<Integer>number2=new ArrayList<>();
        ArrayList<Integer>number3=new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            int ran= random.nextInt(100)+1;
            number1.add(ran);
        if (ran%2==0){
            number2.add(ran);

        }else {
            number3.add(ran);
        }

        }
        System.out.println(number1);
        System.out.println("Жуп сан: "+number2);
        System.out.println("Так сан: "+number3);

    }
}