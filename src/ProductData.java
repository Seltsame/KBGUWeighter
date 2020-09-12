public class ProductData {

    private String productName; //название продукта
    private double kiloCalories; // количество килокалорий
    private double protein; // белок
    private double fat; //жиры
    private double carbohydrate; // углеводы
    private double weight; //вес готового блюда
    private double weightProduct; // вес сырого продукта

    public ProductData() {
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getKiloCalories() {
        return kiloCalories;
    }
    public void setKiloCalories(double kiloCalories) {
        this.kiloCalories = kiloCalories;
    }

    public double getProtein() {
        return protein;
    }
    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getFat() {
        return fat;
    }
    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getCarbohydrate() {
        return carbohydrate;
    }
    public void setCarbohydrate(double carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeightProduct() {
        return weightProduct;
    }
    public void setWeightProduct(double weightProduct) {
        this.weightProduct = weightProduct;
    }
}


