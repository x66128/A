package com.star.testbase;

public class REQUEST_DATA {

  	   private String channelId;
  	   private String merchantCode;
  	   private String serviceId;
  	   private String sysId;
  	   private String token;
  	   private String transactionUuid;
  	   public void setChannelId(String channelId) {
  	        this.channelId = channelId;
  	    }
  	    public String getChannelId() {
  	        return channelId;
  	    }

  	   public void setMerchantCode(String merchantCode) {
  	        this.merchantCode = merchantCode;
  	    }
  	    public String getMerchantCode() {
  	        return merchantCode;
  	    }

  	   public void setServiceId(String serviceId) {
  	        this.serviceId = serviceId;
  	    }
  	    public String getServiceId() {
  	        return serviceId;
  	    }

  	   public void setSysId(String sysId) {
  	        this.sysId = sysId;
  	    }
  	    public String getSysId() {
  	        return sysId;
  	    }

  	   public void setToken(String token) {
  	        this.token = token;
  	    }
  	    public String getToken() {
  	        return token;
  	    }

  	   public void setTransactionUuid(String transactionUuid) {
  	        this.transactionUuid = transactionUuid;
  	    }
  	    public String getTransactionUuid() {
  	        return transactionUuid;
  	    }
		@Override
		public String toString() {
			return "REQUEST_DATA [channelId=" + channelId + ", merchantCode=" + merchantCode + ", serviceId="
					+ serviceId + ", sysId=" + sysId + ", token=" + token + ", transactionUuid=" + transactionUuid
					+ "]";
		}
  	    
  	    
  	}

