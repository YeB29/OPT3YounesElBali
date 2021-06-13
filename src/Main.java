import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;


public class Main {

        public static void main(String [] args){

            Scanner input = new Scanner(System.in);
            System.out.println("1. (Voeg toe / verwijder / toon aantal) een product.");
            System.out.println("2. (Verhoog/ verlaag/ toon hoeveelheid) hoeveelheid van een product.");
            System.out.println("3. Bekijk de cijfers. ");
            int in = input.nextInt();

            switch (in){
                case 1:
                    Warehouse mag = new Warehouse();
                    System.out.println("Voeg een type product toe?");
                    int keuze = input.nextInt();
                    input.nextLine();
                    mag.addProduct(keuze);
                    mag.removeProduct(keuze);
                    mag.totalProduct(keuze);
                break;

                case 2:
                    System.out.println("Enter date: ");
                    String date = input.nextLine();
                    LocalDate date1 = LocalDate.parse(date);
                    Stock quantity = new Stock(123,"Kaas",2.5,date1);
                    System.out.println("Wilt u een product toevoegen kies 1, verwijderen kies 2 en het weergeven van het totaal kies 3.");
                    int keuze1 = input.nextInt();
                    input.nextLine();
                    if(keuze1 == 1) {
                        quantity.addProductQuantity(keuze1);
                            }
                    else if(keuze1 == 2){
                            quantity.removeProductQuantity(keuze1);
                            }
                    else{
                        quantity.totalProductQuantity();
                        }
                break;

                case 3:
                    System.out.println("Enter date: ");
                    String date2 = input.nextLine();
                    LocalDate date3 = LocalDate.parse(date2);
                    Turnover product = new Turnover(123,"Kaas",2.5,date3);
                    System.out.println("Geef de prijs van het product:");
                    Double price = input.nextDouble();
                    product.turnoverRate(price);
        }


    }}


