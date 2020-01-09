/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Eskindir
 */
@Named
@RequestScoped
public class MessageB implements Message{
    private String message = "Hi there";

    public void setMessage(String message) {
        this.message = message;
    }
    
    @Override
    public String getMessage() {
        return message;
    }
    
    
}
