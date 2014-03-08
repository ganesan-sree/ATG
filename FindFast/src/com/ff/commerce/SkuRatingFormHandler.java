package com.ff.commerce;

import java.util.Date;

import atg.nucleus.GenericService;
import atg.repository.MutableRepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;

public class SkuRatingFormHandler extends GenericService{

	public MutableRepository FFRepository;
	public MutableRepository productRepository;
	public String skuID;
	public String rating;
	public void setRating(String skuID,String rating) throws RepositoryException
	{
		MutableRepositoryItem item=getProductRepository().getItemForUpdate(skuID,"sku");
		RepositoryItem rat=(RepositoryItem) item.getPropertyValue("skuRating");
		logInfo(item+"-----"+rat);
		if(rat!=null)
		{
			String totalRating=(String) rat.getPropertyValue("totalRating");
			String totalCount=(String) rat.getPropertyValue("totalCount");
			if(totalRating!=null && totalCount!=null)
			{
				int count=Integer.parseInt(totalCount)+1;
				int r=Integer.parseInt(totalRating)+Integer.parseInt(rating);
				MutableRepositoryItem mItem=getFFRepository().getItemForUpdate(rat.getRepositoryId(),"rating");
				mItem.setPropertyValue("totalRating",""+r);
				mItem.setPropertyValue("totalCount",""+count);
				getFFRepository().updateItem(mItem);
				/*item.setPropertyValue("skuRating",mItem);
				getProductRepository().updateItem(item);*/
			}
		}
		else
		{
			MutableRepositoryItem mItem=getFFRepository().createItem("rating");
			mItem.setPropertyValue("totalRating",""+rating);
			mItem.setPropertyValue("totalCount", ""+1);
			mItem.setPropertyValue("lastDateRated",new Date());
			getFFRepository().addItem(mItem);
			item.setPropertyValue("skuRating",mItem);
			getProductRepository().updateItem(item);
		}
	}
	public MutableRepository getFFRepository() {
		return FFRepository;
	}
	public void setFFRepository(MutableRepository repository) {
		FFRepository = repository;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getSkuID() {
		return skuID;
	}
	public void setSkuID(String skuID) {
		this.skuID = skuID;
	}
	public MutableRepository getProductRepository() {
		return productRepository;
	}
	public void setProductRepository(MutableRepository productRepository) {
		this.productRepository = productRepository;
	}
}
