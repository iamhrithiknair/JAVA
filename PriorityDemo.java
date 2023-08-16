class Clicker implements Runnable{
    long click = 0;
    private volatile boolean running = true;
    Thread t;

    public Clicker(int p){
        t = new Thread(this);
        t.setPriority(p);
    }

    public void run(){
        while(running){
            click++;
        }
    }

    public void stop(){
        running = false;
    }

    public void start(){
        t.start();
    }

}

class PriorityDemo{
    public static void main(String args[]){

        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        Clicker hi = new Clicker(Thread.NORM_PRIORITY + 2);
        Clicker lo = new Clicker(Thread.NORM_PRIORITY - 2);
        lo.start();
        hi.start();
        
        try{
            Thread.sleep(10000);
        }
        catch(InterruptedException e){
            System.out.println("Main thread Interrupted");
        }
        
        lo.stop();
        hi.stop();
        try{
            hi.t.join();
            lo.t.join();
        }
        catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("Low priority thread:" + lo.click);
        System.out.println("High priority thread:" + hi.click);
    
    }
}