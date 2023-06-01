package com.craftsman.productsvcx.domain.model.persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductSvcEntity {

	private Long id;
	private String name;
	private String description;

}
