import java.util.ArrayList;

public class Warehouse {
    private String name;
    private int ID;
    private ArrayList<Product> productList;

    public Warehouse(String name, int ID){
        this.name = name;
        this.ID = ID;
        this.productList = new ArrayList<Product>();
    }

    public void addProduct(Product product){
        System.out.println("Voeg een product toe:");

        productList.add(product);

    }
    public void removeProduct(Product product){
        System.out.println("Verwijder een product:");

        productList.remove(product);

    }
    public int totalProduct(){

        for (int i = 0; i < productList.size();i++){
            System.out.println(productList.get(i));
        }
        return 0;
    }
}
