package com.example.demo2.data.repository;

import com.example.demo2.data.entity.Paste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasteRepository  extends JpaRepository<Paste, Long> {
}
