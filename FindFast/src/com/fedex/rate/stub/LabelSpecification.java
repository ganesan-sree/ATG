/**
 * LabelSpecification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;


/**
 * Description of shipping label to be returned in the reply
 */
public class LabelSpecification  implements java.io.Serializable {
    /* Specify type of label to be returned */
    private com.fedex.rate.stub.LabelFormatType labelFormatType;

    /* The type of image or printer commands the label is to be formatted
     * in.
     *                 DPL = Unimark thermal printer language
     *                 EPL2 = Eltron thermal printer language
     *                 PDF = a label returned as a pdf image
     *                 PNG = a label returned as a png image
     *                 ZPLII = Zebra thermal printer language */
    private com.fedex.rate.stub.ShippingDocumentImageType imageType;

    /* For thermal printer lables this indicates the size of the label
     * and the location of the doc tab if present. */
    private com.fedex.rate.stub.LabelStockType labelStockType;

    /* This indicates if the top or bottom of the label comes out
     * of the printer first. */
    private com.fedex.rate.stub.LabelPrintingOrientationType labelPrintingOrientation;

    /* Relative to normal orientation for the printer. RIGHT=90 degrees
     * clockwise, UPSIDE_DOWN=180 degrees, LEFT=90 degrees counterclockwise. */
    private com.fedex.rate.stub.LabelRotationType labelRotation;

    /* If present, this contact and address information will replace
     * the return address information on the label. */
    private com.fedex.rate.stub.ContactAndAddress printedLabelOrigin;

    /* Allows customer-specified control of label content. */
    private com.fedex.rate.stub.CustomerSpecifiedLabelDetail customerSpecifiedDetail;

    public LabelSpecification() {
    }

    public LabelSpecification(
           com.fedex.rate.stub.LabelFormatType labelFormatType,
           com.fedex.rate.stub.ShippingDocumentImageType imageType,
           com.fedex.rate.stub.LabelStockType labelStockType,
           com.fedex.rate.stub.LabelPrintingOrientationType labelPrintingOrientation,
           com.fedex.rate.stub.LabelRotationType labelRotation,
           com.fedex.rate.stub.ContactAndAddress printedLabelOrigin,
           com.fedex.rate.stub.CustomerSpecifiedLabelDetail customerSpecifiedDetail) {
           this.labelFormatType = labelFormatType;
           this.imageType = imageType;
           this.labelStockType = labelStockType;
           this.labelPrintingOrientation = labelPrintingOrientation;
           this.labelRotation = labelRotation;
           this.printedLabelOrigin = printedLabelOrigin;
           this.customerSpecifiedDetail = customerSpecifiedDetail;
    }


    /**
     * Gets the labelFormatType value for this LabelSpecification.
     * 
     * @return labelFormatType   * Specify type of label to be returned
     */
    public com.fedex.rate.stub.LabelFormatType getLabelFormatType() {
        return labelFormatType;
    }


    /**
     * Sets the labelFormatType value for this LabelSpecification.
     * 
     * @param labelFormatType   * Specify type of label to be returned
     */
    public void setLabelFormatType(com.fedex.rate.stub.LabelFormatType labelFormatType) {
        this.labelFormatType = labelFormatType;
    }


    /**
     * Gets the imageType value for this LabelSpecification.
     * 
     * @return imageType   * The type of image or printer commands the label is to be formatted
     * in.
     *                 DPL = Unimark thermal printer language
     *                 EPL2 = Eltron thermal printer language
     *                 PDF = a label returned as a pdf image
     *                 PNG = a label returned as a png image
     *                 ZPLII = Zebra thermal printer language
     */
    public com.fedex.rate.stub.ShippingDocumentImageType getImageType() {
        return imageType;
    }


    /**
     * Sets the imageType value for this LabelSpecification.
     * 
     * @param imageType   * The type of image or printer commands the label is to be formatted
     * in.
     *                 DPL = Unimark thermal printer language
     *                 EPL2 = Eltron thermal printer language
     *                 PDF = a label returned as a pdf image
     *                 PNG = a label returned as a png image
     *                 ZPLII = Zebra thermal printer language
     */
    public void setImageType(com.fedex.rate.stub.ShippingDocumentImageType imageType) {
        this.imageType = imageType;
    }


    /**
     * Gets the labelStockType value for this LabelSpecification.
     * 
     * @return labelStockType   * For thermal printer lables this indicates the size of the label
     * and the location of the doc tab if present.
     */
    public com.fedex.rate.stub.LabelStockType getLabelStockType() {
        return labelStockType;
    }


    /**
     * Sets the labelStockType value for this LabelSpecification.
     * 
     * @param labelStockType   * For thermal printer lables this indicates the size of the label
     * and the location of the doc tab if present.
     */
    public void setLabelStockType(com.fedex.rate.stub.LabelStockType labelStockType) {
        this.labelStockType = labelStockType;
    }


    /**
     * Gets the labelPrintingOrientation value for this LabelSpecification.
     * 
     * @return labelPrintingOrientation   * This indicates if the top or bottom of the label comes out
     * of the printer first.
     */
    public com.fedex.rate.stub.LabelPrintingOrientationType getLabelPrintingOrientation() {
        return labelPrintingOrientation;
    }


