public class GooGoo {
    public static void main(String[] args) {
        GooGoo goo = new GooGoo();
        GooGooThread[] t = new GooGooThread[9];
        
        for (int i = 1; i < 10; i++) {
            t[i-1] = goo.new GooGooThread(i);
            t[i-1].start();
        }
    }

    class GooGooThread extends Thread {
        int n;

        public GooGooThread(int n) {
            this.n = n;
        }

        public void run() {
            System.out.println("Execute Thread " + n + ".");
            for (int i = 1; i <= 9; i++) {
                System.out.println(n + " * " + i + " = " + (n * i));
            }
        }
    }
}
