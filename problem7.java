c static boolean isPrime(int number) {
        for (int i = 3; i<=Math.sqrt(number); i+=2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String []args){
        int count = 1;
        int primecount = 1;
        int prime = 0;
        while (primecount<10002) {
            if (isPrime(count)) {
                prime = count;
                primecount += 1;
            }
            count += 2;
        }
        System.out.println(prime);
    }
