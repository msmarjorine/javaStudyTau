package codecademy;
// Import statement:
import java.util.ArrayList;

class PrimeDirective {
    // Add your methods here:
    public boolean isPrime(int number){
        boolean primeNumber;
        if(number == 2){
            primeNumber = true;
        } else if (number < 2){
            primeNumber = false;
        } else {
            primeNumber = true;
            for(int i = 2; i < number; i++){
                if(number % i == 0){
                    primeNumber = false;
                    break;
                }
            }
        }
        return primeNumber;
    }

    public ArrayList<Integer> onlyPrimes(int[] numbers){
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int number: numbers){
            if(isPrime(number)){
                primes.add(number);
            }
        }
        return primes;

    }


    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        pd.onlyPrimes(numbers);
        System.out.println(pd.onlyPrimes(numbers));

    }

}