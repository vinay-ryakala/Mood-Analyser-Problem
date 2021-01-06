package com.happyMood;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    //Welcome to Mood Analyzer
    @Test
    public void whenSadMoodReturnSad()
    {
        try
        {
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            String mood = moodAnalyser.analyseMood("I am in sad mood");
            Assert.assertEquals("SAD", mood);
        }
        catch(MoodAnalyserException e)
        {
            e.printStackTrace();
        }
    }
    @Test
    public void whenNotSadReturnHappy()
    {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            String mood = moodAnalyser.analyseMood("I am in Happy mood");
            Assert.assertEquals("HAPPY", mood);
        }
        catch(MoodAnalyserException e)
        {
            e.printStackTrace();
        }
    }
    @Test
    public void whenNullCatchCustomException()
    {
        try
        {
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            String mood = moodAnalyser.analyseMood(null);
            Assert.assertEquals("HAPPY", mood);
        }
        catch(MoodAnalyserException e)
        {
            e.printStackTrace();
        }

    }

}