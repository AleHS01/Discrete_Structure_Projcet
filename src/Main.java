import java.util.Scanner;
import java.io.*;
//import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws IOException{

        boolean doneFlag = true;
        File file;
        Scanner scan = new Scanner(System.in);
        int wikiIndex;
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
                    wikiIndex = 1;
                    setTheory(scan, wikiIndex);
                    break;
                case 'L':
                case 'l':
                    wikiIndex = 2;
                    logic(scan, wikiIndex);
                    break;
                case 'C':
                case 'c':
                    wikiIndex = 3;
                    counting(scan, wikiIndex);
                    break;
                case 'B':
                case 'b':
                    wikiIndex = 4;
                    combination(scan, wikiIndex);
                    break;
                case 'P':
                case 'p':
                    wikiIndex = 5;
                    permutation(scan, wikiIndex);
                    break;
                case 'T':
                case 't':
                    wikiIndex = 6;
                    pascalTriangle(scan, wikiIndex);
                    break;
                case 'I':
                case 'i':
                    wikiIndex = 7;
                    induction(scan, wikiIndex);
                    break;
                case 'R':
                case 'r':
                    wikiIndex = 8;
                    recursion(scan, wikiIndex);
                    break;
                case 'F':
                case 'f':
                    wikiIndex = 9;
                    fibonacciSequence(scan, wikiIndex);
                    break;
                case 'N':
                case 'n':
                    wikiIndex = 10;
                    numberTheory(scan, wikiIndex);
                    break;
                case 'M':
                case 'm':
                    wikiIndex = 11;
                    numberSystem(scan, wikiIndex);
                    break;
                default:
                    wikiIndex = 0;
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

    public static void setTheory(Scanner scanner, int wikiIndex) throws IOException {
        System.out.println("Set Theory is printing");
        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);
    }

    public static void logic(Scanner scanner, int wikiIndex) throws IOException{
        System.out.println("Logic is printing");
        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);
    }

    public static void counting(Scanner scanner, int wikiIndex) throws IOException{
        System.out.println("Counting is printing");
        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);
    }

    public static void combination(Scanner scanner, int wikiIndex) throws IOException{
        System.out.println("Combination is printing");
        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);
    }

    public static void permutation(Scanner scanner, int wikiIndex) throws IOException{
        System.out.println("Permutation is printing");
        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);
    }

    public static void pascalTriangle(Scanner scanner, int wikiIndex) throws IOException{
        System.out.println("Pascal Triangle printing");
        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);
    }

    public static void induction(Scanner scanner, int wikiIndex) throws IOException{
        System.out.println("Induction Printing");
        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);
    }

    public static void recursion(Scanner scanner, int wikiIndex) throws IOException{
        System.out.println("Recursion printing");
        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);
    }

    public static void fibonacciSequence(Scanner scanner, int wikiIndex) throws IOException{
        System.out.println("Fibonacci printing");
        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);
    }
    public static void numberTheory(Scanner scanner, int wikiIndex) throws IOException{
        System.out.println("Number Theory");
        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);
    }
    public static void numberSystem(Scanner scanner, int wikiIndex) throws IOException{
        System.out.println("Number System");
        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);

    }
}

