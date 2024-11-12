package handout_file_pracktick;

import com.google.gson.Gson;

import java.io.*;

public class JSONFileHandler {
    private static final Gson gson = new Gson();

    public static Movies[] getMovies() {
//        try {
//            Reader reader = new InputStreamReader(
//                    JSONFileHandler.class.getClassLoader().getResourceAsStream("movies.json")
//            );
//
//        }
        try (Reader reader = new FileReader("movies.json")) {
            return gson.fromJson(reader, Movies[].class);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return new Movies[0];
    }

    public static void writeMovies(Movies[] movies) {
        try (Writer writer = new FileWriter("movies.json")) {
            String json = gson.toJson(movies);
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
