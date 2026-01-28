import Task2801.Calculate;
import Task2801.Product;

import java.util.Scanner;

public class Main {

    static Product createProduct(String name, double price, String type){
        return new Product(name, price,type);
    }

    public static void main(String[] args) {
        Product temp = new Product();
        temp.showInfoAboutProduct();

        Product tomato = new Product("Помидор", 120.0, "Овощь");
        tomato.showInfoAboutProduct();

        Calculate calc = new Calculate();

        calc.calculate(temp.getPrice());
        calc.calculate(tomato.getPrice());

        Product orange = createProduct("Апельсин", 150.0, "Цитрусовое");
        orange.showInfoAboutProduct();
    }
}