package com.avilbol.poc.jax.serialization.example;

public class PersonAdapter extends ObjectAdapter<Person>{

	@Override
	public Person newInstance() {
		return new Person();
	}
}
