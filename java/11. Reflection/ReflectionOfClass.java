import java.lang.reflect.Modifier;

public class ReflectionOfClass {
    public static void main(String[] args) {
        Class eagleClass = Eagle.class;

        System.out.println(eagleClass.getName());
    }
}
