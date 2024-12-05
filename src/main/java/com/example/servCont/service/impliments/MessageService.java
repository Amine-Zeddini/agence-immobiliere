package com.example.servCont.service.impliments;

import com.example.persistance.dao.ImobiliereRepository;
import com.example.persistance.dao.MessageRepository;
import com.example.persistance.entity.Message;
import com.example.servCont.service.interfaces.IImobiliere;
import com.example.servCont.service.interfaces.IMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService implements IMessage {
    @Autowired
    MessageRepository messagerepository;

    @Override
    public Message SaveMessage(Message message) {
        return messagerepository.save(message);
    }

    @Override
    public boolean deleteMessage(long id) {
        messagerepository.deleteById(id);
        return true;
    }

    @Override
    public List<Message> getListMessage() {
        return  messagerepository.findAll();
    }

    @Override
    public Message getMessage(long id) {
        return  messagerepository.findById(id).get();
    }
}
