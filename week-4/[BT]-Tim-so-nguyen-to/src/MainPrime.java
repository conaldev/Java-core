public class MainPrime {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new LazyPrimeFactorization(874922381));
        Thread thread2 = new Thread(new OptimizedPrimeFactorization(783946341));
        thread1.start();
        thread2.start();
    }
}
