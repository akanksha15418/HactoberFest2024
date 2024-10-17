class PrimeChecker {
    public boolean isPrime(int num) {
        // Edge case: numbers less than 2 are not prime
        if (num < 2) {
            return false;
        }
        
        // Check for factors from 2 to the square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Found a factor, not prime
            }
        }
        
        return true; // No factors found, it is prime
    }

    public static void main(String[] args) {
        PrimeChecker checker = new PrimeChecker();
        
        // Test the isPrime method
        int number = 29; // Example number to check
        if (checker.isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
