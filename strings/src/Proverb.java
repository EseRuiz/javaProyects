class Proverb {
    private String[] words;
    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        StringBuilder out = new StringBuilder();
        if(this.words.length == 0){
            return "";
        }
        for (int i = 0; i < words.length-1; i++) {
            out.append(String.format("For want of a %s the %s was lost.\n", words[i], words[i+1]));
        }
        out.append(String.format("And all for the want of a %s.", words[0]));
        return String.valueOf(out);
    }

}