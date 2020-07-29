public class OptimizedPrimeFactorization implements Runnable{
    private long num;

    public OptimizedPrimeFactorization(long num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println(isPrime(num)+" thread 2");
    }

    public boolean isPrime(long num){
        if(num<2)
            return false;
        else if(num==2)
            return true;
        for(int i=2;i<=num;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}
