package com.avilbol.poc.jax.serialization.example;

public class UbicationAdapter extends ObjectAdapter<Ubication>{

	@Override
	public Ubication newInstance() {
		return new Ubication();
	}
}
