import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Set_Theory_Operation {

    private final int totalElements = 10;

    char setChoice;
    char operationType;
    ArrayList <Integer> numUnionSet = new ArrayList <Integer>();
    ArrayList <String> letterUnionSet = new ArrayList <String>();
    String set;
    private int [] numSetA= new int[totalElements];
    private int [] numSetB = new int[totalElements];
    private String[] letterSetA = new String [totalElements];
    private String[] letterSetB = new String [totalElements];

    public Set_Theory_Operation(){
        //operationType ='';
        //setChoice = '';

    }
    /*Constructor
    * @Parameter operationType - Type of operation the user wants to make
    * @Parameter setChoice - Determine what  to method to call depending on the type of values
    * */
    public Set_Theory_Operation(char operationType, char setChoice){
        this.operationType = operationType;
        this.setChoice = setChoice;
        this.set = set;



    }
    public String miniMenu(){

        String operationMenu = "What do you wish to perform?\n\tU -- Union of Sets\n\tI -- Intersection of Sets\n\tD -- Difference of Sets\n\tG -- Go Back";

        return operationMenu;
    }
    public void setUnion(String setA, String setB){
        if(setChoice == 'L' || setChoice == 'l'){
            letterSetA = setA.split(",");
            letterSetB =setB.split(",");
        }
        else{
            String [] arrA = setA.split(",");
            String [] arrB = setB.split(",");

            for(int i = 0; i < arrA.length; i++){
                numSetA[i] = Integer.parseInt(arrA[i]);
            }
            for(int i = 0; i < arrB.length; i++){
                numSetB[i] = Integer.parseInt(arrB[i]);
            }
        }
        switch (setChoice){
            case 'L':
            case 'l':
                setLetterUnion(letterSetA, letterSetB);
                break;
            case 'i':
            case 'I':
                setNumUnion(numSetA, numSetB);
                break;
        }

    }
    public void setLetterUnion(String [] A, String [] B){
        for(int i = 0; i < A.length; i++){
            letterUnionSet.add(A[i]);
        }
        for(int i = 0; i < B.length; i++){
            if(B[i] != null)
                letterUnionSet.add(B[i]);
        }
    }
    public void setNumUnion(int [] A, int [] B){
        for(int i = 0; i < A.length; i++){
            numUnionSet.add(A[i]);
        }
        for(int i = 0; i < B.length; i++){
            if(B[i] != 0)
                numUnionSet.add(B[i]);
        }
    }
    //Getters
    public String getNumUnion(){

        String str = "Union: " + numUnionSet.size()+"\n";
        int commaPosition;
        int index = 0;

        while(index < numUnionSet.size()){
            if(numUnionSet.get(index) != 0){
                str = str + numUnionSet.get(index);
                str = str + ", ";
            }

//            str = str + numUnionSet.get(index);
//            str = str + ", ";
            index++;
        }
        commaPosition = str.lastIndexOf(',');
        char [] c = str.toCharArray();
        c[commaPosition] = ' ';
        str = String.valueOf(c);

        return str;
    }
    public String getLetterUnion(){
        String str = "Union:\n";
        int commaPosition;
        int index = 0;

        while(index < letterUnionSet.size()){
            str = str +letterUnionSet.get(index);
            str = str + ", ";
            index++;
        }

        commaPosition = str.lastIndexOf(',');
        char [] c = str.toCharArray();
        c[commaPosition] = ' ';
        str = String.valueOf(c);
        return str;
    }
}
