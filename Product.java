public abstract class Product {
    protected String product_name;

    public Product(String product_name)
    {
        this.product_name = product_name;
    }

    public abstract void details();
}
