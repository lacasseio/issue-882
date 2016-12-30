import java.util.*;
import java.util.stream.*;
import java.util.concurrent.*;

public class QuittingTasks {
  public static final int COUNT = 8000;
  public static void main(String[] args) throws InterruptedException {
    ExecutorService es =
      Executors.newCachedThreadPool();
	  
    for (int i = 0; i < COUNT; ++i) {
        es.execute(new Runnable() {
            @Override
            public void run() {
                System.out.print("d ");
            }
        });
    }
    es.shutdown();
  }
}
