package com.github.mochachess.service;

import com.github.mochachess.Data;

import java.util.List;

public interface DataService {

    public Data addData(String name, String description);

    public void removeData(Long id);

    public List<Data> getAll();

    public Data getDataById(long id);
}
