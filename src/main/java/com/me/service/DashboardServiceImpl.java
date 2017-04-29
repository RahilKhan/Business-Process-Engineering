package com.me.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.me.dao.inf.DashboardDaoInf;
import com.me.model.DashboardBean;
import com.me.service.DashboardServiceInf;

@Service("dashboardService")
@Transactional
public class DashboardServiceImpl implements DashboardServiceInf{

	@Autowired
	DashboardDaoInf dashboardDao;
	
	@Override
	public List getDashBoardDetails(String userId) {
		System.out.println("DashboardServiceImpl");
		List<DashboardBean> dashboardList = dashboardDao.getDashBoardDetails(userId);
		System.out.println("dashboardList.size() : " + dashboardList.size() + "\n\tdashboardList : " + dashboardList.get(0).toString());
		
		return dashboardList;
	}

	
}
