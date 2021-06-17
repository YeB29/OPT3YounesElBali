import java.time.LocalDate;
import java. util. Date;
import java.util.ArrayList;
import java.util.Scanner;

public class Warehouse implements interfaceWarehouse{
    private String name;
    private int ID;
    private ArrayList<Product> productList;

    public Warehouse(String name, int ID){
        this.name = name;
        this.ID = ID;
        this.productList = new ArrayList<Product>();
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }
    @Override
    public void addProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voeg een product toe:");
        System.out.println("Geef een ID nummer voor het product:");
        int ID = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Geef een naam voor het product:");
        String name = scanner.nextLine();
        System.out.println("Geef de gewicht van het product:");
        Double  weight= scanner.nextDouble();
        System.out.println("Geef de houdsbaarheidsdatum van het product:");
        String date = scanner.nextLine();
        LocalDate date1 = LocalDate.parse(date);
        productList.add(new Product(ID,name, weight,date1));

    }



    @Override
    public void removeProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Verwijder een product:");
        System.out.println("Geef het ID nummer van het product:");
        int ID = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Geef de naam van het product:");
        String name = scanner.nextLine();
        System.out.println("Geef de gewicht van het product:");
        Double  weight= scanner.nextDouble();
        System.out.println("Geef de houdsbaarheidsdatum van het product:");
        String date = scanner.nextLine();
        LocalDate date1 = LocalDate.parse(date);
        productList.remove(new Product(ID,name, weight,date1));

    }
    @Override
    public void totalProduct(){

        for (int i = 0; i < productList.size();i++){
            System.out.println(productList.get(i));
        }
        System.out.println(productList);
    }
}
