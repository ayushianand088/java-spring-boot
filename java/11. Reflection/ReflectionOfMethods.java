import java.lang.reflect.Method;

import javax.swing.text.html.StyleSheet;

public class ReflectionOfMethods{
    public static void main(String[] args) {
        Class eagleClass = Eagle.class;
        // Method[] methods = eagleClass.getMethods();
        Method[] methods = eagleClass.getDeclaredMethods();

        for(Method method: methods){
            System.out.println("Method name: " + method.getName());
            System.out.println("Return Type: " + method.getReturnType());
            System.out.println("Class name: " + method.getDeclaringClass());
            System.out.println("-----------------");
        }
    }
}