public static void main(String []args){
    int a = 1;
    int b = 2;
    int sum = 0;
    while (a<4000001) {
        int c = b;
        b += a;
        a = c;
        if (a%2==0) {
            sum += a;
        }
    }
    System.out.println(sum);
}
