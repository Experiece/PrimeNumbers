import java.util.ArrayList;

public class PrimeNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> primeNumbersArr = new ArrayList<>();

        for (int potentialPrimeNumber = 1; potentialPrimeNumber < 1000; ) {
            potentialPrimeNumber++;
            for (int q = 2; q <= potentialPrimeNumber; ) {
                int ost;
                ost = potentialPrimeNumber % q;
                if (ost != 0) {
                    q++;
                } else {
                    if (potentialPrimeNumber != q) {
                        break;
                    }
                    else {
                        System.out.println(potentialPrimeNumber);
                        primeNumbersArr.add(potentialPrimeNumber);
                        break;
                    }
                }
            }
        }
    }

}


