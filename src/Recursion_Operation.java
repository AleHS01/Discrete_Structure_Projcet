import java.util.ArrayList;
public class Recursion_Operation {

    private static String hanoiStr = "Results:\n";
    //private  static int [] gcdArr;
    public static long factorial(long num){
        //When it gets to the end then multiply by 1
        if(num == 0)
            return 1;
        else
            return num * factorial(num-1); //Keeps Multiplying until num = 1

        /*
        * The Method is recursive because it calls itself over and over
        * until some status have been made
        * */
    }

    public static void TowerOfHanoi(int disk, String currentPos, String destiny, String temp){

        //Station 1 = Current position of the disk
        //Station 2 = Where we want the disk to be
        //Station 3 = Temporary position

        //initialDisk
        if(disk > 0){
            TowerOfHanoi(disk -1, currentPos, temp, destiny);
            hanoiStr = hanoiStr + "  -You have to move disk " + disk +  " from: " + currentPos + " to " + destiny + "\n";
            TowerOfHanoi(disk -1, temp, destiny, currentPos);

        }
    }
    public static String HanoiToString(){
        return hanoiStr;
    }

    /*Find GCD of Multiple Numbers*/

    public static int [] convertToArr(String str){

        String [] strArr = str.split(",");
        int [] gcdArr = new int [strArr.length];
        for(int i = 0; i < strArr.length; i++){
            gcdArr[i] = Integer.parseInt(strArr[i]);
        }
        //gcdArr = String.valueOf(str.split(","));
        return gcdArr;
    }

    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        else{
            return gcd(b, a % b);
        }
    }

    public static int getGCD(int [] intArray, int i){
        int a, b;

        if(i == intArray.length - 1){
            return intArray[i];
        }
        else{
            a = intArray[i];
            b = getGCD(intArray, i + 1);
            return gcd(a,b);
        }

    }


    //Try Bigger Integer Class -- Need To investigate

}
