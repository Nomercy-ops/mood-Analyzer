package com.bridgelabz.moodanalyser;

import org.junit.Test;
import static org.junit.Assert.*;

public class MoodAnalyzerTest {

    /**
     * Test case 1.1 : Given “I am in Sad Mood” message Should Return SAD
     *
     */
   @Test
   public void givenMessgae_WhenSad_ShouldReturn_Sad() {
       MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Sad Mood"); 
       String mood = moodAnalyser.analyseMood();
       assertEquals("SAD",mood);
   }

   /**
    * Test case 1.2 : Given “I am in Any Mood” message Should Return HAPPY
    *
    */
	
   @Test
   public void givenMessage_WhenNotSad_ShouldReturn_Happy() {
       MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in any Mood"); 
       String mood = moodAnalyser.analyseMood();
       assertEquals("HAPPY", mood);
    }
	
    /**
     * Test case 1.2 : Given “I am in Any Mood” message Should Return HAPPY
     *
     */
	 
    @Test
    public void givenMessage_InputAsNull_ShouldReturnCustomExceptionMessage() {
       
        MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
        
         try{
         moodAnalyser.analyseMood();
        }catch(MoodAnalyserException e){
        assertEquals("Please enter a valid input", e.getMessage());
        }
    }
}
