public class Sandwich {
    private String mainIngredient;
    private String bread;
    private double price;

    // Setters
    public void setMainIngredient(String ingredient) {
        this.mainIngredient = ingredient;
    }

    public void setBread(String breadType) {
        this.bread = breadType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getters
    public String getMainIngredient() {
        return mainIngredient;
    }

    public String getBread() {
        return bread;
    }

    public double getPrice() {
        return price;
    }
}