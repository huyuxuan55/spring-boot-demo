package com.huyx.controller;

import com.huyx.entity.Test;
import com.huyx.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Xuan on 2018/6/5.
 */
@RestController
@RequestMapping(path="/test")
public class TestController {

    @Autowired
    private TestRepository testRepository;

    @GetMapping(path="/add") // Map ONLY GET Requests
    public @ResponseBody
    String addNewTest (@RequestParam String[] userIds) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Test test = new Test();
        test.setUserIds(userIds);
        testRepository.save(test);
        return "Saved";
    }

    @GetMapping(path="/list") // Map ONLY GET Requests
    public @ResponseBody
    Iterable<Test> testList () {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request


        return testRepository.findAll();
    }
}
