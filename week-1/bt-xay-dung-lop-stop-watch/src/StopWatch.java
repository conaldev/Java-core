import java.util.Date;
import java.util.concurrent.TimeUnit;
public class StopWatch {
    public StopWatch() {};
    private long starTime;
    private long endTime;
    public long getStartTime() {
        return this.starTime;
    }
    public long getEndTime() {
        return this.endTime;
    }
    public void start() {
        this.starTime = new Date().getTime();
    }
    public void stop() {
        this.endTime = new Date().getTime();
    }
    public long getElapsedTime() {
        return this.endTime - this.starTime;
    }
    public static void main(String[] args) {
        long[] arr = new long[100000];
        for(int i=0;i<arr.length;i++) {
            arr[i] = Math.round(Math.random()*100000);
        }
        //selectionSort\
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for(int i=0;i<arr.length-1;i++) {
            int indexMin = i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[indexMin]>arr[j])
                    indexMin = j;
            }
            long temp = arr[i];
            arr[i] = arr[indexMin];
            arr[indexMin] = temp;
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }

}
