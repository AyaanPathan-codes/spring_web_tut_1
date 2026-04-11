package com.ayaan.expenseTrackerBasic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Expense extends JpaRepository<Expense,Integer> {
}
