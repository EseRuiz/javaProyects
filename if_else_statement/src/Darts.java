class Darts {
    int score(double xOfDart, double yOfDart) {
        int total = 0 ;
        double rad = 0 ;
        double ct = 0.0 ;
        rad =  Math.sqrt(((Math.pow(xOfDart, 2.0))+(Math.pow(yOfDart,2.0))));
        if( rad <= 1) {
            return total = 10;
        }if (rad <= 5) {
            return total = 5 ;
        }if (rad <= 10) {
            return total = 1 ;
        }else {return total ;}

    }
}