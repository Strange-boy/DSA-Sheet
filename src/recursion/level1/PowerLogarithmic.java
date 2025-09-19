package recursion.level1;

import java.util.Scanner;

public class PowerLogarithmic {

    //in order to find the recursive solution of power logarithmic
    private static long findPowerLogarithmic(long base, long power) {
        //low level thinking
        if(power == 0 ) return 1;

        //high level thinking
        long xpnby2 = findPowerLogarithmic(base, power / 2);
        long xn;

        if(power % 2 == 0) xn = xpnby2 * xpnby2;
        else xn = base * xpnby2 * xpnby2;

        return xn;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long base = scn.nextLong();
        long power = scn.nextLong();

        long result = findPowerLogarithmic(base, power);
        System.out.println(base + " ^ " + power + " : " + result);
    }
}
