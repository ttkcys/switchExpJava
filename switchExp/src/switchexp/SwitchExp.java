package switchexp;

public class SwitchExp {

    public static void main(String[] args) {
        //I predefined the grade as it is a simple example.
        //It can be changed while making the sample.
        char grade = 'T';

        switch (grade) {
            case 'A':
                System.out.println("Fantastic ! You passed the lesson.");
                break;
            case 'B':
                System.out.println("Nice ! You passed the lesson.");
                break;
            case 'C':
                System.out.println("Good ! You passed the lesson.");
                break;
            case 'D':
                System.out.println("You passed the lesson.");
                break;
            case 'F':
                System.out.println("Unfortunately, you failed the course.");
                break;
            default:
                System.out.println("You entered an invalid grade letter.");
        }
    }

}
