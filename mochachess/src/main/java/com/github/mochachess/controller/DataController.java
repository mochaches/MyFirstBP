package com.github.mochachess.controller;

import com.github.mochachess.Data;
import com.github.mochachess.service.DataServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/data")
public class DataController {

    private final DataServiceImpl dataService;

    public DataController(DataServiceImpl dataService) {
        this.dataService = dataService;
    }

    @GetMapping("/getById")
    public Data getDataById(@RequestParam Long id) {
        return dataService.getDataById(id);
    }

    @GetMapping("/getAll")
    public List<Data> getAll() {
        return dataService.getAll();
    }

    @GetMapping("/remove")
    public String removeById(@RequestParam Long id) {
        dataService.removeData(id);
        return "Надеюсь успешный успех))";
    }

    @GetMapping("/add")
    public Data addData(@RequestParam String name,
                        @RequestParam String description) {
        return dataService.addData(name, description);
    }


}
