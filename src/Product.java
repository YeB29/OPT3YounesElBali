import java.time.LocalDate;
import java.util.Date;

public class Product  {
        private int productID;
        private String productName;
        private Double productWeight;
        private LocalDate expirationDate;

        public Product(int productID,String productName, Double productWeight, LocalDate expirationDate){
            this.productID = productID;
            this.productName = productName;
            this.productWeight = productWeight;
          this.expirationDate = expirationDate;
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

        public LocalDate getExpirationDate() {
            return expirationDate;
        }


    }


