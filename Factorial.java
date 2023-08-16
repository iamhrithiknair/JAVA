class Factorial implements Runnable{
    int n;
    public Factorial(int n){
        this.n = n;
    }
    public void run(){
        long factorial = 1;
        for(int i=1; i<=n; i++){
            factorial = factorial*i;
        }
        System.out.println("Factorial is: " + factorial);
    }
}