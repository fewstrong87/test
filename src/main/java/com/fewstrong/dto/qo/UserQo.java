package com.fewstrong.dto.qo;

import com.fewstrong.reposiotry.support.DataQueryObjectPage;
import com.fewstrong.reposiotry.support.QueryBetween;
import com.fewstrong.reposiotry.support.QueryField;
import com.fewstrong.reposiotry.support.QueryType;

public class UserQo extends DataQueryObjectPage {

	@QueryField(type = QueryType.FULL_LIKE, name = "name")
	private String name;

	@QueryField(type = QueryType.BEWTEEN, name = "age")
	private QueryBetween<Integer> betweenAge;
	
	@QueryField(type = QueryType.EQUAL, name = "age")
	private Integer equalAge;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public QueryBetween<Integer> getBetweenAge() {
		return betweenAge;
	}

	public void setBetweenAge(QueryBetween<Integer> betweenAge) {
		this.betweenAge = betweenAge;
	}

	public Integer getEqualAge() {
		return equalAge;
	}

	public void setEqualAge(Integer equalAge) {
		this.equalAge = equalAge;
	}

}
