public class Gryffindor extends Hogwarts{
    private int g1;
    private int g2;
    private int g3;

    public Gryffindor(String name, int witchcraft, int transgression, int g1, int g2, int g3){
        super(name, witchcraft, transgression);
        this.g1 = g1;
        this.g2 = g2;
        this.g3 = g3;
        checkingValuesG(new int[]{g1, g2, g3});

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

    public void checkingValuesG(int [] g){
        int [] values = {g1, g2, g3};
        for(int i = 0; i < values.length; i++){
            if (values[i] < 0 || values[i] > 100){
                throw new RuntimeException("Invalid value");
            }
        }
    }

    public static void comparison2StudentsGryffindor(Gryffindor student1, Gryffindor student2){
        int sumPower1 = student1.g1 + student1.g2 + student1.g3;
        int sumPower2 = student2.g1 + student2.g2 + student2.g3;
        if(sumPower1 > sumPower2){
            System.out.println(student1.getName() + " - total points = " + sumPower1
                    + " and " + student2.getName() + " - total points = " + sumPower2
                    + ". " + student1.getName() + " is a better student in Gryffindor than " + student2.getName() + ".");
        } else if (sumPower1 < sumPower2){
            System.out.println(student1.getName() + " - total points = " + sumPower1
                    + " and " + student2.getName() + " - total points = " + sumPower2
                    + ". " + student2.getName() + " is a better student in Gryffindor than " + student1.getName() + ".");
        } else {
            System.out.println(student1.getName() + " and " + student2.getName() + " have the same number of points.");
        }
    }

}
