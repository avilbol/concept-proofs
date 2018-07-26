/**
 * 
 */
/**
 * @author Avillamil
 *
 */
@XmlJavaTypeAdapters({
    @XmlJavaTypeAdapter(value=PersonAdapter.class, type=Person.class),
    @XmlJavaTypeAdapter(value=NullToEmptyAdapter.class, type=String.class)
})
package com.avilbol.poc.jax.serialization.example;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
