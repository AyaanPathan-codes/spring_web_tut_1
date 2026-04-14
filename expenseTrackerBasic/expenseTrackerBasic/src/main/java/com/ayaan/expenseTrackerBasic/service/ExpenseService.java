package com.ayaan.expenseTrackerBasic.service;


import com.ayaan.expenseTrackerBasic.model.Expense;
import com.ayaan.expenseTrackerBasic.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
        private ExpenseRepository repo;

    public List<Expense> getExpense(){
        return repo.findAll();
    }

    public Expense getExpenseById( Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("User Not Found"));
    }


    public Expense updateExpense(Expense user,Long id) {

            Expense exisisting =repo.findById(id)
                    .orElseThrow(() -> new RuntimeException("User Not Found"));

            exisisting.setAmount(user.getAmount());
            exisisting.setCategory(user.getCategory());
            exisisting.setDescription(user.getDescription());
            exisisting.setDate(user.getDate());

         return repo.save(exisisting);
    }

    public Expense addExpense(Expense user){
      return  repo.save(user);
    }

    public String deleteExpense(Long id) {
        Expense exisisting = repo.findById(id)
                .orElseThrow(()->new  RuntimeException("User Not Found"));
        repo.delete(exisisting);
        return "Deleted Successfully";
    }

    public Expense addSaving(Expense user) {
        return repo.save(user);
    }
}
