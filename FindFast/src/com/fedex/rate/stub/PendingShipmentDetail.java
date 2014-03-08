/**
 * PendingShipmentDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;


/**
 * This information describes the kind of pending shipment being requested.
 */
public class PendingShipmentDetail  implements java.io.Serializable {
    private com.fedex.rate.stub.PendingShipmentType type;

    /* Date after which the pending shipment will no longer be available
     * for completion. */
    private java.util.Calendar expirationDate;

    /* Only used with type of EMAIL. */
    private com.fedex.rate.stub.EMailLabelDetail emailLabelDetail;

    public PendingShipmentDetail() {
    }

    public PendingShipmentDetail(
           com.fedex.rate.stub.PendingShipmentType type,
           java.util.Calendar expirationDate,
           com.fedex.rate.stub.EMailLabelDetail emailLabelDetail) {
           this.type = type;
           this.expirationDate = expirationDate;
           this.emailLabelDetail = emailLabelDetail;
    }


    /**
     * Gets the type value for this PendingShipmentDetail.
     * 
     * @return type
     */
    public com.fedex.rate.stub.PendingShipmentType getType() {
        return type;
    }


    /**
     * Sets the type value for this PendingShipmentDetail.
     * 
     * @param type
     */
    public void setType(com.fedex.rate.stub.PendingShipmentType type) {
        this.type = type;
    }


    /**
     * Gets the expirationDate value for this PendingShipmentDetail.
     * 
     * @return expirationDate   * Date after which the pending shipment will no longer be available
     * for completion.
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this PendingShipmentDetail.
     * 
     * @param expirationDate   * Date after which the pending shipment will no longer be available
     * for completion.
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the emailLabelDetail value for this PendingShipmentDetail.
     * 
     * @return emailLabelDetail   * Only used with type of EMAIL.
     */
    public com.fedex.rate.stub.EMailLabelDetail getEmailLabelDetail() {
        return emailLabelDetail;
    }


    /**
     * Sets the emailLabelDetail value for this PendingShipmentDetail.
     * 
     * @param emailLabelDetail   * Only used with type of EMAIL.
     */
    public void setEmailLabelDetail(com.fedex.rate.stub.EMailLabelDetail emailLabelDetail) {
        this.emailLabelDetail = emailLabelDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PendingShipmentDetail)) return false;
        PendingShipmentDetail other = (PendingShipmentDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.emailLabelDetail==null && other.getEmailLabelDetail()==null) || 
             (this.emailLabelDetail!=null &&
              this.emailLabelDetail.equals(other.getEmailLabelDetail())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getEmailLabelDetail() != null) {
            _hashCode += getEmailLabelDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PendingShipmentDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "PendingShipmentDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "PendingShipmentType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailLabelDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "EmailLabelDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "EMailLabelDetail"));
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
