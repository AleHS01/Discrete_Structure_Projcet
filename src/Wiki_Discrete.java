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

    public static void working(){
        System.out.println("It's Working");
    }


}
