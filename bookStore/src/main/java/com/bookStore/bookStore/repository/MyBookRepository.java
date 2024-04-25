package com.bookStore.bookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookStore.bookStore.entity.MyBookList;
import  org.springframework.stereotype.Repository;

@Repository
public interface MyBookRepository  extends JpaRepository<MyBookList,Integer>{

}
