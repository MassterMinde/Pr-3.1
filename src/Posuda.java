public class Posuda extends Dish {
    String type="Фарфор";
    int persons= 9;
    int broken=2;

    public String getType() {
        return type;
    }

    public int getPersons() {
        return persons;
    }

    public int getBroken() {
        return broken;
    }

    @Override
    public String check() {
        return "\nМатериал: "+getType()+"\nНа "+getPersons()+" людей\nСломанных: "+getBroken()+"\nЧистые: "+getClean();
    }
}
