import java.util.*;

public class WildCards {
    // without wildcard
    void withoutWildcard(List<Number> list) { 
        System.out.println("Only accepts Number");
    }
    // Upper Bounded Wildcard
    void upperBoundedWildcard(List<? extends Number> list){
        System.out.println("Accepts Number and its subclasses like Integer, Double,...");
    }
    // lower bounded wildcard
    void lowerBoundedWildcard(List<? super Integer> list){
        System.out.println("Accepts Integer and its superclass like Number, Object");
    }
    // unbounded wildcard
    void unboundedWildcard(List<?> list){
        System.out.println("Accepts any type");
    }
    public static void main(String[] args) {
        WildCards obj = new WildCards();

        List<Number> list1 = Arrays.asList(1,2,3);
        obj.withoutWildcard(list1);
        obj.upperBoundedWildcard(list1);
        obj.lowerBoundedWildcard(list1);
        obj.unboundedWildcard(list1);

        List<Integer> list2 = Arrays.asList(1,2,3);
        // obj.withoutWildcard(list2);
        obj.upperBoundedWildcard(list2);
        obj.lowerBoundedWildcard(list2);
        obj.unboundedWildcard(list2);

        List<Object> list3 = Arrays.asList(1,2,3);
        // obj.withoutWildcard(list3);
        // obj.upperBoundedWildcard(list3);
        obj.lowerBoundedWildcard(list3);
        obj.unboundedWildcard(list3);

        List<String> list4 = Arrays.asList("hello", "hey", "hii");
        // obj.withoutWildcard(list4);
        // obj.upperBoundedWildcard(list4);
        // obj.lowerBoundedWildcard(list4);
        obj.unboundedWildcard(list4);
    }
}
