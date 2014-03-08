/**
 * ShippingDocumentSpecification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;


/**
 * Contains all data required for additional (non-label) shipping
 * documents to be produced in conjunction with a specific shipment.
 */
public class ShippingDocumentSpecification  implements java.io.Serializable {
    /* Indicates the types of shipping documents requested by the
     * shipper. */
    private com.fedex.rate.stub.RequestedShippingDocumentType[] shippingDocumentTypes;

    private com.fedex.rate.stub.CertificateOfOriginDetail certificateOfOrigin;

    private com.fedex.rate.stub.CommercialInvoiceDetail commercialInvoiceDetail;

    /* Specifies the production of each package-level custom document
     * (the same specification is used for all packages). */
    private com.fedex.rate.stub.CustomDocumentDetail customPackageDocumentDetail;

    /* Specifies the production of a shipment-level custom document. */
    private com.fedex.rate.stub.CustomDocumentDetail customShipmentDocumentDetail;

    /* Details pertaining to the GAA. */
    private com.fedex.rate.stub.GeneralAgencyAgreementDetail generalAgencyAgreementDetail;

    /* Details pertaining to NAFTA COO. */
    private com.fedex.rate.stub.NaftaCertificateOfOriginDetail naftaCertificateOfOriginDetail;

    /* Specifies the production of the OP-900 document for hazardous
     * materials packages. */
    private com.fedex.rate.stub.Op900Detail op900Detail;

    public ShippingDocumentSpecification() {
    }

    public ShippingDocumentSpecification(
           com.fedex.rate.stub.RequestedShippingDocumentType[] shippingDocumentTypes,
           com.fedex.rate.stub.CertificateOfOriginDetail certificateOfOrigin,
           com.fedex.rate.stub.CommercialInvoiceDetail commercialInvoiceDetail,
           com.fedex.rate.stub.CustomDocumentDetail customPackageDocumentDetail,
           com.fedex.rate.stub.CustomDocumentDetail customShipmentDocumentDetail,
           com.fedex.rate.stub.GeneralAgencyAgreementDetail generalAgencyAgreementDetail,
           com.fedex.rate.stub.NaftaCertificateOfOriginDetail naftaCertificateOfOriginDetail,
           com.fedex.rate.stub.Op900Detail op900Detail) {
           this.shippingDocumentTypes = shippingDocumentTypes;
           this.certificateOfOrigin = certificateOfOrigin;
           this.commercialInvoiceDetail = commercialInvoiceDetail;
           this.customPackageDocumentDetail = customPackageDocumentDetail;
           this.customShipmentDocumentDetail = customShipmentDocumentDetail;
           this.generalAgencyAgreementDetail = generalAgencyAgreementDetail;
           this.naftaCertificateOfOriginDetail = naftaCertificateOfOriginDetail;
           this.op900Detail = op900Detail;
    }


    /**
     * Gets the shippingDocumentTypes value for this ShippingDocumentSpecification.
     * 
     * @return shippingDocumentTypes   * Indicates the types of shipping documents requested by the
     * shipper.
     */
    public com.fedex.rate.stub.RequestedShippingDocumentType[] getShippingDocumentTypes() {
        return shippingDocumentTypes;
    }


    /**
     * Sets the shippingDocumentTypes value for this ShippingDocumentSpecification.
     * 
     * @param shippingDocumentTypes   * Indicates the types of shipping documents requested by the
     * shipper.
     */
    public void setShippingDocumentTypes(com.fedex.rate.stub.RequestedShippingDocumentType[] shippingDocumentTypes) {
        this.shippingDocumentTypes = shippingDocumentTypes;
    }

    public com.fedex.rate.stub.RequestedShippingDocumentType getShippingDocumentTypes(int i) {
        return this.shippingDocumentTypes[i];
    }

    public void setShippingDocumentTypes(int i, com.fedex.rate.stub.RequestedShippingDocumentType _value) {
        this.shippingDocumentTypes[i] = _value;
    }


    /**
     * Gets the certificateOfOrigin value for this ShippingDocumentSpecification.
     * 
     * @return certificateOfOrigin
     */
    public com.fedex.rate.stub.CertificateOfOriginDetail getCertificateOfOrigin() {
        return certificateOfOrigin;
    }


