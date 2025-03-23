public class Hufflepuff extends Hogwarts{
    private int h1;
    private int h2;
    private int h3;

    public Hufflepuff(String name, int witchcraft, int transgression, int h1, int h2, int h3) {
        super(name, witchcraft, transgression);
        this.h1 = h1;
        this.h2 = h2;
        this.h3 = h3;

        System.out.println("Hard work = " + h1 + " points. Fidelity = " + h2 + " points. Honesty = " + h3 + " points.");
    }

    public int getH1() {
        return h1;
    }

    public void setH1(int h1) {
        this.h1 = h1;
    }

    public int getH2() {
        return h2;
    }

    public void setH2(int h2) {
        this.h2 = h2;
    }

    public int getH3() {
        return h3;
    }

    public void setH3(int h3) {
        this.h3 = h3;
    }
}
