package com.fewstrong.reposiotry.support;

/**
 * 分页查询对象
 * @author Fewstrong
 *
 */
public class DataQueryObjectPage extends DataQueryObjectSort {
	
	protected Integer page = 0;
	
	protected Integer size = 10;
	
	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}


}
