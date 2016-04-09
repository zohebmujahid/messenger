package com.zoheb.messenger.resources;

import com.zoheb.messenger.service.MessageService;
import com.zoheb.messenger.model.Message;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by zoheb on 4/9/16.
 */

@Path("/messages")
public class Messages {

    MessageService messageService = new MessageService();
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> getMessage(){
        return messageService.getAllMessages();
    }
}
