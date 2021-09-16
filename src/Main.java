public class Main {
    public static void main(String[] args) {
    Posuda domPo=new Posuda();
    Pribori domPr=new Pribori();
    System.out.println(domPo.check());
    System.out.println(domPr.check());
    domPo.eat();
    domPr.eat();
    System.out.println(domPo.check());
    System.out.println(domPr.check());
    }
}
