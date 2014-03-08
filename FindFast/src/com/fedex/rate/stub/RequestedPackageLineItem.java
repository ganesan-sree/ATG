/**
 * RequestedPackageLineItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;


/**
 * This class rationalizes RequestedPackage and RequestedPackageSummary
 * from previous interfaces. The way in which it is uses within a RequestedShipment
 * depends on the RequestedPackageDetailType value specified for that
 * shipment.
 */
public class RequestedPackageLineItem  implements java.io.Serializable {
    /* Used only with INDIVIDUAL_PACKAGE, as a unique identifier of
     * each requested package. */
    private org.apache.axis.types.PositiveInteger sequenceNumber;

    /* Used only with PACKAGE_GROUPS, as a unique identifier of each
     * group of identical packages. */
    private org.apache.axis.types.NonNegativeInteger groupNumber;

    /* Used only with PACKAGE_GROUPS, as a count of packages within
     * a group of identical packages. */
    private org.apache.axis.types.NonNegativeInteger groupPackageCount;

    private com.fedex.rate.stub.VariableHandlingChargeDetail variableHandlingChargeDetail;

    /* Only used for INDIVIDUAL_PACKAGES and PACKAGE_GROUPS. Ignored
     * for PACKAGE_SUMMARY, in which case totalInsuredValue and packageCount
     * on the shipment will be used to determine this value. */
    private com.fedex.rate.stub.Money insuredValue;

    /* Only used for INDIVIDUAL_PACKAGES and PACKAGE_GROUPS. Ignored
     * for PACKAGE_SUMMARY, in which case totalweight and packageCount on
     * the shipment will be used to determine this value. */
    private com.fedex.rate.stub.Weight weight;

    private com.fedex.rate.stub.Dimensions dimensions;

    /* Provides additional detail on how the customer has physically
     * packaged this item. As of June 2009, required for packages moving
     * under international and SmartPost services. */
    private com.fedex.rate.stub.PhysicalPackagingType physicalPackaging;

    /* Human-readable text describing the package. */
    private java.lang.String itemDescription;

    private com.fedex.rate.stub.CustomerReference[] customerReferences;

    private com.fedex.rate.stub.PackageSpecialServicesRequested specialServicesRequested;

    /* Only used for INDIVIDUAL_PACKAGES and PACKAGE_GROUPS. */
    private com.fedex.rate.stub.ContentRecord[] contentRecords;

    public RequestedPackageLineItem() {
    }

    public RequestedPackageLineItem(
           org.apache.axis.types.PositiveInteger sequenceNumber,
           org.apache.axis.types.NonNegativeInteger groupNumber,
           org.apache.axis.types.NonNegativeInteger groupPackageCount,
           com.fedex.rate.stub.VariableHandlingChargeDetail variableHandlingChargeDetail,
           com.fedex.rate.stub.Money insuredValue,
           com.fedex.rate.stub.Weight weight,
           com.fedex.rate.stub.Dimensions dimensions,
           com.fedex.rate.stub.PhysicalPackagingType physicalPackaging,
           java.lang.String itemDescription,
           com.fedex.rate.stub.CustomerReference[] customerReferences,
           com.fedex.rate.stub.PackageSpecialServicesRequested specialServicesRequested,
           com.fedex.rate.stub.ContentRecord[] contentRecords) {
           this.sequenceNumber = sequenceNumber;
           this.groupNumber = groupNumber;
           this.groupPackageCount = groupPackageCount;
           this.variableHandlingChargeDetail = variableHandlingChargeDetail;
           this.insuredValue = insuredValue;
           this.weight = weight;
           this.dimensions = dimensions;
           this.physicalPackaging = physicalPackaging;
           this.itemDescription = itemDescription;
           this.customerReferences = customerReferences;
           this.specialServicesRequested = specialServicesRequested;
           this.contentRecords = contentRecords;
    }


    /**
     * Gets the sequenceNumber value for this RequestedPackageLineItem.
     * 
     * @return sequenceNumber   * Used only with INDIVIDUAL_PACKAGE, as a unique identifier of
     * each requested package.
     */
    public org.apache.axis.types.PositiveInteger getSequenceNumber() {
        return sequenceNumber;
    }


