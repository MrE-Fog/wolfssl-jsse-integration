package edu.kit.aifb.eorg.wolfssl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wolfssl.WolfSSLLoggingCallback;

/**
 * A logging callback for wolfSSL that logs debug and info messages of the
 * wolfSSL (native methods).
 * 
 * @author S. Mueller (AIFB, Karlsruhe Institute of Technology)
 *
 */
class LoggingCallback implements WolfSSLLoggingCallback {

	/**
	 * The logger.
	 */
	private final Logger logger = LoggerFactory.getLogger(LoggingCallback.class);
	/**
	 * Indicates whether the info log level is enabled.
	 */
	public final boolean isInfoEnabled = logger.isInfoEnabled();

	/**
	 * Logging callback method.
	 */
	public void loggingCallback(int logLevel, String logMessage) {
		if (isInfoEnabled)
			logger.info("LogLevel {}: {}", logLevel, logMessage);
	}
}