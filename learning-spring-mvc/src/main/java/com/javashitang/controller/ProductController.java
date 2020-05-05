package com.javashitang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("manage")
@RestController
public class ProductController {

	@RequestMapping("product/*")
	public String index() {
		return "product";
	}
}
