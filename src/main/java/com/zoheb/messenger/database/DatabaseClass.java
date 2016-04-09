package com.zoheb.messenger.database;

import com.zoheb.messenger.model.Message;
import com.zoheb.messenger.model.Profile;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zoheb on 4/9/16.
 */
public class DatabaseClass {

    private static Map<Long, Message>  messages = new HashMap<Long, Message>();
    private static Map<Long, Profile>  profiles = new HashMap<Long, Profile>();

    public static Map<Long, Message> getMessages(){
        return messages;
    }

    public static Map<Long, Profile> getProfiles(){
        return profiles;
    }
}
