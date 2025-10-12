// Upper Bound: T must be a subclass of Number
class UpperBound<T extends Number> {}

// Multi Bound: T must extend A and implement I1, I2
class A {}
interface I1 {}
interface I2 {}
class MultiBound<T extends A & I1 & I2> {}

public class BoundedGenerics {
    public static void main(String[] args) {
        // Upper Bound example
        UpperBound<Integer> upperBoundObj = new UpperBound<>();

        // Multi Bound example
        class Myclass extends A implements I1, I2 {}
        MultiBound<Myclass> multiBoundObj = new MultiBound<>();
    }
}
