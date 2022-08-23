package com.cts.pensionerDetails.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cts.pensionerDetails.Model.PensionerDetails;
import com.cts.pensionerDetails.Service.PensionerDetailServiceImpl;

import lombok.extern.slf4j.Slf4j;


 //       Pensioner Details Controller is to get the details of pensioner by passing the Aadhaar Number
 
@RestController
@Slf4j
@CrossOrigin
public class PensionerDetailsController {

	@Autowired
	private PensionerDetailServiceImpl pensionerDetailService;

	
	// return if Aadhaar Number then return the pensioner details else throws Exception
	

	@GetMapping("/pensionerDetailByAadhaar/{aadhaarNumber}")
	public PensionerDetails getPensionerDetailByAadhaar(@PathVariable String aadhaarNumber) {
		log.info("START - getPensionerDetailByAadhaar()");
		return pensionerDetailService.getPensionerDetailByAadhaarNumber(aadhaarNumber);
	}
	
	@GetMapping(value = "/statusCheck")
	public String statusCheck() {
		log.info("OK");
		return "Pensioner detail microservice running successfully";
	}

}
