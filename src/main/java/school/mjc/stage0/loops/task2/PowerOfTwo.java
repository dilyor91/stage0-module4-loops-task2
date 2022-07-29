package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public  void printPower(int power) {
       int cnt = 1, sum = 1;
       if(cnt >= 31 ||  power < 0) {
           System.out.println("too much power");
       }
       else {
           System.out.println(1);
       }

       while(cnt <= power) {
           sum *= 2;
           System.out.println(sum);
           cnt++;
       }
    }
}
