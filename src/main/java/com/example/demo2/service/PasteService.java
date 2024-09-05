package com.example.demo2.service;

import com.example.demo2.data.PasteExpiration;
import com.example.demo2.data.PasteExposure;
import com.example.demo2.data.entity.Paste;
import com.example.demo2.data.repository.PasteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PasteService {

    @Autowired
    private PasteRepository pasteRepository;

    public Paste createPaste(String content, String name, PasteExposure pasteExposure, PasteExpiration pasteExpiration){
        Paste paste = new Paste();
        paste.setName(name);
        paste.setTextHolder(content);
        paste.setPasteExpiration(pasteExpiration);
        paste.setPasteExposure(pasteExposure);
        paste.setCreatedAt(LocalDateTime.now());
        return pasteRepository.save(paste);
    }

    public List<Paste> getAllPastes(){
        return pasteRepository.findAll();
    }
    public Paste getPasteById(Long id){
        return pasteRepository.findById(id).orElse(null);
    }
}
