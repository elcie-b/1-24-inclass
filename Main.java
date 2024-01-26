import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Product x = null;
        Scanner s = new Scanner(System.in);

        System.out.println("What is the product name? ");
        String product_name_input = s.nextLine();

        do {
            System.out.println("What type of product?");
            System.out.println("(1) Stock");
            System.out.println("(2) To Order");
            String type = s.nextLine();
            try
            {
                if (type.equals("1"))
                {
                    x = new Stock(product_name_input);
                }
                else if (type.equals("2"))
                {
                    x = new To_Order(product_name_input);
                }
            } 
            catch (Exception e)
            {
                System.out.println(e);
            } 
        } while (x == null);

        s.close();
        
        System.out.println("Product: " + x.product_name);
        x.details();
    }
}