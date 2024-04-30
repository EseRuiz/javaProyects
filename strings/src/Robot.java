import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class Robot {
    private static Set<String> generatedNames = new HashSet<>();
    private char[] dictionary = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private String name;

    String getName() {
        if (name == null) {
            Random random = new Random();
            StringBuilder letter = new StringBuilder();
            int randomNumber = random.nextInt(900) + 100;
            for (int i = 0; i < 2; i++) {
                int randomLetter = random.nextInt(26);
                letter.append(dictionary[randomLetter]);
            }
            String newName = letter.toString().toUpperCase() + randomNumber;
            while (generatedNames.contains(newName)) {
                letter.setLength(0);
                randomNumber = random.nextInt(900) + 100;
                for (int i = 0; i < 2; i++) {
                    int randomLetter = random.nextInt(26);
                    letter.append(dictionary[randomLetter]);
                }
                newName = letter.toString().toUpperCase() + randomNumber;
            }
            generatedNames.add(newName);
            this.name = newName;
        }
        return name;
    }

    void reset() {
        this.name = null;
        Random random = new Random(123);
        StringBuilder letter = new StringBuilder();
        int randomNumber = random.nextInt(900) + 100;
        for (int i = 0; i < 2; i++) {
            int randomLetter = random.nextInt(25);
            letter.append(dictionary[randomLetter]);
            if(i==2){break;}
        }
        this.name = letter.toString().toUpperCase() + randomNumber;
    }

}