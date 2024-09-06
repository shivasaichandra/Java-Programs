public class CountOfDigit {

    public static void main(String[] args) {
        int n = 369;
        int res = digcount(n);
        System.out.println(res);
    }

    public static int digcount(int n) {
        if (n > 0 && n<=1000) {
            int count = 0;
            do {
                int rem = n % 10;
                count++;
                n =n / 10;
            } while (n != 0);

            return count;
        }
        else {return -1;}
    }

}
