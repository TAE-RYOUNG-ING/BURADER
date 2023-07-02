package com.itwillbs.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.itwillbs.domain.InMaterialVO;
import com.itwillbs.domain.OrderVO;
import com.itwillbs.domain.PagingVO;
import com.itwillbs.persistence.InMaterialDAO;
import com.itwillbs.persistence.OrderDAO;

@Service
public class OrderServiceImpl implements OrderService {

	// dao 사용을 위한 의존성 주입
	
	@Inject
	private OrderDAO odao;
	
    @Inject
    private PagingService pageService;

    
    
	@Override
	public PagingVO setPageOrder(PagingVO pvo) throws Exception {
		 
		pvo.setTable("orders");
		pvo.setId("order_id");
		pvo.setPageSize(10);
		pvo.setStartRow(1);
		pvo.setStatus_name("order_status");
		pvo.setStatus_value("1");
		
		return null;
	}

	// 전체 리스트 불러오기
	@Override
	public List<OrderVO> getOrderList() throws Exception {

		return odao.getOrderList();		
	}

	@Override
	public Integer modifyOrder(OrderVO ovo) throws Exception{
		
		return odao.modifyOrder(ovo);
	}

	@Override
	public void insertOrder(OrderVO vo) throws Exception {
		odao.insertOrder(vo);
		
	}

	@Override
	public String getMaxNumber() throws Exception {
		
		return odao.getMaxNumber();
	}

	@Override
	public String getMaxDate() throws Exception {
		
		return odao.getMaxDate();
	}

	@Override
	public void registOrderId(OrderVO vo) throws Exception {
		odao.regisOrderId(vo);
	}

	@Override
	public OrderVO getOrderInfo(String order_id) throws Exception {
		
		return odao.getOrderInfo(order_id);
	}

	@Override
	public Integer deleteOrder(String order_id) throws Exception {
		
		return odao.deleteOrder(order_id);	
	}

	@Override
	public List<OrderVO> getMaterialList(String ma_id) throws Exception {
	
		return odao.getMaterialList(ma_id);
	}

	@Override
	public OrderVO getOrderInfoauto(String order_id) throws Exception {
		
		return odao.getOrderInfoauto(order_id);
	}

	@Override
	public void getAddMa(String order_id) throws Exception {
	
		odao.getAddMa(order_id);
		
	}

	
    
	
	
}
