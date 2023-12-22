class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String valueNumber = String.valueOf(numberToCheck);
        int num = 0;
        int val = 0 ;
        boolean varRes = false ;
        for (int i = 0; i < valueNumber.length(); i++) {
            num = Character.getNumericValue(valueNumber.charAt(i));
            //chartAt(i) obtiene el valor en caracter, se debe pasar a int
            val += (int) Math.pow(num,valueNumber.length());
        }
        if (val == numberToCheck){
            varRes = true ;
        }
        return  varRes;
    }
}