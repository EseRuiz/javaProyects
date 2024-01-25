public class FootballMatchReports {
    public static String onField(int shirtNum) {
        String res = "";
        if (shirtNum < 0 || shirtNum > 12){
            throw new IllegalArgumentException("number outside of range 1-11");
        }else {
            switch (shirtNum){
                case 1 :
                    res = "goalie";
                    break ;
                case 2 :
                    res = "left back" ;
                    break ;
                case 3,4 :
                    res = "center back" ;
                    break ;
                case 5 :
                    res = "right back" ;
                    break ;
                case 6,7,8 :
                    res = "midfielder" ;
                    break ;
                case 9 :
                    res = "left wing" ;
                    break ;
                case 10 :
                    res = "striker" ;
                    break ;
                case 11 :
                    res = "right wing" ;
                    break ;
            }
            return res ;
        }

    }
}