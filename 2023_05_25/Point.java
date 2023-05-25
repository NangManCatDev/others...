public class Point {
    //멤버변수
    private int x;
    private int y;

    //생성자함수
    public Point() {
        this(0, 0);
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //메소드
    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void showInfo() {
        System.out.println("(" + x + ", " + y + ")");
    }
}
