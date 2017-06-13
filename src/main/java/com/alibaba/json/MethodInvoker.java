package com.alibaba.json;

import java.lang.reflect.InvocationTargetException;

public interface MethodInvoker {
	public String invoker() throws IllegalArgumentException,
	IllegalAccessException, InvocationTargetException ;

}
