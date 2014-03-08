/**
 * EMailLabelDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;


/**
 * Specific information about the delivery of the email and options
 * for the shipment.
 */
public class EMailLabelDetail  implements java.io.Serializable {
    /* Email address to send the URL to. */
    private java.lang.String notificationEMailAddress;

    /* A message to be inserted into the email. */
    private java.lang.String notificationMessage;

    public EMailLabelDetail() {
    }

    public EMailLabelDetail(
           java.lang.String notificationEMailAddress,
           java.lang.String notificationMessage) {
           this.notificationEMailAddress = notificationEMailAddress;
           this.notificationMessage = notificationMessage;
    }


    /**
     * Gets the notificationEMailAddress value for this EMailLabelDetail.
     * 
     * @return notificationEMailAddress   * Email address to send the URL to.
     */
    public java.lang.String getNotificationEMailAddress() {
        return notificationEMailAddress;
    }


    /**
     * Sets the notificationEMailAddress value for this EMailLabelDetail.
     * 
     * @param notificationEMailAddress   * Email address to send the URL to.
     */
    public void setNotificationEMailAddress(java.lang.String notificationEMailAddress) {
        this.notificationEMailAddress = notificationEMailAddress;
    }


    /**
     * Gets the notificationMessage value for this EMailLabelDetail.
     * 
     * @return notificationMessage   * A message to be inserted into the email.
     */
    public java.lang.String getNotificationMessage() {
        return notificationMessage;
    }


    /**
     * Sets the notificationMessage value for this EMailLabelDetail.
     * 
     * @param notificationMessage   * A message to be inserted into the email.
     */
    public void setNotificationMessage(java.lang.String notificationMessage) {
        this.notificationMessage = notificationMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EMailLabelDetail)) return false;
        EMailLabelDetail other = (EMailLabelDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.notificationEMailAddress==null && other.getNotificationEMailAddress()==null) || 
             (this.notificationEMailAddress!=null &&
              this.notificationEMailAddress.equals(other.getNotificationEMailAddress()))) &&
            ((this.notificationMessage==null && other.getNotificationMessage()==null) || 
             (this.notificationMessage!=null &&
              this.notificationMessage.equals(other.getNotificationMessage())));
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
        if (getNotificationEMailAddress() != null) {
            _hashCode += getNotificationEMailAddress().hashCode();
        }
        if (getNotificationMessage() != null) {
            _hashCode += getNotificationMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EMailLabelDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "EMailLabelDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationEMailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "NotificationEMailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "NotificationMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
