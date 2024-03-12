public class GameMaster {
    public String describe(Character character) {
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() + " with " + character.getHitPoints() + " hit points.";
    }
    public String describe(Destination destination) {
        return "You've arrived at " + destination.getName() + ", which has "  + destination.getInhabitants()+ " inhabitants.";
    }

    public String describe(TravelMethod travelMethod){
        if (travelMethod == TravelMethod.HORSEBACK){
            return "You're traveling to your destination on horseback." ;
        }else {return "You're traveling to your destination by walking.";}
    }

    public String describe (Character character,Destination destination,TravelMethod travelMethod){
        String travel ;
        if (travelMethod == TravelMethod.HORSEBACK){
            travel = "You're traveling to your destination on horseback." ;
        }else {travel = "You're traveling to your destination by walking.";}
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() + " with " + character.getHitPoints() + " hit points. "+travel+
                " You've arrived at " + destination.getName() + ", which has "  + destination.getInhabitants()+ " inhabitants.";

    }

    public String describe (Character character,Destination destination){

        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() + " with " + character.getHitPoints() + " hit points. You're traveling to your destination by walking."+
                " You've arrived at " + destination.getName() + ", which has "  + destination.getInhabitants()+ " inhabitants.";

    }
}