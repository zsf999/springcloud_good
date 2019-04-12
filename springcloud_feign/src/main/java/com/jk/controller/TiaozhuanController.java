package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("tiaozhuan")
public class TiaozhuanController {
    @RequestMapping("totree")
    public String totree() {

        return "Tree";
    }

    @RequestMapping("toAddDrug")
    public String toAddDrug() {

        return "AddDrug";
    }
    @RequestMapping("tojdshouji")
    public String tojingdongshouji() {

        return "jdshouji";
    }

    @RequestMapping("todrug")
    public String todrug() {

        return "Drug";
    }

    @RequestMapping("toUpdateDrug")
    public String toUpdateDrug() {
        return "UpdateDrug";
    }
}
