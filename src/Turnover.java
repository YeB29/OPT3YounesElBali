import java.time.LocalDate;

class Turnover extends Product{

    public Turnover(int productID, String productName, Double productweight, LocalDate expirationDate){
        super(productID, productName, productweight, expirationDate);
    }

     public void turnoverRate(Double price){
         Double rate =  (price *365)/100;

         System.out.println(rate);
     }
}
