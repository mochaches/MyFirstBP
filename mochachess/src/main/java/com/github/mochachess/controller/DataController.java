package com.github.mochachess.controller;

import com.github.mochachess.service.PdViewLogging;
import com.github.mochachess.service.PdViewLoggingImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/data")
public class DataController {

    private final PdViewLoggingImpl pdViewLogging;

    public DataController(PdViewLoggingImpl pdViewLogging) {
        this.pdViewLogging = pdViewLogging;
    }

    @GetMapping("/getById")
    public PdViewLogging getDataById(@RequestParam Long id) {
        return pdViewLogging.getDataById(id);
    }

    @GetMapping("/getAll")
    public List<PdViewLogging> getAll() {
        return pdViewLogging.getAll();
    }

    @GetMapping("/remove")
    public String removeById(@RequestParam Long id) {
        pdViewLogging.removeLog(id);
        return "Надеюсь успешный успех))";
    }

    @GetMapping("/add")
    public PdViewLogging addLog(@RequestParam String name,
                                @RequestParam String description) {
        return pdViewLogging.addLog(name, description);
    }


}
