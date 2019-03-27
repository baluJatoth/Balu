package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Location;
import com.app.service.ILocationService;

@Controller
public class LocationController {
	@Autowired
	private ILocationService service;

	// 1.Show Register page
	@RequestMapping("/regLoc")
	public String showReg() {
		return "LocationRegister";

	}

	// 2.insert data on click Submit Button
	@RequestMapping(value = "/saveLoc", method = RequestMethod.POST)
	public String insertLoca(@ModelAttribute("location") Location loc, ModelMap map) {
		int locId = service.saveLocation(loc);
		String info = "saved with:" + locId;
		map.addAttribute("msg", info);
		return "LocationRegister";

	}

	// 3.display data on click view all
	@RequestMapping("/getAllLocs")
	public String getallLocation(ModelMap map) {
		List<Location> locs = service.getAllLocation();
		map.addAttribute("loc", locs);
		return "LocationData";
	}

	// 4.onclick DELETE remove Record
	@RequestMapping("/deleteLoc")
	public String delLoc(@RequestParam("locId") int locId) {
		service.deleteLocation(locId);
		return "redirect:getAllLocs";

	}

	// 5.show edit page
	@RequestMapping("/editLoc")
	public String showEdit(@RequestParam("locId") int locId, ModelMap map) {
		Location loc = service.getLocationById(locId);
		map.addAttribute("loc", loc);
		return "LocationDataEdit";

	}

	// 6.do update Data
	@RequestMapping(value = "/updateLoc", method = RequestMethod.POST)
	public String updateLoc(@ModelAttribute("location") Location loc) {
		service.updateLocation(loc);
		return "redirect:getAllLocs";
	}
}
