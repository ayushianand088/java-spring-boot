public class NormalEnumClassUsage {
    public static void main(String[] args) {
        for(NormalEnumClass value: NormalEnumClass.values()){
            System.out.println(value.ordinal());
        }

        NormalEnumClass enumVariable = NormalEnumClass.valueOf("FRIDAY");

        System.out.println(enumVariable.name());
    }
}