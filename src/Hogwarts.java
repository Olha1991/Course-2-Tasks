public class Hogwarts {
    private String name;
    private int witchcraft;
    private int transgression;

    public Hogwarts(String name, int witchcraft, int transgression) {
        checkingValues1(witchcraft);
        checkingValues2(transgression);
        this.name = name;
        this.witchcraft = witchcraft;
        this.transgression = transgression;

        System.out.println(name + " - Magic power = " + witchcraft + " points. Transgression = " + transgression + " points.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
    public void checkingValues1(int witchcraft) {
        if(witchcraft < 0 || witchcraft > 100) {
            throw new RuntimeException("Invalid value");
        }
    }
    public void checkingValues2(int transgression) {
        if(transgression < 0 || transgression > 100) {
            throw new RuntimeException("Invalid value");
        }
    }
    public static void comparison2StudentsHogwarts(Hogwarts student1, Hogwarts student2){
        int sumPower1 = student1.witchcraft + student1.transgression;
        int sumPower2 = student2.witchcraft + student2.transgression;
        if(sumPower1 > sumPower2){
            System.out.println(student1.getName() + " - total points = " + sumPower1
                    + " and " + student2.getName() + " - total points = " + sumPower2
                    + ". " + student1.getName() + " has more magical power than  " + student2.getName() + ".");
        } else if (sumPower1 < sumPower2){
            System.out.println(student1.getName() + " - total points = " + sumPower1
                    + " and " + student2.getName() + " - total points = " + sumPower2
                    + ". " + student2.getName() + " has more magical power than  " + student1.getName() + ".");
        } else {
            System.out.println(student1.getName() + " and " + student2.getName() + " have the same magical powers.");
        }
    }
}
