/**
 * CustomDocumentDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;


/**
 * Data required to produce a custom-specified document, either at
 * shipment or package level.
 */
public class CustomDocumentDetail  implements java.io.Serializable {
    /* Common information controlling document production. */
    private com.fedex.rate.stub.ShippingDocumentFormat format;

    /* Applicable only to documents produced on thermal printers with
     * roll stock. */
    private com.fedex.rate.stub.LabelPrintingOrientationType labelPrintingOrientation;

    /* Applicable only to documents produced on thermal printers with
     * roll stock. */
    private com.fedex.rate.stub.LabelRotationType labelRotation;

    /* Identifies the formatting specification used to construct this
     * custom document. */
    private java.lang.String specificationId;

    public CustomDocumentDetail() {
    }

    public CustomDocumentDetail(
           com.fedex.rate.stub.ShippingDocumentFormat format,
           com.fedex.rate.stub.LabelPrintingOrientationType labelPrintingOrientation,
           com.fedex.rate.stub.LabelRotationType labelRotation,
           java.lang.String specificationId) {
           this.format = format;
           this.labelPrintingOrientation = labelPrintingOrientation;
           this.labelRotation = labelRotation;
           this.specificationId = specificationId;
    }


    /**
     * Gets the format value for this CustomDocumentDetail.
     * 
     * @return format   * Common information controlling document production.
     */
    public com.fedex.rate.stub.ShippingDocumentFormat getFormat() {
        return format;
    }


    /**
     * Sets the format value for this CustomDocumentDetail.
     * 
     * @param format   * Common information controlling document production.
     */
    public void setFormat(com.fedex.rate.stub.ShippingDocumentFormat format) {
        this.format = format;
    }


    /**
     * Gets the labelPrintingOrientation value for this CustomDocumentDetail.
     * 
     * @return labelPrintingOrientation   * Applicable only to documents produced on thermal printers with
     * roll stock.
     */
    public com.fedex.rate.stub.LabelPrintingOrientationType getLabelPrintingOrientation() {
        return labelPrintingOrientation;
    }


    /**
     * Sets the labelPrintingOrientation value for this CustomDocumentDetail.
     * 
     * @param labelPrintingOrientation   * Applicable only to documents produced on thermal printers with
     * roll stock.
     */
    public void setLabelPrintingOrientation(com.fedex.rate.stub.LabelPrintingOrientationType labelPrintingOrientation) {
        this.labelPrintingOrientation = labelPrintingOrientation;
    }


    /**
     * Gets the labelRotation value for this CustomDocumentDetail.
     * 
     * @return labelRotation   * Applicable only to documents produced on thermal printers with
     * roll stock.
     */
    public com.fedex.rate.stub.LabelRotationType getLabelRotation() {
        return labelRotation;
    }


    /**
     * Sets the labelRotation value for this CustomDocumentDetail.
     * 
     * @param labelRotation   * Applicable only to documents produced on thermal printers with
     * roll stock.
     */
    public void setLabelRotation(com.fedex.rate.stub.LabelRotationType labelRotation) {
        this.labelRotation = labelRotation;
    }


    /**
     * Gets the specificationId value for this CustomDocumentDetail.
     * 
     * @return specificationId   * Identifies the formatting specification used to construct this
     * custom document.
     */
    public java.lang.String getSpecificationId() {
        return specificationId;
    }


    /**
     * Sets the specificationId value for this CustomDocumentDetail.
     * 
     * @param specificationId   * Identifies the formatting specification used to construct this
     * custom document.
     */
    public void setSpecificationId(java.lang.String specificationId) {
        this.specificationId = specificationId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomDocumentDetail)) return false;
        CustomDocumentDetail other = (CustomDocumentDetail) obj;
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
            ((this.labelPrintingOrientation==null && other.getLabelPrintingOrientation()==null) || 
             (this.labelPrintingOrientation!=null &&
              this.labelPrintingOrientation.equals(other.getLabelPrintingOrientation()))) &&
            ((this.labelRotation==null && other.getLabelRotation()==null) || 
             (this.labelRotation!=null &&
              this.labelRotation.equals(other.getLabelRotation()))) &&
            ((this.specificationId==null && other.getSpecificationId()==null) || 
             (this.specificationId!=null &&
              this.specificationId.equals(other.getSpecificationId())));
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
        if (getLabelPrintingOrientation() != null) {
            _hashCode += getLabelPrintingOrientation().hashCode();
        }
        if (getLabelRotation() != null) {
            _hashCode += getLabelRotation().hashCode();
        }
        if (getSpecificationId() != null) {
            _hashCode += getSpecificationId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomDocumentDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomDocumentDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ShippingDocumentFormat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelPrintingOrientation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "LabelPrintingOrientation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "LabelPrintingOrientationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelRotation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "LabelRotation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "LabelRotationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specificationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "SpecificationId"));
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
