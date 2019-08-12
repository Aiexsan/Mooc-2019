package fizzbuzz;

import java.util.concurrent.TimeUnit;


public class FizzBuzz {

    public static void main(String[] args) throws InterruptedException {

        int i = 1;
        while (i <= 100) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
            
            i++;
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
