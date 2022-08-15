package com.github.mochachess.service;

import com.github.mochachess.Data;
import com.github.mochachess.repository.PdViewLoggingRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PdViewLoggingImpl implements PdViewLogging {

    private final PdViewLoggingRepository pdViewLoggingRepository;

    static List<Data> dataList = new ArrayList<>();

    public PdViewLoggingImpl(PdViewLoggingRepository pdViewLoggingRepository) {
        this.pdViewLoggingRepository = pdViewLoggingRepository;
    }

    @Override
    public PdViewLogging addLog(String name, String description) {
        com.github.mochachess.Entity.PdViewLogging pdViewLogging = new com.github.mochachess.Entity.PdViewLogging("tester", "clientPage");
        pdViewLoggingRepository.save(pdViewLogging);
        return (PdViewLogging) pdViewLogging;
    }

    @Override
    public void removeLog(Long id) {
        dataList.remove(dataList.stream().filter(data -> data.getId() == id)
                .findFirst().orElse(null));
    }

    @Override
    public List<PdViewLogging> getAll() {
        return null;
    }

    @Override
    public PdViewLogging getDataById(long id) {
        return null;
    }
}
