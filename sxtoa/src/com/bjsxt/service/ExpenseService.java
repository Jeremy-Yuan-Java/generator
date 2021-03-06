package com.bjsxt.service;

import java.util.List;

import com.bjsxt.entity.Auditing;
import com.bjsxt.entity.Expense;

public interface ExpenseService {

	void add(Expense expense);
	/**
	 * 获取指定审核人要审核的报销单列表
	 * @param auditorId
	 * @return
	 */
	List<Expense> getToAudit(String auditorId);
	/**
	 * 审核报销单
	 * @param auditing
	 */
	void audit(Auditing auditing);

}
