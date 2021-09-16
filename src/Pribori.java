public class Pribori extends Dish {
    String metal="Золото";
    String quality="Хорошее";
    int pares=7;

    public String getMetal() {
        return metal;
    }

    public String getQuality() {
        return quality;
    }

    public int getPares() {
        return pares;
    }

    @Override
    public String check() {
        return "\nМеталл: "+getMetal()+"\nКачество: "+getQuality()+"\nКоличество пар: "+getPares()+"\nЧистые: "+getClean();
    }
}
