package com.github.mochachess.service;

import java.util.List;

public interface PdViewLogging {

    PdViewLogging addLog(String name, String description);

    void removeLog(Long id);

    List<PdViewLogging> getAll();

    PdViewLogging getDataById(long id);
}
