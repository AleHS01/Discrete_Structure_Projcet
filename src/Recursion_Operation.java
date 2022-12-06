public class Recursion_Operation {

    public static int factorial(int num){
        //When it get to the end then multiply by 1
        if(num == 0)
            return 1;
        else
            return num * factorial(num-1); //Keeps Multiplying until num = -1
    }

}
