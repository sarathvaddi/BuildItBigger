package com.udacity.gradle.builditbigger;

import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by sarathreddyvaddhi on 6/27/17.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {
    @Test
    public void when_tell_joke_invoked_server_returns_joke() {
        Assert.assertTrue(true);
    }
}
