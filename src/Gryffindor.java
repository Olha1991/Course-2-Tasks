public class Gryffindor extends Hogwarts{
    private int g1;
    private int g2;
    private int g3;

    public Gryffindor(String name, int witchcraft, int transgression, int g1, int g2, int g3){
        super(name, witchcraft, transgression);
        this.g1 = g1;
        this.g2 = g2;
        this.g3 = g3;

        System.out.println("Nobility = " + g1 + " points. Honor = " + g2 + " points. Courage = " + g3 + " points.");
    }

    public int getG1() {
        return g1;
    }

    public void setG1(int g1) {
        this.g1 = g1;
    }

    public int getG2() {
        return g2;
    }

    public void setG2(int g2) {
        this.g2 = g2;
    }

    public int getG3() {
        return g3;
    }

    public void setG3(int g3) {
        this.g3 = g3;
    }
}
