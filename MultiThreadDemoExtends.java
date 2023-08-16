class NewThread extends Thread{
    NewThread(String readname){
        super(readname);
        System.out.println("NewThread:" + this);
        start();
    }

    public void run(){
        try{
            for(int i=5; i>0; i--){
                System.out.println(getName()+ ":" + i);
                Thread.sleep(1000);      
            }
        }
        catch(InterruptedException e){
            System.out.println(getName() + "Interrupted");
        }
    }
}

class MultiThreadDemoExtends{
    public static void main(String args[]){
        new NewThread("One");
        new NewThread("Two");
        new NewThread("Three");
        try{
            Thread.sleep(10000);

        }
        catch(InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }
        
    }
}