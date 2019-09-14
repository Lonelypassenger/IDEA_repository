package com.kejia.twelve;

import java.util.concurrent.*;

public class SingleThreadExecutor {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        for(int i = 0;i<5;i++){
            executor.execute(new OtherThread());
        }
        executor.shutdown();
    }
}
