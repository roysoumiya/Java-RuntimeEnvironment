/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization.message;

import business.useraccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author raseswaridas
 */
public class MessageDirectory {
    
    private ArrayList<Message> messageList;
    
    public MessageDirectory(){
        messageList = new ArrayList<Message>();
    }

    public ArrayList<Message> getMessageList() {
        return messageList;
    }
    
    public Message addMessage(Message.messageType type, UserAccount sender, UserAccount receiver, Message.statusType status, String message, String subject, Date created){
        Message m =  new Message(type,sender,receiver, status, message, subject, created);
        messageList.add(m);
        return m;
    }
    
}
