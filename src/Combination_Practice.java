import java.util.Random;

public class Combination_Practice {

    static int ans =0;
    static String problemStr = "";
    public static int Combination_Problem(){

        Random random = new Random();

            int n1 = random.nextInt(5,17);
            //int n2 = random.nextInt(2,5);
            String Problem = "", strA = "";

                Problem = "Teams from " + n1 +" schools participate in a basketball tournament.";
                strA = "How many games are there in the tournament if each team must play each other team exactly once?";
                problemStr = Problem + "\n" + strA + "\n";
                ans = (n1*(n1 -1))/2;

        return n1;
    }
    public static int getAns(){
        return ans;
    }

    public static String getProblem(){
        return problemStr;
    }
//
//    public static void main(String[] args) {
//        Combination_Problem('c');
//    }
}

