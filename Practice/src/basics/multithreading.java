package basics;

public class multithreading {
    public static void main(String[] args) {
        System.out.println("Maing method thread .. "+ Thread.currentThread().getName());

/*        Multithreading implementing runnable interface..
        for(int i=0;i<5;i++){
            Thread runnable = new Thread(new implentingRunnable());
            runnable.start();
        }*/

/*        multithreading by extending thread class
        for(int i=0;i<5;i++){
            Thread th = new extendingThreads();
            th.start();
        }*/


        /*both threads together*/
        for(int i=0;i<5;i++){
            Thread runnable = new Thread(new implentingRunnable());
            Thread th = new extendingThreads();
            runnable.start();
            th.start();
        }
    }
}
class implentingRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Current thread name by implementing runnable : " + Thread.currentThread().getName());
    }
}
class extendingThreads extends Thread{
    @Override
    public void run(){
        System.out.println("current thread name by extending thread : "+ Thread.currentThread().getName() );
    }
}