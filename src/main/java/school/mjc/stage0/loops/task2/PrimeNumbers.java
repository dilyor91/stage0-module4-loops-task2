package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public  boolean isPrime(int number) {
        int i = 2;
        while(i<=number-1) {
            if(number%i==0)
                return false;
            i++;
        }
        return true;
    }
    public  void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        while(i <= printToInclusive) {
            if(isPrime(i)) {
                System.out.println(i);
            }
            i++;
        }
    }
}
