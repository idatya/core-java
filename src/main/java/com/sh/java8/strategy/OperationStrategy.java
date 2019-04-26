package com.sh.java8.strategy;

@FunctionalInterface
public interface OperationStrategy<T> {

	T compute(T x, T y);
}