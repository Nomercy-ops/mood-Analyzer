/**
 *
 * @author Rikesh Chhetri
 * @version 1.0
 * @Created_on: 22.06.21
 *
 * purpose: is to analyze user mood based on message and to use custom exception
 * for handling invalid input.
 *
 */
package com.bridgelabz.moodanalyser;

public class MoodAnalyzer {

    private String message;

    /**
     * Refactor : Created parameterized constructor which takes string as
     * argument
     *
     * @param message
     */
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    /**
     * This method is used for getting mood which takes string message and calls
     * analyseMood method.
     *
     * @param message
     * @return
     */
    public String analyseMood(String message) {
        this.message = message;
        return analyseMood();
    }

    /**
     * UC2: return happy even if user provide null input.
     * @return SAD OR HAPPY
     */
    public String analyseMood() {
        try {
            if (message.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
           throw new MoodAnalyserException("Please enter a valid input");
        }
    }

}
