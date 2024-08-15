package com.fbayhan.iddia.service;

import com.fbayhan.iddia.model.DenemeDeneme;
import com.fbayhan.iddia.repo.DenemeDenemeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class DenemeService {

    @Autowired
    DenemeDenemeRepository denemeDenemeRepository;

    public Boolean firstInsert() {
        DenemeDeneme denemeDeneme = new DenemeDeneme();
        denemeDeneme.setName("Tahsin");
        denemeDenemeRepository.save(denemeDeneme);
        return null;
    }

}
