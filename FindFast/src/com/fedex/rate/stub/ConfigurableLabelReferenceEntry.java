/**
 * ConfigurableLabelReferenceEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;


/**
 * Defines additional data to print in the Configurable portion of
 * the label, this allows you to print the same type information on the
 * label that can also be printed on the doc tab.
 */
public class ConfigurableLabelReferenceEntry  implements java.io.Serializable {
    /* 1 of 12 possible zones to  position data. */
    private org.apache.axis.types.PositiveInteger zoneNumber;

    /* The identifiying text for the data in this zone. */
    private java.lang.String header;

    /* A reference to a field in either the request or reply to print
     * in this zone following the header. */
    private java.lang.String dataField;

    /* A literal value to print after the header in this zone. */
    private java.lang.String literalValue;

    public ConfigurableLabelReferenceEntry() {
    }

    public ConfigurableLabelReferenceEntry(
           org.apache.axis.types.PositiveInteger zoneNumber,
           java.lang.String header,
           java.lang.String dataField,
           java.lang.String literalValue) {
           this.zoneNumber = zoneNumber;
           this.header = header;
           this.dataField = dataField;
           this.literalValue = literalValue;
    }


    /**
     * Gets the zoneNumber value for this ConfigurableLabelReferenceEntry.
     * 
     * @return zoneNumber   * 1 of 12 possible zones to  position data.
     */
    public org.apache.axis.types.PositiveInteger getZoneNumber() {
        return zoneNumber;
    }


    /**
     * Sets the zoneNumber value for this ConfigurableLabelReferenceEntry.
     * 
     * @param zoneNumber   * 1 of 12 possible zones to  position data.
     */
    public void setZoneNumber(org.apache.axis.types.PositiveInteger zoneNumber) {
        this.zoneNumber = zoneNumber;
    }


    /**
     * Gets the header value for this ConfigurableLabelReferenceEntry.
     * 
     * @return header   * The identifiying text for the data in this zone.
     */
    public java.lang.String getHeader() {
        return header;
    }


    /**
     * Sets the header value for this ConfigurableLabelReferenceEntry.
     * 
     * @param header   * The identifiying text for the data in this zone.
     */
    public void setHeader(java.lang.String header) {
        this.header = header;
    }


    /**
     * Gets the dataField value for this ConfigurableLabelReferenceEntry.
     * 
     * @return dataField   * A reference to a field in either the request or reply to print
     * in this zone following the header.
     */
    public java.lang.String getDataField() {
        return dataField;
    }


    /**
     * Sets the dataField value for this ConfigurableLabelReferenceEntry.
     * 
     * @param dataField   * A reference to a field in either the request or reply to print
     * in this zone following the header.
     */
    public void setDataField(java.lang.String dataField) {
        this.dataField = dataField;
    }


    /**
     * Gets the literalValue value for this ConfigurableLabelReferenceEntry.
     * 
     * @return literalValue   * A literal value to print after the header in this zone.
     */
    public java.lang.String getLiteralValue() {
        return literalValue;
    }


    /**
     * Sets the literalValue value for this ConfigurableLabelReferenceEntry.
     * 
     * @param literalValue   * A literal value to print after the header in this zone.
     */
    public void setLiteralValue(java.lang.String literalValue) {
        this.literalValue = literalValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigurableLabelReferenceEntry)) return false;
        ConfigurableLabelReferenceEntry other = (ConfigurableLabelReferenceEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.zoneNumber==null && other.getZoneNumber()==null) || 
             (this.zoneNumber!=null &&
              this.zoneNumber.equals(other.getZoneNumber()))) &&
            ((this.header==null && other.getHeader()==null) || 
             (this.header!=null &&
              this.header.equals(other.getHeader()))) &&
            ((this.dataField==null && other.getDataField()==null) || 
             (this.dataField!=null &&
              this.dataField.equals(other.getDataField()))) &&
            ((this.literalValue==null && other.getLiteralValue()==null) || 
             (this.literalValue!=null &&
              this.literalValue.equals(other.getLiteralValue())));
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
        if (getZoneNumber() != null) {
            _hashCode += getZoneNumber().hashCode();
        }
        if (getHeader() != null) {
            _hashCode += getHeader().hashCode();
        }
        if (getDataField() != null) {
            _hashCode += getDataField().hashCode();
        }
        if (getLiteralValue() != null) {
            _hashCode += getLiteralValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigurableLabelReferenceEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ConfigurableLabelReferenceEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ZoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("header");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Header"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DataField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("literalValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "LiteralValue"));
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
