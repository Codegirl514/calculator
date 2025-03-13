public class methodoverl {
     public static void main(String[] args) {
         MO m = new MO();
         m.show();
         m.show(5);
         m.show("hii");
         m.show(7,"helo");
     }

}
class MO{

    public void show() {
        System.out.println("1");
    }
    public int show(int x) {
        return x;
//        System.out.println(x);
    }
    public void show(String x){
        System.out.println(x);
    }

    public void show(int x ,String s){
        System.out.println(x+" "+s);
    }
}
