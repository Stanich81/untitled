import java.beans.PropertyDescriptor;

public class Main {
    public static void main(String[] args) {

        HotDrink tea = new HotDrink("Tea with lemon", 150, 80);
        HotDrink coffe = new HotDrink("Latte", 200, 90);



        System.out.println("Стоимость чая с лимоном = " + tea.getPrice());
        System.out.println("Название кофе = " + coffe.getName());



    }
}