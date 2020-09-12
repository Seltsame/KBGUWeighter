import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Calculating calc = new Calculating();
        Print print = new Print();
        ProductData products = new ProductData();
        CalculatingData calculatingData = new CalculatingData();

       /* int cookedFoodWeight = calc.addingProductWeight();
        print.printLn("Какой-то там важный расчёт равен: " + calc.calculateCalorieContent(cookedFoodWeight));*/
        ArrayList<ProductData> productBase = new ArrayList<>();
        int count = 0; //счетчик продуктов
        String exit;
        Scanner sc = new Scanner(System.in);
        while (true) {

            ProductData productData = new ProductData(); //каждую итерацию цикла создаем новый  вносимый продукт
            ProductIn productIn = new ProductIn();
            productIn.ProductInData(sc, productData, print);

            count++; //считаем количество продукты

            productBase.add(productData); //заносим продукт в базу

            print.print("Хотите завершить ввод ингредиетов, введите слово \"да\" или \"нет\"! ==> ");
            exit = sc.next();
            if (exit.equals("да")) {
                break;
            }
        }
        print.print("Введите вес готового блюда:  ");
        products.setWeight(sc.nextDouble()); //вес готового продукта
        calculatingData.calcKbgu(productBase, products, count, print);
        calculatingData.calcCalories(productBase, products, count, print);

    }
}

