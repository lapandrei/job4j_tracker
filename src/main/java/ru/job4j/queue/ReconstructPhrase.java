package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder string = new StringBuilder();
        int i = 2;
        while (evenElements.size() != 0) {
            if (i % 2 == 0) {
                string.append(evenElements.pollFirst());
            } else {
                evenElements.pollFirst();
            }
            i++;
        }
        return string.toString();
    }

    private String getDescendingElements() {
        StringBuilder strings = new StringBuilder();
        while (descendingElements.size() != 0) {
            strings.append(descendingElements.pollLast());
        }
        return strings.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}