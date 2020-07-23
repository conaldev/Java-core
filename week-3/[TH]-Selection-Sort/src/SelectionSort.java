public class SelectionSort {
    static double[] list = {1,9,4.5,6.6,5.7,-4.5};
    public static void selectionSort(double[] list){
        for(int i=0;i<list.length-1;i++){
            int currentMinIndex = i;
            for(int j=i+1;j<list.length;j++){
                if(list[currentMinIndex]>list[j])
                    currentMinIndex =j;
                if(currentMinIndex!=i){
                    double temp = list[currentMinIndex];
                    list[currentMinIndex] = list[i];
                    list[i] =temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for(int i=0;i<list.length;i++)
            System.out.print(list[i] + " ");
    }
}
