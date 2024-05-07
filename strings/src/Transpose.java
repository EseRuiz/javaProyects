import java.sql.SQLOutput;
import java.util.Arrays;

public class Transpose {
    public String transpose(String toTranspose) {
        StringBuilder res = new StringBuilder();
        String[] lines = toTranspose.split("\\n");
        if (lines.length == 0) {
            return "";
        }
        if (lines.length == 1) {
            String line = lines[0];
            for (char c : line.toCharArray()) {
                res.append(c).append("\n");
            }
            return res.toString().trim();
            //return res.substring(0,res.length()-1);
        }
        if (lines.length > 1) {
            int maxLength = 0;
            for (String line : lines) {
                maxLength = Math.max(maxLength, line.length());
            }
            StringBuilder[] linesPadded = new StringBuilder[lines.length];
            for (int i = 0; i < lines.length; i++) {
                while (lines[i].length() < maxLength) {
                    lines[i] += "_";
                }
                linesPadded[i] = new StringBuilder(lines[i]);
            }
            for (int col = 0; col < maxLength; col++) {
                for (StringBuilder line : linesPadded) {
                    if (col < line.length()) {
                        res.append(line.charAt(col));
                    }
                }
                res.append('\n');
            }

            StringBuilder result = new StringBuilder(); // StringBuilder para almacenar el resultado

            for (String line : res.toString().split("\\n")) {
                for (int i = 0; i < line.length(); i++) {
                    char currentChar = line.charAt(i);
                    if (currentChar == '_' && i < line.length() - 1 && line.charAt(i + 1) != '_') {
                        result.append(" ");
                    } else {
                        result.append(currentChar);
                    }
                }
                result.append("\n");
            }
            if (result.length() > 0 && result.charAt(result.length() - 1) == '\n') {
                result.deleteCharAt(result.length() - 1);
            }
            if (result.length() > 0 && result.charAt(result.length() - 1) == '_') {
                result.deleteCharAt(result.length() - 1);
            }
            System.out.println("result = " + result);
            if (result.length() > 0 && result.charAt(result.length() - 1) == '_') {
                result = new StringBuilder(result.toString().replaceAll("_", ""));
            }else{
                result = new StringBuilder(result.toString().replace('_', ' '));
            }
            return result.toString();
        }
        return null;
    }
}