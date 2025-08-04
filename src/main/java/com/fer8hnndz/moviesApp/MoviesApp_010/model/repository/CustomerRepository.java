package com.fer8hnndz.moviesApp.MoviesApp_010.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fer8hnndz.moviesApp.MoviesApp_010.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}