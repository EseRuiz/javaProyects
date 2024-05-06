class PhoneNumber {
    private String numberString;
    private String final_num = "";
    PhoneNumber(String numberString) {
        this.numberString = numberString;
        String num = this.numberString.replace(".","").replace("-","").replace(" ","").replace("(","").replace(")","").replace("+","");
        for(char c : num.toCharArray()){
            if(Character.isLetter(c)){
                throw new IllegalArgumentException("letters not permitted");
            }
            if(!Character.isLetterOrDigit(c)){
                throw new IllegalArgumentException("punctuations not permitted");
            }
        }
        if(num.length()<10){
            throw new IllegalArgumentException("must not be fewer than 10 digits");
        }
        if(num.length()>11){
            throw new IllegalArgumentException("must not be greater than 11 digits");
        }
        if(num.length() == 11 && num.charAt(0) != '1'){
            throw new IllegalArgumentException("11 digits must start with 1");
        }
        if(num.length() == 10 && num.charAt(0) == '0' || num.length() == 11 && num.charAt(1) == '0'){
            throw new IllegalArgumentException("area code cannot start with zero");
        }
        if(num.length() == 10 && num.charAt(0) == '1' || num.length() == 11 && num.charAt(1) == '1'){
            throw new IllegalArgumentException("area code cannot start with one");
        }
        if(num.length() == 10 && num.charAt(3) == '0' || num.length() == 11 && num.charAt(4) == '0'){
            throw new IllegalArgumentException("exchange code cannot start with zero");
        }
        if(num.length() == 10 && num.charAt(3) == '1' || num.length() == 11 && num.charAt(4) == '1'){
            throw new IllegalArgumentException("exchange code cannot start with one");
        }
    }

    String getNumber() {
        String num = this.numberString.replace(".","").replace("-","").replace(" ","").replace("(","").replace(")","").replace("+","");
        if(num.length() == 11){
            final_num = num.substring(1,11);
        }else{
            final_num = num ;
        }
        return final_num;
    }

}