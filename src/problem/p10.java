package problem;

public class p10 {
    public static void main(String[] args){
        int num = 2000000;
        long sum = 0;
        boolean notPrime[] = new boolean[num+1];
        //The sieve of Eratosthenes is awesome
        for(int multiple = 2; multiple*multiple <= num; multiple++) {
            if (!notPrime[multiple]) {
                for (int i = multiple; multiple*i <= num; i++) {
                    notPrime[i*multiple] = true;
                }
            }
        }

        for(int i = 2; i <= num; i++){
            if(!notPrime[i]) {
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
