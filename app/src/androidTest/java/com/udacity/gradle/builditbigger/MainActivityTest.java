package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;
import android.text.TextUtils;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

import static junit.framework.Assert.assertFalse;

/**
 * Created by sarathreddyvaddhi on 6/27/17.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {
    private String jokeString;
    private CountDownLatch signal;


    @Test
    public void testGetJokeTask() throws InterruptedException {
        Context appContext = InstrumentationRegistry.getTargetContext();
        signal = new CountDownLatch(1);


        EndpointsAsyncTask task = new EndpointsAsyncTask(appContext);
        task.setListener(new EndpointsAsyncTask.JokeListener() {
            @Override
            public void onJokeReceived(String joke) {
                jokeString = joke;
                signal.countDown();
            }
        });

        task.execute(appContext);
        signal.await();

        assertFalse(TextUtils.isEmpty(jokeString));
    }
}
