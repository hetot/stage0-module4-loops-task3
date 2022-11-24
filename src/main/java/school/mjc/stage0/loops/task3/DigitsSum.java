package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String num = Integer.toString(Math.abs(t));
        int res = 0;
        for (int i = 0; i < num.length(); i++) {
            res += (int)num.charAt(i) - (int) '0';
        }
        System.out.println(res);
    }
}
