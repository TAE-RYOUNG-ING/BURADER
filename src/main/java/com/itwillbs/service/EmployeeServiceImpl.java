package com.itwillbs.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.itwillbs.domain.EmployeeVO;
import com.itwillbs.persistence.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	//DB와 연결 (의존주입)
	@Inject
	private EmployeeDAO edao;
	
	//회원가입
	@Override
	public void insertEmployee(EmployeeVO vo) {
		//컨트롤러 -> 서비스 호출 -> DAO 호출 -> Mapper -> DB
		System.out.println("S : 회원가입동작");
		if(vo == null) {
			//처리
			return;
		}
		edao.insertEmployee(vo);
	}
}
