package lv.st.sbogdano.app;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.EndpointAsyncTask;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import lv.st.sbogdano.jokeslib.JokesProvider;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class MyTests {

    @Test
    public void AsyncTaskResultTest() throws ExecutionException, InterruptedException {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        JokesProvider jokesProvider = new JokesProvider();

        String resultJoke = new EndpointAsyncTask().execute(appContext).get();
        String libraryJoke = jokesProvider.getJoke();

        assertEquals(libraryJoke, resultJoke);
    }
}
