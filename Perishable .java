import java.time.LocalDate;

class Perishable  extends Product{

    public Perishable (int productID,String productName,Double productWeight, LocalDate expirationDate, int keuze){
        super(productID, productName, productWeight, expirationDate);
    }

}
