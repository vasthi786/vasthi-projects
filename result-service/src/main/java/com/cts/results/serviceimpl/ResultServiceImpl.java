package com.cts.results.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.results.entity.Result;
import com.cts.results.model.ResultResponse;
import com.cts.results.repository.ResultRepository;
import com.cts.results.service.ResultService;

@Service
public class ResultServiceImpl implements ResultService {
	
	
	@Autowired
	ResultRepository resultRepository;

	@Override
	public ResultResponse getResults(String htNumber) {
		
		//Get the Result data from DB by using repository
		Optional<Result> results = resultRepository.findById(htNumber);
		
		Result result = results.get();
		
		//Set the results to response
		ResultResponse response = new ResultResponse();
		response.setHallTicketNumber(htNumber);
		response.setStudentName(result.getStudentName());
		response.setTelugu(result.getTelugu());
		response.setEnglish(result.getEnglish());
		response.setMathematics(result.getMathematics());
		response.setHindi(result.getHindi());
		response.setScience(result.getScience());
		response.setSocial(result.getSocial());
		
		return response;
	}

}
