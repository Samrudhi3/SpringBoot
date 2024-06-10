package com.tka.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.CrickStaff;

@Repository
public class WC20WorldCupDao {

	@Autowired
	SessionFactory factory;

	public List<CrickStaff> allIndianCricketStaffList() {
		System.err.println("factory >>>> " + factory);
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(CrickStaff.class);
		List<CrickStaff> crickstaffList = criteria.list();
		System.out.println(crickstaffList);
		return crickstaffList;
	}

	public CrickStaff fetchSingleCrickStaff() {
		System.err.println("factory >>>> " + factory);
		Session session = factory.openSession();
		CrickStaff crickStaff = session.load(CrickStaff.class, 1);
		return crickStaff;
	}

	public void insertCrickStaff(CrickStaff crickStaff) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(crickStaff);
		transaction.commit();
	}

	public void updateCrickStaff(CrickStaff crickStaff) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(crickStaff);
		transaction.commit();
	}
}
