import java.util.ArrayList;

public class PrimeNumbers {
    public static void main(String[] args) {
//        ArrayList<Integer> primeNumbersArr = new ArrayList<>();

        for (int potentialPrimeNumber = 2; potentialPrimeNumber < 20;) {
            potentialPrimeNumber++;
            for (int q = 2; q < potentialPrimeNumber;) {
                int ost;
                ost = potentialPrimeNumber % q;
                if (ost != 0) {
                    q++;
                } else {
                    System.out.println(potentialPrimeNumber);
                    break;
                }
            }
        }
    }

}


