public class Main {
    public static void main(String[] args) {
        EvenThread et = new EvenThread();
        Thread thread1 = new Thread(et);
        thread1.setPriority(6);
        OddThread ot = new OddThread();
        Thread thread2 = new Thread(ot);
        thread2.start();
        try{
            thread2.join();
        }catch (Exception e){
            e.printStackTrace();
        }  thread1.start();


    }
}
