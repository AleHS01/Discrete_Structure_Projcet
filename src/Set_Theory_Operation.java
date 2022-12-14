import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Set_Theory_Operation {

    private final int totalElements = 10;

    char setChoice;
    char operationType;
    ArrayList <String> UnionSet = new ArrayList <String>();
    ArrayList <String> IntersectionSet = new ArrayList <String>();
    ArrayList <String> DifferenceSet = new ArrayList <String>();
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

//        UnionSet.addAll(List.of(A));
//        UnionSet.addAll(List.of(B));

        for(int i = 0; i < A.length; i++){
            UnionSet.add(A[i]);
        }
        for(int i = 0; i < B.length; i++){
            if(!UnionSet.contains(B[i]))
                UnionSet.add(B[i]);
        }
    }

    public void setUnion(String [] A, String [] B, String [] C){
        for(int i = 0; i < A.length; i++){
            UnionSet.add(A[i]);
        }
        for(int i = 0; i < B.length; i++){
            if(!UnionSet.contains(B[i]))
                UnionSet.add(B[i]);
        }
        for(int i = 0; i < C.length; i++){
            if(!UnionSet.contains(C[i]))
                UnionSet.add(C[i]);
        }
    }
    public void setUnion(String [] A, String [] B, String [] C, String [] D){
        for(int i = 0; i < A.length; i++){
            UnionSet.add(A[i]);
        }
        for(int i = 0; i < B.length; i++){
            if(!UnionSet.contains(B[i]))
                UnionSet.add(B[i]);
        }
        for(int i = 0; i < C.length; i++){
            if(!UnionSet.contains(C[i]))
                UnionSet.add(C[i]);
        }
        for(int i = 0; i < D.length; i++){
            if(!UnionSet.contains(D[i]))
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
            setIntersection(letterSetA, letterSetB, letterSetC);
        }
        else if(setNum == 4){
            letterSetC = setC.split(",");
            letterSetD =setD.split(",");
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
                }
            }

        }

    }
    public void setIntersection(String [] A, String [] B, String [] C){
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j <B.length; j++){
                for(int k = 0; k <C.length; k++){
                    if(A[i].equals(B[j]) && (A[i].equals(C[k]) && B[j].equals(C[k]))){
                        IntersectionSet.add(A[i]);
                    }
                }
            }
        }
    }
    public void setIntersection(String [] A, String [] B, String [] C, String [] D){

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j <B.length; j++){
                for(int k = 0; k <C.length; k++){
                    for(int l = 0; l <D.length; l++){
                        if(A[i].equals(B[j]) && (A[i].equals(C[k]) && B[j].equals(C[k])) && (A[i].equals(D[l]) && B[j].equals(D[l]) && C[k].equals(D[l]))){
                            IntersectionSet.add(A[i]);
                        }
                    }
                }
            }
        }
    }
    public String getIntersection(){
        String str = "Intersection: " + IntersectionSet.size() + " elements \n";
        int commaPosition;
        int index = 0;

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

    /*Methods: Difference of Set
    */

    public void setMainDifference(String setA, String setB, String setC, String setD, int setNum, char cDiff){

        letterSetA = setA.split(",");
        letterSetB =setB.split(",");

        if(setNum == 3){

            letterSetC = setC.split(",");
            setDifference(letterSetA, letterSetB, letterSetC,cDiff);
        }
        else if(setNum == 4){
            letterSetC = setC.split(",");
            letterSetD =setD.split(",");
            setDifference(letterSetA, letterSetB, letterSetC,letterSetD,cDiff);

        }
        else{
            setDifference(letterSetA, letterSetB,cDiff);
        }
    }
    public void setDifference(String [] A, String [] B, char cDiff){
        //DifferenceSet
        if(cDiff == 'A' || cDiff == 'a'){

            for(int i = 0; i < A.length; i++){
                DifferenceSet.add(A[i]);
            }
//            for(int i = 0; i < A.length; i++){
//                for(int j = 0; j <B.length; j++){
//                    if(!A[i].equals(B[j])){
//                        DifferenceSet.add(A[i]);
//                        break;
//                    }
//                }
//            }
        DifferenceSet.removeAll(List.of(B));
        }
        else{

            for(int i = 0; i < B.length; i++){
                DifferenceSet.add(B[i]);
            }
//            for(int i = 0; i < B.length; i++){
//                for(int j = 0; j <A.length; j++){
//                    if(!B[i].equals(A[j])){
//                        DifferenceSet.add(B[i]);
//                        break;
//                    }
//                }
//
//            }
            DifferenceSet.removeAll(List.of(A));
        }


    }
    public void setDifference(String [] A, String [] B, String [] C,char cDiff){

        switch (cDiff){
            case 'A':
            case 'a':

                for(int i = 0; i < A.length; i++){
                    DifferenceSet.add(A[i]);
                }

                DifferenceSet.removeAll(List.of(B));
                DifferenceSet.removeAll(List.of(C));
                break;
            case 'b':
            case 'B':

                for(int i = 0; i < B.length; i++){
                    DifferenceSet.add(B[i]);
                }

                DifferenceSet.removeAll(List.of(A));
                DifferenceSet.removeAll(List.of(C));
                break;
            case 'c':
            case 'C':

                for(int i = 0; i < C.length; i++){
                    DifferenceSet.add(C[i]);
                }

                DifferenceSet.removeAll(List.of(A));
                DifferenceSet.removeAll(List.of(B));
                break;
        }

    }
    public void setDifference(String [] A, String [] B, String [] C, String [] D,char cDiff){

        switch (cDiff){
            case 'A':
            case 'a':

                for(int i = 0; i < A.length; i++){
                    DifferenceSet.add(A[i]);
                }

                DifferenceSet.removeAll(List.of(B));
                DifferenceSet.removeAll(List.of(C));
                DifferenceSet.removeAll(List.of(D));
                break;
            case 'b':
            case 'B':

                for(int i = 0; i < B.length; i++){
                    DifferenceSet.add(B[i]);
                }

                DifferenceSet.removeAll(List.of(A));
                DifferenceSet.removeAll(List.of(C));
                DifferenceSet.removeAll(List.of(D));
                break;
            case 'c':
            case 'C':

                for(int i = 0; i < C.length; i++){
                    DifferenceSet.add(C[i]);
                }

                DifferenceSet.removeAll(List.of(A));
                DifferenceSet.removeAll(List.of(B));
                DifferenceSet.removeAll(List.of(D));
                break;
            case 'D':
            case 'd':

                for(int i = 0; i < D.length; i++){
                    DifferenceSet.add(D[i]);
                }
                DifferenceSet.removeAll(List.of(A));
                DifferenceSet.removeAll(List.of(B));
                DifferenceSet.removeAll(List.of(C));
                break;
        }
    }

    public String getDifference(){
        String str = "Differences: " + DifferenceSet.size() + " elements \n";
        int commaPosition;
        int index = 0;

        while(index < DifferenceSet.size()){
            str = str + DifferenceSet.get(index);
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