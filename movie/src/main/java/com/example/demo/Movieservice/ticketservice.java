package com.example.demo.Movieservice;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.tickets;
import com.example.demo.Repository.ticketrepo;

@Service
public class ticketservice {
	@Autowired
	ticketrepo repository;

public String updateDetails(tickets mov) {
	repository.save(mov);
	return "updated";
}
public String deleteDetails(String movie) {
	repository.deleteById(movie);
	return "Id deleted";
}

}
