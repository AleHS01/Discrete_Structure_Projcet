import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Set_Theory_Operation {

    private final int totalElements = 10;

    char setChoice;
    char operationType;
    private int [] numSetA= new int[totalElements];
    private int [] numSetB = new int[totalElements];
    private String[] letterSetA = new String [totalElements];
    private String[] letterSetB = new String [totalElements];

    public Set_Theory_Operation(){
        //operationType ='';
        //setChoice = '';

    }
    public Set_Theory_Operation(char operationType, char setChoice){
        this.operationType = operationType;
        this.setChoice = setChoice;
    }
    public String miniMenu(){

        String operationMenu = "What do you wish to perform?\n\tU -- Union of Sets\n\tI -- Intersection of Sets\n\tD -- Difference of Sets";

        return operationMenu;
    }
    public void numUnion(int [] A, int [] B){

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
    public int getLetterUnion(String [] A, String [] B){
        return 2;
    }
}
