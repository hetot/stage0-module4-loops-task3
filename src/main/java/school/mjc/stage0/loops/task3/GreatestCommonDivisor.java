package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        for (int i = second; i >= 1; i--) {
            if (second % i == 0 && first % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
