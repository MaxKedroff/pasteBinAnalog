package com.example.demo2.controller;

import com.example.demo2.data.entity.Paste;
import com.example.demo2.service.PasteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pastes")
public class NewPasteController {

    @Autowired
    private PasteService pasteService;

    @PostMapping("/createPaste")
    public Paste createPaste(@RequestBody Paste pasteRequest){
        return pasteService.createPaste(
                pasteRequest.getTextHolder(),
                pasteRequest.getName(),
                pasteRequest.getPasteExposure(),
                pasteRequest.getPasteExpiration());
    }
    @GetMapping("/")
    public List<Paste> getAllPastes(){
        return pasteService.getAllPastes();
    }
    @GetMapping("/{id}")
    public Paste getPasteById(@PathVariable Long id){
        return pasteService.getPasteById(id);
    }
}
