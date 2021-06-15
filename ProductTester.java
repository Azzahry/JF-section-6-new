
package inventory;

import java.util.Scanner;
public class ProductTester {
    
    ProductTester(){
        Product pro1 = new Product();
        pro1.setItem(1);
        pro1.setName("Steelseries Rival 3");
        pro1.setQty(25);
        pro1.setInventoryValue(999*25);
        pro1.setPrice(99.9);
        System.out.println(pro1.toString());
        System.out.println("\n");
        
        pro1.setItem(2);
        pro1.setName("Razer Basilisk pro V2");
        pro1.setQty(21);
        pro1.setInventoryValue(999*21);
        pro1.setPrice(99.9);
        System.out.println(pro1.toString());
        System.out.println("\n");
        
    }
    ProductTester(String Logitech, String Rexus, String Cougar, String Corsair){
        Product pro2 = new Product();
        pro2.setItem(3);
        pro2.setName("Logitech G310");
        pro2.setQty(25);
        pro2.setInventoryValue(999*25);
        pro2.setPrice(99.9);
        System.out.println(pro2.toString());
        System.out.println("\n");
        
        pro2.setItem(4);
        pro2.setName("Rexus rx108");
        pro2.setQty(21);
        pro2.setInventoryValue(999*21);
        pro2.setPrice(99.9);
        System.out.println(pro2.toString());
        System.out.println("\n");
        
        pro2.setItem(5);
        pro2.setName("Cougar 250 M");
        pro2.setQty(25);
        pro2.setInventoryValue(999*25);
        pro2.setInventoryValue(999*25);
        pro2.setPrice(99.9);
        System.out.println(pro2.toString());
        System.out.println("\n");
        
        pro2.setItem(6);
        pro2.setName("Corsair M65 RGB");
        pro2.setQty(21);
        pro2.setActive(false);
        pro2.setInventoryValue(999*25);
        pro2.setPrice(99.9);
        
        System.out.println(pro2.toString2());
        System.out.println("\n");
        
        
    }

       
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ProductTester pt = new ProductTester();
        ProductTester pt2 = new ProductTester("Logitech", "Rexus" , "Cougar" , "Corsair");
        int tempNumber;
        String tempName;
        int tempQty;
        double tempPrice;
        int maxSize;
        
        System.out.println("====================================================");
        System.out.println("Enter the number of product  you would like to add");
        System.out.println("Enter zero (0) if you don't wish to add products");
        System.out.println("====================================================\n");
        int i = 10;
        while(0 < i){
            System.out.println("================================================");
            System.out.println("Input number of product   :");
            maxSize = in.nextInt();
            
            if(maxSize == 0){
                System.out.println("Incorrect Value Entered");
                System.out.println("No products required");
                break;
            }else{
                String[] productBased;
                for(int j = 0; j < maxSize; j++){
                    System.out.print("Item Number       : ");
                    tempNumber = in.nextInt(); 
                    System.out.println("Product Name    : ");
                    tempName = in.nextLine();
                    System.out.print("Quantity          : ");
                    tempQty = in.nextInt();
                    System.out.print("Price             : ");
                    tempPrice = in.nextDouble();
                    System.out.println("=========================================");
                    System.out.println("Item number         : "+ tempNumber);
                    System.out.println("Product Name        : "+ tempName);
                    System.out.println("Quantity in stock   : "+ tempQty);
                    System.out.println("Product Price       : "+ tempPrice);
                    
                }
            }
            break;
        }    
}
    
    
}
