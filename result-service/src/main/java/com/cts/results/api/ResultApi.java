package com.cts.results.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.results.model.ResultResponse;
import com.cts.results.service.ResultService;

@CrossOrigin(origins = "*")
@RestController
public class ResultApi {
	
	@Autowired
	ResultService resultService;
	
	@GetMapping("/api/msg")
	public String getMsg() {
		return "Welcome to Spring boot";
	}
	
	@GetMapping("/api/results")
	public ResultResponse getResults(@RequestParam String htNumber) {
		return resultService.getResults(htNumber);
	}

}
