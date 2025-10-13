class BillPughSolution  {

    private BillPughSolution(){}

    public static class BillPughSolutionHelper {
        private static final BillPughSolution INSTANCE_OBJECT = new BillPughSolution();
    }

    public static BillPughSolution getInstance() {
        System.out.println("Object created by Bill Pugh Solution");
        return BillPughSolutionHelper.INSTANCE_OBJECT;
    }
}
