public class ColorPoint {
    private int x, y;
    private String color;
    public void setColor(String color) {
        this.color = color;
    }
    public void setPoint(int x, int y) {
        this.x = x; this.y = y;
    }
    public void showPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }
    public void showColorPoint() {
        System.out.print(color);
        showPoint();
    }
}
