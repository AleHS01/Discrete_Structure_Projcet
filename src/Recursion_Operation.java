public class Recursion_Operation {

    public static long factorial(long num){
        //When it get to the end then multiply by 1
        if(num == 0)
            return 1;
        else
            return num * factorial(num-1); //Keeps Multiplying until num = 1

        /*
        * The Method is recursive because it calls itself over and over
        * until some status have been made
        * */
    }

    //Try Bigger Integer Class

}
