import java.util.*;

public class StreamDemo{
    public static void main(String[] args){
        Collection<Integer> salaryList = new ArrayList<>();

        salaryList.add(35000);
        salaryList.add(75000);
        salaryList.add(28000);
        salaryList.add(20000);
        salaryList.add(90000);

        // without stream
        int count = 0;
        for(Integer salary: salaryList){
            if(salary > 30000){
                count++;
            }
        }
        System.out.println("Count of salary which is > 30000: " + count);

        // with stream
        long output = salaryList.stream().filter((Integer salary) -> salary>30000).count();
        System.out.println("Count of salary which is > 30000: " + output);
    }
}