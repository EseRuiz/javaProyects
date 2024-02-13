public enum colors {
    AMARILLO(1,"Y"),
    AZUL(2,"B"),
    ROJO(3,"R"),
    NINGUNO(20,"NON");

    private int num;
    private String letter;

    colors(int num,String letter){
        this.num = num ;
        this.letter = letter;
    }

    public int getnum(){
        return this.num;
    }
    public String getLetter(){
        return this.letter;
    }
}
