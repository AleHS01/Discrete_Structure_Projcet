public class Recursion_Operation {

    private static String hanoiStr = "Results:\n";

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

    public static void TowerOfHanoi(int disk, String station1, String station2, String station3){

        if(disk > 0){
            TowerOfHanoi(disk -1, station1, station3, station2);
            hanoiStr = hanoiStr + "\tYou have to move disk from: " + station1 + " to " + station2 + "\n";
            TowerOfHanoi(disk -1, station3, station2, station1);
            //            TowerOfHanoi(disk -1, station1, station2, station3);
            //TowerOfHanoi(disk -1, station2, station3, station1);
            //TowerOfHanoi(disk -1, station2, station1, station3);
            //TowerOfHanoi(disk -1, station2, station1, station3);
        }
    }

    public static String HanoiToString(){
        return hanoiStr;
    }

    //Try Bigger Integer Class -- Need To investigate

}
