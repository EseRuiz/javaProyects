class MicroBlog {
    public String truncate(String input) {
        if(input.codePointCount(0, input.length())<5){
            return input.substring(0, input.offsetByCodePoints(0, input.codePointCount(0, input.length())));
        }else {
            return input.substring(0, input.offsetByCodePoints(0, 5));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String valueMicro;
        String valueLogs;
        MicroBlog micro = new MicroBlog();
        LogLevels log = new LogLevels();
        valueMicro = micro.truncate("test probe");
        System.out.println("valueMicro = " + valueMicro);
        valueLogs = log.message("mes:sage");
        System.out.println("log = " + valueLogs);

    }
}