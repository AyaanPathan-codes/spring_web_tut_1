package com.ayaan.expenseTrackerBasic.controller;


import com.ayaan.expenseTrackerBasic.model.Expense;
import com.ayaan.expenseTrackerBasic.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class ExpenseController {
        @Autowired
        private ExpenseService service;

    @GetMapping("/")
    public List<Expense> getUsers(){
         return service.getExpense();
    }

    @GetMapping("/user/{id}")
    public Expense getExpenseById(@PathVariable Long id){

        return service.getExpenseById(id);
    }

    @PutMapping("/user/{id}")
    public Expense updateUser(@RequestBody Expense user,@PathVariable Long id){
        return service.updateExpense(user,id);
    }


    @PostMapping("/")
    public Expense addExpense(@RequestBody Expense user){
       return service.addExpense(user);
    }

    @DeleteMapping("/user/{id}")
    public String deleteExpenseById(@PathVariable Long id){
       return service.deleteExpense(id);
    }

    @PostMapping("/save")
    public Expense addSavings(@RequestBody Expense user){
        return service.addSaving(user);
    }
}
