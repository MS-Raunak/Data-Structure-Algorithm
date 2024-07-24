package multithreading;


public class CustomThread_ThreadClass extends  Thread{
    @Override
    public void run() {
        for (int i=1; i<=5; i++){
            System.out.println( Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        CustomThread_ThreadClass thread = new CustomThread_ThreadClass();
        CustomThread_ThreadClass thread2 = new CustomThread_ThreadClass();

        //thread-1 and thread2 will be executing in random order
        thread.setName("Thread-1");
        thread.start();

        thread2.setName("Thread-2");
        thread2.start();

        //Always executed first bkg thread will wait for CPU allocation
        System.out.println("main-thread");

    }
}
