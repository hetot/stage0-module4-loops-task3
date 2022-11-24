package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int res = 0;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            res += Integer.parseInt("9".repeat(i + 1));
        }
        System.out.println(res);
    }
}
