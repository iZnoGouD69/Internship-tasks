package com.example.misc;

public class GenericClass<T> {
	
	T obj;
	GenericClass(T obj){
		this.obj = obj;
	}
	
	public T getObject() {
		return this.obj;
	}
}
