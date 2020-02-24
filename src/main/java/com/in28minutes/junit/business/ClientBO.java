package main.java.com.in28minutes.junit.business;


import main.java.com.in28minutes.junit.business.exception.DifferentCurrenciesException;
import main.java.com.in28minutes.junit.model.Amount;
import main.java.com.in28minutes.junit.model.Product;

import java.util.List;

public interface ClientBO {

	Amount getClientProductsSum(List<Product> products)
			throws DifferentCurrenciesException;

}