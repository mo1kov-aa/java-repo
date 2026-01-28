package Task2801;

public class Product {
    private String name;
    private  double price;
    private String type;

    public Product(){
        this.name = "notFound";
        this.price = 0.0;
        this.type = "notFound";
    }

    public  Product(String name, double price, String type){
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void showInfoAboutProduct(){
        System.out.println("Название товара: " + this.name);
        System.out.println("Цена товара: " + this.price);
        System.out.println("Тип товара: " + this.type);
        System.out.println("\n");
    }
}

