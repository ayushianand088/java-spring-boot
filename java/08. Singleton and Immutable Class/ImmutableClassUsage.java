import java.util.ArrayList;
import java.util.List;

public class ImmutableClassUsage {
    public static void main(String[] args) {
        List<Object> allName = new ArrayList<>();
        allName.add("Ayushi");
        allName.add("Anand");

        ImmutableClass obj = new ImmutableClass("Ayushi", allName );
        obj.getAllName().add("Anisha");
        System.out.println(obj.getAllName());
    }
}
