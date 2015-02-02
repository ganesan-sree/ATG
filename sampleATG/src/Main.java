import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.invokeAll(Arrays.asList(new Task()), 10, TimeUnit.MINUTES); 
		executor.shutdown();
	}

}

class Task implements Callable<String> {
	@Override
	public String call() throws Exception {
		Thread.sleep(4000); // Just to demo a long running task of 4 seconds.
		return "Ready!";
	}
}