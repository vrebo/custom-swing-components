package org.itver.componentlibrary.bo;

/**
 *
 * @author vrebo
 */
public class LogErrorMessage extends LogMessage {

    public LogErrorMessage(String message) {
        super(message);
        type = LogMessage.Type.ERROR;
    }
}
