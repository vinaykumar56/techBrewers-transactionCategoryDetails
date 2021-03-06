package com.ibm.transactioncategory.api.model;

import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomerCategoryDetails {

	@Id
	private String _id;
	private String _rev;
	private int customerId;
	private List<AggregateCategoryDetails> transactionCategoryDetails;

	public CustomerCategoryDetails(){ }
	
}
