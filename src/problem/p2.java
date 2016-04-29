package problem;

public class p2 {
    public static void main(String[] args){
        System.out.println(2+fib4m(1, 2));
    }

    public static long fib4m(long first, long second){
        long third = first + second;
        if(third >= 4000000){
            return 0;
        }
        if(third%2==0){
            return third + fib4m(second, third);
        }else{
            return fib4m(second, third);
        }
    }
}
