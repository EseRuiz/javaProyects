class RotationalCipher {
    private int shiftKey;
    char[] dictionary = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        StringBuilder pos = new StringBuilder();
        for (char letter : data.toCharArray()) {
            if (Character.isLetter(letter)) {
                boolean isUpperCase = Character.isUpperCase(letter);
                char lowercaseLetter = Character.toLowerCase(letter);
                int index = -1;
                for (int i = 0; i < dictionary.length; i++) {
                    if (dictionary[i] == lowercaseLetter) {
                        index = i;
                        break;
                    }
                }
                if (index != -1) {
                    int rotatedIndex = (index + shiftKey) % 26;
                    char rotatedChar = dictionary[rotatedIndex];
                    if (isUpperCase) {
                        rotatedChar = Character.toUpperCase(rotatedChar);
                    }
                    pos.append(rotatedChar);
                } else {
                    pos.append(letter);
                }
            } else {
                pos.append(letter);
            }
        }
        return pos.toString();
    }
}
