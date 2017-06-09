package com.me.dao.inf;

import java.util.List;

import com.me.model.Currency;

public interface CurrencyDao {

//	public Currency findCurrencyById(int id);
	public List<Currency> getAllCurrency();
}
