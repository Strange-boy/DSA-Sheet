package recursion.level1;

import java.util.Scanner;

public class PowerLinear {

    // time complexity : O(N)
    // space complexity: O(N)
    private static int findPowerLinear(int base, int power){
        //low level thinking
        if(power == 0) {
            return 1;
        }

        //high level thinking
        int xnm1 = findPowerLinear(base, power - 1);
        int xn = base * xnm1;
        return xn;
    }


    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int base = scn.nextInt();
        int power = scn.nextInt();

        int result = findPowerLinear(base, power);
        System.out.println(base + " ^ " + power + " : " + result );
    }
}
