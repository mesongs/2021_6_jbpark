package kr.ac.kopo.financial.service;

import java.util.HashMap;

public interface FinancialService {
	
	// 배치 처리
	void batchInsertSalesService();
	
	// 매출 시각화 데이터 처리 후 리턴
	HashMap<String, Object> getSalesInfo(String businessNo);
	
	// 매입 시각화 데이터 처리 후 리턴
	HashMap<String, Object> getPurchaseInfo(String businessNo);
	
}
