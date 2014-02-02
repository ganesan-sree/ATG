/**
 * FlatbedTrailerDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;


/**
 * Specifies the optional features/characteristics requested for a
 * Freight shipment utilizing a flatbed trailer.
 */
public class FlatbedTrailerDetail  implements java.io.Serializable {
    private com.fedex.rate.stub.FlatbedTrailerOption[] options;

    public FlatbedTrailerDetail() {
    }

    public FlatbedTrailerDetail(
           com.fedex.rate.stub.FlatbedTrailerOption[] options) {
           this.options = options;
    }


    /**
     * Gets the options value for this FlatbedTrailerDetail.
     * 
     * @return options
     */
    public com.fedex.rate.stub.FlatbedTrailerOption[] getOptions() {
        return options;
    }


    /**
     * Sets the options value for this FlatbedTrailerDetail.
     * 
     * @param options
     */
    public void setOptions(com.fedex.rate.stub.FlatbedTrailerOption[] options) {
        this.options = options;
    }

    public com.fedex.rate.stub.FlatbedTrailerOption getOptions(int i) {
        return this.options[i];
    }

    public void setOptions(int i, com.fedex.rate.stub.FlatbedTrailerOption _value) {
        this.options[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlatbedTrailerDetail)) return false;
        FlatbedTrailerDetail other = (FlatbedTrailerDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              java.util.Arrays.equals(this.options, other.getOptions())));
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
        if (getOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOptions(), i);
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
        new org.apache.axis.description.TypeDesc(FlatbedTrailerDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FlatbedTrailerDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Options"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FlatbedTrailerOption"));
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
