import com.example.android.jokesandroid.RetrieveAsycnTask;

import org.junit.Test;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertNotEquals;

/**
 * Created by Isaac on 5/24/17.
 */


public class JokeVerification{

    @Test
    public void test() {
        String result = null;
        RetrieveAsycnTask asycnTask = new RetrieveAsycnTask();
        try {
            result = asycnTask.execute(new RetrieveAsycnTask.onPostFinishListener() {
                @Override
                public String onPostFinish(String joke) {
                    return joke;
                }
            }).get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        assertNotEquals (result, null);
    }
}
