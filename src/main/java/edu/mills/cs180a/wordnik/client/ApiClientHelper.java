package edu.mills.cs180a.wordnik.client;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.IOUtils;
import edu.mills.cs180a.wordnik.client.invoker.ApiClient;

public class ApiClientHelper {
    private static final String API_KEY_FILE = "api-key.txt";

    private static String getApiKey() throws IOException {
        return getResource(API_KEY_FILE);
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

    public static ApiClient getApiClient() throws IOException {
        return new ApiClient("api_key", getApiKey());
    }
}
