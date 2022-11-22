import java.util.Scanner;
import java.io.*;
//import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws IOException{

        boolean doneFlag = true;
        File file;
        Scanner scan = new Scanner(System.in);
        //int wikiIndex = 0;
        //JOptionPane.showMessageDialog(null, "Hello Beato");

        do {
            menu();
            char choice = scan.next().charAt(0);
            switch (choice) {
                case 'Q':
                case 'q':
                    doneFlag = false;
                    break;
                case 'S':
                case 's':
                    //wikiIndex = 1;
                    setTheory(scan);
                    break;
                case 'L':
                case 'l':
                    logic(scan);
                    break;
                case 'C':
                case 'c':
                    counting(scan);
                    break;
                case 'B':
                case 'b':
                    combination(scan);
                    break;
                case 'P':
                case 'p':
                    permutation(scan);
                    break;
                case 'T':
                case 't':
                    pascalTriangle(scan);
                    break;
                case 'I':
                case 'i':
                    induction(scan);
                    break;
                case 'R':
                case 'r':
                    recursion(scan);
                    break;
                case 'F':
                case 'f':
                    fibonacciSequence(scan);
                    break;
                case 'N':
                case 'n':
                    numberTheory(scan);
                    break;
                case 'M':
                case 'm':
                    numberSystem(scan);
                    break;
                default:
                    System.out.printf("Error: %s is an invalid selection - Try Again Please\n", choice);
                    break;
            }

            pause(scan, choice);
        } while(doneFlag);

        scan.close();
    }

    public static void menu() {
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println("\t\t  List of Topics");
        System.out.println("------------------------------------");
        System.out.println("\tS -- Set Theory");
        System.out.println("\tL -- Logic");
        System.out.println("\tC -- Counting");
        System.out.println("\tB -- Combination");
        System.out.println("\tP -- Permutation");
        System.out.println("\tT -- Pascal Triangle");
        System.out.println("\tI -- Induction");
        System.out.println("\tR -- Recursion");
        System.out.println("\tF -- Fibonacci Sequence");
        System.out.println("\tN -- Number Theory");
        System.out.println("\tM -- Number System");
        System.out.println("\tQ -- Quit");
        System.out.println();
        System.out.print("Enter your Selection: ");
        System.out.println();
    }

    public static void pause(Scanner scan, char choice) {
        if (choice != 'q' && choice != 'Q') {
            System.out.println();
            System.out.println("Press \"Enter\" to continue");
            String tempWait = scan.nextLine();
            tempWait = scan.nextLine();
        } else {
            System.out.println("Quitting Program");
        }

    }

    public static void setTheory(Scanner scanner) {
        System.out.println("Set Theory is printing");
        //Wiki_Discrete wiki = new Wiki_Discrete();
        File file;
        Wiki_Discrete.working();
    }

    public static void logic(Scanner scanner) {
        System.out.println("Logic is printing");
    }

    public static void counting(Scanner scanner) {
        System.out.println("Counting is printing");
    }

    public static void combination(Scanner scanner) {
        System.out.println("Combination is printing");
    }

    public static void permutation(Scanner scanner) {
        System.out.println("Permutation is printing");
    }

    public static void pascalTriangle(Scanner scanner) {
        System.out.println("Pascal Triangle printing");
    }

    public static void induction(Scanner scanner) {
        System.out.println("Induction Printing");
    }

    public static void recursion(Scanner scanner) {
        System.out.println("Recursion printing");
    }

    public static void fibonacciSequence(Scanner scanner) {
        System.out.println("Fibonacci printing");
    }
    public static void numberTheory(Scanner scanner) {
        System.out.println("Number Theory");
    }
    public static void numberSystem(Scanner scanner) {
        System.out.println("Number System");
    }
}

