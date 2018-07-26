package com.avilbol.poc.jax.serialization.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.avilbol.poc.jax.serialization.example.ListAdapter.AdaptedList;

public class ListAdapter extends XmlAdapter<AdaptedList, List<? extends Object>>{

	@Override
	public List<? extends Object> unmarshal(AdaptedList adaptedList) throws Exception {
		return adaptedList.value;
	}

	@Override
	public AdaptedList marshal(List<? extends Object> list) throws Exception {
		List<? extends Object> marshalled  = list == null ? Arrays.asList(new Object[] {new Object()}) : list;
		AdaptedList adaptedList = new AdaptedList();
		adaptedList.value = marshalled;
		return adaptedList;
	}
	
	//protected abstract List<Person> newInstance();

	public static class AdaptedList{
		List<? extends Object> value = new ArrayList<>();
	}
}
