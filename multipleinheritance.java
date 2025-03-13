public class multipleinheritance {
    public static void main(String[] args) {
        Anuj a = new Anuj();
        a.pitai();
        a.pyarr();
        a.show();

    }
}
interface father {
    void pitai();
    void show();
}
interface mother{
    void pyarr();
    void show();
}
class Anuj implements father,mother{
    public void pitai(){
        System.out.println("Pitai");
    }public void pyarr(){
        System.out.println("Pyarr");
    }public void show(){
        System.out.println("show");
    }

}
