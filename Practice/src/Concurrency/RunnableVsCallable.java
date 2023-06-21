package Concurrency;

import java.util.concurrent.*;

import static Concurrency.CallableClass.factorial;

public class RunnableVsCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        execute();
        System.out.println(submit());
    }

    public static void execute() {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        System.out.println(Thread.currentThread().getName());
        executor.execute(new RunnableClass());
    }
    static Integer submit() throws ExecutionException, InterruptedException {
        ExecutorService executor =  Executors.newSingleThreadExecutor();
        System.out.println(Thread.currentThread().getName());
        Integer result = executor.submit(new CallableClass()).get();
        return  result;
    }
}

class RunnableClass implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable Class");
        System.out.println(Thread.currentThread().getName());
        System.out.println(factorial());
    }
}

class CallableClass implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("Callable Class");
        System.out.println(Thread.currentThread().getName());
        return factorial();
    }

    static int factorial() {
        int factorial = 1;
        for (int i = 5; i > 0; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }
}