package com.avilbol.poc.jax.serialization.example;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public abstract class ObjectAdapter<T> extends XmlAdapter<T, T>{
	
	@Override
	public T unmarshal(T marshalled) throws Exception {
		return marshalled;
	}

	@Override
	public T marshal(T unmarshalled) throws Exception {
		return unmarshalled == null ? newInstance() : unmarshalled;
	}
	
	public abstract T newInstance();
}
