package com.elbrus.controller;

import com.elbrus.entity.Stock;
import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StockController {

    @GetMapping("/stocks")
    public List<Stock> all() {
        return Lists.newArrayList(new Stock("0005.hk", "hsbc"), new Stock("0001.hk", "CK"), new Stock("ibm.n", "IBM"));
    }
}
