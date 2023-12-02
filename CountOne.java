//Hard----->example-3

import java.util.Scanner;
public class CountOne {

    public static int counts(int n){
        int count = 0;
        int factor = 1;
        int curr, before, after;

        while (n / factor != 0) {
            before = n / (factor * 10);
            curr = (n / factor) % 10;
            after = n - (n / factor) * factor;

            if (curr > 1) {
                count += (before + 1) * factor;
            } else if (curr == 1) {
                count += before * factor + after + 1;
            } else {
                count += before * factor;
            }

            factor *= 10;
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(counts(n));
    }
}
