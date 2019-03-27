package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IVendorDao;
import com.app.model.Vendor;

@Repository
public class VendorDaoImpl implements IVendorDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public int saveVendor(Vendor ven) {

		return (int) ht.save(ven);
	}

	@Override
	public void updateVendor(Vendor ven) {
		ht.update(ven);

	}

	@Override
	public void deleteVendor(int venId) {
		ht.delete(venId);

	}

	@Override
	public Vendor getVendorById(int VenId) {
		Vendor ven = ht.get(Vendor.class, VenId);
		return ven;
	}

	@Override
	public List<Vendor> getallVendor() {
		List<Vendor> venlist = ht.loadAll(Vendor.class);
		return venlist;
	}

}
