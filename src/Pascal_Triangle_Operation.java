public class Pascal_Triangle_Operation {

    public static String pascalTriangle(int n){

        String str = "";
        int temp = n - 1;
        for(int i = 1; i <= n; i++){

            for(int j = 0; j <= temp; j++){
                str  = str + ".";
            }
            temp--;
            str = str+ "/";
            int p = 1;

            for(int k = 1; k <= i; k++){


                str =  str + ( p  + " ");

                p = p *  (i - k)/k;
            }
            str = str + "\n";
        }
        return str;
    }

}
