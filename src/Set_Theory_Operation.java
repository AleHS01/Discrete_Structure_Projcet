import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Set_Theory_Operation {

    private final int totalElements = 10;

    char setChoice;
    char operationType;
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
    public Set_Theory_Operation(char operationType, char setChoice, String setA, String setB){
        this.operationType = operationType;
        this.setChoice = setChoice;
        this.set = set;

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

    }
    public String miniMenu(){

        String operationMenu = "What do you wish to perform?\n\tU -- Union of Sets\n\tI -- Intersection of Sets\n\tD -- Difference of Sets\n\tG -- Go Back";

        return operationMenu;
    }
    public void getUnion(){

        switch (setChoice){
            case 'L':
            case 'l':
                //letterSetA
                getLetterUnion(letterSetA, letterSetB);
                JOptionPane.showMessageDialog(null,getLetterUnion(letterSetA, letterSetB), "Letters Set",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 'i':
            case 'I':
                break;
        }

    }
    public void letterUnion(String [] A, String [] B){

    }
    public int [] getNumUnion(int [] A, int [] B){
        int [] unionSet = new int[20];

        for(int i = 0; i < A.length; i++){
            unionSet [i] = A[i];
        }
        for(int i = 0; i < B.length; i++){
            unionSet [i] = B[i];
        }

        return unionSet;
    }
    public String [] getLetterUnion(String [] A, String [] B){

        String [] unionSet = new String[20];

        for(int i = 0; i < A.length; i++){
            unionSet [i] = A[i];
        }
        for(int i = 0; i < B.length; i++){
            unionSet [i] = B[i];
        }

        return unionSet;
    }
}
