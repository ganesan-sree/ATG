/**
 * TaxpayerIdentification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;


/**
 * The descriptive data for taxpayer identification information.
 */
public class TaxpayerIdentification  implements java.io.Serializable {
    /* Identifies the category of the taxpayer identification number.
     * See TinType for the list of values. */
    private com.fedex.rate.stub.TinType tinType;

    /* Identifies the taxpayer identification number. */
    private java.lang.String number;

    /* Identifies the usage of Tax Identification Number in Shipment
     * processing */
    private java.lang.String usage;

    public TaxpayerIdentification() {
    }

    public TaxpayerIdentification(
           com.fedex.rate.stub.TinType tinType,
           java.lang.String number,
           java.lang.String usage) {
           this.tinType = tinType;
           this.number = number;
           this.usage = usage;
    }


    /**
     * Gets the tinType value for this TaxpayerIdentification.
     * 
     * @return tinType   * Identifies the category of the taxpayer identification number.
     * See TinType for the list of values.
     */
    public com.fedex.rate.stub.TinType getTinType() {
        return tinType;
    }


    /**
     * Sets the tinType value for this TaxpayerIdentification.
     * 
     * @param tinType   * Identifies the category of the taxpayer identification number.
     * See TinType for the list of values.
     */
    public void setTinType(com.fedex.rate.stub.TinType tinType) {
        this.tinType = tinType;
    }


    /**
     * Gets the number value for this TaxpayerIdentification.
     * 
     * @return number   * Identifies the taxpayer identification number.
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this TaxpayerIdentification.
     * 
     * @param number   * Identifies the taxpayer identification number.
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the usage value for this TaxpayerIdentification.
     * 
     * @return usage   * Identifies the usage of Tax Identification Number in Shipment
     * processing
     */
    public java.lang.String getUsage() {
        return usage;
    }


    /**
     * Sets the usage value for this TaxpayerIdentification.
     * 
     * @param usage   * Identifies the usage of Tax Identification Number in Shipment
     * processing
     */
    public void setUsage(java.lang.String usage) {
        this.usage = usage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxpayerIdentification)) return false;
        TaxpayerIdentification other = (TaxpayerIdentification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tinType==null && other.getTinType()==null) || 
             (this.tinType!=null &&
              this.tinType.equals(other.getTinType()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.usage==null && other.getUsage()==null) || 
             (this.usage!=null &&
              this.usage.equals(other.getUsage())));
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
        if (getTinType() != null) {
            _hashCode += getTinType().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getUsage() != null) {
            _hashCode += getUsage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaxpayerIdentification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "TaxpayerIdentification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tinType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "TinType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "TinType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Usage"));
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
