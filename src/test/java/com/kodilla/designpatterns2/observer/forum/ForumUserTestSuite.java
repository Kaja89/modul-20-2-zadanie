package com.kodilla.designpatterns2.observer.forum;

import org.junit.Assert;
import org.junit.Test;

public class ForumUserTestSuite {
    @Test
    public void testUpdate(){
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();

        ForumUser adamNowak = new ForumUser("Adam Nowak");
        ForumUser monikaKowalska = new ForumUser("Monika Kowalska");
        ForumUser antoniTrzmiel = new ForumUser("Antoni Trzmiel");

        javaHelpForum.registerObserver(adamNowak);
        javaHelpForum.registerObserver(monikaKowalska);
        javaToolsForum.registerObserver(monikaKowalska);
        javaToolsForum.registerObserver(antoniTrzmiel);

        //When
        javaHelpForum.addPost("Hi everyone im first in helpforum");
        javaHelpForum.addPost("Need some help from second?");
        javaHelpForum.addPost("Not at all");
        javaToolsForum.addPost("My tool doesnt work");
        javaToolsForum.addPost("I can see");
        javaToolsForum.addPost("Do this");

        //Then
        Assert.assertEquals(3, adamNowak.getUpdateCount());
       // Assert.assertEquals(6, monikaKowalska.getUpdateCount());
       // Assert.assertEquals(3, antoniTrzmiel.getUpdateCount());
    }
}
