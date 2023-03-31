package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int firstNum = 0, secondNum = 1;

        for (int i = 1; i <= lastFibonacci; ++i) {
            System.out.print(firstNum + "\n");
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
