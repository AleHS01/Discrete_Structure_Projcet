public class Permutation_Operation {

    static String FString = "";
    static int num = 0;

    public static String permutationString(String str1, String str2){



        if(str1.length() == 0){
            num++;
            FString = FString + str2 + " \n";
            return FString;
        }
        for(int i = 0; i < str1.length(); i++){

            //num++;
            char c = str1.charAt(i);

            String temp = str1.substring(0,i) + str1.substring(i + 1);
            permutationString(temp, str2 + c);
        }

        return FString;
    }
    public static int getPerNum(){
        return num;
    }
    public static void clear(){
        FString = "";
        num = 0;
    }
//
//    public static void main(String[] args) {
//        System.out.println(permutationString("abc", ""));;
//    }

}