    /**
     * Sets the certificateOfOrigin value for this ShippingDocumentSpecification.
     * 
     * @param certificateOfOrigin
     */
    public void setCertificateOfOrigin(com.fedex.rate.stub.CertificateOfOriginDetail certificateOfOrigin) {
        this.certificateOfOrigin = certificateOfOrigin;
    }


    /**
     * Gets the commercialInvoiceDetail value for this ShippingDocumentSpecification.
     * 
     * @return commercialInvoiceDetail
     */
    public com.fedex.rate.stub.CommercialInvoiceDetail getCommercialInvoiceDetail() {
        return commercialInvoiceDetail;
    }


    /**
     * Sets the commercialInvoiceDetail value for this ShippingDocumentSpecification.
     * 
     * @param commercialInvoiceDetail
     */
    public void setCommercialInvoiceDetail(com.fedex.rate.stub.CommercialInvoiceDetail commercialInvoiceDetail) {
        this.commercialInvoiceDetail = commercialInvoiceDetail;
    }


    /**
     * Gets the customPackageDocumentDetail value for this ShippingDocumentSpecification.
     * 
     * @return customPackageDocumentDetail   * Specifies the production of each package-level custom document
     * (the same specification is used for all packages).
     */
    public com.fedex.rate.stub.CustomDocumentDetail getCustomPackageDocumentDetail() {
        return customPackageDocumentDetail;
    }


    /**
     * Sets the customPackageDocumentDetail value for this ShippingDocumentSpecification.
     * 
     * @param customPackageDocumentDetail   * Specifies the production of each package-level custom document
     * (the same specification is used for all packages).
     */
    public void setCustomPackageDocumentDetail(com.fedex.rate.stub.CustomDocumentDetail customPackageDocumentDetail) {
        this.customPackageDocumentDetail = customPackageDocumentDetail;
    }


    /**
     * Gets the customShipmentDocumentDetail value for this ShippingDocumentSpecification.
     * 
     * @return customShipmentDocumentDetail   * Specifies the production of a shipment-level custom document.
     */
    public com.fedex.rate.stub.CustomDocumentDetail getCustomShipmentDocumentDetail() {
        return customShipmentDocumentDetail;
    }


    /**
     * Sets the customShipmentDocumentDetail value for this ShippingDocumentSpecification.
     * 
     * @param customShipmentDocumentDetail   * Specifies the production of a shipment-level custom document.
     */
    public void setCustomShipmentDocumentDetail(com.fedex.rate.stub.CustomDocumentDetail customShipmentDocumentDetail) {
        this.customShipmentDocumentDetail = customShipmentDocumentDetail;
    }


    /**
     * Gets the generalAgencyAgreementDetail value for this ShippingDocumentSpecification.
     * 
     * @return generalAgencyAgreementDetail   * Details pertaining to the GAA.
     */
    public com.fedex.rate.stub.GeneralAgencyAgreementDetail getGeneralAgencyAgreementDetail() {
        return generalAgencyAgreementDetail;
    }


    /**
     * Sets the generalAgencyAgreementDetail value for this ShippingDocumentSpecification.
     * 
     * @param generalAgencyAgreementDetail   * Details pertaining to the GAA.
     */
    public void setGeneralAgencyAgreementDetail(com.fedex.rate.stub.GeneralAgencyAgreementDetail generalAgencyAgreementDetail) {
        this.generalAgencyAgreementDetail = generalAgencyAgreementDetail;
    }


    /**
     * Gets the naftaCertificateOfOriginDetail value for this ShippingDocumentSpecification.
     * 
     * @return naftaCertificateOfOriginDetail   * Details pertaining to NAFTA COO.
     */
    public com.fedex.rate.stub.NaftaCertificateOfOriginDetail getNaftaCertificateOfOriginDetail() {
        return naftaCertificateOfOriginDetail;
    }


    /**
     * Sets the naftaCertificateOfOriginDetail value for this ShippingDocumentSpecification.
     * 
     * @param naftaCertificateOfOriginDetail   * Details pertaining to NAFTA COO.
     */
    public void setNaftaCertificateOfOriginDetail(com.fedex.rate.stub.NaftaCertificateOfOriginDetail naftaCertificateOfOriginDetail) {
        this.naftaCertificateOfOriginDetail = naftaCertificateOfOriginDetail;
    }


