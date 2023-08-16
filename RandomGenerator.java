import java.util.Random;

public class RandomGenerator implements Runnable{
    public void run(){
        Random random = new Random();
        while(true){
            int n = random.nextInt(100);
            System.out.println("Generated random integer:" + n);

            if(n%2==0){
                Thread even = new Thread(new Factorial(n));
                even.start();
            }
            else{
                Thread odd = new Thread(new Fibonacci(n));
                odd.start();
            
            }

            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace(); //prints the detailed info of the exception
            }
        }
    }
}