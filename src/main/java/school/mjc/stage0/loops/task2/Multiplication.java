package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int sign = 1, cnt = 0;
        if(multiplyByAndToInclusive < 0) {
            multiplyByAndToInclusive*=-1;
            sign = -1;
        }
        while (cnt <= multiplyByAndToInclusive && multiplyByAndToInclusive > 0) {
            System.out.println(cnt*multiplyByAndToInclusive*sign);
            cnt++;
        }
    }
}
