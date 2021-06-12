import java. util. Date;
import java.util.ArrayList;
import java.util.Scanner;

public class Warehouse implements interfaceWarehouse{
    private String name;
    private int ID;
    private ArrayList<Product> productList;

    public Warehouse(){
        this.productList = new ArrayList<Product>();
    }
    @Override
    public void addProduct(int product){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voeg een product toe:");
        System.out.println("Geef een ID nummer voor het product:");
        int ID = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Geef een naam voor het product:");
        String name = scanner.nextLine();
        productList.add(new Product(ID,name));

    }



    @Override
    public void removeProduct(int product){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Verwijder een product:");
        System.out.println("Geef het ID nummer van het product:");
        int ID = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Geef de naam van het product:");
        String name = scanner.nextLine();
        productList.remove(new Product(ID,name));

    }
    @Override
    public void totalProduct(int product){

        for (int i = 0; i < productList.size();i++){
            System.out.println(productList.get(i));
        }
        System.out.println(product);
    }
}
