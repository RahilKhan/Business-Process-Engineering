package com.me.dao.impl;

import java.util.Collection;
import java.util.List;
 
import org.springframework.stereotype.Repository;

import com.me.dao.inf.AbstractDao;
import com.me.dao.inf.CurrencyDao;
import com.me.model.Currency;
 
 
@Repository("currencyDao")
public class CurrencyDaoImpl extends AbstractDao<Integer, Currency> implements CurrencyDao {
 
	@Override
	@SuppressWarnings("unchecked")
	public List<Currency> getAllCurrency() {
		List<Currency> currencies = getEntityManager()
                .createQuery("SELECT curr FROM Currency curr ORDER BY curr.currencyIsoCode ASC")
                .getResultList();
        return currencies;
	}
 
    //An alternative to Hibernate.initialize()
    protected void initializeCollection(Collection<?> collection) {
        if(collection == null) {
            return;
        }
        collection.iterator().hasNext();
    }
	
}