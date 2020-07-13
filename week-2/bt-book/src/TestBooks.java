import java.util.*;
import java.util.function.BinaryOperator;

public class TestBooks {
    public static void main(String[] args) {
        List<ProgrammingBook> ProBookList = new ArrayList<>(5);
        ProBookList.add(new ProgrammingBook(1, "Java Basic", 200000, "Minh", "Java", true));
        ProBookList.add(new ProgrammingBook(2, "C++ Basic", 150000, "Minh", "C++", true));
        ProBookList.add(new ProgrammingBook(3, "JavaScript Basic", 1000, "Minh", "JavaScript", true));
        ProBookList.add(new ProgrammingBook(4, "Python Advanced", 500000, "Minh", "Python", false));
        ProBookList.add(new ProgrammingBook(5, "C# Advanced", 600000, "Minh", "C#", false));
        List<FictionBook> FicBookList = new ArrayList(5);
        FicBookList.add(new FictionBook(6, "Alice's adventures in wonderland", 700000, "Anonymous", "FictionBook"));
        FicBookList.add(new FictionBook(7, "Harry Potter", 800000, "JK Rowlings", "FictionBook"));
        FicBookList.add(new FictionBook(8, "Angels & Demons", 900000, "Dan Brown", "FictionBook"));
        FicBookList.add(new FictionBook(9, "Origin", 190000, "Dan Brown", "FictionBook"));
        FicBookList.add(new FictionBook(10, "The Davinci Code", 990000, "Dan Brown", "FictionBook"));

        List<Book> BookList = new ArrayList<>(10);
        BookList.addAll(0,ProBookList);
        BookList.addAll(5,FicBookList);
        int sumMoney = 0;
        int countJava=0;
        for (int i = 0; i < 5; i++) {
            String str = ProBookList.get(i).getLanguage();
            if(str.equals("Java")) countJava++;
            sumMoney+= ProBookList.get(i).getPrice();
            sumMoney+=FicBookList.get(i).getPrice();
        }
        System.out.println("Gia 10 cuon sach = " + sumMoney);
        System.out.println("So sach programming book co language la Java = " +countJava);

        System.out.println("Nhap ten cuon sach can tim");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int length=10;
        System.out.println("Sequential Search: ");
        boolean check = true;
        for(int i=0;i<length;i++){
            String temp = BookList.get(i).getName();
            if(temp.equals(name)){
                check = false;
                System.out.println("Gia cua cuon sach co ten la " + name+ " = " +BookList.get(i).getPrice());
                break;
            }
        }
        if(check)
            System.out.println("Khong co ten sach nay");
        System.out.println("Bubble Sort:");
        for(int i=0;i<length-1;i++){
            boolean haveSwap = false;
            for(int j=0;j<length-i-1;j++){
               if(BookList.get(j).getPrice()>BookList.get(j+1).getPrice()){
                   Collections.swap(BookList,j,j+1);
                   haveSwap = true;
               }
            }
            if(!haveSwap)
                break;
        }
        for(int i=0;i<10;i++){
            System.out.println(BookList.get(i).getPrice());
        }
        System.out.println("Insertion Sort:");
        for (int i = 1; i < length; ++i) {
            int key = BookList.get(i).getPrice();
            int j = i - 1;
            while (j >= 0 && BookList.get(j).getPrice() < key) {
                BookList.get(j+1).setPrice( BookList.get(j).getPrice());
                j = j - 1;
            }
            BookList.get(j+1).setPrice(key);
        }
        for(int i=0;i<length;i++){
            System.out.println(BookList.get(i).getPrice());
        }
        System.out.println("Selection Sort:");
        for(int i=0;i<length-1;i++){
            int indexMin=i;
            for(int j=i+1;j<length;j++){
                if(BookList.get(indexMin).getPrice()>BookList.get(j).getPrice())
                    indexMin = j;
            }
            Collections.swap(BookList,indexMin,i);
        }
        for(int i=0;i<length;i++){
            System.out.println(BookList.get(i).getPrice());
        }
        int findPrice = 200000;
        System.out.println("Binary Search:");
        int r = 10-1;
        int l=0;
        int index = -1;
        while (r>=l){
            int mid = (l+r)/2;
            int currentPrice= BookList.get(mid).getPrice();
            if(currentPrice == findPrice){
                index = mid;
                break;
            }
            if(currentPrice>findPrice)
                r = mid -1;
            if(currentPrice<findPrice)
                l = mid +1;
        }
        System.out.println("200.000 duoc tim thay o index = " + index);

    }

}
