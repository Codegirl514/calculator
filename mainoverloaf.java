public class mainoverloaf {
    public static void main(String[] args) {//main main method
        main();
        main(7);
        main("hello");
    }
    public static void main(){// overloaded copies of main
        System.out.println("Empty Main");

    }
    public static void main(int x){// overloaded copies of main
        System.out.println(x);
    }

    public static void main(String x) {// overloaded copies of main
        System.out.println(x);
    }
}
