package com.avilbol.poc.jax.serialization.example;

import java.util.Collections;
import java.util.List;

public class EmptyListAdapter {

	public List<Object> newInstance() {
		return Collections.emptyList();
	}
}
