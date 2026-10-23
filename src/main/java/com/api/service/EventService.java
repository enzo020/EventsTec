package com.api.service;

import com.api.DTO.EventRequestDTO;
import com.api.domain.event.Event;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Service
public class EventService {
    private Event createEvent(EventRequestDTO data){
        String imgUrl = null; //sempre atribui a null

        //se não for nulo salva em data.img
        if(data.image()!=null){
           imgUrl= this.uploadImg(data.image());
        }

        //esses dados estão sendo instanciados em event e recebem os dados do DTO
        //DTO fornece os valores e newEvent Armazena-os
        Event newEvent = new Event();
        newEvent.setTitle(data.title());
        newEvent.setDescription(data.description());
        newEvent.setEventUrl(data.eventUrl());
        newEvent.setDate(new Date(data.date()));
    }

    private String uploadImg(MultipartFile multipartFile){
        return "";
    }
}
