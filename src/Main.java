public class Main {
    public static void main(String[] args) {

        System.out.println("Gryffindor students: ");
        Gryffindor[] studentsG = {
                new Gryffindor ("Harry Potter", 65, 54, 89, 75, 95),
                new Gryffindor("Hermione Granger", 86, 63, 45, 50, 35),
                new Gryffindor("Ron Weasley", 58, 38, 38,85, 48)
        };

        System.out.println();
        System.out.println("Slytherin students: ");
        Slytherin[] studentsS = {
                new Slytherin("Draco Malfoy", 85, 35, 23, 13, 19, 57, 74),
                new Slytherin("Graham Montague", 75, 15, 25, 23, 35, 36, 24),
                new Slytherin("Gregory Goyle", 58, 23, 29, 25, 53, 19, 30)
        };

        System.out.println();
        System.out.println("Hufflepuff students: ");
        Hufflepuff[] studentsH = {
                new Hufflepuff("Zacharias Smith", 35, 57, 45, 57, 23),
                new Hufflepuff("Cedric Diggory", 76, 42, 67, 31, 62),
                new Hufflepuff("Justin Finch-Fletchley", 68, 33, 34, 67, 45),
        };

        System.out.println();
        System.out.println("Ravenclaw students: ");
        Ravenclaw[] studentsR = {
                new Ravenclaw("Cho Chang", 54, 87, 23, 45, 15, 44),
                new Ravenclaw("Padma Patil", 38, 62, 34, 25, 9, 69),
                new Ravenclaw("Marcus Belby", 85, 18, 33, 19, 20, 89)
        };

        System.out.println();
        Gryffindor.comparison2StudentsGryffindor(studentsG[0], studentsG[1]);
        Slytherin.comparison2StudentsSlytherin(studentsS[0], studentsS[2]);
        Hufflepuff.comparison2StudentsHufflepuff(studentsH[1], studentsH[2]);
        Ravenclaw.comparison2StudentsRavenclaw(studentsR[2], studentsR[0]);
        Hogwarts.comparison2StudentsHogwarts(studentsH[0], studentsR[1]);
    }
}