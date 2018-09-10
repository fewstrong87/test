package com.fewstrong.dto.qo;

import com.fewstrong.reposiotry.support.DataQueryObjectPage;
import com.fewstrong.reposiotry.support.QueryField;
import com.fewstrong.reposiotry.support.QueryType;

public class UserQo extends DataQueryObjectPage {

	@QueryField(type = QueryType.EQUAL, name = "id")
	private Long id;
	
	@QueryField(type = QueryType.FULL_LIKE, name = "name")
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
