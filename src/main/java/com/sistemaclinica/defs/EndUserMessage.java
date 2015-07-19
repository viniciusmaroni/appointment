/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemaclinica.defs;

/**
 *
 * @author maroni
 */
public class EndUserMessage {
    
    public enum MessageType {
        ERROR("alert alert-danger"),
        WARNING("alert alert-warning"),
        SUCCESS("alert alert-success");
        
        private String cssClass;
    
        private MessageType(String cssClass) {
            this.cssClass = cssClass;
        }

        public String getCssClass() {
            return cssClass;
        }

        public void setCssClass(String cssClass) {
            this.cssClass = cssClass;
        }
    }

    private String text;
    private String messageType;
    
    public EndUserMessage(String text, String messageType) {
        this.text = text;
        this.messageType = messageType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }


}
