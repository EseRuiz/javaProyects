import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if (square <= 0 || square > 64){
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        BigInteger res = BigInteger.valueOf(2).pow(square-1) ;
        return  res;
    }

    BigInteger grainsOnBoard(int i) {
        BigInteger totalGrains = BigInteger.ZERO;
        for (int j = 1; j <= 64; j++) {
            BigInteger grainsOnSquare = BigInteger.valueOf(2).pow(j - 1);
            totalGrains = totalGrains.add(grainsOnSquare);
        }
        return totalGrains;
    }

}