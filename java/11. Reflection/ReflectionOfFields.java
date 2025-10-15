import java.lang.reflect.Field;

public class ReflectionOfFields {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException{
        Eagle eagle = new Eagle();   
        Class eagleClass = Eagle.class;

        // set breed(public field)
        Field breedField = eagleClass.getDeclaredField("breed");
        breedField.set(eagle, "eagleBrownBreed");
        System.out.println(eagle.breed);
        System.out.println("Error");

        // set canSwim(private field)
        Field canSwimField = eagleClass.getDeclaredField("canSwim");
        canSwimField.setAccessible(true);
        canSwimField.set(eagle, true);

        if(canSwimField.getBoolean(eagle)){
            System.out.println("Value is set to true");
        }
        // Field[] fields = eagleClass.getFields();
        Field[] fields = eagleClass.getDeclaredFields();

        for(Field field: fields){
            System.out.println("Field Name: " + field.getName());
            System.out.println("Type: " + field.getType());
            System.out.println("Modifier: " + field.getModifiers());
            System.out.println("----------------");
        }
    }
}
