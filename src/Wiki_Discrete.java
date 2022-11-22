import java.io.*;
import java.util.Scanner;

public class Wiki_Discrete{

    private int wikiIndex;
    private File file;
    private Scanner scanner;

    //No-Arg Constructor
    public Wiki_Discrete(){
        wikiIndex = 0;
        file = new File("");
        scanner = new Scanner("");
    }
    //Constructor with Parameter
    public Wiki_Discrete( int wikiIndex, File file, Scanner scanner){
        this.wikiIndex = wikiIndex;
        this.file = file;
        this.scanner = scanner;
    }
    public Wiki_Discrete( int wikiIndex){
        this.wikiIndex = wikiIndex;

        switch (wikiIndex){
            case 1:
                this.file = new File("set_Theory_Wiki.txt");
                setTheory(file);
                break;
            case 2:
                this.file = new File("logic_Wiki.txt");
                logic(file);
                break;
            case 3:
                this.file = new File("counting_Wiki.txt");
                counting(file);
                break;
            case 4:
                this.file = new File("combination_Wiki.txt");
                combination(file);
                break;
            case 5:
                this. file = new File("permutation_Wiki.txt");
                permutation(file);
                break;
            case 6:
                this.file = new File("pascal_Triangle_Wiki.txt");
                pascalTriangle(file);
                break;
            case 7:
                this.file = new File("induction_Wiki.txt");
                induction(file);
                break;
            case 8:
                this.file = new File("recursion_Wiki.txt");
                recursion(file);
                break;
            case 9:
                this.file = new File("fibonacci_Wiki.txt");
                fibonacci(file);
                break;
            case 10:
                this.file = new File("number_Theory_Wiki.txt");
                numberTheory(file);
                break;
            case 11:
                this.file = new File("number_System_Wiki.txt");
                numberSystem(file);
                break;
        }
    }
    public static void working(){
        System.out.println("It's Working");
    }
    public static void setTheory(File file){
        Scanner scanner = new Scanner(file);
    }
    public static void logic(File file){

    }
    public static void counting(File file){

    }
    public static void combination(File file){

    }
    public static void permutation(File file){

    }
    public static void pascalTriangle(File file){

    }
    public static void induction(File file){

    }
    public static void recursion(File file){

    }
    public static void fibonacci(File file){

    }
    public static void numberTheory(File file){

    }
    public static void numberSystem(File file){

    }

}
