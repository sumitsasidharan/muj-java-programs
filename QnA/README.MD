

### Define Threads in Java programming and what are the various methods to implement threads

In Java programming, a thread is a lightweight process or a unit of execution within a process. Java allows multiple threads to run concurrently, enabling the execution of multiple tasks simultaneously. This feature is essential for developing applications that require multitasking, such as GUI applications, web servers, and other systems that perform several tasks at the same time.

#### Methods to Implement Threads in Java:

1. By Extending the Thread Class:

You can create a new thread by extending the Thread class and overriding its run() method. The run() method defines the code that constitutes the new thread.

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();  // Start the new thread
    }
}
```

2. By Implementing the Runnable Interface:

Instead of extending the Thread class, you can implement the Runnable interface. This approach is preferred when the class is already extending another class since Java supports single inheritance.

```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        t1.start();  // Start the new thread
    }
}
```