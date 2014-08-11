public static boolean isPalindrome(int number) {
        String num = "" + number;
        String reverse = "";
        for (int k = num.length()-1; k>=0; k--) {
            reverse = reverse + num.charAt(k);
        }
        //System.out.println(num + " " + reverse);
        return num.equals(reverse);
    }

    public static void main(String []args){
        int n = 0;
        for (int i=100;i<1000;i++) {
            for (int j=i;j<1000;j++) {
                int pal = i*j;
                if (pal>n && isPalindrome(pal)) {
                    n = pal;
                }
            }
        }
        System.out.println(n + "");
    }
