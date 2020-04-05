package com.example.objectExample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {
    int[][] table = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};

    @RequestMapping("/")
    @ResponseBody
    String getInfo() {
        return "info...";
    }

    @RequestMapping("table")
    @ResponseBody
    int[][] getTable() {
        return table;
    }

    @RequestMapping("tableElement/{i}/{j}")
    @ResponseBody
    String getTableElement(@PathVariable("i") Integer i, @PathVariable("j") Integer j) {
        return "tablica[" + i + "," + j + "]=" + table[i][j];
    }
}
