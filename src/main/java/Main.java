public class Main {
    public static void main(String[] args) {
        System.out.println("HELLO MAVEN");
        System.out.println("DEVELOPMENT BRANCH");
        Shape shape = Factory.getShaoe("CIRCLE");
        System.out.println(shape.getShape());
        Shape shape2 = Factory.getShaoe("fff");
        System.out.println(shape2.getShape());


    }
}
