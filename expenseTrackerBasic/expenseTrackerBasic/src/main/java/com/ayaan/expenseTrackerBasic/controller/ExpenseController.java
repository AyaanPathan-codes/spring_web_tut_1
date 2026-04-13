package com.ayaan.expenseTrackerBasic.controller;


import com.ayaan.expenseTrackerBasic.model.Expense;
import com.ayaan.expenseTrackerBasic.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExpenseController {
        @Autowired
        private ExpenseService service;

    @GetMapping("/")
    public List<Expense> getUsers(){
         return service.getExpense();
    }

    @GetMapping("/user/{id}")
    public Expense getExpenseById(@PathVariable int id){
        return service.getExpenseById(id);
    }

    @PutMapping("/")
    public Expense updateUser(@RequestBody Expense user){
        return service.updateExpense(user);
    }


    @PostMapping("/")
    public Expense addExpense(@RequestBody Expense user){
       return service.addExpense(user);
    }

    @DeleteMapping("/")
    public String deleteExpenseById(@PathVariable int id){
       return service.deleteExpense(id);
    }
}
