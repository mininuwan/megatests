package io.mega.functions;

import static java.lang.Thread.sleep;

public class Common {
    public static void wait_MiliSec(int miliSeconds){
        if(miliSeconds == 0){
            miliSeconds = 1000;
        }
        //sleep for 2 seconds (2000 milli seconds)
        try {
            sleep(miliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
