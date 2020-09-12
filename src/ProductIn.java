import java.util.Scanner;

public class ProductIn {

    //Print print;

    public ProductIn() {
    }

    public void ProductInData(Scanner sc, ProductData productData, Print print) {

        print.print("Введите название продукта: ");
        productData.setProductName(sc.next());
        print.print("Введите количество килокалорий: ");
        productData.setKiloCalories(sc.nextInt());
        print.print("Введите количсетво белков, гр.: ");
        productData.setProtein(sc.nextInt());
        print.print("Введите количество жиров, гр.: ");
        productData.setFat(sc.nextInt());
        print.print("Введите количество углеводов, гр.: ");
        productData.setCarbohydrate(sc.nextInt());
        print.print("Введите вес продукта, гр. : ");
        productData.setWeightProduct(sc.nextInt());
        print.printLn();

    }
}
