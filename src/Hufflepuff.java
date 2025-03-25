public class Hufflepuff extends Hogwarts{
    private int h1;
    private int h2;
    private int h3;

    public Hufflepuff(String name, int witchcraft, int transgression, int h1, int h2, int h3) {
        super(name, witchcraft, transgression);
        this.h1 = h1;
        this.h2 = h2;
        this.h3 = h3;
        checkingValuesH(new int[]{h1, h2, h3});

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

    public void checkingValuesH(int [] h){
        int [] values = {h1, h2, h3};
        for(int i = 0; i < values.length; i++){
            if (values[i] < 0 || values[i] > 100){
                throw new RuntimeException("Invalid value");
            }
        }
    }

    public static void comparison2StudentsHufflepuff(Hufflepuff student1, Hufflepuff student2){
        int sumPower1 = student1.h1 + student1.h2 + student1.h3;
        int sumPower2 = student2.h1 + student2.h2 + student2.h3;
        if(sumPower1 > sumPower2){
            System.out.println(student1.getName() + " - total points = " + sumPower1
                    + " and " + student2.getName() + " - total points = " + sumPower2
                    + ". " + student1.getName() + " is a better student in Hufflepuff than " + student2.getName() + ".");
        } else if (sumPower1 < sumPower2){
            System.out.println(student1.getName() + " - total points = " + sumPower1
                    + " and " + student2.getName() + " - total points = " + sumPower2
                    + ". " + student2.getName() + " is a better student in Hufflepuff than " + student1.getName() + ".");
        } else {
            System.out.println(student1.getName() + " and " + student2.getName() + " have the same number of points.");
        }
    }
}