    /**
     * Sets the sequenceNumber value for this RequestedPackageLineItem.
     * 
     * @param sequenceNumber   * Used only with INDIVIDUAL_PACKAGE, as a unique identifier of
     * each requested package.
     */
    public void setSequenceNumber(org.apache.axis.types.PositiveInteger sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }


    /**
     * Gets the groupNumber value for this RequestedPackageLineItem.
     * 
     * @return groupNumber   * Used only with PACKAGE_GROUPS, as a unique identifier of each
     * group of identical packages.
     */
    public org.apache.axis.types.NonNegativeInteger getGroupNumber() {
        return groupNumber;
    }


    /**
     * Sets the groupNumber value for this RequestedPackageLineItem.
     * 
     * @param groupNumber   * Used only with PACKAGE_GROUPS, as a unique identifier of each
     * group of identical packages.
     */
    public void setGroupNumber(org.apache.axis.types.NonNegativeInteger groupNumber) {
        this.groupNumber = groupNumber;
    }


    /**
     * Gets the groupPackageCount value for this RequestedPackageLineItem.
     * 
     * @return groupPackageCount   * Used only with PACKAGE_GROUPS, as a count of packages within
     * a group of identical packages.
     */
    public org.apache.axis.types.NonNegativeInteger getGroupPackageCount() {
        return groupPackageCount;
    }


    /**
     * Sets the groupPackageCount value for this RequestedPackageLineItem.
     * 
     * @param groupPackageCount   * Used only with PACKAGE_GROUPS, as a count of packages within
     * a group of identical packages.
     */
    public void setGroupPackageCount(org.apache.axis.types.NonNegativeInteger groupPackageCount) {
        this.groupPackageCount = groupPackageCount;
    }


    /**
     * Gets the variableHandlingChargeDetail value for this RequestedPackageLineItem.
     * 
     * @return variableHandlingChargeDetail
     */
    public com.fedex.rate.stub.VariableHandlingChargeDetail getVariableHandlingChargeDetail() {
        return variableHandlingChargeDetail;
    }


    /**
     * Sets the variableHandlingChargeDetail value for this RequestedPackageLineItem.
     * 
     * @param variableHandlingChargeDetail
     */
    public void setVariableHandlingChargeDetail(com.fedex.rate.stub.VariableHandlingChargeDetail variableHandlingChargeDetail) {
        this.variableHandlingChargeDetail = variableHandlingChargeDetail;
    }


    /**
     * Gets the insuredValue value for this RequestedPackageLineItem.
     * 
     * @return insuredValue   * Only used for INDIVIDUAL_PACKAGES and PACKAGE_GROUPS. Ignored
     * for PACKAGE_SUMMARY, in which case totalInsuredValue and packageCount
     * on the shipment will be used to determine this value.
     */
    public com.fedex.rate.stub.Money getInsuredValue() {
        return insuredValue;
    }


    /**
     * Sets the insuredValue value for this RequestedPackageLineItem.
     * 
     * @param insuredValue   * Only used for INDIVIDUAL_PACKAGES and PACKAGE_GROUPS. Ignored
     * for PACKAGE_SUMMARY, in which case totalInsuredValue and packageCount
     * on the shipment will be used to determine this value.
     */
    public void setInsuredValue(com.fedex.rate.stub.Money insuredValue) {
        this.insuredValue = insuredValue;
    }


    /**
     * Gets the weight value for this RequestedPackageLineItem.
     * 
     * @return weight   * Only used for INDIVIDUAL_PACKAGES and PACKAGE_GROUPS. Ignored
     * for PACKAGE_SUMMARY, in which case totalweight and packageCount on
     * the shipment will be used to determine this value.
     */
    public com.fedex.rate.stub.Weight getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this RequestedPackageLineItem.
     * 
     * @param weight   * Only used for INDIVIDUAL_PACKAGES and PACKAGE_GROUPS. Ignored
     * for PACKAGE_SUMMARY, in which case totalweight and packageCount on
     * the shipment will be used to determine this value.
     */
    public void setWeight(com.fedex.rate.stub.Weight weight) {
        this.weight = weight;
    }


