package org.itver.componentlibrary.bo;

import java.awt.Color;
import static java.awt.Color.BLACK;
import static java.awt.Color.BLUE;
import static java.awt.Color.RED;

/**
 *
 * @author vrebo
 */
public class LogMessage extends Message {

    public static enum Type {

        NONE(BLACK), INFO(BLUE), WARNING(new Color(0xD8, 0x7C, 0)), ERROR(RED), DEBUG(new Color(0x11, 0x66, 0x11));

        private final Color fontColor;

        Type(Color fontColor) {
            this.fontColor = fontColor;
        }

        public Color fontColor() {
            return fontColor;
        }
    }

    protected Type type;

    public LogMessage(String message) {
        super(message);        
        type = Type.NONE;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String getMessage() {
        return type.toString().concat(":\t").concat(message);
    }

}
