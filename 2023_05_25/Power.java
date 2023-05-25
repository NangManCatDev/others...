public class Power {
    //멤버변수
    private int kick;
    private int punch;

    //생성자 함수
    public Power() {
        this.kick = 0;
        this.punch = 0;
    }
    public Power(int kick, int punch) {
        this.kick = kick;
        this.punch = punch;
    }

    //메소드
    public int getKick() {
        return this.kick;
    }

    public void setKick(int kick) {
        this.kick = kick;
    }

    public int getPunch() {
        return this.punch;
    }

    public void setPunch(int punch) {
        this.punch = punch;
    }
    public void showInfo() {
        System.out.println("킥" + kick);
        System.out.println("펀치" + punch);
    }
}
