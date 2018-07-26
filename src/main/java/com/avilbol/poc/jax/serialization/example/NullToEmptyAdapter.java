package com.avilbol.poc.jax.serialization.example;

public class NullToEmptyAdapter extends ObjectAdapter<String>{

	@Override
	public String newInstance() {
		return "";
	}
}
