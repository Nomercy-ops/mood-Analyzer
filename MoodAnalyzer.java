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

public class MoodAnalyser {

    private String message;

    /**
     * Created parameterized constructor which takes string as argument
     *
     * @param message
     */
    public MoodAnalyser(String message) {
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
     *
     * @return SAD OR HAPPY
     */
    public String analyseMood() {

        if (message.contains("Sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }

}
