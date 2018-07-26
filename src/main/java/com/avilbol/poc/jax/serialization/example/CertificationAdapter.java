package com.avilbol.poc.jax.serialization.example;

public class CertificationAdapter extends ObjectAdapter<Certification>{

	@Override
	public Certification newInstance() {
		return new Certification();
	}
}
