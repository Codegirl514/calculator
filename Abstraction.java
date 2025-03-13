public class Abstraction {
    public static void main(String[] args) {
      // car c = new car();
       BMW b = new BMW();
       // b.show();
        b.display();
        b.show(4);
        b.display();
        //c.show();
        //c.display();
    }
}
abstract class car{
   //abstract public void show();
   abstract public void show(int x);
  //  {
     //   System.out.println("car show");
   // }
    public void display() {
        System.out.println("car display");
    }
}

class BMW extends car{
    public void show(int x){
        System.out.println("BMW SHOW");

    }
    public void display(int x){
        System.out.println("BMW display");
    }
}
