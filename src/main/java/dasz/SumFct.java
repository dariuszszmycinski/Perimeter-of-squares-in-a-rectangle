package dasz;

import java.math.BigInteger;

public class SumFct {
    public static BigInteger perimeter(BigInteger n) {
        BigInteger[] squares = new BigInteger[Integer.parseInt(String.valueOf(n.add(BigInteger.valueOf(1))))];
        squares[0]= BigInteger.valueOf(1);
        squares[1]= BigInteger.valueOf(1);
        BigInteger sum = squares[0].add(squares[1]);
        for (int i = 2; i < squares.length; i++) {
            squares[i]=squares[i-1].add(squares[i-2]);
            sum = sum.add(squares[i]);
        }
        return sum.multiply(BigInteger.valueOf(4));
    }
}
