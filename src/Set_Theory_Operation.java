import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Set_Theory_Operation {

    private final int totalElements = 10;

    char setChoice;
    char operationType;
    int [] numUnionSet = new int[20];
    String [] letterUnionSet = new String[20];
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
            String [] arrB = setA.split(",");

            for(int i = 0; 1 < arrA.length; i++){
                numSetA[i] = Integer.parseInt(arrA[i]);
            }
            for(int i = 0; 1 < arrB.length; i++){
                numSetB[i] = Integer.parseInt(arrB[i]);
            }
        }
        switch (setChoice){
            case 'L':
            case 'l':
                //letterSetA
                setLetterUnion(letterSetA, letterSetB);
                JOptionPane.showMessageDialog(null,"Hola", "Letters Set",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 'i':
            case 'I':
                setNumUnion(numSetA, numSetB);
                break;
        }

    }
    public void setLetterUnion(String [] A, String [] B){
        for(int i = 0; i < A.length; i++){
            letterUnionSet [i] = A[i];
        }
        for(int i = A.length; i < 20; i++){
            if(B[i] != null)
            letterUnionSet [i] = B[i];
        }
    }
    public void setNumUnion(int [] A, int [] B){
        for(int i = 0; i < A.length; i++){
            numUnionSet [i] = A[i];
        }
        for(int i =  A.length; i < 20; i++){
            if(B[i] != 0)
            numUnionSet [i] = B[i];
        }
    }
    //Getters
    public String getNumUnion(){

        String str = "";
        int commaPosition;

        for(int i =0; i < numUnionSet.length; i++){
            str.concat(Integer.toString(numUnionSet[i]));
            str.concat(", ");
        }
        //commaPosition = str.lastIndexOf(',');

        return str;
    }
    public String getLetterUnion(){
        String str = "";
        return str;
    }
}
