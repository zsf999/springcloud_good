package com.jk.controller;

import com.jk.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("book")
public class BookContrller {
        @Autowired
      private BookService bookService;
        @GetMapping("query/{id}")
        @ResponseBody
    public  String query(@PathVariable Integer id){
            String query = bookService.query(id);
            return query;
        }
}
