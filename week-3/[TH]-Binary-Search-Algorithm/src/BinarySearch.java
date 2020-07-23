import java.util.Date;
public class BinarySearch {
     static int binarySearch(int[] list, int key ){
        int low =0;
        int high = list.length -1;
        while(high>=low){
            int mid = (low+high)/2;
            if(key<list[mid])
                high = mid -1;
            else if(key == list[mid])
                return mid;
            else
                low = mid +1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] list = new int[1000000];
        for (int i = 0; i < list.length; i++) {
            list[i] =i+1;
        }
        long start = System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            binarySearch(list,50003);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time = " + (end-start));
    }
}
