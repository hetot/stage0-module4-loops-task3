package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first = 0;
        int second = 0;
        int res;
        for (int i = 0; i < lastFibonacci; i++) {
            res = first + (i == 1 ? 1 : second);
            first = second;
            second = res;
            System.out.println(res);
        }
    }
}
