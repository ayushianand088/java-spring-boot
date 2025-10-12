public enum EnumWithCustomValues {
    MONDAY(1, "1st day of week"),
    TUESDAY(2, "2nd day of week"),
    WEDNESDAY(3, "3rd day of week"),
    THURSDAY(4, "4th day of week"),
    FRIDAY(5, "5th day of week"),
    SATURDAY(6, "6th day of week"),
    SUNDAY(7, "7th day of week");

    private int value;
    private String comment;

    EnumWithCustomValues(int value, String comment){
        this.value = value;
        this.comment = comment;
    }

    public int getValue() {
        return value;
    }

    public String getComment(){
        return comment;
    }

    public static EnumWithCustomValues getEnumValue(int value){
        for(EnumWithCustomValues day: EnumWithCustomValues.values()){
            if(day.value == value){
                return day;
            }
        }
        return null;
    }
}
