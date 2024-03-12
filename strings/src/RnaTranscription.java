class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder rnaFinal = new StringBuilder();
        char[] rna = dnaStrand.toCharArray();
        for(char adn : rna){
            switch (adn){
                case ' ':
                    rnaFinal.append(' ');
                    break;
                case 'G':
                    rnaFinal.append('C');
                    break;
                case 'C':
                    rnaFinal.append('G');
                    break;
                case 'T':
                    rnaFinal.append('A');
                    break;
                case 'A':
                    rnaFinal.append('U');
                    break;
            }
        }
        return rnaFinal.toString();
    }

}
