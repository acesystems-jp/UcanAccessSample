package com.example.shukka.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {
	
	SampleMapper mapper;
	
	SampleRestController(SampleMapper mapper) {
		this.mapper = mapper;
	}

	@GetMapping("{id}")
	SampleResult sample(@PathVariable("id") String id) {
		System.out.println(id);
		return mapper.findById(id);
	}
}
