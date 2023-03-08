package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.tickets;
import com.example.demo.Movieservice.ticketservice;
import com.example.demo.Repository.ticketrepo;

@RestController
@CrossOrigin
public class moviecontroller {
	@Autowired
	ticketrepo serviceRepository;
	@Autowired
	ticketservice service;
@GetMapping("/get")
    List<tickets> getList(){
	return serviceRepository.findAll();
}
@PostMapping("/post")
    public tickets create(@RequestBody tickets mov) {
	return serviceRepository.save(mov);
}

@PutMapping("/put")
public String update(@RequestBody tickets mov) {
	return service.updateDetails(mov);
}
@DeleteMapping("/del/{movie}")
public String delete(@PathVariable String movie) {
	return service.deleteDetails(movie);
}

}
