package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum;
        for (sum = 0; t!=0; t=t/10) {
            sum = sum + t%10;
        }
        if (sum>0) {
            System.out.println(sum);
        }else {
            System.out.println(sum*-1);
        }
    }
}
