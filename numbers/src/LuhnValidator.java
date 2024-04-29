import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class LuhnValidator {

    boolean isValid(String candidate) {
        List<Integer> res = new ArrayList<>();
        String cleanCandidate = candidate.replace(" ","");
        if(!cleanCandidate.matches("\\d+") || cleanCandidate.equals("0")){
            return false;
        }
        List<Integer> lis_numeros = new ArrayList<>();
        BigInteger numero = new BigInteger(cleanCandidate);
        char[] digitos = String.valueOf(numero).toCharArray();
        for(char num: digitos){
            int digito = Character.getNumericValue(num);
            lis_numeros.add(digito);
        }
        Collections.reverse(lis_numeros);
        for (int i = 0; i < lis_numeros.size(); i++) {
            int con = 0;
            if (i % 2 != 0) {
                con = lis_numeros.get(i) * 2;
                if (con > 9) {
                    con -= 9;
                }
                res.add(con);
            } else {
                res.add(lis_numeros.get(i));
            }
        }
        int suma = 0 ;
        for (int i = 0; i < res.size(); i++) {
            suma += res.get(i);
        }
        return suma%10 == 0;
    }

}