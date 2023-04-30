class NewThread implements Runnable {

Thread t;

NewThread() {

t = new Thread(this);

t.start(); // Start the thread

}



public void run() {

try {

for(int i = 5; i > 0; i--) {

System.out.println("Hello");

Thread.sleep(1000);

}

} catch (InterruptedException e) {

System.out.println("Child interrupted.");

}


}

}

class ThreadDemo {

public static void main(String args[ ] ) {

new NewThread(); // create a new thread

try {

for(int i = 5; i > 0; i--) {

System.out.println("World" );

Thread.sleep(3000);

}

} catch (InterruptedException e) {

System.out.println("Main thread interrupted.");

}



}

}


