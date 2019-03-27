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
import com.app.model.Vendor;
import com.app.service.IVendorService;

@Controller
public class VendorController {
	@Autowired
	private IVendorService service;

	// 1.show vendor reg page
	@RequestMapping("/venReg")
	public String showReg() {
		return "VendorRegister";

	}

	@RequestMapping(value = "/saveVen", method = RequestMethod.POST)
	public String saveVendor(@ModelAttribute("vendor") Vendor ven, ModelMap map) {
		int venId = service.saveVendor(ven);
		String info = "saved with:" + venId;
		map.addAttribute("msg", info);
		return "VendorRegister";

	}

	// 3.display data on click view all
	@RequestMapping("/getAllvens")
	public String getallVendor(ModelMap map) {
		List<Vendor> vens = service.getAllVendors();
		map.addAttribute("ven", vens);
		return "VendorData";
	}

	// 4.delete or remove Record
	@RequestMapping("/deleteVen")
	public String deleteVen(@RequestParam("venId") int venId) {
		service.deleteVendor(venId);
		return "redirect:getAllvens";

	}

	@RequestMapping("/editVen")
	public String editVen(@RequestParam("venId") int venId, ModelMap map) {
		Vendor vens = service.getVendorById(venId);
		map.addAttribute("ven", vens);
		return "VendorDataEdit";
	}

}
