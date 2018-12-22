package Deffi;

import java.math.BigInteger;
import java.util.Random;

public class Deffi {

    private BigInteger Y1, Y2, x1, K;
    private BigInteger P, A;
    public Deffi(BigInteger P, BigInteger A)
    {
        this.P = P;
        this.A = A;
        x1 = new BigInteger(32, new Random());
        while(x1.longValue()>P.longValue())
        {
            x1 = new BigInteger(32, new Random());
        }
        Y1 = this.A.modPow(x1, this.P);
    }

    public void setK(BigInteger Y2)
    {
        this.Y2 = Y2;
        K = this.Y2.modPow(x1, P);
    }

    public BigInteger getX1() {
        return x1;
    }
    public BigInteger getY1() {
        return Y1;
    }
    public BigInteger getK() {
        return K;
    }

}
