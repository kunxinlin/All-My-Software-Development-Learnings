public class TheadingExample {
    public static void main(String[] args) {
        System.out.println("in main");

        Task task = new Task();
        task.start();

        Task task2 = new Task();
        task2.start();
        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n\nSYNCHRONIZED:");
        Sequence sequence = new Sequence();
        Thread t1 = new Thread(new Task2(sequence));
        Thread t2 = new Thread(new Task2(sequence));
        t1.start();
        t2.start();
    }
}



class Task extends Thread{
    public void run() {
        for(int i=0; i<100; i++){
            System.out.println(Thread.currentThread().getName() + ": " +i);
        }
    }
}

class Sequence{
    private int value = 0;

    public int getNext() {
        synchronized (this){
            value++;
            return value;
        }
    }
}

class Task2 implements Runnable{

    Sequence sequence = null;
    public Task2(Sequence sequence){
        this.sequence = sequence;
    }

    @Override
    public void run(){
        for (int i=0; i<100; i++){
            System.out.println(Thread.currentThread().getName() +": seq=" + sequence.getNext());
        }
    }
}