package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class JavaJokes {
    public static final int JOKES_LIST_SIZE = 12;
    private List<String> jokeList = Arrays.asList("Why did the tomato turn red? It saw the salad dressing!.",
            "What do you call a ghosts mom and dad?.Transparents.",
            "Did you hear about the painter who was hospitalized?.Reports say it was due to too many strokes.",
            "What did the triangle say to the circle?.You're pointless!",
            "What's easy to get into but hard to get out of?.Trouble.",
            "Why don't you see giraffes in elementary school?.Because they're all in High School!",
            "What kind of shorts do clouds wear?.Thunderwear",
            "Who cleans the bottom of the ocean?. A Mer-Maid.",
            "What do you call a South American girl who is always in a hurry?.Urgent Tina.",
            "Have you heard the joke about the butter?.I better not tell you, it might spread.",
            "IWhy was the math book sad?.Because it had too many problems.",
            "Why can't a leopard hide?. Because he's always spotted!");

    public String getJokes() {
        Random rand = new Random();
        return jokeList.get(rand.nextInt(JOKES_LIST_SIZE));
    }
}
