package atg.commerce.pricing;

import atg.repository.RepositoryItem;

public class MyItemPricingEngineImpl extends ItemPricingEngineImpl {

	
	@Override
	protected Object getCalculator(RepositoryItem pPricingModel)
			throws PricingException {
	

		System.out.println(pPricingModel);
		System.out.println("jjjjjjjjjjjj\n\n\n");
		System.out.println(getPricingModelProperties());
		
		String propertyName = getPricingModelProperties().getPricingCalculatorService();
		System.out.println(propertyName);
		       String calcServiceString = (String)pPricingModel.getPropertyValue(propertyName);
		System.out.println(calcServiceString);
		
		
		return super.getCalculator(pPricingModel);
	}
	
}
