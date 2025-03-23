public class Slytherin extends Hogwarts{
    private int s1;
    private int s2;
    private int s3;
    private int s4;
    private int s5;

    public Slytherin(String name, int witchcraft, int transgression, int s1, int s2, int s3, int s4, int s5) {
        super(name, witchcraft, transgression);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.s5 = s5;

        System.out.println("Cunning = " + s1 + " points. Determination = " + s2 + " points. Ambition = " + s3
                + " points. Resourcefulness = " + s4 + " points. Thirst for power = " + s5 + " points.");
    }

    public int getS1() {
        return s1;
    }

    public void setS1(int s1) {
        this.s1 = s1;
    }

    public int getS2() {
        return s2;
    }

    public void setS2(int s2) {
        this.s2 = s2;
    }

    public int getS3() {
        return s3;
    }

    public void setS3(int s3) {
        this.s3 = s3;
    }

    public int getS4() {
        return s4;
    }

    public void setS4(int s4) {
        this.s4 = s4;
    }

    public int getS5() {
        return s5;
    }

    public void setS5(int s5) {
        this.s5 = s5;
    }
}
