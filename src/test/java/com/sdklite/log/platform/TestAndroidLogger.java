package com.sdklite.log.platform;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import com.sdklite.log.Logger;
import com.sdklite.log.LoggerFactory;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE, sdk = 21)
public class TestAndroidLogger {

    @Test
    public void obtain_android_logger() {
        final Logger logger = LoggerFactory.getLogger("Android");
        Assert.assertNotNull(logger);
        Assert.assertEquals("com.sdklite.log.LogcatLogger", logger.getClass().getName());
    }
    
}
