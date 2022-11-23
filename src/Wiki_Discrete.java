import java.io.*;
import java.util.Scanner;
public class Wiki_Discrete{

    private int wikiIndex;
    private File file;
    private Scanner scanner;
    private String wikiString;

    //No-Arg Constructor
    public Wiki_Discrete(){
        wikiIndex = 0;
        file = new File("");
        scanner = new Scanner("");
        wikiString = "";
    }
    //Constructor with Parameter
    /*public Wiki_Discrete( int wikiIndex, File file, Scanner scanner){
        this.wikiIndex = wikiIndex;
        this.file = file;
        this.scanner = scanner;
    }*/
    public Wiki_Discrete( int wikiIndex)throws IOException{
        wikiString = "";
        this.wikiIndex = wikiIndex;
        switch (wikiIndex){
            case 1:
                this.file = new File("/Users/alehs/Desktop/Discrete Strucuture/Discrete_Structure_Project/src/WikiFolder/set_Theory_Wiki.txt");
                setterSetTheory(file);
                break;
            case 2:
                this.file = new File("/Users/alehs/Desktop/Discrete Strucuture/Discrete_Structure_Project/src/WikiFolder/logic_Wiki.txt");
                setLogic(file);
                break;
            case 3:
                this.file = new File("/Users/alehs/Desktop/Discrete Strucuture/Discrete_Structure_Project/src/WikiFolder/counting_Wiki.txt");
                counting(file);
                break;
            case 4:
                this.file = new File("/Users/alehs/Desktop/Discrete Strucuture/Discrete_Structure_Project/src/WikiFolder/combination_Wiki.txt");
                combination(file);
                break;
            case 5:
                this. file = new File("/Users/alehs/Desktop/Discrete Strucuture/Discrete_Structure_Project/src/WikiFolder/permutation_Wiki.txt");
                permutation(file);
                break;
            case 6:
                this.file = new File("/Users/alehs/Desktop/Discrete Strucuture/Discrete_Structure_Project/src/WikiFolder/pascal_Triangle_Wiki.txt");
                pascalTriangle(file);
                break;
            case 7:
                this.file = new File("/Users/alehs/Desktop/Discrete Strucuture/Discrete_Structure_Project/src/WikiFolder/induction_Wiki.txt");
                induction(file);
                break;
            case 8:
                this.file = new File("/Users/alehs/Desktop/Discrete Strucuture/Discrete_Structure_Project/src/WikiFolder/recursion_Wiki.txt");
                recursion(file);
                break;
            case 9:
                this.file = new File("/Users/alehs/Desktop/Discrete Strucuture/Discrete_Structure_Project/src/WikiFolder/fibonacci_Wiki.txt");
                fibonacci(file);
                break;
            case 10:
                this.file = new File("/Users/alehs/Desktop/Discrete Strucuture/Discrete_Structure_Project/src/WikiFolder/number_Theory_Wiki.txt");
                numberTheory(file);
                break;
            case 11:
                this.file = new File("/Users/alehs/Desktop/Discrete Strucuture/Discrete_Structure_Project/src/WikiFolder/number_System_Wiki.txt");
                numberSystem(file);
                break;
        }
    }
    //Setters
    public static void working(){
        System.out.println("It's Working");
    }
    public void setterSetTheory(File file) throws IOException{

        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()){
            wikiString = wikiString.concat(scan.nextLine() + " ");
            //infoArray.add(scanner.nextLine());
        }
    }
    public void setLogic(File file)throws IOException{
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()){
            wikiString = wikiString.concat(scan.nextLine() + " ");
            //infoArray.add(scanner.nextLine());
        }
    }
    public void counting(File file)throws IOException{

    }
    public void combination(File file)throws IOException{

    }
    public void permutation(File file)throws IOException{

    }
    public void pascalTriangle(File file)throws IOException{

    }
    public void induction(File file)throws IOException{

    }
    public void recursion(File file)throws IOException{

    }
    public void fibonacci(File file)throws IOException{

    }
    public void numberTheory(File file)throws IOException{

    }
    public void numberSystem(File file)throws IOException{

    }

    //Getters

    public String getSetTheory(){
        return wikiString;
    }
    public String getLogic(){
        return wikiString;
    }
}
