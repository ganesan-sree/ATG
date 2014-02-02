/**
 * DocTabContentZone001.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;

public class DocTabContentZone001  implements java.io.Serializable {
    private com.fedex.rate.stub.DocTabZoneSpecification[] docTabZoneSpecifications;

    public DocTabContentZone001() {
    }

    public DocTabContentZone001(
           com.fedex.rate.stub.DocTabZoneSpecification[] docTabZoneSpecifications) {
           this.docTabZoneSpecifications = docTabZoneSpecifications;
    }


    /**
     * Gets the docTabZoneSpecifications value for this DocTabContentZone001.
     * 
     * @return docTabZoneSpecifications
     */
    public com.fedex.rate.stub.DocTabZoneSpecification[] getDocTabZoneSpecifications() {
        return docTabZoneSpecifications;
    }


    /**
     * Sets the docTabZoneSpecifications value for this DocTabContentZone001.
     * 
     * @param docTabZoneSpecifications
     */
    public void setDocTabZoneSpecifications(com.fedex.rate.stub.DocTabZoneSpecification[] docTabZoneSpecifications) {
        this.docTabZoneSpecifications = docTabZoneSpecifications;
    }

    public com.fedex.rate.stub.DocTabZoneSpecification getDocTabZoneSpecifications(int i) {
        return this.docTabZoneSpecifications[i];
    }

    public void setDocTabZoneSpecifications(int i, com.fedex.rate.stub.DocTabZoneSpecification _value) {
        this.docTabZoneSpecifications[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocTabContentZone001)) return false;
        DocTabContentZone001 other = (DocTabContentZone001) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.docTabZoneSpecifications==null && other.getDocTabZoneSpecifications()==null) || 
             (this.docTabZoneSpecifications!=null &&
              java.util.Arrays.equals(this.docTabZoneSpecifications, other.getDocTabZoneSpecifications())));
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
        if (getDocTabZoneSpecifications() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocTabZoneSpecifications());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocTabZoneSpecifications(), i);
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
        new org.apache.axis.description.TypeDesc(DocTabContentZone001.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DocTabContentZone001"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docTabZoneSpecifications");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DocTabZoneSpecifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DocTabZoneSpecification"));
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
