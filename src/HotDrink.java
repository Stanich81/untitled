public class HotDrink extends Product{

    private int temperature;
    private int volume;



    public HotDrink(String name, int volume) {
        super(name, volume);
    }

    public HotDrink(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }


    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "temperature=" + temperature +
                '}';
    }

    public int getVolume() {
        return volume;
    }
}

