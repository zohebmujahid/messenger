package com.zoheb.messenger.service;

import com.zoheb.messenger.database.DatabaseClass;
import com.zoheb.messenger.model.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by zoheb on 4/9/16.
 */
public class MessageService {

    //support all CRUD operations

    private Map<Long, Message> messages = DatabaseClass.getMessages();

    public MessageService(){
        messages.put(1L, new Message(1, "Hello World", "zoheb"));
        messages.put(2L, new Message(2, "Hello Jersey", "zoheb"));
    }

    public List<Message> getAllMessages(){
        return  new ArrayList<Message>(messages.values());
    }

    public Message getMessage(Long id){
        return messages.get(id);
    }

    public Message addMessage(Message message){
        message.setId(messages.size() + 1);
        messages.put(message.getId(), message);
        return message;
    }

    public Message updateMessage(Message message){
        if(message.getId() == 0){
            return null;
        }else
            messages.put(message.getId(), message);
        return message;
    }

    public  Message deleteMessage(Message message){
        return messages.remove(message.getId());
    }
}
