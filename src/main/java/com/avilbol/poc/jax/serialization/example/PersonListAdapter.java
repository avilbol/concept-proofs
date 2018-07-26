package com.avilbol.poc.jax.serialization.example;

import java.util.Arrays;
import java.util.List;

public class PersonListAdapter {

	public List<Person> newInstance() {
		return Arrays.asList(new Person());
	}
}
