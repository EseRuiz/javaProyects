public class DifferenceOfSquaresCalculator {
    int computeSquareOfSumTo(int input) {
        int resSquaOfSum = 0;
        resSquaOfSum = (int) Math.pow(((input *(input+1))/2),2);
        return resSquaOfSum;
    }

    int computeSumOfSquaresTo(int input) {
        int resSumOfSqua = 0;
        resSumOfSqua = ((input*(input+1)*((2*input)+1))/6);
        return resSumOfSqua;
    }

    int computeDifferenceOfSquares(int input) {
        int a = computeSumOfSquaresTo(input);
        int b = computeSquareOfSumTo(input);
        return (b - a) ;
    }
}
