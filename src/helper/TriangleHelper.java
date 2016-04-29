package helper;

public class TriangleHelper {
    public static long getTriangleNumber(long index){
        long sum = 0;
        for(long i = 0; i <= index; i++){
            sum = sum + i;
        }
        return sum;
    }
}
