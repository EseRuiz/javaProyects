import java.util.Arrays;
import java.util.List;

class WordProblemSolver {
    int solve(final String wordProblem) {
        int res = 0;
        String[] parts = wordProblem.split(" ");
        String[] operations = {"plus", "minus", "multiplied", "divided"};
        List<String> sentence = Arrays.asList(parts);
        int flag1 = 0;
        int flag2 = 0;

        if(sentence.size() < 3){
            throw new IllegalArgumentException("I'm sorry, I don't understand the question!");
        }
        if(sentence.get(0).equals("What") && sentence.get(1).equals("is") && sentence.size()== 3){
            return Integer.parseInt(sentence.get(2).split("\\?")[0]);
        }
        for(String ope : operations ){
            if (sentence.get(3).equals(ope)){flag1 = 1 ;}
        }
        if (sentence.get(0).equals("What") && sentence.get(1).equals("is") && flag1==1 && sentence.size()== 5){
            if (sentence.get(3).equals("plus")){
                return (Integer.parseInt(sentence.get(2)) + Integer.parseInt(sentence.get(4).split("\\?")[0]));
            }
            if (sentence.get(3).equals("minus")){
                return (Integer.parseInt(sentence.get(2)) - Integer.parseInt(sentence.get(4).split("\\?")[0]));
            }
        }
        if (sentence.get(0).equals("What") && sentence.get(1).equals("is") && flag1==1 && sentence.size()== 6){
            if (sentence.get(3).equals("multiplied")){
                return (Integer.parseInt(sentence.get(2)) * Integer.parseInt(sentence.get(5).split("\\?")[0]));
            }
            if (sentence.get(3).equals("divided")){
                return (Integer.parseInt(sentence.get(2)) / Integer.parseInt(sentence.get(5).split("\\?")[0]));
            }
        }
        if (sentence.get(0).equals("What") && sentence.get(1).equals("is") && flag1==1 && sentence.size()>= 7){
            if (sentence.get(3).equals("plus")){
                res = (Integer.parseInt(sentence.get(2)) + Integer.parseInt(sentence.get(4).split("\\?")[0]));
                if (sentence.get(5).equals("plus")){
                    return (res + Integer.parseInt(sentence.get(6).split("\\?")[0]));
                }
                if (sentence.get(5).equals("minus")){
                    return (res- Integer.parseInt(sentence.get(6).split("\\?")[0]));
                }
                if (sentence.get(5).equals("multiplied")){
                    return (res * Integer.parseInt(sentence.get(7).split("\\?")[0]));
                }
                if (sentence.get(5).equals("divided")){
                    return  (res / Integer.parseInt(sentence.get(7).split("\\?")[0]));
                }

            }
            if (sentence.get(3).equals("minus")){
                res = (Integer.parseInt(sentence.get(2)) - Integer.parseInt(sentence.get(4).split("\\?")[0]));
                if (sentence.get(5).equals("plus")){
                    return (res + Integer.parseInt(sentence.get(6).split("\\?")[0]));
                }
                if (sentence.get(5).equals("minus")){
                    return (res- Integer.parseInt(sentence.get(6).split("\\?")[0]));
                }
                if (sentence.get(5).equals("multiplied")){
                    return (res * Integer.parseInt(sentence.get(7).split("\\?")[0]));
                }
                if (sentence.get(5).equals("divided")){
                    return  (res / Integer.parseInt(sentence.get(7).split("\\?")[0]));
                }

            }
            if (sentence.get(3).equals("multiplied")){
                res = (Integer.parseInt(sentence.get(2)) * Integer.parseInt(sentence.get(5).split("\\?")[0]));
                if (sentence.get(6).equals("plus")){
                    return (res + Integer.parseInt(sentence.get(6).split("\\?")[0]));
                }
                if (sentence.get(6).equals("minus")){
                    return (res- Integer.parseInt(sentence.get(6).split("\\?")[0]));
                }
                if (sentence.get(6).equals("multiplied")){
                    return (res * Integer.parseInt(sentence.get(8).split("\\?")[0]));
                }
                if (sentence.get(6).equals("divided")){
                    return  (res / Integer.parseInt(sentence.get(8).split("\\?")[0]));
                }

            }
            if (sentence.get(3).equals("divided")){
                res = (Integer.parseInt(sentence.get(2)) / Integer.parseInt(sentence.get(5).split("\\?")[0]));
                if (sentence.get(6).equals("plus")){
                    return (res + Integer.parseInt(sentence.get(6).split("\\?")[0]));
                }
                if (sentence.get(6).equals("minus")){
                    return (res- Integer.parseInt(sentence.get(6).split("\\?")[0]));
                }
                if (sentence.get(6).equals("multiplied")){
                    return (res * Integer.parseInt(sentence.get(8).split("\\?")[0]));
                }
                if (sentence.get(6).equals("divided")){
                    return  (res / Integer.parseInt(sentence.get(8).split("\\?")[0]));
                }

            }
        }
        else {
            throw new IllegalArgumentException("I'm sorry, I don't understand the question!");
        }
        return res;
    }
}