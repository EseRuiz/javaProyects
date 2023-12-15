class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        boolean fastAttack;
        if (knightIsAwake == false){
            return fastAttack=true;
        }else{return fastAttack=false;}
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean canSpy = true;
        if(knightIsAwake == false && archerIsAwake == true && prisonerIsAwake== true){canSpy=true;
        }else if(knightIsAwake == true && archerIsAwake == false && prisonerIsAwake== true){canSpy=true;
        }else if(knightIsAwake == true && archerIsAwake == true && prisonerIsAwake== false){canSpy=true;
        }else if(knightIsAwake == true && archerIsAwake == true && prisonerIsAwake== true){canSpy=true;
        }else if(knightIsAwake == false && archerIsAwake == false && prisonerIsAwake== false){canSpy=false;
        }
        return canSpy;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean signal = false;
        if (archerIsAwake == true && prisonerIsAwake == true ){
            signal=false;
        }else if (archerIsAwake == false && prisonerIsAwake == true )
        {signal=true;
        }return signal;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        boolean free = false;
        if(
                knightIsAwake == false && archerIsAwake == false && petDogIsPresent == true && prisonerIsAwake == true)       {
            free = true;
        }else if(knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == true && petDogIsPresent == false
        )
        {
            free = true;
        }
        else if(knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == false && petDogIsPresent == false
        )
        {
            free = false;
        }
        else if(knightIsAwake == true && archerIsAwake == false && prisonerIsAwake == true && petDogIsPresent == true
        )
        {
            free = true;
        }
        else if(knightIsAwake == true && archerIsAwake == false && prisonerIsAwake == false && petDogIsPresent == true
        )
        {
            free = true;
        }
        else if(knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == false && petDogIsPresent == true
        )
        {
            free = true;
        }
        return free;
    }
}
public class Main {
    public static void main(String[] args) {
        boolean test;
        AnnalynsInfiltration analysis = new AnnalynsInfiltration();
        test = analysis.canFastAttack(true);
        System.out.println(test);
    }
}