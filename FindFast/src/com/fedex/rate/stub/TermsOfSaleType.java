/**
 * TermsOfSaleType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;

public class TermsOfSaleType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TermsOfSaleType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CFR_OR_CPT = "CFR_OR_CPT";
    public static final java.lang.String _CIF_OR_CIP = "CIF_OR_CIP";
    public static final java.lang.String _DDP = "DDP";
    public static final java.lang.String _DDU = "DDU";
    public static final java.lang.String _EXW = "EXW";
    public static final java.lang.String _FOB_OR_FCA = "FOB_OR_FCA";
    public static final TermsOfSaleType CFR_OR_CPT = new TermsOfSaleType(_CFR_OR_CPT);
    public static final TermsOfSaleType CIF_OR_CIP = new TermsOfSaleType(_CIF_OR_CIP);
    public static final TermsOfSaleType DDP = new TermsOfSaleType(_DDP);
    public static final TermsOfSaleType DDU = new TermsOfSaleType(_DDU);
    public static final TermsOfSaleType EXW = new TermsOfSaleType(_EXW);
    public static final TermsOfSaleType FOB_OR_FCA = new TermsOfSaleType(_FOB_OR_FCA);
    public java.lang.String getValue() { return _value_;}
    public static TermsOfSaleType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TermsOfSaleType enumeration = (TermsOfSaleType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TermsOfSaleType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TermsOfSaleType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "TermsOfSaleType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
