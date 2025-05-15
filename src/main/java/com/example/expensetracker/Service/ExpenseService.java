package com.example.expensetracker.Service;

import com.example.expensetracker.Model.Expense;
import com.example.expensetracker.Repo.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expense>getAllExpenses(){
        return expenseRepository.findAll();

    }
    public void saveExpenses(Expense expense){
        expenseRepository.save(expense);
    }

    public Expense getExpenseById(Long id){
        return expenseRepository.findById(id).orElse(null );

    }
    public void deleteExpenseById(Long id){
        expenseRepository.deleteById(id);
    }
}
