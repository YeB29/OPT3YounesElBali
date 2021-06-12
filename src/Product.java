import java.time.LocalDate;
import java.util.Date;

public class Product  {
        private int productID;
        private String productName;
        private Double productWeight;
        private Date expirationDate;

        public Product(int productID,String productName){
            this.productID = productID;
            this.productName = productName;
//            this.productWeight = productWeight;
//            this.expirationDate = expirationDate;
        }


        public void turnoverRate(Double price){
        Double rate =  (price *365)/100;

            System.out.println(rate);
        }

        public int getProductID() {
            return productID;
        }

        public String getProductName() {
            return productName;
        }

        public Double getProductWeight() {
            return productWeight;
        }

        public Date getExpirationDate() {
            return expirationDate;
        }


    }


