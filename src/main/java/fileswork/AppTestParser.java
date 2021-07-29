package fileswork;

import java.util.HashMap;
import java.util.Map;

public class AppTestParser {

    static private HashMap<String, String> parseArgs(String[] args, HashMap<String, String> defaults) {
        HashMap<String, String> result = new HashMap<>();
        if (defaults != null) {
            for (Map.Entry<String, String> e : defaults.entrySet()) {
                if (e.getValue() != null) {
                    result.put(e.getKey(), e.getValue());
                }
            }
        }
        for (String s : args) {
            String[] keyvalue = s.split("=", 2);
            result.put(keyvalue[0], keyvalue.length < 2 ? null : keyvalue[1]);
        }
        return result;
    }

    static public HashMap<String, String> defaultArgs(String... args) {
        return parseArgs(args, null);
    }

    static public HashMap<String, String> mapOfArgs(String[] args, HashMap<String, String> defaults) {
        return parseArgs(args, defaults);
    }
}

