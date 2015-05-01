package org.itver.componentlibrary.bo;

/**
 *
 * @author vrebo
 */
public abstract class Message {

    protected String message;

    public Message(String message){
        this.message = message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
