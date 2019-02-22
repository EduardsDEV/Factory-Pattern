
public class Factory {
    public static Shape getShaoe(String type) {
        if (type.equals(Shape.CIRCLE)) {
            return new Circle();
//            return new Circle(
        } else if (type.equals(Shape.RECTANGULAR)) {
            return new Rectangular();
        } else return new UndefinedShape();
    }
}