    /**
     * Gets the op900Detail value for this ShippingDocumentSpecification.
     * 
     * @return op900Detail   * Specifies the production of the OP-900 document for hazardous
     * materials packages.
     */
    public com.fedex.rate.stub.Op900Detail getOp900Detail() {
        return op900Detail;
    }


    /**
     * Sets the op900Detail value for this ShippingDocumentSpecification.
     * 
     * @param op900Detail   * Specifies the production of the OP-900 document for hazardous
     * materials packages.
     */
    public void setOp900Detail(com.fedex.rate.stub.Op900Detail op900Detail) {
        this.op900Detail = op900Detail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShippingDocumentSpecification)) return false;
        ShippingDocumentSpecification other = (ShippingDocumentSpecification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shippingDocumentTypes==null && other.getShippingDocumentTypes()==null) || 
             (this.shippingDocumentTypes!=null &&
              java.util.Arrays.equals(this.shippingDocumentTypes, other.getShippingDocumentTypes()))) &&
            ((this.certificateOfOrigin==null && other.getCertificateOfOrigin()==null) || 
             (this.certificateOfOrigin!=null &&
              this.certificateOfOrigin.equals(other.getCertificateOfOrigin()))) &&
            ((this.commercialInvoiceDetail==null && other.getCommercialInvoiceDetail()==null) || 
             (this.commercialInvoiceDetail!=null &&
              this.commercialInvoiceDetail.equals(other.getCommercialInvoiceDetail()))) &&
            ((this.customPackageDocumentDetail==null && other.getCustomPackageDocumentDetail()==null) || 
             (this.customPackageDocumentDetail!=null &&
              this.customPackageDocumentDetail.equals(other.getCustomPackageDocumentDetail()))) &&
            ((this.customShipmentDocumentDetail==null && other.getCustomShipmentDocumentDetail()==null) || 
             (this.customShipmentDocumentDetail!=null &&
              this.customShipmentDocumentDetail.equals(other.getCustomShipmentDocumentDetail()))) &&
            ((this.generalAgencyAgreementDetail==null && other.getGeneralAgencyAgreementDetail()==null) || 
             (this.generalAgencyAgreementDetail!=null &&
              this.generalAgencyAgreementDetail.equals(other.getGeneralAgencyAgreementDetail()))) &&
            ((this.naftaCertificateOfOriginDetail==null && other.getNaftaCertificateOfOriginDetail()==null) || 
             (this.naftaCertificateOfOriginDetail!=null &&
              this.naftaCertificateOfOriginDetail.equals(other.getNaftaCertificateOfOriginDetail()))) &&
            ((this.op900Detail==null && other.getOp900Detail()==null) || 
             (this.op900Detail!=null &&
              this.op900Detail.equals(other.getOp900Detail())));
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
        if (getShippingDocumentTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShippingDocumentTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShippingDocumentTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCertificateOfOrigin() != null) {
            _hashCode += getCertificateOfOrigin().hashCode();
        }
        if (getCommercialInvoiceDetail() != null) {
            _hashCode += getCommercialInvoiceDetail().hashCode();
        }
        if (getCustomPackageDocumentDetail() != null) {
            _hashCode += getCustomPackageDocumentDetail().hashCode();
        }
        if (getCustomShipmentDocumentDetail() != null) {
            _hashCode += getCustomShipmentDocumentDetail().hashCode();
        }
        if (getGeneralAgencyAgreementDetail() != null) {
            _hashCode += getGeneralAgencyAgreementDetail().hashCode();
        }
        if (getNaftaCertificateOfOriginDetail() != null) {
            _hashCode += getNaftaCertificateOfOriginDetail().hashCode();
        }
        if (getOp900Detail() != null) {
            _hashCode += getOp900Detail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShippingDocumentSpecification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ShippingDocumentSpecification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingDocumentTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ShippingDocumentTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RequestedShippingDocumentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateOfOrigin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CertificateOfOrigin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CertificateOfOriginDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commercialInvoiceDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CommercialInvoiceDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CommercialInvoiceDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customPackageDocumentDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomPackageDocumentDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomDocumentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customShipmentDocumentDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomShipmentDocumentDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomDocumentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generalAgencyAgreementDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "GeneralAgencyAgreementDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "GeneralAgencyAgreementDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naftaCertificateOfOriginDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "NaftaCertificateOfOriginDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "NaftaCertificateOfOriginDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("op900Detail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Op900Detail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Op900Detail"));
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
