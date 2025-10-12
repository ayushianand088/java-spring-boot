public enum MethodOverrideByConstant {
    MONDAY{
        @Override
        public void dummyMethod(){
            System.out.println("Monday overrided dummy method");
        }
    },
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public void dummyMethod(){
        System.out.println("Dummy method");
    }
}
