/**
 * ReturnShipmentDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;


/**
 * Information relating to a return shipment.
 */
public class ReturnShipmentDetail  implements java.io.Serializable {
    /* The type of return shipment that is being requested. At present
     * the only type of retrun shipment that is supported is PRINT_RETURN_LABEL.
     * With this option you can print a return label to insert into the box
     * of an outbound shipment. This option can not be used to print an outbound
     * label. */
    private com.fedex.rate.stub.ReturnType returnType;

    /* Return Merchant Authorization */
    private com.fedex.rate.stub.Rma rma;

    /* Specific information about the delivery of the email and options
     * for the shipment. */
    private com.fedex.rate.stub.ReturnEMailDetail returnEMailDetail;

    public ReturnShipmentDetail() {
    }

    public ReturnShipmentDetail(
           com.fedex.rate.stub.ReturnType returnType,
           com.fedex.rate.stub.Rma rma,
           com.fedex.rate.stub.ReturnEMailDetail returnEMailDetail) {
           this.returnType = returnType;
           this.rma = rma;
           this.returnEMailDetail = returnEMailDetail;
    }


    /**
     * Gets the returnType value for this ReturnShipmentDetail.
     * 
     * @return returnType   * The type of return shipment that is being requested. At present
     * the only type of retrun shipment that is supported is PRINT_RETURN_LABEL.
     * With this option you can print a return label to insert into the box
     * of an outbound shipment. This option can not be used to print an outbound
     * label.
     */
    public com.fedex.rate.stub.ReturnType getReturnType() {
        return returnType;
    }


    /**
     * Sets the returnType value for this ReturnShipmentDetail.
     * 
     * @param returnType   * The type of return shipment that is being requested. At present
     * the only type of retrun shipment that is supported is PRINT_RETURN_LABEL.
     * With this option you can print a return label to insert into the box
     * of an outbound shipment. This option can not be used to print an outbound
     * label.
     */
    public void setReturnType(com.fedex.rate.stub.ReturnType returnType) {
        this.returnType = returnType;
    }


    /**
     * Gets the rma value for this ReturnShipmentDetail.
     * 
     * @return rma   * Return Merchant Authorization
     */
    public com.fedex.rate.stub.Rma getRma() {
        return rma;
    }


    /**
     * Sets the rma value for this ReturnShipmentDetail.
     * 
     * @param rma   * Return Merchant Authorization
     */
    public void setRma(com.fedex.rate.stub.Rma rma) {
        this.rma = rma;
    }


    /**
     * Gets the returnEMailDetail value for this ReturnShipmentDetail.
     * 
     * @return returnEMailDetail   * Specific information about the delivery of the email and options
     * for the shipment.
     */
    public com.fedex.rate.stub.ReturnEMailDetail getReturnEMailDetail() {
        return returnEMailDetail;
    }


    /**
     * Sets the returnEMailDetail value for this ReturnShipmentDetail.
     * 
     * @param returnEMailDetail   * Specific information about the delivery of the email and options
     * for the shipment.
     */
    public void setReturnEMailDetail(com.fedex.rate.stub.ReturnEMailDetail returnEMailDetail) {
        this.returnEMailDetail = returnEMailDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReturnShipmentDetail)) return false;
        ReturnShipmentDetail other = (ReturnShipmentDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.returnType==null && other.getReturnType()==null) || 
             (this.returnType!=null &&
              this.returnType.equals(other.getReturnType()))) &&
            ((this.rma==null && other.getRma()==null) || 
             (this.rma!=null &&
              this.rma.equals(other.getRma()))) &&
            ((this.returnEMailDetail==null && other.getReturnEMailDetail()==null) || 
             (this.returnEMailDetail!=null &&
              this.returnEMailDetail.equals(other.getReturnEMailDetail())));
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
        if (getReturnType() != null) {
            _hashCode += getReturnType().hashCode();
        }
        if (getRma() != null) {
            _hashCode += getRma().hashCode();
        }
        if (getReturnEMailDetail() != null) {
            _hashCode += getReturnEMailDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReturnShipmentDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ReturnShipmentDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ReturnType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ReturnType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rma");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Rma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Rma"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnEMailDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ReturnEMailDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ReturnEMailDetail"));
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
