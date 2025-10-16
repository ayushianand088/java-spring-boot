@interface MyCustomAnnotation1{}

@interface MyCustomAnnotation2{
    String name();
}

@interface MyCustomAnnotation3{
    String name() default "Ayushi Anand";
}

@MyCustomAnnotation2(name = "Ayushi")
class Class1{}

@MyCustomAnnotation3
class Class2{}

@MyCustomAnnotation3(name = "Ayu")
class Class3{}

public class CustomAnnotations {
    public static void main(String[] args) {
        
    }
}