/**
 * HazardousCommodityDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;


/**
 * Identifies and describes an individual hazardous commodity. For
 * 201001 load, this is based on data from the FedEx Ground Hazardous
 * Materials Shipping Guide.
 */
public class HazardousCommodityDescription  implements java.io.Serializable {
    /* Regulatory identifier for a commodity (e.g. "UN ID" value). */
    private java.lang.String id;

    private com.fedex.rate.stub.HazardousCommodityPackingGroupType packingGroup;

    private java.lang.String properShippingName;

    private java.lang.String technicalName;

    private java.lang.String hazardClass;

    private java.lang.String[] subsidiaryClasses;

    private java.lang.String labelText;

    public HazardousCommodityDescription() {
    }

    public HazardousCommodityDescription(
           java.lang.String id,
           com.fedex.rate.stub.HazardousCommodityPackingGroupType packingGroup,
           java.lang.String properShippingName,
           java.lang.String technicalName,
           java.lang.String hazardClass,
           java.lang.String[] subsidiaryClasses,
           java.lang.String labelText) {
           this.id = id;
           this.packingGroup = packingGroup;
           this.properShippingName = properShippingName;
           this.technicalName = technicalName;
           this.hazardClass = hazardClass;
           this.subsidiaryClasses = subsidiaryClasses;
           this.labelText = labelText;
    }


    /**
     * Gets the id value for this HazardousCommodityDescription.
     * 
     * @return id   * Regulatory identifier for a commodity (e.g. "UN ID" value).
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this HazardousCommodityDescription.
     * 
     * @param id   * Regulatory identifier for a commodity (e.g. "UN ID" value).
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the packingGroup value for this HazardousCommodityDescription.
     * 
     * @return packingGroup
     */
    public com.fedex.rate.stub.HazardousCommodityPackingGroupType getPackingGroup() {
        return packingGroup;
    }


    /**
     * Sets the packingGroup value for this HazardousCommodityDescription.
     * 
     * @param packingGroup
     */
    public void setPackingGroup(com.fedex.rate.stub.HazardousCommodityPackingGroupType packingGroup) {
        this.packingGroup = packingGroup;
    }


    /**
     * Gets the properShippingName value for this HazardousCommodityDescription.
     * 
     * @return properShippingName
     */
    public java.lang.String getProperShippingName() {
        return properShippingName;
    }


    /**
     * Sets the properShippingName value for this HazardousCommodityDescription.
     * 
     * @param properShippingName
     */
    public void setProperShippingName(java.lang.String properShippingName) {
        this.properShippingName = properShippingName;
    }


    /**
     * Gets the technicalName value for this HazardousCommodityDescription.
     * 
     * @return technicalName
     */
    public java.lang.String getTechnicalName() {
        return technicalName;
    }


    /**
     * Sets the technicalName value for this HazardousCommodityDescription.
     * 
     * @param technicalName
     */
    public void setTechnicalName(java.lang.String technicalName) {
        this.technicalName = technicalName;
    }


    /**
     * Gets the hazardClass value for this HazardousCommodityDescription.
     * 
     * @return hazardClass
     */
    public java.lang.String getHazardClass() {
        return hazardClass;
    }


    /**
     * Sets the hazardClass value for this HazardousCommodityDescription.
     * 
     * @param hazardClass
     */
    public void setHazardClass(java.lang.String hazardClass) {
        this.hazardClass = hazardClass;
    }


    /**
     * Gets the subsidiaryClasses value for this HazardousCommodityDescription.
     * 
     * @return subsidiaryClasses
     */
    public java.lang.String[] getSubsidiaryClasses() {
        return subsidiaryClasses;
    }


    /**
     * Sets the subsidiaryClasses value for this HazardousCommodityDescription.
     * 
     * @param subsidiaryClasses
     */
    public void setSubsidiaryClasses(java.lang.String[] subsidiaryClasses) {
        this.subsidiaryClasses = subsidiaryClasses;
    }

    public java.lang.String getSubsidiaryClasses(int i) {
        return this.subsidiaryClasses[i];
    }

    public void setSubsidiaryClasses(int i, java.lang.String _value) {
        this.subsidiaryClasses[i] = _value;
    }


    /**
     * Gets the labelText value for this HazardousCommodityDescription.
     * 
     * @return labelText
     */
    public java.lang.String getLabelText() {
        return labelText;
    }


    /**
     * Sets the labelText value for this HazardousCommodityDescription.
     * 
     * @param labelText
     */
    public void setLabelText(java.lang.String labelText) {
        this.labelText = labelText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HazardousCommodityDescription)) return false;
        HazardousCommodityDescription other = (HazardousCommodityDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.packingGroup==null && other.getPackingGroup()==null) || 
             (this.packingGroup!=null &&
              this.packingGroup.equals(other.getPackingGroup()))) &&
            ((this.properShippingName==null && other.getProperShippingName()==null) || 
             (this.properShippingName!=null &&
              this.properShippingName.equals(other.getProperShippingName()))) &&
            ((this.technicalName==null && other.getTechnicalName()==null) || 
             (this.technicalName!=null &&
              this.technicalName.equals(other.getTechnicalName()))) &&
            ((this.hazardClass==null && other.getHazardClass()==null) || 
             (this.hazardClass!=null &&
              this.hazardClass.equals(other.getHazardClass()))) &&
            ((this.subsidiaryClasses==null && other.getSubsidiaryClasses()==null) || 
             (this.subsidiaryClasses!=null &&
              java.util.Arrays.equals(this.subsidiaryClasses, other.getSubsidiaryClasses()))) &&
            ((this.labelText==null && other.getLabelText()==null) || 
             (this.labelText!=null &&
              this.labelText.equals(other.getLabelText())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getPackingGroup() != null) {
            _hashCode += getPackingGroup().hashCode();
        }
        if (getProperShippingName() != null) {
            _hashCode += getProperShippingName().hashCode();
        }
        if (getTechnicalName() != null) {
            _hashCode += getTechnicalName().hashCode();
        }
        if (getHazardClass() != null) {
            _hashCode += getHazardClass().hashCode();
        }
        if (getSubsidiaryClasses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsidiaryClasses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsidiaryClasses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLabelText() != null) {
            _hashCode += getLabelText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HazardousCommodityDescription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "HazardousCommodityDescription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packingGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "PackingGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "HazardousCommodityPackingGroupType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("properShippingName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ProperShippingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("technicalName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "TechnicalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hazardClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "HazardClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiaryClasses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "SubsidiaryClasses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "LabelText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
