package helper;

import java.util.ArrayList;
import java.util.List;

public class FactorHelper {
    public static long getLargestFactor(long num){
        for(long i = num; i > 0; i--){
            if(i != num && num%i == 0){
                return num;
            }
        }
        return 1;
    }

    public static long countFactors(long num){
        long sum = 0;
        for(long i = num; i > 0; i--) {
            if (num % i == 0) {
                sum++;
            }
        }
        return sum;
    }
}
