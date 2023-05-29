public class TestStatic {
     static int age;


      static void show() {
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {

        System.out.println("Age is "+ age);
        show();
    }
}
