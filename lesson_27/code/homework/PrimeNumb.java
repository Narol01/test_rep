package homework;

public class PrimeNumb {

    public void setPrime(int prime) {
        if (prime(prime)) {
        } else {
            System.out.println("Isn't prime number");
        }
    }

    boolean prime(int a){
        int div=2;
        if (a <= 1) {
            return false;
        }
        while ( div < a){
            if ( a % div == 0 ){
                return false;
            }
            div++;
        }
        return true;
    }
}
