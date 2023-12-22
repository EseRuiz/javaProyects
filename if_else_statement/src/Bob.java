public class Bob {
    String hey(String input) {
        String repl = input.replace(",","");
        repl = repl.replace(" ","");
        boolean valid = false;
        try{Integer.parseInt(repl); valid=true;}catch (NumberFormatException e){ valid = false;}

        if(input.contains("?") && input.toUpperCase().equals(input) && input.length()>4 ){
            return ("Calm down, I know what I'm doing!");
        } else if (input.trim().endsWith("?")) {
            return ("Sure.");
        } else if (input.trim().isEmpty()){
            return("Fine. Be that way!");
        } else if (input.toUpperCase().equals(input) && !input.isEmpty() && !valid) {
            return("Whoa, chill out!");
        }else {return("Whatever.");}
    }
}
