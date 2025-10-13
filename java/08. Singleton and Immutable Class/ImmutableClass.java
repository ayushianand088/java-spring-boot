import java.util.ArrayList;
import java.util.List;

final class ImmutableClass {
    private final String name;
    private final List<Object> allName;

    ImmutableClass(String name, List<Object> allName){
        this.name = name;
        this.allName = new ArrayList<>(allName);
    }

    public String getName(){
        return name;
    }
    public List<Object> getAllName(){
        return new ArrayList<>(allName);
    }
}