    /**
     * Sets the labelPrintingOrientation value for this LabelSpecification.
     * 
     * @param labelPrintingOrientation   * This indicates if the top or bottom of the label comes out
     * of the printer first.
     */
    public void setLabelPrintingOrientation(com.fedex.rate.stub.LabelPrintingOrientationType labelPrintingOrientation) {
        this.labelPrintingOrientation = labelPrintingOrientation;
    }


    /**
     * Gets the labelRotation value for this LabelSpecification.
     * 
     * @return labelRotation   * Relative to normal orientation for the printer. RIGHT=90 degrees
     * clockwise, UPSIDE_DOWN=180 degrees, LEFT=90 degrees counterclockwise.
     */
    public com.fedex.rate.stub.LabelRotationType getLabelRotation() {
        return labelRotation;
    }


    /**
     * Sets the labelRotation value for this LabelSpecification.
     * 
     * @param labelRotation   * Relative to normal orientation for the printer. RIGHT=90 degrees
     * clockwise, UPSIDE_DOWN=180 degrees, LEFT=90 degrees counterclockwise.
     */
    public void setLabelRotation(com.fedex.rate.stub.LabelRotationType labelRotation) {
        this.labelRotation = labelRotation;
    }


    /**
     * Gets the printedLabelOrigin value for this LabelSpecification.
     * 
     * @return printedLabelOrigin   * If present, this contact and address information will replace
     * the return address information on the label.
     */
    public com.fedex.rate.stub.ContactAndAddress getPrintedLabelOrigin() {
        return printedLabelOrigin;
    }


    /**
     * Sets the printedLabelOrigin value for this LabelSpecification.
     * 
     * @param printedLabelOrigin   * If present, this contact and address information will replace
     * the return address information on the label.
     */
    public void setPrintedLabelOrigin(com.fedex.rate.stub.ContactAndAddress printedLabelOrigin) {
        this.printedLabelOrigin = printedLabelOrigin;
    }


    /**
     * Gets the customerSpecifiedDetail value for this LabelSpecification.
     * 
     * @return customerSpecifiedDetail   * Allows customer-specified control of label content.
     */
    public com.fedex.rate.stub.CustomerSpecifiedLabelDetail getCustomerSpecifiedDetail() {
        return customerSpecifiedDetail;
    }


    /**
     * Sets the customerSpecifiedDetail value for this LabelSpecification.
     * 
     * @param customerSpecifiedDetail   * Allows customer-specified control of label content.
     */
    public void setCustomerSpecifiedDetail(com.fedex.rate.stub.CustomerSpecifiedLabelDetail customerSpecifiedDetail) {
        this.customerSpecifiedDetail = customerSpecifiedDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LabelSpecification)) return false;
        LabelSpecification other = (LabelSpecification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.labelFormatType==null && other.getLabelFormatType()==null) || 
             (this.labelFormatType!=null &&
              this.labelFormatType.equals(other.getLabelFormatType()))) &&
            ((this.imageType==null && other.getImageType()==null) || 
             (this.imageType!=null &&
              this.imageType.equals(other.getImageType()))) &&
            ((this.labelStockType==null && other.getLabelStockType()==null) || 
             (this.labelStockType!=null &&
              this.labelStockType.equals(other.getLabelStockType()))) &&
            ((this.labelPrintingOrientation==null && other.getLabelPrintingOrientation()==null) || 
             (this.labelPrintingOrientation!=null &&
              this.labelPrintingOrientation.equals(other.getLabelPrintingOrientation()))) &&
            ((this.labelRotation==null && other.getLabelRotation()==null) || 
             (this.labelRotation!=null &&
              this.labelRotation.equals(other.getLabelRotation()))) &&
            ((this.printedLabelOrigin==null && other.getPrintedLabelOrigin()==null) || 
             (this.printedLabelOrigin!=null &&
              this.printedLabelOrigin.equals(other.getPrintedLabelOrigin()))) &&
            ((this.customerSpecifiedDetail==null && other.getCustomerSpecifiedDetail()==null) || 
             (this.customerSpecifiedDetail!=null &&
              this.customerSpecifiedDetail.equals(other.getCustomerSpecifiedDetail())));
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
        if (getLabelFormatType() != null) {
            _hashCode += getLabelFormatType().hashCode();
        }
        if (getImageType() != null) {
            _hashCode += getImageType().hashCode();
        }
        if (getLabelStockType() != null) {
            _hashCode += getLabelStockType().hashCode();
        }
        if (getLabelPrintingOrientation() != null) {
            _hashCode += getLabelPrintingOrientation().hashCode();
        }
        if (getLabelRotation() != null) {
            _hashCode += getLabelRotation().hashCode();
        }
        if (getPrintedLabelOrigin() != null) {
            _hashCode += getPrintedLabelOrigin().hashCode();
        }
        if (getCustomerSpecifiedDetail() != null) {
            _hashCode += getCustomerSpecifiedDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LabelSpecification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "LabelSpecification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelFormatType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "LabelFormatType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "LabelFormatType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ImageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ShippingDocumentImageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelStockType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "LabelStockType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "LabelStockType"));
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
        elemField.setFieldName("printedLabelOrigin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "PrintedLabelOrigin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ContactAndAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerSpecifiedDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomerSpecifiedDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomerSpecifiedLabelDetail"));
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
