/**
 * 
 */
package com.etandon.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author eshantandon
 *
 */
@WebService
public class Catalog {
    @WebMethod
	public List<String> getProductCategories(String parent){
		List<String> categories=new ArrayList<>();
		if(parent.compareTo("Test")==0)
		{
		categories.add("Cat1");
		categories.add("Cat2");
		categories.add("Cat3");
		}
		if(parent.compareTo("Book")==0)
		{
		categories.add("BookCat1");
		categories.add("BookCat2");
		categories.add("BookCat3");
		}
		return categories;
		
	}
    @WebMethod
    public List<String> getProductCategories1234(){
		List<String> categories=new ArrayList<>();
		categories.add("Cat1");
		categories.add("Cat2");
		categories.add("Cat3");
		return categories;
		
	}
    
    
}
