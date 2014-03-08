/**
 * EtdDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;


/**
 * Electronic Trade document references used with the ETD special
 * service.
 */
public class EtdDetail  implements java.io.Serializable {
    /* Indicates the types of shipping documents produced for the
     * shipper by FedEx (see ShippingDocumentSpecification) which should
     * be copied back to the shipper in the shipment result data. */
    private com.fedex.rate.stub.RequestedShippingDocumentType[] requestedDocumentCopies;

    /* Currently not supported. */
    private com.fedex.rate.stub.UploadDocumentDetail[] documents;

    private com.fedex.rate.stub.UploadDocumentReferenceDetail[] documentReferences;

    public EtdDetail() {
    }

    public EtdDetail(
           com.fedex.rate.stub.RequestedShippingDocumentType[] requestedDocumentCopies,
           com.fedex.rate.stub.UploadDocumentDetail[] documents,
           com.fedex.rate.stub.UploadDocumentReferenceDetail[] documentReferences) {
           this.requestedDocumentCopies = requestedDocumentCopies;
           this.documents = documents;
           this.documentReferences = documentReferences;
    }


    /**
     * Gets the requestedDocumentCopies value for this EtdDetail.
     * 
     * @return requestedDocumentCopies   * Indicates the types of shipping documents produced for the
     * shipper by FedEx (see ShippingDocumentSpecification) which should
     * be copied back to the shipper in the shipment result data.
     */
    public com.fedex.rate.stub.RequestedShippingDocumentType[] getRequestedDocumentCopies() {
        return requestedDocumentCopies;
    }


    /**
     * Sets the requestedDocumentCopies value for this EtdDetail.
     * 
     * @param requestedDocumentCopies   * Indicates the types of shipping documents produced for the
     * shipper by FedEx (see ShippingDocumentSpecification) which should
     * be copied back to the shipper in the shipment result data.
     */
    public void setRequestedDocumentCopies(com.fedex.rate.stub.RequestedShippingDocumentType[] requestedDocumentCopies) {
        this.requestedDocumentCopies = requestedDocumentCopies;
    }

    public com.fedex.rate.stub.RequestedShippingDocumentType getRequestedDocumentCopies(int i) {
        return this.requestedDocumentCopies[i];
    }

    public void setRequestedDocumentCopies(int i, com.fedex.rate.stub.RequestedShippingDocumentType _value) {
        this.requestedDocumentCopies[i] = _value;
    }


    /**
     * Gets the documents value for this EtdDetail.
     * 
     * @return documents   * Currently not supported.
     */
    public com.fedex.rate.stub.UploadDocumentDetail[] getDocuments() {
        return documents;
    }


    /**
     * Sets the documents value for this EtdDetail.
     * 
     * @param documents   * Currently not supported.
     */
    public void setDocuments(com.fedex.rate.stub.UploadDocumentDetail[] documents) {
        this.documents = documents;
    }

    public com.fedex.rate.stub.UploadDocumentDetail getDocuments(int i) {
        return this.documents[i];
    }

    public void setDocuments(int i, com.fedex.rate.stub.UploadDocumentDetail _value) {
        this.documents[i] = _value;
    }


    /**
     * Gets the documentReferences value for this EtdDetail.
     * 
     * @return documentReferences
     */
    public com.fedex.rate.stub.UploadDocumentReferenceDetail[] getDocumentReferences() {
        return documentReferences;
    }


    /**
     * Sets the documentReferences value for this EtdDetail.
     * 
     * @param documentReferences
     */
    public void setDocumentReferences(com.fedex.rate.stub.UploadDocumentReferenceDetail[] documentReferences) {
        this.documentReferences = documentReferences;
    }

    public com.fedex.rate.stub.UploadDocumentReferenceDetail getDocumentReferences(int i) {
        return this.documentReferences[i];
    }

    public void setDocumentReferences(int i, com.fedex.rate.stub.UploadDocumentReferenceDetail _value) {
        this.documentReferences[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EtdDetail)) return false;
        EtdDetail other = (EtdDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestedDocumentCopies==null && other.getRequestedDocumentCopies()==null) || 
             (this.requestedDocumentCopies!=null &&
              java.util.Arrays.equals(this.requestedDocumentCopies, other.getRequestedDocumentCopies()))) &&
            ((this.documents==null && other.getDocuments()==null) || 
             (this.documents!=null &&
              java.util.Arrays.equals(this.documents, other.getDocuments()))) &&
            ((this.documentReferences==null && other.getDocumentReferences()==null) || 
             (this.documentReferences!=null &&
              java.util.Arrays.equals(this.documentReferences, other.getDocumentReferences())));
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
        if (getRequestedDocumentCopies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequestedDocumentCopies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequestedDocumentCopies(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDocuments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocuments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocuments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDocumentReferences() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentReferences());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentReferences(), i);
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
        new org.apache.axis.description.TypeDesc(EtdDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "EtdDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedDocumentCopies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RequestedDocumentCopies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RequestedShippingDocumentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Documents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "UploadDocumentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentReferences");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DocumentReferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "UploadDocumentReferenceDetail"));
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