    /**
     * Gets the dimensions value for this RequestedPackageLineItem.
     * 
     * @return dimensions
     */
    public com.fedex.rate.stub.Dimensions getDimensions() {
        return dimensions;
    }


    /**
     * Sets the dimensions value for this RequestedPackageLineItem.
     * 
     * @param dimensions
     */
    public void setDimensions(com.fedex.rate.stub.Dimensions dimensions) {
        this.dimensions = dimensions;
    }


    /**
     * Gets the physicalPackaging value for this RequestedPackageLineItem.
     * 
     * @return physicalPackaging   * Provides additional detail on how the customer has physically
     * packaged this item. As of June 2009, required for packages moving
     * under international and SmartPost services.
     */
    public com.fedex.rate.stub.PhysicalPackagingType getPhysicalPackaging() {
        return physicalPackaging;
    }


    /**
     * Sets the physicalPackaging value for this RequestedPackageLineItem.
     * 
     * @param physicalPackaging   * Provides additional detail on how the customer has physically
     * packaged this item. As of June 2009, required for packages moving
     * under international and SmartPost services.
     */
    public void setPhysicalPackaging(com.fedex.rate.stub.PhysicalPackagingType physicalPackaging) {
        this.physicalPackaging = physicalPackaging;
    }


    /**
     * Gets the itemDescription value for this RequestedPackageLineItem.
     * 
     * @return itemDescription   * Human-readable text describing the package.
     */
    public java.lang.String getItemDescription() {
        return itemDescription;
    }


    /**
     * Sets the itemDescription value for this RequestedPackageLineItem.
     * 
     * @param itemDescription   * Human-readable text describing the package.
     */
    public void setItemDescription(java.lang.String itemDescription) {
        this.itemDescription = itemDescription;
    }


    /**
     * Gets the customerReferences value for this RequestedPackageLineItem.
     * 
     * @return customerReferences
     */
    public com.fedex.rate.stub.CustomerReference[] getCustomerReferences() {
        return customerReferences;
    }


    /**
     * Sets the customerReferences value for this RequestedPackageLineItem.
     * 
     * @param customerReferences
     */
    public void setCustomerReferences(com.fedex.rate.stub.CustomerReference[] customerReferences) {
        this.customerReferences = customerReferences;
    }

    public com.fedex.rate.stub.CustomerReference getCustomerReferences(int i) {
        return this.customerReferences[i];
    }

    public void setCustomerReferences(int i, com.fedex.rate.stub.CustomerReference _value) {
        this.customerReferences[i] = _value;
    }


    /**
     * Gets the specialServicesRequested value for this RequestedPackageLineItem.
     * 
     * @return specialServicesRequested
     */
    public com.fedex.rate.stub.PackageSpecialServicesRequested getSpecialServicesRequested() {
        return specialServicesRequested;
    }


    /**
     * Sets the specialServicesRequested value for this RequestedPackageLineItem.
     * 
     * @param specialServicesRequested
     */
    public void setSpecialServicesRequested(com.fedex.rate.stub.PackageSpecialServicesRequested specialServicesRequested) {
        this.specialServicesRequested = specialServicesRequested;
    }


    /**
     * Gets the contentRecords value for this RequestedPackageLineItem.
     * 
     * @return contentRecords   * Only used for INDIVIDUAL_PACKAGES and PACKAGE_GROUPS.
     */
    public com.fedex.rate.stub.ContentRecord[] getContentRecords() {
        return contentRecords;
    }


    /**
     * Sets the contentRecords value for this RequestedPackageLineItem.
     * 
     * @param contentRecords   * Only used for INDIVIDUAL_PACKAGES and PACKAGE_GROUPS.
     */
    public void setContentRecords(com.fedex.rate.stub.ContentRecord[] contentRecords) {
        this.contentRecords = contentRecords;
    }

    public com.fedex.rate.stub.ContentRecord getContentRecords(int i) {
        return this.contentRecords[i];
    }

