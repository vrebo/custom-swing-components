package org.itver.componentlibrary.bo;

/**
 *
 * @author vrebo
 */
public class LogInfoMessage extends LogMessage{
    
    public LogInfoMessage(String message) {
        super(message);
        type = Type.INFO;
    }
    
}
