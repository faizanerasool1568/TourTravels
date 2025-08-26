package com.project.tour.travels.TourTravels.servicce;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class MainController {
		 @RequestMapping("/test1")
		 @ResponseBody
   public String getTest()
   
   {System.out.print("tygdhfghdsfsdfsd");
	   return "Hello World";
	   
   }
	
}
