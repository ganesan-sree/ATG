/**
 * CustomDeliveryWindowType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;

public class CustomDeliveryWindowType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CustomDeliveryWindowType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AFTER = "AFTER";
    public static final java.lang.String _BEFORE = "BEFORE";
    public static final java.lang.String _BETWEEN = "BETWEEN";
    public static final java.lang.String _ON = "ON";
    public static final CustomDeliveryWindowType AFTER = new CustomDeliveryWindowType(_AFTER);
    public static final CustomDeliveryWindowType BEFORE = new CustomDeliveryWindowType(_BEFORE);
    public static final CustomDeliveryWindowType BETWEEN = new CustomDeliveryWindowType(_BETWEEN);
    public static final CustomDeliveryWindowType ON = new CustomDeliveryWindowType(_ON);
    public java.lang.String getValue() { return _value_;}
    public static CustomDeliveryWindowType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CustomDeliveryWindowType enumeration = (CustomDeliveryWindowType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CustomDeliveryWindowType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomDeliveryWindowType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomDeliveryWindowType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
