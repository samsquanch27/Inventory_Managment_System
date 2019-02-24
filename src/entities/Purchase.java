package entities;


public class Purchase {
		
			private int purchaseId;
			private String purchaseName;
			private String getOrderName;
			
			
			public Purchase(int purchaseId, String purchaseName, String getOrderName) {
				this.purchaseId = (purchaseId);
				this.setPurchaseName(purchaseName);
				this.setGetOrderName(getOrderName);
			}
			
			
			public int getPurchaseId() {
				return purchaseId;
			}


			public void setPurchaseId(int purchaseId) {
				this.purchaseId = purchaseId;
			}


			public String getPurchaseName() {
				return purchaseName;
			}


			public void setPurchaseName(String purchaseName) {
				this.purchaseName = purchaseName;
			}


			public String getGetOrderName() {
				return getOrderName;
			}


			public void setGetOrderName(String getOrderName) {
				this.getOrderName = getOrderName;
			}


		
			
			
	
	
}