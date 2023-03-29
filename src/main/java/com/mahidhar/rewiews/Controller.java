package com.mahidhar.rewiews;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import springfox.documentation.annotations.ApiIgnore;

@RestController
public class Controller {
	
	
	
	@Autowired
	Repo repo;
	
	@ApiIgnore
	@RequestMapping(value="/")
	public void redirect(HttpServletResponse res) throws IOException
	{
		res.sendRedirect("/swagger-ui.html");
	}
	
	@GetMapping("/viewAllReviews")
	public List<Data> viewAllReviews()
	{
		return repo.findAll();
	}
	@PutMapping("/addReview")
	public String addReview(@RequestBody Data data)
	{
		repo.save(data);
		return "Review added";
	}
	@GetMapping("/viewReviewById/{id}")
	public Optional<Data> viewReview(@PathVariable String id)
	
	{  
		Optional<Data> data=repo.findById(id);
		
		
		
	 return data;
		
	}
	@DeleteMapping("/delete/{id}")
	public String deleteReview(@PathVariable String id)
	{
		repo.deleteById(id);
		 return "Review Deleted";
	}
	@GetMapping("/viewReviewByName/{name}")
	public List<Data> viewByName(@PathVariable String name)
	
	{  
		List<Data> data=repo.findByName(name);
		
		
		
		
	 return data;
		
	}

}
