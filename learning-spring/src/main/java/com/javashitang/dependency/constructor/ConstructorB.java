package com.javashitang.dependency.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ConstructorB {

	private ConstructorA constructorA;

	@Autowired
	public ConstructorB(@Lazy ConstructorA constructorA) {
		this.constructorA = constructorA;
	}
}
