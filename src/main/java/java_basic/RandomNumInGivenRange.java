package java_basic;

public class RandomNumInGivenRange {
    public static void main(String[] args) {

        System.out.println(getRandom(5,74));
    }

    public static int getRandom(int max,int min){
     int num =  (int) (Math.random()*(max-min))+min;
        return num;
    }
}
