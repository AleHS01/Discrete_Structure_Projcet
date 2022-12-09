public class Fibonacci_Sequence_Operation {

    public static  String Fibonacci(int n){

        String str = "";
        int [] f = new int [n+2];
        int i;

        f[0] = 0;
        f[1] = 1;

        str = str + f[0] + " " +f[1] + " ";


        if(n <= 1){
            return "" + n;
        }
        else{
            for (i = 2; i < n; i++){
                f[i] = f[i-1] + f[i-2];
                //Fibonacci(n-1) + Fibonacci(n -2)
                str = str + f[i] + " " ;
            }

            return str;
        }
    }
}
