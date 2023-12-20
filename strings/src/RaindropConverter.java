public class RaindropConverter {
    String convert(int number) {
        String res = "";
        String tres = "";
        String cinco = "";
        String siete = "";
        if(number % 3 != 0 && number % 5 != 0 && number % 7 != 0) {
            return (res = number+""); }
        if(number % 3 == 0){
            tres = "Pling";
        }
        if (number % 5 == 0) {
            cinco = "Plang";
        }
        if (number % 7 == 0) {
            siete = "Plong";
        }
        return ( tres + cinco + siete);
    }
}
