class RunLengthEncoding {

    String encode(String data) {
        if (data.isEmpty()) {
            return data;
        }
        StringBuilder res = new StringBuilder();
        char Accumulator = data.charAt(0);
        int count = 1;
        for(char c : data.substring(1).toCharArray()){
            if(Accumulator == c){
                count ++ ;
            }else{
                if(count == 1){
                    res.append(Accumulator);
                }
                else {
                    res.append(count).append(Accumulator);
                }
                Accumulator = c;
                count = 1 ;
            }
        }
        if(count == 1){
            res.append(Accumulator);
        }else{
            res.append(count).append(Accumulator);
        }
        return res.toString();

    }

    String decode(String data) {

        StringBuilder res = new StringBuilder();
        StringBuilder Accumulator = new StringBuilder();
        for(char c: data.toCharArray()){
            if (Character.isDigit(c)){
                Accumulator.append(c);
            }else {
                if (!Accumulator.isEmpty()){
                    String acum = Accumulator.toString();
                    int value_acum = Integer.parseInt(acum);
                    for (int i = 0; i < value_acum; i++) {
                        res.append(c);
                    }
                    Accumulator.setLength(0);
                }else {
                    res.append(c);
                }
            }
        }return res.toString();
    }

}