package com.github.mochachess.service;

import com.github.mochachess.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataServiceImpl implements DataService {

    static List<Data> dataList = new ArrayList<>();

    @Override
    public Data addData(String name, String description) {
        Data e = new Data(name, description);
        dataList.add(e);
        return e;
    }

    @Override
    public void removeData(Long id) {
        dataList.remove(dataList.stream().filter(data -> data.getId() == id)
                .findFirst().orElse(null));
    }

    @Override
    public List<Data> getAll() {
        return dataList;
    }

    @Override
    public Data getDataById(long id) {
        return dataList.stream().filter(data -> data.getId() == id)
                .findFirst().orElse(null);
    }
}
