import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class MainProducts {
    public static void main(String[] args) throws IOException {
        LinkedList<Produts> productsList = new LinkedList<Produts>();
        File sourceFile = new File("manageProducts.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(sourceFile));
        Scanner scanner = new Scanner(System.in);
        int choose = 10;
        while (choose != 0) {
            System.out.println("====================\n1.Add a new product\n2.Display all products \n3.Search a product by ID\n0.Exit\n");
            choose = scanner.nextInt();
            switch (choose) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.print("Enter your new product id, name, nsx, price: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    String nsx = scanner.nextLine();
                    int price = scanner.nextInt();
                    Produts newProduct = new Produts(id, name, nsx, price);
                    productsList.add(newProduct);
                    bw.write(newProduct.toString());
                    bw.close();
                    break;
                case 2:
                    System.out.print("All products:\n");
                    for(Produts product : productsList){
                        System.out.println(product);
                    }
                    break;
                case 3:
                    System.out.print("Enter the number of ID to search: ");
                    int searchId = scanner.nextInt();
                    for (Produts product : productsList) {
                        if (product.getId() == searchId) {
                            System.out.println(product.getName());
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid number. Choose again !");
                    break;
            }
        }
    }
}
