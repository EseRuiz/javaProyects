class RomanNumerals {
    private static final String[] unidades = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    private static final String[] decenas = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static final String[] centenas = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static final String[] miles = {"", "M", "MM", "MMM"};
    private int number;
    RomanNumerals(int number) {
        this.number = number ;
    }

    String getRomanNumeral() {
        String resRomano = "";
        int mil = (this.number / 1000) % 10 ;
        int centena = (this.number / 100) % 10 ;
        int decena = (this.number / 10) % 10 ;
        int unidad = (this.number % 10 );
        resRomano = miles[mil]+ centenas[centena] + decenas[decena] + unidades[unidad] ;
        return resRomano ;
    }
}