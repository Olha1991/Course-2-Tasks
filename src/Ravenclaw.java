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
        checkingValuesR(new int[]{r1, r2, r3, r4});

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

    public void checkingValuesR(int [] r){
        int [] values = {r1, r2, r3, r4};
        for(int i = 0; i < values.length; i++){
            if (values[i] < 0 || values[i] > 100){
                throw new RuntimeException("Invalid value");
            }
        }
    }

    public static void comparison2StudentsRavenclaw(Ravenclaw student1, Ravenclaw student2){
        int sumPower1 = student1.r1 + student1.r2 + student1.r3 + student1.r4;
        int sumPower2 = student2.r1 + student2.r2 + student2.r3 + student2.r4;
        if(sumPower1 > sumPower2){
            System.out.println(student1.getName() + " - total points = " + sumPower1
                    + " and " + student2.getName() + " - total points = " + sumPower2
                    + ". " + student1.getName() + " is a better student in Ravenclaw than " + student2.getName() + ".");
        } else if (sumPower1 < sumPower2){
            System.out.println(student1.getName() + " - total points = " + sumPower1
                    + " and " + student2.getName() + " - total points = " + sumPower2
                    + ". " + student2.getName() + " is a better student in Ravenclaw than " + student1.getName() + ".");
        } else {
            System.out.println(student1.getName() + " and " + student2.getName() + " have the same number of points.");
        }
    }
}
