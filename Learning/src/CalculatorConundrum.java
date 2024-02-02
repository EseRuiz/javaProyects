class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        int res = 0 ;
        if (operation == null){
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if (operation.isEmpty()){
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        try{
            if (operation.equals("+")){
                res = operand1 + operand2 ;
            }
            if (operation.equals("*")){
                res = operand1 * operand2 ;
            }
            if (operation.equals("/")){
                res = operand1 / operand2 ;
            }
         //   else{throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));}
            }
        catch (ArithmeticException  e) {
        //    throw new IllegalOperationException("Division by zero is not allowed", e);
        }
        return  operand1 +" "+ operation + " " + operand2 + " = " + res ;
    }
}