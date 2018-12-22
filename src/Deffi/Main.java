package Deffi;

import java.math.BigInteger;
import java.util.Random;

public class Main {
    private static BigInteger P;
    private static BigInteger A;
    public static void main(String[] args)
    {
        P = BigInteger.probablePrime(48, new Random());
        A = BigInteger.probablePrime(48, new Random());
        while(P.longValue()<A.longValue())
        {
            A = BigInteger.probablePrime(48, new Random());
        }
        Deffi alice = new Deffi(P, A);
        Deffi bob = new Deffi(P, A);
        alice.setK(bob.getY1());
        bob.setK(alice.getY1());
        System.out.println("P - " + P);
        System.out.println("A - " + A);
        System.out.println("Алиса получила  X1 - " + alice.getX1());;
        System.out.println("Алиса получила   K - " + alice.getK());
        System.out.println("Боб получил     X2 - " + bob.getX1());
        System.out.println("Боб получил      K - " + bob.getK());
    }
}
