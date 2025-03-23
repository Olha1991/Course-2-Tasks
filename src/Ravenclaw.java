public class Ravenclaw extends Hogwarts{
    private int r1;
    private int r2;
    private int r3;
    private int r4;

    public Ravenclaw(String name, int witchcraft, int transgression, int r1, int r2, int r3, int r4){
        super(name, witchcraft, transgression);
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
        this.r4 = r4;

        System.out.println("Intelligence = " + r1 + " points. Wisdom = " + r2
                + " points. Wit = " + r3 + "points. Creativity = " + r4 + " points.");
    }

    public int getR1() {
        return r1;
    }

    public void setR1(int r1) {
        this.r1 = r1;
    }

    public int getR2() {
        return r2;
    }

    public void setR2(int r2) {
        this.r2 = r2;
    }

    public int getR3() {
        return r3;
    }

    public void setR3(int r3) {
        this.r3 = r3;
    }

    public int getR4() {
        return r4;
    }

    public void setR4(int r4) {
        this.r4 = r4;
    }
}
