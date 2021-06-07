package football;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;


public class ReadClubFromJSON {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        FootballClub club1 = mapper.readValue(new File("src/main/resources/test.json"), FootballClub.class);
    }
}
