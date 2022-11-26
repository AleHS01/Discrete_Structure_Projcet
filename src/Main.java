import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws IOException{

        boolean doneFlag = true;
        int wikiIndex;

        do {
            //menu();
            char choice = menu();
            switch (choice) {
                case 'Q':
                case 'q':
                    doneFlag = false;
                    break;
                case 'S':
                case 's':
                    wikiIndex = 1;
                    setTheory(wikiIndex);
                    break;
                case 'L':
                case 'l':
                    wikiIndex = 2;
                    logic(wikiIndex);
                    break;
                case 'C':
                case 'c':
                    wikiIndex = 3;
                    counting(wikiIndex);
                    break;
                case 'B':
                case 'b':
                    wikiIndex = 4;
                    combination(wikiIndex);
                    break;
                case 'P':
                case 'p':
                    wikiIndex = 5;
                    permutation(wikiIndex);
                    break;
                case 'T':
                case 't':
                    wikiIndex = 6;
                    pascalTriangle(wikiIndex);
                    break;
                case 'I':
                case 'i':
                    wikiIndex = 7;
                    induction(wikiIndex);
                    break;
                case 'R':
                case 'r':
                    wikiIndex = 8;
                    recursion(wikiIndex);
                    break;
                case 'F':
                case 'f':
                    wikiIndex = 9;
                    fibonacciSequence(wikiIndex);
                    break;
                case 'N':
                case 'n':
                    wikiIndex = 10;
                    numberTheory(wikiIndex);
                    break;
                case 'M':
                case 'm':
                    wikiIndex = 11;
                    numberSystem(wikiIndex);
                    break;
                default:
                    wikiIndex = 0;
                    System.out.printf("Error: %s is an invalid selection - Try Again Please\n", choice);
                    break;
            }

            //pause(choice);
        } while(doneFlag);
    }

    public static char menu() {
        char choice;
        String jString = "\n------------------------------------\n" +
                "\t\t  List of Topics\n" +
                "------------------------------------\n" +
                "\tS -- Set Theory\n" +
                "\tL -- Logic\n" +
                "\tC -- Counting\n" +
                "\tB -- Combination\n" +
                "\tP -- Permutation\n" +
                "\tT -- Pascal Triangle\n" +
                "\tI -- Induction\n" +
                "\tR -- Recursion\n" +
                "\tF -- Fibonacci Sequence\n" +
                "\tN -- Number Theory\n" +
                "\tM -- Number System\n" +
                "\tQ -- Quit\n\n" +
                "Enter your Selection: ";
        choice = JOptionPane.showInputDialog(null, jString, "Menu", JOptionPane.PLAIN_MESSAGE).charAt(0);

        return choice;
        /*
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
        */
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

    public static void setTheory(int wikiIndex) throws IOException {

        String menu;
        char operationType = ' ';
        char menuOption;
        boolean status = true;
        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);
        Set_Theory_Operation operation = new Set_Theory_Operation();

        menu = "What do you wish to do?\n\tK -- Know more information about set\n\tO -- Perform and Operation";
        menuOption = JOptionPane.showInputDialog(null, menu, "Set Theory Menu", JOptionPane.PLAIN_MESSAGE).charAt(0);

//        do{
            switch (menuOption){
                case 'K':
                case 'k':
                    JOptionPane.showMessageDialog(null, wiki.getWikiString(), "Set Theory Info", JOptionPane.PLAIN_MESSAGE);
                    status = false;
                    break;
                case 'O':
                case 'o':
                    operationType = JOptionPane.showInputDialog(null, operation.miniMenu(),"Operation Menu", JOptionPane.PLAIN_MESSAGE).charAt(0);
                    status = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error:  '" + menuOption + "' is an invalid selection - Try Again Please\n",
                            "Set Theory", JOptionPane.WARNING_MESSAGE);
                    status = false;
                    break;
            }
//        }while(status);

        boolean opStatus = true;

            do {
                if (operationType == 'U'){
                    JOptionPane.showMessageDialog(null, "Union printing","Set Theory", JOptionPane.INFORMATION_MESSAGE);
                    opStatus = false;
                }
                else if (operationType == 'I'){
                    JOptionPane.showMessageDialog(null, "Intersection printing","Set Theory", JOptionPane.INFORMATION_MESSAGE);
                    opStatus = false;
                }
                else if (operationType == 'D'){
                    JOptionPane.showMessageDialog(null, "Difference printing","Set Theory", JOptionPane.INFORMATION_MESSAGE);
                    opStatus = false;
                }
                else{
                    operationType = JOptionPane.showInputDialog(null, "Invalid Choice, please try again", "Operation Menu", JOptionPane.WARNING_MESSAGE).charAt(0);
                    //need else if statement to sort the choice and call their constructor
                }

            }while((operationType != 'U' ||operationType != 'I' || operationType != 'D') && !status);


    }

    public static void logic(int wikiIndex) throws IOException{
        System.out.println("Logic is printing");
        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);
        System.out.println(wiki.getWikiString());
    }

    public static void counting(int wikiIndex) throws IOException{
        System.out.println("Counting is printing");
        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);
        System.out.println(wiki.getWikiString());
    }

    public static void combination(int wikiIndex) throws IOException{
        System.out.println("Combination is printing");
        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);
    }

    public static void permutation(int wikiIndex) throws IOException{
        System.out.println("Permutation is printing");
        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);
    }

    public static void pascalTriangle(int wikiIndex) throws IOException{
        System.out.println("Pascal Triangle printing");
        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);
    }

    public static void induction(int wikiIndex) throws IOException{
        System.out.println("Induction Printing");
        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);
    }

    public static void recursion(int wikiIndex) throws IOException{
        System.out.println("Recursion printing");
        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);
    }

    public static void fibonacciSequence(int wikiIndex) throws IOException{
        System.out.println("Fibonacci printing");
        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);
    }
    public static void numberTheory(int wikiIndex) throws IOException{
        System.out.println("Number Theory");
        System.out.println("Theory");
        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);
    }
    public static void numberSystem(int wikiIndex) throws IOException{
        System.out.println("Number System");
        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);

    }
}

