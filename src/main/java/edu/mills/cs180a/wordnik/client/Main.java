package edu.mills.cs180a.wordnik.client;

import java.io.IOException;
import edu.mills.cs180a.wordnik.client.api.WordsApi;
import edu.mills.cs180a.wordnik.client.invoker.ApiClient;
import edu.mills.cs180a.wordnik.client.model.WordOfTheDay;

public class Main {
    public static void main(String[] args) throws IOException {
        ApiClient client = ApiClientHelper.getApiClient();

        WordsApi wordsApi = client.buildClient(WordsApi.class);
        WordOfTheDay word = wordsApi.getWordOfTheDay();
        System.out.println(word);
    }
}
