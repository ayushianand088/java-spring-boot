import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionOfConstructor {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Class eagleClass = Eagle.class;

        Constructor[] constructorsList = eagleClass.getDeclaredConstructors();
        for(Constructor constructor: constructorsList){
            System.out.println("Modifier: " + constructor.getModifiers());
            constructor.setAccessible(true);

            // able to create object, even constructor is private
            Eagle eagleObject = (Eagle) constructor.newInstance();
            eagleObject.fly();
        }
    }
}
