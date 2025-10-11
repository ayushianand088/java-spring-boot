class Outer {
    int outerVar = 10;

    // Static Nested Class
    static class StaticNested {
        void display() {
            System.out.println("Inside static nested class");
        }
    }

    // Member Inner Class
    class Inner {
        void show() {
            System.out.println("Inside member inner class, outerVar = " + outerVar);
        }
    }

    void methodWithLocalClass() {
        // Local Inner Class
        class LocalInner {
            void print() {
                System.out.println("Inside local inner class");
            }
        }
        LocalInner local = new LocalInner();
        local.print();
    }
}

abstract class Greeting {
    abstract void greet();
}

public class NestedClassDemo {
    public static void main(String[] args) {
        // Static Nested
        Outer.StaticNested staticNested = new Outer.StaticNested();
        staticNested.display();

        // Member Inner
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show();

        // Local Inner
        outer.methodWithLocalClass();

        // Anonymous Inner Class
        Greeting g = new Greeting() {
            public void greet() {
                System.out.println("Hello!");
            }
        };
        g.greet();
    }
}
