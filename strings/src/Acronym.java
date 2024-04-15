class Acronym {
    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase ;
    }

    String get() {
        String[] words = this.phrase.split("[\\s-_.]+");
        StringBuilder res = new StringBuilder();
        for(String word: words){
            res.append((word.charAt(0)));
        }
        return res.toString().toUpperCase();
    }

}
