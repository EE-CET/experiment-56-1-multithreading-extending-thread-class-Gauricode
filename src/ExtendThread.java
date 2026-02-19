class MyThread extends Thread {
    // TODO: Override the run() method
    // Inside run(), print "Thread is running"
	
	public void run(){
		System.out.println("Thread is running");
	}
}

public class ExtendThread {
    public static void main(String[] args) {
	MyThread t1=new MyThread();
	t1.start();
        // TODO: Create an object of MyThread
        // TODO: Start the thread using start() method
    }
}
