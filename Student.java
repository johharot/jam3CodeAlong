public class Student {
    byte gradeLevel;
    byte currentGrade;

    public static void main(String args[]) {
        Student studentA = new Student();
        Student studentB = new Student();
        studentA.gradeLevel = 12;
        studentB.gradeLevel = 10;
        // Student.comparedGradeLevels(studentA, studentB);
        studentA.currentGrade = 90;
        studentB.currentGrade = 100;
        // char determinedGrade = studentA.determineLetterGrade(studentA.currentGrade);
        // System.out.println("Here is your current grade " + determinedGrade);
        // char determinedGrade2 = studentA.determineLetterGrade(studentB.currentGrade);
        // System.out.println("Here is your current grade " + determinedGrade2);
        studentA.determineLetterGradeSwitch(studentA.currentGrade);
    }

    // if, if in one class would be called out simultaneously
    // nest statements can only be true if the first statement was true
    public static void comparedGradeLevels(Student a, Student b) {
        if (a.gradeLevel > b.gradeLevel) {
            System.out.println("Student A has the higher grade level");
        }
        if (a.gradeLevel > b.gradeLevel) {
            System.out.println("Student B has the higher grade level");
        }
    }

    public char determineLetterGrade(byte currentGrade) {
        /*
         * when we receive a number grade,
         * we want to determine the letter grade
         * by determining where
         * the number grade falls in range
         */
        // comparing grade in a range by using operations
        // if (currentGrade >= 90 && currentGrade <= 100) {
        // return 'A';
        // } else if (currentGrade >= 80 && currentGrade <= 89) {
        // return 'B';
        // } else if (currentGrade >= 79) {
        // return 'F';
        // }
        // return 'F';

        if (currentGrade >= 90 && currentGrade <= 100) {
            return 'A';
        } else if (currentGrade >= 80 && currentGrade <= 89) {
            return 'B';
        } else if (currentGrade <= 79) {
            return 'F';
        } else {
            return 'Z';
        }
    }

    public void determineLetterGradeSwitch(byte currentGrade) {

        switch (currentGrade) {
            case 100:
                System.out.println("You have a perfect score of 100");
                // breaks the code to printout the below lines
                break;
            case 90:
                System.out.println("You have a score of 90");
                break;

            case 80:
                System.out.println("You have a score of 80");
                break;

            default:
                System.out.println("Sorry, but neither case matched your current grade ");
        }
        // return 'Z';
    }
}
