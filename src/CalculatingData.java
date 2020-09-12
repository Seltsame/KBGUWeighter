import java.util.ArrayList;

public class CalculatingData {
    private double foo;
    private double kKal;

    public CalculatingData() {
    }

    public void calcCalories(ArrayList<ProductData> myData, ProductData products, int counter, Print print) {
        while (counter > 0) {
            counter--;
            ProductData productData = myData.get(counter);
            foo += productData.getWeightProduct();
        }
        kKal = foo / products.getWeight() * 100;
        print.printLn("Общая калорийность этого блюда: " + kKal + " ккал.");
    }

    public void calcKbgu(ArrayList<ProductData> myData, ProductData products, int counter, Print print) {
        while (counter > 0) {
            counter--;
            ProductData productData = myData.get(counter);
            print.print("Название продукта: ");
            print.printLn("" + productData.getProductName());
            print.print("Количество белков на 100гр. в готовом блюде, гр: ");
            print.printLn("" + productData.getProtein() * productData.getWeightProduct() / products.getWeight());
            print.print("Количество жиров на 100гр. в готовом блюде, гр: ");
            print.printLn("" + productData.getFat() * productData.getWeightProduct() / products.getWeight());
            print.print("Количество углеводов на 100гр. в готовом блюде, гр: ");
            print.printLn("" + productData.getCarbohydrate() * productData.getWeightProduct() / products.getWeight());
            print.print("Калорийность 100гр. готового блюда, гр: ");
            print.printLn("" + productData.getKiloCalories() * productData.getWeightProduct() / products.getWeight());
        }
    }
}
