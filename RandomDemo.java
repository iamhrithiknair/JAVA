public class RandomDemo{
    public static void main(String args[]){
        Thread r = new Thread(new RandomGenerator());
    }
}