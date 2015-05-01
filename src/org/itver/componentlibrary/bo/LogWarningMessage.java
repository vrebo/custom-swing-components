package org.itver.componentlibrary.bo;

/**
 *
 * @author vrebo
 */
public class LogWarningMessage extends LogMessage {

    public LogWarningMessage(String message) {
        super(message);
        type = LogMessage.Type.WARNING;
    }
}
