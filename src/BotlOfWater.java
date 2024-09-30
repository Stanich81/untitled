public class BotlOfWater extends Product {


    private int volume;

    public BotlOfWater(String name, int price) {
        super(name, price);
    }

    public BotlOfWater(String name, int price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    public BotlOfWater() {
        super();
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BotlOfWater{" +
                "volume=" + volume + ", name= " + getName() +
                '}';
    }
}
