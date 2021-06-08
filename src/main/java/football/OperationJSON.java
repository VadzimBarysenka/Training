package football;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;


public class OperationJSON {
    public static FootballClub ReadJSON(String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(fileName), FootballClub.class);
    }

    public static void WriteJSON(FootballClub footballClub, String fileName) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(fileName), footballClub);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

