package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ILocationDao;
import com.app.model.Location;
import com.app.service.ILocationService;
@Service
public class LocationServiceImpl implements ILocationService {
	@Autowired
	private ILocationDao dao;

	@Override
	public int saveLocation(Location loc) {
		int locId = dao.saveLocation(loc);
		return locId;
	}

	@Override
	public void updateLocation(Location loc) {
		dao.updateLocation(loc);

	}

	@Override
	public void deleteLocation(int locId) {
		dao.deleteLocation(locId);

	}

	@Override
	public Location getLocationById(int locId) {
		Location loc = dao.getLocationById(locId);
		return loc;
	}

	@Override
	public List<Location> getAllLocation() {
		List<Location> locList = dao.getallLocation();
		return locList;
	}

}
