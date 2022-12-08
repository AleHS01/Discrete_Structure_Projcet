public class Fibonacci_Sequence_Operation {

    public static  String Fibonacci(int n){
       String str = "";
        if(n <= 1){
            return "" + n;
        }
        else{
            str = str + Fibonacci(n-1) + Fibonacci(n -2);
            return str;
        }
    }
}
