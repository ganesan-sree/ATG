/**
 * FreightGuaranteeDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;

public class FreightGuaranteeDetail  implements java.io.Serializable {
    private com.fedex.rate.stub.FreightGuaranteeType type;

    /* Date for all Freight guarantee types. */
    private java.util.Date date;

    /* Time for GUARANTEED_TIME only. */
    private org.apache.axis.types.Time time;

    public FreightGuaranteeDetail() {
    }

    public FreightGuaranteeDetail(
           com.fedex.rate.stub.FreightGuaranteeType type,
           java.util.Date date,
           org.apache.axis.types.Time time) {
           this.type = type;
           this.date = date;
           this.time = time;
    }


    /**
     * Gets the type value for this FreightGuaranteeDetail.
     * 
     * @return type
     */
    public com.fedex.rate.stub.FreightGuaranteeType getType() {
        return type;
    }


    /**
     * Sets the type value for this FreightGuaranteeDetail.
     * 
     * @param type
     */
    public void setType(com.fedex.rate.stub.FreightGuaranteeType type) {
        this.type = type;
    }


    /**
     * Gets the date value for this FreightGuaranteeDetail.
     * 
     * @return date   * Date for all Freight guarantee types.
     */
    public java.util.Date getDate() {
        return date;
    }


    /**
     * Sets the date value for this FreightGuaranteeDetail.
     * 
     * @param date   * Date for all Freight guarantee types.
     */
    public void setDate(java.util.Date date) {
        this.date = date;
    }


    /**
     * Gets the time value for this FreightGuaranteeDetail.
     * 
     * @return time   * Time for GUARANTEED_TIME only.
     */
    public org.apache.axis.types.Time getTime() {
        return time;
    }


    /**
     * Sets the time value for this FreightGuaranteeDetail.
     * 
     * @param time   * Time for GUARANTEED_TIME only.
     */
    public void setTime(org.apache.axis.types.Time time) {
        this.time = time;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FreightGuaranteeDetail)) return false;
        FreightGuaranteeDetail other = (FreightGuaranteeDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FreightGuaranteeDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FreightGuaranteeDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FreightGuaranteeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
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
