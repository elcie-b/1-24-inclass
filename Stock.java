public class Stock extends Product
{
    public Stock(String product_name)
    {
        super(product_name);
    }

    public void details() 
    {
        System.out.println("We have this product in stock.");
    }
}
