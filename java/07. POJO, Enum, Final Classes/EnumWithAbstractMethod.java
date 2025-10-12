public enum EnumWithAbstractMethod {
    MONDAY{
        void info(){
            System.out.println("Start of Week");
        }
    },
    SUNDAY{
        void info(){
            System.out.println("End of week");
        }
    };

    abstract void info();
}