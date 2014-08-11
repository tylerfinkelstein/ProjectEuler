public static void main(String []args){
        int i = 2*3*5*7*11*13*17*19;
        int num = i;
        while (num%12!=0 || num%16!=0 || num%18!=0) {
            num += i;
        }
        System.out.println(num);
    }
