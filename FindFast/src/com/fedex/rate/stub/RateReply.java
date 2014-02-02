/**
 * RateReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;


/**
 * The response to a RateRequest. The Notifications indicate whether
 * the request was successful or not.
 */
public class RateReply  implements java.io.Serializable {
    /* This indicates the highest level of severity of all the notifications
     * returned in this reply. */
    private com.fedex.rate.stub.NotificationSeverityType highestSeverity;

    /* The descriptive data regarding the results of the submitted
     * transaction. */
    private com.fedex.rate.stub.Notification[] notifications;

    /* Contains the CustomerTransactionId that was sent in the request. */
    private com.fedex.rate.stub.TransactionDetail transactionDetail;

    /* The version of this reply. */
    private com.fedex.rate.stub.VersionId version;

    /* Each element contains all rate data for a single service. If
     * service was specified in the request, there will be a single entry
     * in this array; if service was omitted in the request, there will be
     * a separate entry in this array for each service being compared. */
    private com.fedex.rate.stub.RateReplyDetail[] rateReplyDetails;

    public RateReply() {
    }

    public RateReply(
           com.fedex.rate.stub.NotificationSeverityType highestSeverity,
           com.fedex.rate.stub.Notification[] notifications,
           com.fedex.rate.stub.TransactionDetail transactionDetail,
           com.fedex.rate.stub.VersionId version,
           com.fedex.rate.stub.RateReplyDetail[] rateReplyDetails) {
           this.highestSeverity = highestSeverity;
           this.notifications = notifications;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.rateReplyDetails = rateReplyDetails;
    }


    /**
     * Gets the highestSeverity value for this RateReply.
     * 
     * @return highestSeverity   * This indicates the highest level of severity of all the notifications
     * returned in this reply.
     */
    public com.fedex.rate.stub.NotificationSeverityType getHighestSeverity() {
        return highestSeverity;
    }


    /**
     * Sets the highestSeverity value for this RateReply.
     * 
     * @param highestSeverity   * This indicates the highest level of severity of all the notifications
     * returned in this reply.
     */
    public void setHighestSeverity(com.fedex.rate.stub.NotificationSeverityType highestSeverity) {
        this.highestSeverity = highestSeverity;
    }


    /**
     * Gets the notifications value for this RateReply.
     * 
     * @return notifications   * The descriptive data regarding the results of the submitted
     * transaction.
     */
    public com.fedex.rate.stub.Notification[] getNotifications() {
        return notifications;
    }


    /**
     * Sets the notifications value for this RateReply.
     * 
     * @param notifications   * The descriptive data regarding the results of the submitted
     * transaction.
     */
    public void setNotifications(com.fedex.rate.stub.Notification[] notifications) {
        this.notifications = notifications;
    }

    public com.fedex.rate.stub.Notification getNotifications(int i) {
        return this.notifications[i];
    }

    public void setNotifications(int i, com.fedex.rate.stub.Notification _value) {
        this.notifications[i] = _value;
    }


    /**
     * Gets the transactionDetail value for this RateReply.
     * 
     * @return transactionDetail   * Contains the CustomerTransactionId that was sent in the request.
     */
    public com.fedex.rate.stub.TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this RateReply.
     * 
     * @param transactionDetail   * Contains the CustomerTransactionId that was sent in the request.
     */
    public void setTransactionDetail(com.fedex.rate.stub.TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this RateReply.
     * 
     * @return version   * The version of this reply.
     */
    public com.fedex.rate.stub.VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this RateReply.
     * 
     * @param version   * The version of this reply.
     */
    public void setVersion(com.fedex.rate.stub.VersionId version) {
        this.version = version;
    }


    /**
     * Gets the rateReplyDetails value for this RateReply.
     * 
     * @return rateReplyDetails   * Each element contains all rate data for a single service. If
     * service was specified in the request, there will be a single entry
     * in this array; if service was omitted in the request, there will be
     * a separate entry in this array for each service being compared.
     */
    public com.fedex.rate.stub.RateReplyDetail[] getRateReplyDetails() {
        return rateReplyDetails;
    }


    /**
     * Sets the rateReplyDetails value for this RateReply.
     * 
     * @param rateReplyDetails   * Each element contains all rate data for a single service. If
     * service was specified in the request, there will be a single entry
     * in this array; if service was omitted in the request, there will be
     * a separate entry in this array for each service being compared.
     */
    public void setRateReplyDetails(com.fedex.rate.stub.RateReplyDetail[] rateReplyDetails) {
        this.rateReplyDetails = rateReplyDetails;
    }

    public com.fedex.rate.stub.RateReplyDetail getRateReplyDetails(int i) {
        return this.rateReplyDetails[i];
    }

    public void setRateReplyDetails(int i, com.fedex.rate.stub.RateReplyDetail _value) {
        this.rateReplyDetails[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RateReply)) return false;
        RateReply other = (RateReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.highestSeverity==null && other.getHighestSeverity()==null) || 
             (this.highestSeverity!=null &&
              this.highestSeverity.equals(other.getHighestSeverity()))) &&
            ((this.notifications==null && other.getNotifications()==null) || 
             (this.notifications!=null &&
              java.util.Arrays.equals(this.notifications, other.getNotifications()))) &&
            ((this.transactionDetail==null && other.getTransactionDetail()==null) || 
             (this.transactionDetail!=null &&
              this.transactionDetail.equals(other.getTransactionDetail()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.rateReplyDetails==null && other.getRateReplyDetails()==null) || 
             (this.rateReplyDetails!=null &&
              java.util.Arrays.equals(this.rateReplyDetails, other.getRateReplyDetails())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getHighestSeverity() != null) {
            _hashCode += getHighestSeverity().hashCode();
        }
        if (getNotifications() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotifications());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotifications(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransactionDetail() != null) {
            _hashCode += getTransactionDetail().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getRateReplyDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRateReplyDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRateReplyDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RateReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RateReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highestSeverity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "HighestSeverity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "NotificationSeverityType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifications");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Notifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Notification"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "TransactionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "TransactionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "VersionId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateReplyDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RateReplyDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RateReplyDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
