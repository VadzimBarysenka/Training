package football;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class WriteClubToJSON {
    public static void main(String[] args) throws IOException {
        FootballClub club2 = new FootballClub("club2", 2, 45);
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("src/main/resources/test2.json"), club2);
    }
}