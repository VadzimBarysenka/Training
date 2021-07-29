package fileswork;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        String path = "path=";
        String contains = "contains=";
        String sort = "sort=";
        Map<String, String> argMap = AppTestParser.mapOfArgs(args, AppTestParser.defaultArgs(path, contains, sort));
        FileClass test = new FileClass(argMap.get("path"));
        test.process(argMap.get("contains"), argMap.get("sort"));
        System.out.println(System.currentTimeMillis() - time + " milliseconds spent for operation");
    }
}
