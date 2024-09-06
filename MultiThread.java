//wap to create multiple threads to find ones and tens position of a given number.
//testcase: use runnable
//testcase: use anonymous class
//testcase: take positive number


public class MultiThread {

    static int n=1234;

    public static void main(String[] args) {
    Runnable obj =() ->  {
        System.out.println("ones position : "+n%10);
    };

        Runnable obj1 = new Runnable() {
            @Override
            public void run() {
                int rem=0;
                for (int i = 0; i <2 ; i++) {

                    rem =n%10;
                        n=n/10;

                }

                System.out.println("tens position: "+rem);
            }
        };

    Thread t1 = new Thread(obj);
    t1.start();
    Thread t2 = new Thread(obj1);
    t2.start();
    }
}
