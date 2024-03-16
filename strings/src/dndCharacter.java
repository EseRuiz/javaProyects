import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

class DnDCharacter {
    private List<Integer> values = new ArrayList<>();
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    int ability(List<Integer> scores) {
        int sum = 0 ;
        int min = 9999;
        for(int val: scores){
            if(val < min){ min = val ;}
            sum += val ;
        }
        return sum - min ;
    }

    List<Integer> rollDice() {
        Random ram = new Random();
        values.clear();
        for (int j = 0; j < 4; j++) {
            values.add(ram.nextInt(6) + 1);
        }
        return  values ;
    }

    int modifier(int input) {
        return input/2 -5 ;
    }

    int getStrength() {
        if (strength == 0) {
            strength = ability(rollDice());
        }
        return strength;
    }

    int getDexterity() {
        if (dexterity == 0) {
            dexterity = ability(rollDice());
        }
        return dexterity;
    }

    int getConstitution() {
        if (constitution == 0) {
            constitution = ability(rollDice());
        }
        return constitution;
    }

    int getIntelligence() {
        if (intelligence == 0) {
            intelligence = ability(rollDice());
        }
        return intelligence;
    }

    int getWisdom() {
        if (wisdom == 0) {
            wisdom = ability(rollDice());
        }
        return wisdom;
    }

    int getCharisma() {
        if (charisma == 0) {
            charisma = ability(rollDice());
        }
        return charisma;
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }
}