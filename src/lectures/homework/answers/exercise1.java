package lectures.homework.answers;
import java.util.*;
public class exercise1 {
    public static double average(int marks1,int marks2,int marks3){
        int avg = (marks1+marks2+marks3)/3;
        return avg;
    }
    public static int sumallodds(int n){
        int sum = 0;
        for(int i = 1;i<=n;i++){
            if(i%2==0){
                continue;
            }
            else{
                sum += i;
            }
        }
        return sum;
    }
    public static int greaternum(int n,int j){
        int greaternum = n;
        if(n > j){
            greaternum = n;
        }
        else if(n<j){
            greaternum = j;
        }
        return greaternum;
    }
    public static long circumfrence(int rad){
        double pi = 3.14;
        return (long) ((rad * 2) * pi);
    }
    public static void eligibletoVote(int age){
        if(age >18){
            System.out.println("eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }
    }
    public static void infloop(int i){
        do{
            System.out.println("I use apna colleage for learning java");
        }
        while (i != 0);
    }
    public static void counting(){

    }
    public static void main(String[]args){
        long mera = circumfrence(9);
        System.out.println(mera);
    }

}
