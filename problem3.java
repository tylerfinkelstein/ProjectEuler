public static void main(String []args){
    long n = 600851475143L;
    for (int i = 2; i<n; i+=1) {
        if (n%i == 0) {
            n = n/i;
        }
    }
    System.out.println(n);
}
