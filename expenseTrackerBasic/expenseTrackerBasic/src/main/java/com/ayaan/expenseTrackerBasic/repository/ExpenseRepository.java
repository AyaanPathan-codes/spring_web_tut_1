package com.ayaan.expenseTrackerBasic.repository;

import com.ayaan.expenseTrackerBasic.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense,Long> {
}
