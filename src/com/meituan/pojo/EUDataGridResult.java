package com.meituan.pojo;

import java.util.List;

public class EUDataGridResult {
	// ��ǰҳ
	private long curPage;
	// ҳ��С
	private long pageSize;
	// ���
	private List<?> rows;

	public long getCurPage() {
		return curPage;
	}

	public void setCurPage(long curPage) {
		this.curPage = curPage;
	}

	public long getPageSize() {
		return pageSize;
	}

	public void setPageSize(long pageSize) {
		this.pageSize = pageSize;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

}