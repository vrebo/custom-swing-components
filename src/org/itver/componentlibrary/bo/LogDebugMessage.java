/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itver.componentlibrary.bo;

/**
 *
 * @author vrebo
 */
public class LogDebugMessage extends LogMessage{
    
    public LogDebugMessage(String message) {
        super(message);
        type = LogMessage.Type.DEBUG;
    }
}
