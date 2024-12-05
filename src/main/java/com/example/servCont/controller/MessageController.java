package com.example.servCont.controller;

import com.example.persistance.entity.Imobiliere;
import com.example.persistance.entity.Message;
import com.example.servCont.service.interfaces.IImobiliere;
import com.example.servCont.service.interfaces.IMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class MessageController {
    @Autowired
    IMessage MessageService;

    @PostMapping("/Message/save")
    Message save(@RequestBody Message message) {
        System.out.println("*******save ***********");
        Message I=MessageService.SaveMessage(message);
        return I ;
    }
    @GetMapping("/Message/{id}")
    Message getMessage(@PathVariable Long id) {
        return MessageService.getMessage(id);
    }

    @GetMapping("/Messages")
    List<Message> getListMessage() {
        return MessageService.getListMessage();
    }

    @GetMapping("/Message/delete/{id}")
    public boolean deleteMessage(@PathVariable Long id) {
        MessageService.deleteMessage(id);
        return true;
    }
}
