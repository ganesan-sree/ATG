<%@ taglib uri="/dsp" prefix="dsp"%>

<dsp:page>

	<dsp:importbean bean="/atg/dynamo/droplet/Switch" />
	<dsp:importbean bean="/atg/dynamo/droplet/ForEach" />
	<dsp:importbean bean="/atg/commerce/ShoppingCart" />

	<div id="cart_totals">
		<div class="ordertoltalswrapper">
			<div class="totalrow">
				<div class="totalcolleft">Subtotal:</div>
				<div class="totalcolright">
					<dsp:valueof converter="currency"
						param="order.priceInfo.rawSubtotal" />
				</div>
			</div>
			<br/>
			<div class="totalrow">
				<div class="totalcolleft">Total:</div>
				<div class="totalcolright">
					<dsp:valueof converter="currency" param="order.priceInfo.total" />
				</div>
			</div>
		</div>
	</div>

</dsp:page>
