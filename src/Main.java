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
                    JOptionPane.showMessageDialog(null,"Quitting Program", "Quitting",JOptionPane.ERROR_MESSAGE);
                    doneFlag = false;
                    break;
                case 'S':
                case 's':
                    wikiIndex = 1;
                    setTheory(wikiIndex);
                    break;
                case 'C':
                case 'c':
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
                default:
                    wikiIndex = 0;
                    JOptionPane.showMessageDialog(null, "Error: '" + choice+"' is an invalid selection - Try Again Please\n", "Discrete Structure Menu", JOptionPane.PLAIN_MESSAGE);
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
                "\tT -- Pascal Triangle\n" +
                "\tR -- Recursion\n" +
                "\tF -- Fibonacci Sequence\n" +
                "\tC -- Combination\n" +
                "\tP -- Permutation\n" +
                "\tQ -- Quit\n\n" +
                "Enter your Selection: ";
        choice = JOptionPane.showInputDialog(null, jString, "Menu", JOptionPane.PLAIN_MESSAGE).charAt(0);

        return choice;

    }

//    public static void pause(Scanner scan, char choice) {
//        if (choice != 'q' && choice != 'Q') {
//            System.out.println();
//            System.out.println("Press \"Enter\" to continue");
//            String tempWait = scan.nextLine();
//            tempWait = scan.nextLine();
//        } else {
//            System.out.println("Quitting Program");
//        }
//
//    }

    public static void setTheory(int wikiIndex) throws IOException {
        String menu;
        String operationMiniMenu;
        String typeOfOperation; //whether is a Letter Unions, or Integers Union
        String setA = "", setB = "", setC = "", setD = "";
        char operationType = ' ';
        char menuOption;
        boolean status = true;
        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);
        Set_Theory_Operation operation;

        menu = "What do you wish to do?\n\tI -- Information about Set Theory\n\tO -- Perform and Operation\n\tG -- Go Back";
        operationMiniMenu = "What do you wish to perform?\n\tU -- Union of Sets\n\tI -- Intersection of Sets\n\tD -- Difference of Sets\n\tG -- Go Back";
        typeOfOperation = "How Many sets do you Want to Work With\n\t2 -- Two Sets\n\t3 -- Three Sets\n\t4 -- Four Set\n\tG -- Go Back";

        do{
            menuOption = JOptionPane.showInputDialog(null, menu, "Set Theory Menu", JOptionPane.PLAIN_MESSAGE).charAt(0);
            switch (menuOption){
                case 'G':
                case 'g':
                    status = false;
                    break;
                case 'i':
                case 'I':
                    JOptionPane.showMessageDialog(null, wiki.getWikiString(), "Set Theory Info", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 'O':
                case 'o':

                    boolean secondBoolean = true;
                    do{
                        operationType = JOptionPane.showInputDialog(null, operationMiniMenu,"Operation Menu", JOptionPane.PLAIN_MESSAGE).charAt(0);
                        boolean thirdBoolean = true;
                        switch (operationType){
                            case 'G':
                            case 'g':
                                secondBoolean = false;
                                break;
                            case 'U':
                            case 'u':
                                do{
                                    char typeChoice =JOptionPane.showInputDialog(null, typeOfOperation,"Menu", JOptionPane.PLAIN_MESSAGE).charAt(0);
                                    int setNum= 0;
                                    switch (typeChoice){
                                        case '1':
                                        case '2':
                                            setNum = 2;
                                            operation = new Set_Theory_Operation();
                                            setA = JOptionPane.showInputDialog(null, "Enter First set - Set A\nDivide each element by comma","Set A", JOptionPane.PLAIN_MESSAGE);
                                            setB = JOptionPane.showInputDialog(null, "Enter Second set - Set B\nDivide each element by comma","Set B", JOptionPane.PLAIN_MESSAGE);
                                            operation.setMainUnion(setA, setB, setC, setD, setNum);
                                            JOptionPane.showMessageDialog(null, operation.getUnion(), "Union", JOptionPane.PLAIN_MESSAGE);
                                            break;
                                        case '3':
                                            setNum =3;
                                            operation = new Set_Theory_Operation();
                                            setA = JOptionPane.showInputDialog(null, "Enter First set - Set A\nDivide each element by comma","Set A", JOptionPane.PLAIN_MESSAGE);
                                            setB = JOptionPane.showInputDialog(null, "Enter Second set - Set B\nDivide each element by comma","Set B", JOptionPane.PLAIN_MESSAGE);
                                            setC = JOptionPane.showInputDialog(null, "Enter first set - Set C\nDivide each element by comma","Set C", JOptionPane.PLAIN_MESSAGE);
                                            operation.setMainUnion(setA, setB, setC, setD, setNum);
                                            JOptionPane.showMessageDialog(null, operation.getUnion(), "Union", JOptionPane.PLAIN_MESSAGE);
                                            break;
                                        case '4':
                                            setNum =4;
                                            operation = new Set_Theory_Operation();
                                            setA = JOptionPane.showInputDialog(null, "Enter First set - Set A\nDivide each element by comma","Set A", JOptionPane.PLAIN_MESSAGE);
                                            setB = JOptionPane.showInputDialog(null, "Enter Second set - Set B\nDivide each element by comma","Set B", JOptionPane.PLAIN_MESSAGE);
                                            setC = JOptionPane.showInputDialog(null, "Enter first set - Set C\nDivide each element by comma","Set C", JOptionPane.PLAIN_MESSAGE);
                                            setD = JOptionPane.showInputDialog(null, "Enter first set - Set D\nDivide each element by comma","Set D", JOptionPane.PLAIN_MESSAGE);
                                            operation.setMainUnion(setA, setB, setC, setD, setNum);
                                            JOptionPane.showMessageDialog(null, operation.getUnion(), "Union", JOptionPane.PLAIN_MESSAGE);
                                            break;
                                        case 'G':
                                        case 'g':
                                            thirdBoolean = false;
                                            break;
                                        default:
                                            JOptionPane.showMessageDialog(null, "Error: '" + typeChoice + "' is an invalid selection - Try Again Please\n",
                                                    "Menu", JOptionPane.WARNING_MESSAGE);
                                            break;
                                    }
                                }while (thirdBoolean);
                                break;
                            case 'I':
                            case 'i':
                                do{
                                    char typeChoice =JOptionPane.showInputDialog(null, typeOfOperation,"Menu", JOptionPane.PLAIN_MESSAGE).charAt(0);
                                    int setNum;
                                    switch (typeChoice){
                                        case '1':
                                        case '2':
                                            operation = new Set_Theory_Operation();
                                            setNum = 2;
                                            setA = JOptionPane.showInputDialog(null, "Enter First set - Set A\nDivide each element by comma","Set A", JOptionPane.PLAIN_MESSAGE);
                                            setB = JOptionPane.showInputDialog(null, "Enter Second set - Set B\nDivide each element by comma","Set B", JOptionPane.PLAIN_MESSAGE);
                                            operation.setMainIntersection(setA, setB, setC, setD, setNum);
                                            JOptionPane.showMessageDialog(null, operation.getIntersection(), "Intersection", JOptionPane.PLAIN_MESSAGE);
                                            break;
                                        case '3':
                                            operation = new Set_Theory_Operation();
                                            setNum = 3;
                                            setA = JOptionPane.showInputDialog(null, "Enter First set - Set A\nDivide each element by comma","Set A", JOptionPane.PLAIN_MESSAGE);
                                            setB = JOptionPane.showInputDialog(null, "Enter Second set - Set B\nDivide each element by comma","Set B", JOptionPane.PLAIN_MESSAGE);
                                            setC = JOptionPane.showInputDialog(null, "Enter first set - Set C\nDivide each element by comma","Set C", JOptionPane.PLAIN_MESSAGE);
                                            operation.setMainIntersection(setA, setB, setC, setD, setNum);
                                            JOptionPane.showMessageDialog(null, operation.getIntersection(), "Intersection", JOptionPane.PLAIN_MESSAGE);
                                            break;
                                        case '4':
                                            operation = new Set_Theory_Operation();
                                            setNum = 4;
                                            setA = JOptionPane.showInputDialog(null, "Enter First set - Set A\nDivide each element by comma","Set A", JOptionPane.PLAIN_MESSAGE);
                                            setB = JOptionPane.showInputDialog(null, "Enter Second set - Set B\nDivide each element by comma","Set B", JOptionPane.PLAIN_MESSAGE);
                                            setC = JOptionPane.showInputDialog(null, "Enter first set - Set C\nDivide each element by comma","Set C", JOptionPane.PLAIN_MESSAGE);
                                            setD = JOptionPane.showInputDialog(null, "Enter first set - Set D\nDivide each element by comma","Set D", JOptionPane.PLAIN_MESSAGE);
                                            operation.setMainIntersection(setA, setB, setC, setD, setNum);
                                            JOptionPane.showMessageDialog(null, operation.getIntersection(), "Intersection", JOptionPane.PLAIN_MESSAGE);
                                            break;
                                        case 'G':
                                        case 'g':
                                            thirdBoolean = false;
                                            break;
                                        default:
                                            JOptionPane.showMessageDialog(null, "Error: '" + typeChoice + "' is an invalid selection - Try Again Please\n",
                                                    "Menu", JOptionPane.WARNING_MESSAGE);
                                            break;
                                    }
                                }while (thirdBoolean);
                                break;
                            case 'D':
                            case 'd':
                                do{
                                    char typeChoice =JOptionPane.showInputDialog(null, typeOfOperation,"Menu", JOptionPane.PLAIN_MESSAGE).charAt(0);
                                    operation = new Set_Theory_Operation();
                                    char c;
                                    int val;
                                    switch (typeChoice){
                                        case '1':
                                        case '2':
                                            val = 2;
                                            c = JOptionPane.showInputDialog(null, "What Set Do You Want to Differentiate?\n\tSet A\n\tSet B", "Count", JOptionPane.PLAIN_MESSAGE).charAt(0);
                                            setA = JOptionPane.showInputDialog(null, "Enter First set - Set A\nDivide each element by comma","Set A", JOptionPane.PLAIN_MESSAGE);
                                            setB = JOptionPane.showInputDialog(null, "Enter Second set - Set B\nDivide each element by comma","Set B", JOptionPane.PLAIN_MESSAGE);
                                            operation.setMainDifference(setA, setB, setC, setD, val,c);
                                            JOptionPane.showMessageDialog(null, operation.getDifference(), "Difference", JOptionPane.PLAIN_MESSAGE);
                                            break;
                                        case '3':
                                            val = 3;
                                            c = JOptionPane.showInputDialog(null, "What Set Do You Want to Differentiate?\n\tSet A\n\tSet B\n\tSet C", "Count", JOptionPane.PLAIN_MESSAGE).charAt(0);
                                            setA = JOptionPane.showInputDialog(null, "Enter First set - Set A\nDivide each element by comma","Set A", JOptionPane.PLAIN_MESSAGE);
                                            setB = JOptionPane.showInputDialog(null, "Enter Second set - Set B\nDivide each element by comma","Set B", JOptionPane.PLAIN_MESSAGE);
                                            setC = JOptionPane.showInputDialog(null, "Enter Third set - Set C\nDivide each element by comma","Set C", JOptionPane.PLAIN_MESSAGE);
                                            operation.setMainDifference(setA, setB, setC, setD, val,c);
                                            JOptionPane.showMessageDialog(null, operation.getDifference(), "Difference", JOptionPane.PLAIN_MESSAGE);
                                            break;
                                        case '4':
                                            val = 4;
                                            c = JOptionPane.showInputDialog(null, "What Set Do You Want to Differentiate?\n\tSet A\n\tSet B\n\tSet C\n\tSet D", "Count", JOptionPane.PLAIN_MESSAGE).charAt(0);
                                            setA = JOptionPane.showInputDialog(null, "Enter First set - Set A\nDivide each element by comma","Set A", JOptionPane.PLAIN_MESSAGE);
                                            setB = JOptionPane.showInputDialog(null, "Enter Second set - Set B\nDivide each element by comma","Set B", JOptionPane.PLAIN_MESSAGE);
                                            setC = JOptionPane.showInputDialog(null, "Enter Third set - Set C\nDivide each element by comma","Set C", JOptionPane.PLAIN_MESSAGE);
                                            setD = JOptionPane.showInputDialog(null, "Enter Fourth set - Set D\nDivide each element by comma","Set D", JOptionPane.PLAIN_MESSAGE);
                                            operation.setMainDifference(setA, setB, setC, setD, val, c);
                                            JOptionPane.showMessageDialog(null, operation.getDifference(), "Difference", JOptionPane.PLAIN_MESSAGE);
                                            break;
                                        case 'G':
                                        case 'g':
                                            thirdBoolean = false;
                                            break;
                                        default:
                                            JOptionPane.showMessageDialog(null, "Error: '" + typeChoice + "' is an invalid selection - Try Again Please\n",
                                                    "Menu", JOptionPane.WARNING_MESSAGE);
                                            break;
                                    }
                                }while (thirdBoolean);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Error: '" + operationType + "' is an invalid selection - Try Again Please\n",
                                        "Set Theory", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                    }while(secondBoolean);

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error: '" + menuOption + "' is an invalid selection - Try Again Please\n",
                            "Set Theory", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        }while(status);

    }

//    public static void logic(int wikiIndex) throws IOException{
//        System.out.println("Logic is printing");
//        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);
//        System.out.println(wiki.getWikiString());
//    }
//
//    public static void counting(int wikiIndex) throws IOException{
//        System.out.println("Counting is printing");
//        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);
//        System.out.println(wiki.getWikiString());
//    }

    public static void combination(int wikiIndex) throws IOException{
        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);

        String menu = "I -- Information about Combinatorics\nG -- Go Back\n     Or\n Enter Witch Problem You want\n" +
                        "    1 -- Problem #1: Schools Teams in A Basketball Tournament";

        char c = JOptionPane.showInputDialog(null, menu, "Combinatorics Problems", JOptionPane.PLAIN_MESSAGE).charAt(0);
        boolean control = true;

        do {
            switch (c) {
                case 'i':
                case 'I':
                    JOptionPane.showMessageDialog(null, wiki.getWikiString(), "Combination Information", JOptionPane.PLAIN_MESSAGE);
                    control = false;
                    break;
                case 'g':
                case 'G':
                    control = false;
                    break;
                default:
                    boolean secondControl = true;

                    int temp = Combination_Practice.Combination_Problem();
                    String tStr = JOptionPane.showInputDialog(null, Combination_Practice.getProblem() + "Enter Solution as an Integer:\n  Or\nG -- Go Back", "Problem", JOptionPane.PLAIN_MESSAGE);

                    //boolean thirdControl = true;
                    switch (tStr) {
                        case "G":
                        case "g":
                            control = false;
                            //secondControl = false;
                            break;
                        default:
                            do {
                                int i = Integer.parseInt(tStr);
                                if (i == Combination_Practice.getAns()) {
                                    JOptionPane.showMessageDialog(null, "Your Answer was Correct, Explanation:\n The number of games is exactly the number of different pairs of teams.\n\n" +
                                            "Answer:\n" + temp + " * " + (temp - 1) + "/2  = " + Combination_Practice.getAns(), "Juanito", JOptionPane.PLAIN_MESSAGE);
                                    control = false;
                                } else {
                                    int count = 3;
                                    for (int j = 0; j < 4; j++) {

                                        if(count == 0){
                                            JOptionPane.showMessageDialog(null, "The Correct Answer should be: "+ Combination_Practice.getAns() +"\nExplanation:\n The number of games is exactly the number of different pairs of teams.\n\n" +
                                                    "Answer:\n" + temp + " * " + (temp - 1) + "/2  = " + Combination_Practice.getAns(), "Solution", JOptionPane.ERROR_MESSAGE);
                                            break;
                                        }
                                        i = Integer.parseInt(JOptionPane.showInputDialog(null, "Umm... That was not the correct Answer\n You have " + count + " more Tries.\nEnter Solution as an Integer:", "Problem", JOptionPane.WARNING_MESSAGE));
                                        if (i == Combination_Practice.getAns()) {
                                            JOptionPane.showMessageDialog(null, "Your Answer was Correct, Explanation:\n The number of games is exactly the number of different pairs of teams.\n\n" +
                                                    "Answer:\n" + temp + " * " + (temp - 1) + "/2  = " + Combination_Practice.getAns(), "Solution", JOptionPane.PLAIN_MESSAGE);
                                            control = false;
                                            break;
                                        }

                                        count--;
                                    }
                                }
                                    break;

                    } while (secondControl);
                }
            }
        }while (control);
    }


    public static void permutation(int wikiIndex) throws IOException{
        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);

        boolean control = true;

        do{
            char c = JOptionPane.showInputDialog(null, "I -- Information about Pascal Triangle\nP -- Permutation Calculator\nG --  Go back\n").charAt(0);
            switch (c){
                case 'G':
                case 'g':
                    control = false;
                    break;
                case 'i':
                case 'I':
                    JOptionPane.showMessageDialog(null, wiki.getWikiString(), "Permutation", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 'P':
                case 'p':
                    String str = JOptionPane.showInputDialog(null, "Enter What you want to get the permutation of");
                    String temp = Permutation_Operation.permutationString(str, "");
                    JOptionPane.showMessageDialog(null, "Permutations: " + Permutation_Operation.getPerNum() + "\n\n" +temp );
                    Permutation_Operation.clear();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error: '" + c + "' is an invalid selection - Try Again Please\n",
                            "Menu", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while(control);
    }

    public static void pascalTriangle(int wikiIndex) throws IOException{
        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);

        String str = "Please Enter the number of line you want the Pascal Triangle to have:";
        boolean control = true;

        do{
            char c = JOptionPane.showInputDialog(null, "I -- Information about Pascal Triangle\nG --  Go back\n  OR Continue:\n" + str).charAt(0);
            switch (c){
                case 'G':
                case 'g':
                    control = false;
                    break;
                case 'i':
                case 'I':
                    JOptionPane.showMessageDialog(null, wiki.getWikiString(), "Pascal Triangle Info", JOptionPane.PLAIN_MESSAGE);
                    break;
                default:
                    if(Character.isDigit(c)){
                        int n = Integer.parseInt(Character.toString(c));
                        String trig = Pascal_Triangle_Operation.pascalTriangle(n);
                        JOptionPane.showMessageDialog(null, trig, "Pascal Triangle", JOptionPane.PLAIN_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Invalid Format, Make sure is and integer -- Try again");
                    }
                    break;
            }
        } while(control);
    }

//    public static void induction(int wikiIndex) throws IOException{
//        System.out.println("induction");
//        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);
//    }

    public static void recursion(int wikiIndex) throws IOException{
        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);
        boolean status = true;
        String menu;
        String current = "Tower #1";
        String destiny = "Tower #3";
        String temp = "Tower #2";


        menu = "What do you wish to Perform?\n\tI -- Information about Recursion\n\tX -- Factorial" +
                "\n\tT -- Tower Of Hanoi\n\tC -- Greatest Common Divisor\n\tL -- Least Common Multiple\n\tG -- Go Back";

        char menuOption;

        do{
            menuOption = JOptionPane.showInputDialog(null, menu, "Recursion Menu", JOptionPane.PLAIN_MESSAGE).charAt(0);
            String str, str2;
            int [] arr;
            switch (menuOption){
                case 'I':
                case 'i':
                    JOptionPane.showMessageDialog(null, wiki.getWikiString(), "Recursion Info", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 'F':
                case 'f':
                    break;
                case 'X':
                case 'x':
                    long num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter The Integer you wish to Get it Factorial\n(Use Number From 0 to 65, That's the maximum a variable can hold)" , "Factorial Calculator", JOptionPane.INFORMATION_MESSAGE));
                    JOptionPane.showMessageDialog(null, "The Factorial of " + num +" is:\n\t" + Recursion_Operation.factorial(num), "Factorial Calculator", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 'T':
                case 't':
                    int disk = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter The Number of Disk Your Tower has?\n" , "Tower Of Hanoi", JOptionPane.INFORMATION_MESSAGE));
                    Recursion_Operation.TowerOfHanoi(disk, current, destiny, temp);
                    JOptionPane.showMessageDialog(null,Recursion_Operation.HanoiToString(), "Results", JOptionPane.PLAIN_MESSAGE );
                    Recursion_Operation.clearHanoiString();
                    break;
                case 'c':
                case 'C':
                    str = JOptionPane.showInputDialog(null, "Enter as Many integer as you like (Split every number with a comma ',')", "Greatest Common Divisor", JOptionPane.PLAIN_MESSAGE);
                    arr = Recursion_Operation.convertToArr(str);
                    str2 = "The Greatest Common Divisor of: " + str + "\n\nGCD:  " + Recursion_Operation.getGCD(arr, 0);
                    JOptionPane.showMessageDialog(null, str2, "Results Of Greatest Common Divisor", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 'L':
                case 'l':
                    str = JOptionPane.showInputDialog(null, "Enter as Many integer as you like (Split every number with a comma ',')", "Greatest Common Divisor", JOptionPane.PLAIN_MESSAGE);
                    arr = Recursion_Operation.convertToArr(str);
                    str2 = "The Least Common Multiple of: " + str + "\n\nLCM:  " + Recursion_Operation.getLCM(arr, 0);
                    JOptionPane.showMessageDialog(null, str2, "Results Of Least Common Multiple", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 'G':
                case 'g':
                    status = false;
                    break;
                    default:
                        JOptionPane.showMessageDialog(null, "Error: '" + menuOption + "' is an invalid selection - Try Again Please\n",
                                "Recursion", JOptionPane.WARNING_MESSAGE);
                        break;
            }
        }while(status);
    }

    public static void fibonacciSequence(int wikiIndex) throws IOException{
        System.out.println("Fibonacci printing");
        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);

        boolean control = true;

        do{
            String c = JOptionPane.showInputDialog(null, "I -- Information about Fibonacci Sequence\nG -- Go back\nEnter how many Fibonacci Numbers you wish to generate", "Fibonacci Sequence", JOptionPane.PLAIN_MESSAGE);
            switch (c){
                case "I":
                case "i":
                    break;
                case "G":
                case "g":
                    control = false;
                    break;
                default:
                        int n = Integer.parseInt(c);
                        String fiboStr = Fibonacci_Sequence_Operation.Fibonacci(n);
                        JOptionPane.showMessageDialog(null, fiboStr, "Fibonacci Sequence", JOptionPane.PLAIN_MESSAGE);
                    break;
            }
        }while (control);
    }
//    public static void numberTheory(int wikiIndex) throws IOException{
//        System.out.println("Number Theory");
//        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);
//    }
//    public static void numberSystem(int wikiIndex) throws IOException{
//        System.out.println("Number System");
//        Wiki_Discrete wiki = new Wiki_Discrete(wikiIndex);
//
//    }
}

