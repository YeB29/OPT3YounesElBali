import java.time.LocalDate;

 class NonPerishable extends Product {

    public NonPerishable(int productID,String productName,Double productWeight, LocalDate expirationDate, int keuze){
        super(productID, productName, productWeight, expirationDate);
    }


}
