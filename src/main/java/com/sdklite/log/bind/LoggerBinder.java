package com.sdklite.log.bind;

import com.sdklite.log.platform.Build;
import com.sdklite.log.Level;
import com.sdklite.log.Logger;

/**
 * A stub class for logger implementation binding, the logger implementation
 * must implements the stub methods.
 * 
 * @author johnsonlee
 *
 */
public class LoggerBinder {

    private static final Level DEFAULT = Build.VERSION.endsWith("-SNAPSHOT") ? Level.TRACE : Level.INFO;

    /**
     * Returns the biner instance
     */
    public static final LoggerBinder getInstance() {
        return Internal.BINDER;
    }

    private LoggerBinder() {
    }

    /**
     * Obtain a logger with the specified name
     * 
     * @param name
     *            The name of logger
     * @return an instance of logger
     */
    public Logger getLogger(final String name) {
        return null;
    }

    /**
     * Returns the default log level
     */
    public Level getDefaultLevel() {
        return DEFAULT;
    }

    private static final class Internal {
        private static final LoggerBinder BINDER = new LoggerBinder();
    }
}
