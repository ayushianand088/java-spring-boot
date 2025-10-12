public class EnumWithCustomValuesUsage {
    public static void main(String[] args){
        EnumWithCustomValues day7 = EnumWithCustomValues.getEnumValue(7);
        EnumWithCustomValues value = EnumWithCustomValues.TUESDAY;

        System.out.println(day7.getComment());
        System.out.println(value.getComment());
        System.out.println(EnumWithCustomValues.MONDAY.getValue());
        System.out.println(EnumWithCustomValues.MONDAY.getComment());
    }
}
