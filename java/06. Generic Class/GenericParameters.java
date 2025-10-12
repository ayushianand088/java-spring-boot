// Generic class with 2 type parameter
class Pair<K,V> {
    private K key;
    private V value;
    public void put(K key, V value){
        this.key = key;
        this.value = value;
    }
    public void get(){
        System.out.println("Key is " + key);
        System.out.println("Value is " +value);
    }
}

public class GenericParameters {
    public static void main(String[] args) {
        Pair<String, Integer> pairObj = new Pair<>();
        pairObj.put("hello", 1234);
        pairObj.get();
    }
}
