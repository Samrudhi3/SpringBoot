package com.tka.contoller;


import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.CrickStaff;
import com.tka.service.WC20WorldCupService;

@RestController
public class WC20WorldCupController {
	@Autowired
	WC20WorldCupService cupService;
	
	
	@Value("${x.uf}")
	int a;

	@GetMapping("totalcrickstaff")
	public int allIndianCricketStaffCount() {
		System.out.println(a);
		return cupService.allIndianCricketStaffCount();
	}

	@GetMapping("totalmedcrickstaff")
	public int allIndianCricketMedStaffCount() {
		return cupService.allIndianCricketStaffCount();
	}

	@GetMapping("agenamestaff")
	public HashMap<String, String> fetchIndianCricketNamewithAge() {
		return cupService.getAgeandNameofStaff();
	}

	@GetMapping("maxyearstobcci")
	public String fetchStaffNamewithMaxYears() {
		return cupService.fetchStaffNamewithMaxYears();
	}

	@GetMapping("singlecrickStaff")
	public CrickStaff fetchSingleCrickStaff() {
		return cupService.fetchSingleCrickStaff();
	}

	@PostMapping("insertcrickStaff")
	public void insertCrickStaff(@RequestBody CrickStaff crickStaff) {
		System.out.println("crick staff data from postman -- > " + crickStaff);
		cupService.insertCrickStaff(crickStaff);
	}

	
	@PutMapping("updatecrickStaff")
	public void updateCrickStaff(@RequestBody CrickStaff crickStaff) {
		System.out.println("crick staff data from postman -- > " + crickStaff);
		cupService.updateCrickStaff(crickStaff);
	}

}





