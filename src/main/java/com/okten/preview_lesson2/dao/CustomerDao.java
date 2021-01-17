package com.okten.preview_lesson2.dao;

import com.okten.preview_lesson2.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer, Integer> {
}
