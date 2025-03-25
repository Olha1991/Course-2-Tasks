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
        checkingValuesS(new int[]{s1, s2, s3, s4, s5});

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

    public void checkingValuesS(int [] s){
        int [] values = {s1, s2, s3, s4, s5};
        for(int i = 0; i < values.length; i++){
            if (values[i] < 0 || values[i] > 100){
                throw new RuntimeException("Invalid value");
            }
        }
    }

    public static void comparison2StudentsSlytherin(Slytherin student1, Slytherin student2){
        int sumPower1 = student1.s1 + student1.s2 + student1.s3 + student1.s4 + student1.s5;
        int sumPower2 = student2.s1 + student2.s2 + student2.s3 + student2.s4 + student2.s5;
        if(sumPower1 > sumPower2){
            System.out.println(student1.getName() + " - total points = " + sumPower1
                    + " and " + student2.getName() + " - total points = " + sumPower2
                    + ". " + student1.getName() + " is a better student in Slytherin than " + student2.getName() + ".");
        } else if (sumPower1 < sumPower2){
            System.out.println(student1.getName() + " - total points = " + sumPower1
                    + " and " + student2.getName() + " - total points = " + sumPower2
                    + ". " + student2.getName() + " is a better student in Slytherin than " + student1.getName() + ".");
        } else {
            System.out.println(student1.getName() + " and " + student2.getName() + " have the same number of points.");
        }
    }
}
