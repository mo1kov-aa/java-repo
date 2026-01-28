package Task2801;

public class Calculate {
    private boolean amountIsNotZero(double price){
        return price > 0;
    }

    public void calculate(double price){
        if(amountIsNotZero(price)){
            System.out.println("Цена вашего товара: " + price);
        }else{
            System.out.println("Сумма ваших покупок имеет отрицательное число.");
        }
    }

}
