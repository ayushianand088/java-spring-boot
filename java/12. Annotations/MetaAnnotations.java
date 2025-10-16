import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
// @Retention(RetentionPolicy.SOURCE)
@Inherited
@interface MyCustomAnnotation{}

@MyCustomAnnotation
class TestClass{}

class Child extends TestClass{}

@Repeatable(Categories.class)
@interface Category{
    String name();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Categories {
    Category[] value();
}

@Category(name = "Ayushi")
@Category(name = "Anisha")
@Category(name = "Anubhav")
class Person{
    public void study(){}
}

public class MetaAnnotations {
    public static void main(String[] args) {
        System.out.println(new TestClass().getClass().getAnnotation(MyCustomAnnotation.class));

        System.out.println(new Child().getClass().getAnnotation(MyCustomAnnotation.class));

        Category[] categoryArray = new Person().getClass().getAnnotationsByType(Category.class);
        for(Category annotation: categoryArray){
            System.out.println(annotation.name());
        }
    }
}