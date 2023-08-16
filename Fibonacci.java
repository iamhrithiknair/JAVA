class Fibonacci implements Runnable{
    int n;
    public Fibonacci(int n){
        this.n = n;
    }

    public void run(){
        int a=0, b=1, c;
        System.out.println("Fibonacci series upto" + n);
        for(int i=1; i<=n; i++){
            System.out.println(a + "");
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println();
    } 
      
}