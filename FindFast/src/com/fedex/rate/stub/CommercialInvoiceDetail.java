/**
 * CommercialInvoiceDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;


/**
 * The instructions indicating how to print the Commercial Invoice(
 * e.g. image type) Specifies characteristics of a shipping document
 * to be produced.
 */
public class CommercialInvoiceDetail  implements java.io.Serializable {
    private com.fedex.rate.stub.ShippingDocumentFormat format;

    /* Specifies the usage and identification of a customer supplied
     * image to be used on this document. */
    private com.fedex.rate.stub.CustomerImageUsage[] customerImageUsages;

    public CommercialInvoiceDetail() {
    }

    public CommercialInvoiceDetail(
           com.fedex.rate.stub.ShippingDocumentFormat format,
           com.fedex.rate.stub.CustomerImageUsage[] customerImageUsages) {
           this.format = format;
           this.customerImageUsages = customerImageUsages;
    }


    /**
     * Gets the format value for this CommercialInvoiceDetail.
     * 
     * @return format
     */
    public com.fedex.rate.stub.ShippingDocumentFormat getFormat() {
        return format;
    }


    /**
     * Sets the format value for this CommercialInvoiceDetail.
     * 
     * @param format
     */
    public void setFormat(com.fedex.rate.stub.ShippingDocumentFormat format) {
        this.format = format;
    }


    /**
     * Gets the customerImageUsages value for this CommercialInvoiceDetail.
     * 
     * @return customerImageUsages   * Specifies the usage and identification of a customer supplied
     * image to be used on this document.
     */
    public com.fedex.rate.stub.CustomerImageUsage[] getCustomerImageUsages() {
        return customerImageUsages;
    }


    /**
     * Sets the customerImageUsages value for this CommercialInvoiceDetail.
     * 
     * @param customerImageUsages   * Specifies the usage and identification of a customer supplied
     * image to be used on this document.
     */
    public void setCustomerImageUsages(com.fedex.rate.stub.CustomerImageUsage[] customerImageUsages) {
        this.customerImageUsages = customerImageUsages;
    }

    public com.fedex.rate.stub.CustomerImageUsage getCustomerImageUsages(int i) {
        return this.customerImageUsages[i];
    }

    public void setCustomerImageUsages(int i, com.fedex.rate.stub.CustomerImageUsage _value) {
        this.customerImageUsages[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommercialInvoiceDetail)) return false;
        CommercialInvoiceDetail other = (CommercialInvoiceDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.customerImageUsages==null && other.getCustomerImageUsages()==null) || 
             (this.customerImageUsages!=null &&
              java.util.Arrays.equals(this.customerImageUsages, other.getCustomerImageUsages())));
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
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getCustomerImageUsages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerImageUsages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerImageUsages(), i);
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
        new org.apache.axis.description.TypeDesc(CommercialInvoiceDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CommercialInvoiceDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ShippingDocumentFormat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerImageUsages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomerImageUsages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomerImageUsage"));
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
