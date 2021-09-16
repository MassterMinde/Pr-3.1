public abstract class Dish {
     char clean='Y';
     void doClean(){
         clean='Y';
    }
    void eat(){
         clean='N';
    }

    public char getClean() {
        return clean;
    }

    abstract String check();
}
