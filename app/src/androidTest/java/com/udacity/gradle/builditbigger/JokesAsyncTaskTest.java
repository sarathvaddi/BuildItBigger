package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.text.TextUtils;

import java.util.concurrent.CountDownLatch;

/**
 * Created by sarathreddyvaddhi on 7/8/17.
 */

public class JokesAsyncTaskTest extends ApplicationTestCase<Application> {

    String jokeString = null;
    CountDownLatch signal = null;

    public JokesAsyncTaskTest() {
        super(Application.class);
    }

    @Override
    protected void setUp() throws Exception {
        signal = new CountDownLatch(1);
    }

    @Override
    protected void tearDown() throws Exception {
        signal.countDown();
    }

    public void testGetJokeTask() throws InterruptedException {
        EndpointsAsyncTask task = new EndpointsAsyncTask(getContext());
        task.setListener(new EndpointsAsyncTask.JokeListener() {
            @Override
            public void onJokeReceived(String joke) {
                jokeString = joke;
                signal.countDown();
            }
        });

        task.execute(getContext());
        signal.await();
        assertFalse(TextUtils.isEmpty(jokeString));
    }
}
