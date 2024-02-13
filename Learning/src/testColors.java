public class testColors {
    public String color;

    public testColors(String color){
        this.color = color;
    }

    public colors GetTestColor(){
        if(color.equals("Y")){
            return colors.AMARILLO;
        } else if (color.equals("B")) {
            return colors.AZUL;
        } else if (color.equals("R")) {
            return colors.ROJO;
        }

        return colors.NINGUNO;
    }

    public int getNumberColor(){
        colors col = GetTestColor();
        return col.getnum();
    }
    public String getLetterColor () {
        colors col = GetTestColor();
        return col.getLetter();
    }
}
