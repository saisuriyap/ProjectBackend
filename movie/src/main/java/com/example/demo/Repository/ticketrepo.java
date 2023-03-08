package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.tickets;

@Repository
public interface ticketrepo extends JpaRepository<tickets,String>{

}
