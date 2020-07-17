package com.restapi.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.demo.Books;  

public interface BooksRepository extends JpaRepository<Books, Integer>  
{  
}  
