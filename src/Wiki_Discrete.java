import java.io.*;
import java.util.Scanner;
public class Wiki_Discrete{

    private int wikiIndex;
    private File file;
    private String wikiString;

    //No-Arg Constructor
    public Wiki_Discrete(){
        wikiIndex = 0;
        file = new File("");
        wikiString = "";
    }
    //Constructor
    public Wiki_Discrete( int wikiIndex)throws IOException{
        wikiString = "";
        this.wikiIndex = wikiIndex;
        switch (wikiIndex){
            case 1:
                this.file = new File("/Users/alehs/Desktop/Discrete Strucuture/Discrete_Structure_Project/src/WikiFolder/set_Theory_Wiki.txt");
                setWikiString( file);
                break;
            case 2:
                this.file = new File("/Users/alehs/Desktop/Discrete Strucuture/Discrete_Structure_Project/src/WikiFolder/logic_Wiki.txt");
                setWikiString( file);
                break;
            case 3:
                this.file = new File("/Users/alehs/Desktop/Discrete Strucuture/Discrete_Structure_Project/src/WikiFolder/counting_Wiki.txt");
                setWikiString( file);
                break;
            case 4:
                this.file = new File("/Users/alehs/Desktop/Discrete Strucuture/Discrete_Structure_Project/src/WikiFolder/combination_Wiki.txt");
                setWikiString( file);
                break;
            case 5:
                this. file = new File("/Users/alehs/Desktop/Discrete Strucuture/Discrete_Structure_Project/src/WikiFolder/permutation_Wiki.txt");
                setWikiString( file);
                break;
            case 6:
                this.file = new File("/Users/alehs/Desktop/Discrete Strucuture/Discrete_Structure_Project/src/WikiFolder/pascal_Triangle_Wiki.txt");
                setWikiString( file);
                break;
            case 7:
                this.file = new File("/Users/alehs/Desktop/Discrete Strucuture/Discrete_Structure_Project/src/WikiFolder/induction_Wiki.txt");
                setWikiString( file);
                break;
            case 8:
                this.file = new File("/Users/alehs/Desktop/Discrete Strucuture/Discrete_Structure_Project/src/WikiFolder/recursion_Wiki.txt");
                setWikiString( file);
                break;
            case 9:
                this.file = new File("/Users/alehs/Desktop/Discrete Strucuture/Discrete_Structure_Project/src/WikiFolder/fibonacci_Wiki.txt");
                setWikiString( file);
                break;
            case 10:
                this.file = new File("/Users/alehs/Desktop/Discrete Strucuture/Discrete_Structure_Project/src/WikiFolder/number_Theory_Wiki.txt");
                setWikiString( file);
                break;
            case 11:
                this.file = new File("/Users/alehs/Desktop/Discrete Strucuture/Discrete_Structure_Project/src/WikiFolder/number_System_Wiki.txt");
                setWikiString( file);
                break;
        }
    }
    //Setters
    private void setWikiString(File file) throws IOException{
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()){
            wikiString = wikiString.concat(scan.nextLine() + "\n");
        }
    }
    public String getWikiString(){
        return wikiString;
    }

}
