package com.example.servCont.service.interfaces;

import com.example.persistance.entity.Imobiliere;
import com.example.persistance.entity.Message;
import com.example.persistance.entity.Proprietaire;

import java.util.List;

public interface IMessage {
    Message SaveMessage(Message message);
    boolean deleteMessage(long id);
    List<Message> getListMessage();
    Message getMessage(long id);

}