    public void setContentRecords(int i, com.fedex.rate.stub.ContentRecord _value) {
        this.contentRecords[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestedPackageLineItem)) return false;
        RequestedPackageLineItem other = (RequestedPackageLineItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sequenceNumber==null && other.getSequenceNumber()==null) || 
             (this.sequenceNumber!=null &&
              this.sequenceNumber.equals(other.getSequenceNumber()))) &&
            ((this.groupNumber==null && other.getGroupNumber()==null) || 
             (this.groupNumber!=null &&
              this.groupNumber.equals(other.getGroupNumber()))) &&
            ((this.groupPackageCount==null && other.getGroupPackageCount()==null) || 
             (this.groupPackageCount!=null &&
              this.groupPackageCount.equals(other.getGroupPackageCount()))) &&
            ((this.variableHandlingChargeDetail==null && other.getVariableHandlingChargeDetail()==null) || 
             (this.variableHandlingChargeDetail!=null &&
              this.variableHandlingChargeDetail.equals(other.getVariableHandlingChargeDetail()))) &&
            ((this.insuredValue==null && other.getInsuredValue()==null) || 
             (this.insuredValue!=null &&
              this.insuredValue.equals(other.getInsuredValue()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.dimensions==null && other.getDimensions()==null) || 
             (this.dimensions!=null &&
              this.dimensions.equals(other.getDimensions()))) &&
            ((this.physicalPackaging==null && other.getPhysicalPackaging()==null) || 
             (this.physicalPackaging!=null &&
              this.physicalPackaging.equals(other.getPhysicalPackaging()))) &&
            ((this.itemDescription==null && other.getItemDescription()==null) || 
             (this.itemDescription!=null &&
              this.itemDescription.equals(other.getItemDescription()))) &&
            ((this.customerReferences==null && other.getCustomerReferences()==null) || 
             (this.customerReferences!=null &&
              java.util.Arrays.equals(this.customerReferences, other.getCustomerReferences()))) &&
            ((this.specialServicesRequested==null && other.getSpecialServicesRequested()==null) || 
             (this.specialServicesRequested!=null &&
              this.specialServicesRequested.equals(other.getSpecialServicesRequested()))) &&
            ((this.contentRecords==null && other.getContentRecords()==null) || 
             (this.contentRecords!=null &&
              java.util.Arrays.equals(this.contentRecords, other.getContentRecords())));
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
        if (getSequenceNumber() != null) {
            _hashCode += getSequenceNumber().hashCode();
        }
        if (getGroupNumber() != null) {
            _hashCode += getGroupNumber().hashCode();
        }
        if (getGroupPackageCount() != null) {
            _hashCode += getGroupPackageCount().hashCode();
        }
        if (getVariableHandlingChargeDetail() != null) {
            _hashCode += getVariableHandlingChargeDetail().hashCode();
        }
        if (getInsuredValue() != null) {
            _hashCode += getInsuredValue().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getDimensions() != null) {
            _hashCode += getDimensions().hashCode();
        }
        if (getPhysicalPackaging() != null) {
            _hashCode += getPhysicalPackaging().hashCode();
        }
        if (getItemDescription() != null) {
            _hashCode += getItemDescription().hashCode();
        }
        if (getCustomerReferences() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerReferences());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerReferences(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSpecialServicesRequested() != null) {
            _hashCode += getSpecialServicesRequested().hashCode();
        }
        if (getContentRecords() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContentRecords());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContentRecords(), i);
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
        new org.apache.axis.description.TypeDesc(RequestedPackageLineItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RequestedPackageLineItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "SequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "GroupNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupPackageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "GroupPackageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variableHandlingChargeDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "VariableHandlingChargeDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "VariableHandlingChargeDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuredValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "InsuredValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Dimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Dimensions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("physicalPackaging");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "PhysicalPackaging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "PhysicalPackagingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ItemDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerReferences");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomerReferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomerReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialServicesRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "SpecialServicesRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "PackageSpecialServicesRequested"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ContentRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ContentRecord"));
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
