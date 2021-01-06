package com.happyMood;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    //Welcome to Mood Analyzer
    @Test
    public void whenSadMoodReturnSad()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in sad mood");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void whenNotSadReturnHappy()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Happy mood");
        Assert.assertEquals("HAPPY", mood);
    }
    @Test
    public void whenNullCatchException()
    {
        try
        {
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            String mood = moodAnalyser.analyseMood(null);
            Assert.assertEquals("HAPPY", mood);
        }
        catch(NullPointerException e)
        {
            e.printStackTrace();
        }

    }

}