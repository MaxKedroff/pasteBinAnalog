package com.example.demo2.data.entity;


import com.example.demo2.data.PasteExpiration;
import com.example.demo2.data.PasteExposure;
import jakarta.persistence.*;
import org.hibernate.annotations.IdGeneratorType;

import java.time.LocalDateTime;

@Entity
@Table(name = "pastes")
public class Paste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTextHolder() {
        return textHolder;
    }

    public void setTextHolder(String textHolder) {
        this.textHolder = textHolder;
    }

    private String textHolder;

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public PasteExpiration getPasteExpiration() {
        return pasteExpiration;
    }

    public void setPasteExpiration(PasteExpiration pasteExpiration) {
        this.pasteExpiration = pasteExpiration;
    }

    public PasteExposure getPasteExposure() {
        return pasteExposure;
    }

    public void setPasteExposure(PasteExposure pasteExposure) {
        this.pasteExposure = pasteExposure;
    }

    private String name;

    @Enumerated(EnumType.STRING)
    private PasteExposure pasteExposure;

    @Enumerated(EnumType.ORDINAL)
    private PasteExpiration pasteExpiration;

    private LocalDateTime createdAt;
}
