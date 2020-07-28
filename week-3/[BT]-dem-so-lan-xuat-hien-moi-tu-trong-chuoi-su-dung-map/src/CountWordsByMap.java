import java.util.TreeMap;

public class CountWordsByMap {
    public static void main(String[] args) {
        String text = "one two one two three four four five six six seven seven eight";
        TreeMap<String,Integer> countMap = new TreeMap<String, Integer>();
        countMap.put("one",0);
        countMap.put("two",0);
        countMap.put("three",0);
        countMap.put("four",0);
        countMap.put("five",0);
        countMap.put("six",0);
        countMap.put("seven",0);
        countMap.put("eight",0);
        String[] arr = text.split(" ");
        for(int i=0;i<arr.length;i++){
            if(countMap.containsKey(arr[i])){
                int currentValue = countMap.get(arr[i]);
                currentValue++;
                countMap.put(arr[i],currentValue);
            }
        }
        System.out.println(countMap);
    }
}
