/**
 * VariableHandlingChargeDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;


/**
 * Details about how to calculate variable handling charges at the
 * shipment level.
 */
public class VariableHandlingChargeDetail  implements java.io.Serializable {
    /* The type of handling charge to be calculated and returned in
     * the reply. */
    private com.fedex.rate.stub.VariableHandlingChargeType variableHandlingChargeType;

    /* Used with Variable handling charge type of FIXED_VALUE. Contains
     * the amount to be added to the freight charge. Contains 2 explicit
     * decimal positions with a total max length of 10 including the decimal. */
    private com.fedex.rate.stub.Money fixedValue;

    /* Used with Variable handling charge types PERCENTAGE_OF_BASE,
     * PERCENTAGE_OF_NET or PERCETAGE_OF_NET_EXCL_TAXES. Used to calculate
     * the amount to be added to the freight charge. Contains 2 explicit
     * decimal positions. */
    private java.math.BigDecimal percentValue;

    public VariableHandlingChargeDetail() {
    }

    public VariableHandlingChargeDetail(
           com.fedex.rate.stub.VariableHandlingChargeType variableHandlingChargeType,
           com.fedex.rate.stub.Money fixedValue,
           java.math.BigDecimal percentValue) {
           this.variableHandlingChargeType = variableHandlingChargeType;
           this.fixedValue = fixedValue;
           this.percentValue = percentValue;
    }


    /**
     * Gets the variableHandlingChargeType value for this VariableHandlingChargeDetail.
     * 
     * @return variableHandlingChargeType   * The type of handling charge to be calculated and returned in
     * the reply.
     */
    public com.fedex.rate.stub.VariableHandlingChargeType getVariableHandlingChargeType() {
        return variableHandlingChargeType;
    }


    /**
     * Sets the variableHandlingChargeType value for this VariableHandlingChargeDetail.
     * 
     * @param variableHandlingChargeType   * The type of handling charge to be calculated and returned in
     * the reply.
     */
    public void setVariableHandlingChargeType(com.fedex.rate.stub.VariableHandlingChargeType variableHandlingChargeType) {
        this.variableHandlingChargeType = variableHandlingChargeType;
    }


    /**
     * Gets the fixedValue value for this VariableHandlingChargeDetail.
     * 
     * @return fixedValue   * Used with Variable handling charge type of FIXED_VALUE. Contains
     * the amount to be added to the freight charge. Contains 2 explicit
     * decimal positions with a total max length of 10 including the decimal.
     */
    public com.fedex.rate.stub.Money getFixedValue() {
        return fixedValue;
    }


    /**
     * Sets the fixedValue value for this VariableHandlingChargeDetail.
     * 
     * @param fixedValue   * Used with Variable handling charge type of FIXED_VALUE. Contains
     * the amount to be added to the freight charge. Contains 2 explicit
     * decimal positions with a total max length of 10 including the decimal.
     */
    public void setFixedValue(com.fedex.rate.stub.Money fixedValue) {
        this.fixedValue = fixedValue;
    }


    /**
     * Gets the percentValue value for this VariableHandlingChargeDetail.
     * 
     * @return percentValue   * Used with Variable handling charge types PERCENTAGE_OF_BASE,
     * PERCENTAGE_OF_NET or PERCETAGE_OF_NET_EXCL_TAXES. Used to calculate
     * the amount to be added to the freight charge. Contains 2 explicit
     * decimal positions.
     */
    public java.math.BigDecimal getPercentValue() {
        return percentValue;
    }


    /**
     * Sets the percentValue value for this VariableHandlingChargeDetail.
     * 
     * @param percentValue   * Used with Variable handling charge types PERCENTAGE_OF_BASE,
     * PERCENTAGE_OF_NET or PERCETAGE_OF_NET_EXCL_TAXES. Used to calculate
     * the amount to be added to the freight charge. Contains 2 explicit
     * decimal positions.
     */
    public void setPercentValue(java.math.BigDecimal percentValue) {
        this.percentValue = percentValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VariableHandlingChargeDetail)) return false;
        VariableHandlingChargeDetail other = (VariableHandlingChargeDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.variableHandlingChargeType==null && other.getVariableHandlingChargeType()==null) || 
             (this.variableHandlingChargeType!=null &&
              this.variableHandlingChargeType.equals(other.getVariableHandlingChargeType()))) &&
            ((this.fixedValue==null && other.getFixedValue()==null) || 
             (this.fixedValue!=null &&
              this.fixedValue.equals(other.getFixedValue()))) &&
            ((this.percentValue==null && other.getPercentValue()==null) || 
             (this.percentValue!=null &&
              this.percentValue.equals(other.getPercentValue())));
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
        if (getVariableHandlingChargeType() != null) {
            _hashCode += getVariableHandlingChargeType().hashCode();
        }
        if (getFixedValue() != null) {
            _hashCode += getFixedValue().hashCode();
        }
        if (getPercentValue() != null) {
            _hashCode += getPercentValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VariableHandlingChargeDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "VariableHandlingChargeDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variableHandlingChargeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "VariableHandlingChargeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "VariableHandlingChargeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixedValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FixedValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "PercentValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
