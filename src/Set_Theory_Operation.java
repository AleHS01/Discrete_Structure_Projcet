import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Set_Theory_Operation {

    private final int totalElements = 10;

    char setChoice;
    char operationType;
    ArrayList <String> UnionSet = new ArrayList <String>();
    ArrayList <String> IntersectionSet = new ArrayList <String>();
    Set<String> interSet = new HashSet<>();
    private String[] letterSetA = new String [totalElements];
    private String[] letterSetB = new String [totalElements];
    private String[] letterSetC = new String [totalElements];
    private String[] letterSetD = new String [totalElements];

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

    }
    public String miniMenu(){

        String operationMenu = "What do you wish to perform?\n\tU -- Union of Sets\n\tI -- Intersection of Sets\n\tD -- Difference of Sets\n\tG -- Go Back";

        return operationMenu;
    }
    public void setMainUnion(String setA, String setB, String setC, String setD, int setNum){
            letterSetA = setA.split(",");
            letterSetB =setB.split(",");

            if(setNum == 3){
                letterSetC = setC.split(",");
                setUnion(letterSetA, letterSetB, letterSetC);
            }
            else if(setNum == 4){
                letterSetC = setC.split(",");
                letterSetD =setD.split(",");
                setUnion(letterSetA, letterSetB, letterSetC,letterSetD);
            }
            else{
                setUnion(letterSetA, letterSetB);
            }
    }
    public void setUnion(String [] A, String [] B){
        for(int i = 0; i < A.length; i++){
            UnionSet.add(A[i]);
        }
        for(int i = 0; i < B.length; i++){
            if(B[i] != null)
                UnionSet.add(B[i]);
        }
    }

    public void setUnion(String [] A, String [] B, String [] C){
        for(int i = 0; i < A.length; i++){
            UnionSet.add(A[i]);
        }
        for(int i = 0; i < B.length; i++){
            if(B[i] != null)
                UnionSet.add(B[i]);
        }
        for(int i = 0; i < C.length; i++){
            if(C[i] != null)
                UnionSet.add(C[i]);
        }
    }
    public void setUnion(String [] A, String [] B, String [] C, String [] D){
        for(int i = 0; i < A.length; i++){
            UnionSet.add(A[i]);
        }
        for(int i = 0; i < B.length; i++){
            if(B[i] != null)
                UnionSet.add(B[i]);
        }
        for(int i = 0; i < C.length; i++){
            if(C[i] != null)
                UnionSet.add(C[i]);
        }
        for(int i = 0; i < D.length; i++){
            if(D[i] != null)
                UnionSet.add(D[i]);
        }
    }

    public String getUnion(){
        String str = "Union:\n";
        int commaPosition;
        int index = 0;

        while(index < UnionSet.size()){
            str = str + UnionSet.get(index);
            str = str + ", ";
            index++;
        }

        commaPosition = str.lastIndexOf(',');
        char [] c = str.toCharArray();
        c[commaPosition] = ' ';
        str = String.valueOf(c);
        return str;
    }

    /*Methods: Intersection
    *
    */

    public void setMainIntersection(String setA, String setB, String setC, String setD, int setNum){
        letterSetA = setA.split(",");
        letterSetB =setB.split(",");

        if(setNum == 3){

            letterSetC = setC.split(",");
            for(int i = 0; i < 10; i++) {
                if (letterSetC[i] == null) {
                    letterSetC[i] = "";
                }
            }
            setIntersection(letterSetA, letterSetB, letterSetC);
        }
        else if(setNum == 4){
            letterSetC = setC.split(",");
            letterSetD =setD.split(",");
            for(int i = 0; i < 10; i++){
                if(letterSetC[i] == null){
                    letterSetC[i] ="";
                }
                if(letterSetD[i] == null){
                    letterSetD[i] ="";
                }
            }
            setIntersection(letterSetA, letterSetB, letterSetC,letterSetD);

        }
        else{
            setIntersection(letterSetA, letterSetB);
        }
    }
    public void setIntersection(String [] A, String [] B){
        //IntersectionSet
        //interSet

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j <B.length; j++){
                if(A[i].equals(B[j])){
                    IntersectionSet.add(A[i]);
                    //break;
                }
            }

        }

    }
    public void setIntersection(String [] A, String [] B, String [] C){
        for(int i = 0; i < A.length; i++){
            if(A[i].equals(B[i]) && (A[i].equals(C[i]) && B[i].equals(C[i]))){
                IntersectionSet.add(A[i]);
            }
        }
    }
    public void setIntersection(String [] A, String [] B, String [] C, String [] D){
        for(int i = 0; i < A.length; i++){
            if(A[i].equals(B[i]) && (A[i].equals(C[i]) && B[i].equals(C[i])) && (A[i].equals(D[i]) && B[i].equals(D[i]) && C[i].equals(D[i]))){
                IntersectionSet.add(A[i]);
            }
        }
    }
    public String getIntersection(){
        String str = "Intersection: " + IntersectionSet.size() + " elements \n";
        int commaPosition;
        int index = 0;

//        for(String i : IntersectionSet)
//            str = (i + ", ");
        while(index < IntersectionSet.size()){
            str = str + IntersectionSet.get(index);
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