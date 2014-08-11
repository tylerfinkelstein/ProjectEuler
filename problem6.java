public static void main(String []args){
        int sum = 0;
        for (int i = 1; i<101; i++) {
            sum += i;
        }
        int sumsquare = sum*sum;
        int sum2 = 0;
        for (int j = 1; j<101; j++) {
            sum2 += j*j;
        }
        System.out.println(sum2 - sumsquare);
    }
