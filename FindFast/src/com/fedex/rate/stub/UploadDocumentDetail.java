/**
 * UploadDocumentDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;

public class UploadDocumentDetail  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger lineNumber;

    private java.lang.String customerReference;

    private com.fedex.rate.stub.UploadDocumentProducerType documentProducer;

    private com.fedex.rate.stub.UploadDocumentType documentType;

    private java.lang.String fileName;

    private byte[] documentContent;

    public UploadDocumentDetail() {
    }

    public UploadDocumentDetail(
           org.apache.axis.types.NonNegativeInteger lineNumber,
           java.lang.String customerReference,
           com.fedex.rate.stub.UploadDocumentProducerType documentProducer,
           com.fedex.rate.stub.UploadDocumentType documentType,
           java.lang.String fileName,
           byte[] documentContent) {
           this.lineNumber = lineNumber;
           this.customerReference = customerReference;
           this.documentProducer = documentProducer;
           this.documentType = documentType;
           this.fileName = fileName;
           this.documentContent = documentContent;
    }


    /**
     * Gets the lineNumber value for this UploadDocumentDetail.
     * 
     * @return lineNumber
     */
    public org.apache.axis.types.NonNegativeInteger getLineNumber() {
        return lineNumber;
    }


    /**
     * Sets the lineNumber value for this UploadDocumentDetail.
     * 
     * @param lineNumber
     */
    public void setLineNumber(org.apache.axis.types.NonNegativeInteger lineNumber) {
        this.lineNumber = lineNumber;
    }


    /**
     * Gets the customerReference value for this UploadDocumentDetail.
     * 
     * @return customerReference
     */
    public java.lang.String getCustomerReference() {
        return customerReference;
    }


    /**
     * Sets the customerReference value for this UploadDocumentDetail.
     * 
     * @param customerReference
     */
    public void setCustomerReference(java.lang.String customerReference) {
        this.customerReference = customerReference;
    }


    /**
     * Gets the documentProducer value for this UploadDocumentDetail.
     * 
     * @return documentProducer
     */
    public com.fedex.rate.stub.UploadDocumentProducerType getDocumentProducer() {
        return documentProducer;
    }


    /**
     * Sets the documentProducer value for this UploadDocumentDetail.
     * 
     * @param documentProducer
     */
    public void setDocumentProducer(com.fedex.rate.stub.UploadDocumentProducerType documentProducer) {
        this.documentProducer = documentProducer;
    }


    /**
     * Gets the documentType value for this UploadDocumentDetail.
     * 
     * @return documentType
     */
    public com.fedex.rate.stub.UploadDocumentType getDocumentType() {
        return documentType;
    }


    /**
     * Sets the documentType value for this UploadDocumentDetail.
     * 
     * @param documentType
     */
    public void setDocumentType(com.fedex.rate.stub.UploadDocumentType documentType) {
        this.documentType = documentType;
    }


    /**
     * Gets the fileName value for this UploadDocumentDetail.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this UploadDocumentDetail.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the documentContent value for this UploadDocumentDetail.
     * 
     * @return documentContent
     */
    public byte[] getDocumentContent() {
        return documentContent;
    }


    /**
     * Sets the documentContent value for this UploadDocumentDetail.
     * 
     * @param documentContent
     */
    public void setDocumentContent(byte[] documentContent) {
        this.documentContent = documentContent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UploadDocumentDetail)) return false;
        UploadDocumentDetail other = (UploadDocumentDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineNumber==null && other.getLineNumber()==null) || 
             (this.lineNumber!=null &&
              this.lineNumber.equals(other.getLineNumber()))) &&
            ((this.customerReference==null && other.getCustomerReference()==null) || 
             (this.customerReference!=null &&
              this.customerReference.equals(other.getCustomerReference()))) &&
            ((this.documentProducer==null && other.getDocumentProducer()==null) || 
             (this.documentProducer!=null &&
              this.documentProducer.equals(other.getDocumentProducer()))) &&
            ((this.documentType==null && other.getDocumentType()==null) || 
             (this.documentType!=null &&
              this.documentType.equals(other.getDocumentType()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.documentContent==null && other.getDocumentContent()==null) || 
             (this.documentContent!=null &&
              java.util.Arrays.equals(this.documentContent, other.getDocumentContent())));
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
        if (getLineNumber() != null) {
            _hashCode += getLineNumber().hashCode();
        }
        if (getCustomerReference() != null) {
            _hashCode += getCustomerReference().hashCode();
        }
        if (getDocumentProducer() != null) {
            _hashCode += getDocumentProducer().hashCode();
        }
        if (getDocumentType() != null) {
            _hashCode += getDocumentType().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getDocumentContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentContent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentContent(), i);
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
        new org.apache.axis.description.TypeDesc(UploadDocumentDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "UploadDocumentDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "LineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomerReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentProducer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DocumentProducer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "UploadDocumentProducerType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DocumentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "UploadDocumentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DocumentContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
