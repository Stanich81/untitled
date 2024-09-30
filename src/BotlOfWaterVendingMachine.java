import java.util.List;

public class BotlOfWaterVendingMachine implements VendingMachine {

    private final List<Product> productList;
    private int money;

    public BotlOfWaterVendingMachine(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                money += product.getPrice();
                return product;
            }
        }
        return null;
    }

    public BotlOfWater getProduct(String name, int volume) {
        for (Product product: productList){
            if (product instanceof BotlOfWater){
                if (product.getName().equals(name) && ((BotlOfWater) product).getVolume() == volume){
                    return (BotlOfWater) product;
                }
            }
        }
        return null;
    }
}
