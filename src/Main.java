public class Main {
    static int a= 30;
    static int b;
    static int c;
    static {
        System.out.println("first block");
        b=a+10;
    }
    static {
        System.out.println("Second block");
        c=50;
    }
    static void show(){
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("c= "+c);
    }

    public static void main(String[] args) {
        show();
    }
}
