import java.util.Scanner;

public class GooGoo{
    public static void main(String[] args) {
        GooGoo goo = new GooGoo();
        GooGooThread t = goo.new GooGooThread();
        t.start();
    }

    class GooGooThread extends Thread {
        public void run() {
            System.out.print("Execute Thread. input the number you want to calculate : _\b");
            Scanner scanner = new Scanner(System.in);
            boolean isValid = false;
            
            while (!isValid) {
                int n = scanner.nextInt();
                if (n > 9 || n <= 0) {
                    isValid = false;
                    System.out.print("Invalid input. input the number again : _\b");
                }
                else {
                    long sleepTime = (long) (Math.random() * 500);
                    System.out.println(n + "단이 " + sleepTime + "만큼 sleep...");
                    try {
                        Thread.sleep(sleepTime);
                    } catch (Exception e) { }
                    
                    System.out.println("Calculating . . . ");
                    for (int i = 1; i <= 9; i++) {
                        System.out.println(n + " * " + i + " = " + (n * i));
                    }
                    System.out.print("calculate has been completed.");
                    isValid = true;
                }
            }
            
            scanner.close();
        }
    }
}