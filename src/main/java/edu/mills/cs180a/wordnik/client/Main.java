package edu.mills.cs180a.wordnik.client;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.IOUtils;
import edu.mills.cs180a.wordnik.client.api.WordsApi;
import edu.mills.cs180a.wordnik.client.invoker.ApiClient;
import edu.mills.cs180a.wordnik.client.model.WordOfTheDay;

public class Main {
    private static final String USER_NAME = "ellensf";
    private static final String API_KEY_FILE = "api-key.txt";
    private static final String PASSWORD_FILE = "password.txt";

    private static String getApiKey() throws IOException {
        return getResource(API_KEY_FILE);
    }

    private static String getPassword() throws IOException {
        return getResource(PASSWORD_FILE);
    }

    private static String getResource(String filename) throws IOException {
        try (InputStream is =
                ApiClient.class.getClassLoader().getResourceAsStream(filename)) {
            if (is == null) {
                throw new IOException("Unable to open file " + filename);
            }
            return IOUtils.toString(is, StandardCharsets.UTF_8).trim();
        }
    }

    public static void main(String[] args) throws IOException {
        ApiClient client = new ApiClient("api_key", getApiKey());

        WordsApi wordsApi = client.buildClient(WordsApi.class);
        WordOfTheDay word = wordsApi.getWordOfTheDay();
        System.out.println(word);
    }
}
