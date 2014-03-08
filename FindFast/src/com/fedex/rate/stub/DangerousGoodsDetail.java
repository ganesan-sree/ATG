/**
 * DangerousGoodsDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;


/**
 * The descriptive data required for a FedEx shipment containing dangerous
 * goods (hazardous materials).
 */
public class DangerousGoodsDetail  implements java.io.Serializable {
    /* Identifies whether or not the products being shipped are required
     * to be accessible during delivery. */
    private com.fedex.rate.stub.DangerousGoodsAccessibilityType accessibility;

    /* Shipment is packaged/documented for movement ONLY on cargo
     * aircraft. */
    private java.lang.Boolean cargoAircraftOnly;

    /* Indicates which kinds of hazardous content are in the current
     * package. */
    private com.fedex.rate.stub.HazardousCommodityOptionType[] options;

    /* Documents the kinds and quantities of all hazardous commodities
     * in the current package. */
    private com.fedex.rate.stub.HazardousCommodityContent[] hazardousCommodities;

    /* Description of the packaging of this commodity, suitable for
     * use on OP-900 and OP-950 forms. */
    private com.fedex.rate.stub.HazardousCommodityPackagingDetail packaging;

    /* Telephone number to use for contact in the event of an emergency. */
    private java.lang.String emergencyContactNumber;

    public DangerousGoodsDetail() {
    }

    public DangerousGoodsDetail(
           com.fedex.rate.stub.DangerousGoodsAccessibilityType accessibility,
           java.lang.Boolean cargoAircraftOnly,
           com.fedex.rate.stub.HazardousCommodityOptionType[] options,
           com.fedex.rate.stub.HazardousCommodityContent[] hazardousCommodities,
           com.fedex.rate.stub.HazardousCommodityPackagingDetail packaging,
           java.lang.String emergencyContactNumber) {
           this.accessibility = accessibility;
           this.cargoAircraftOnly = cargoAircraftOnly;
           this.options = options;
           this.hazardousCommodities = hazardousCommodities;
           this.packaging = packaging;
           this.emergencyContactNumber = emergencyContactNumber;
    }


    /**
     * Gets the accessibility value for this DangerousGoodsDetail.
     * 
     * @return accessibility   * Identifies whether or not the products being shipped are required
     * to be accessible during delivery.
     */
    public com.fedex.rate.stub.DangerousGoodsAccessibilityType getAccessibility() {
        return accessibility;
    }


    /**
     * Sets the accessibility value for this DangerousGoodsDetail.
     * 
     * @param accessibility   * Identifies whether or not the products being shipped are required
     * to be accessible during delivery.
     */
    public void setAccessibility(com.fedex.rate.stub.DangerousGoodsAccessibilityType accessibility) {
        this.accessibility = accessibility;
    }


    /**
     * Gets the cargoAircraftOnly value for this DangerousGoodsDetail.
     * 
     * @return cargoAircraftOnly   * Shipment is packaged/documented for movement ONLY on cargo
     * aircraft.
     */
    public java.lang.Boolean getCargoAircraftOnly() {
        return cargoAircraftOnly;
    }


    /**
     * Sets the cargoAircraftOnly value for this DangerousGoodsDetail.
     * 
     * @param cargoAircraftOnly   * Shipment is packaged/documented for movement ONLY on cargo
     * aircraft.
     */
    public void setCargoAircraftOnly(java.lang.Boolean cargoAircraftOnly) {
        this.cargoAircraftOnly = cargoAircraftOnly;
    }


    /**
     * Gets the options value for this DangerousGoodsDetail.
     * 
     * @return options   * Indicates which kinds of hazardous content are in the current
     * package.
     */
    public com.fedex.rate.stub.HazardousCommodityOptionType[] getOptions() {
        return options;
    }


    /**
     * Sets the options value for this DangerousGoodsDetail.
     * 
     * @param options   * Indicates which kinds of hazardous content are in the current
     * package.
     */
    public void setOptions(com.fedex.rate.stub.HazardousCommodityOptionType[] options) {
        this.options = options;
    }

    public com.fedex.rate.stub.HazardousCommodityOptionType getOptions(int i) {
        return this.options[i];
    }

    public void setOptions(int i, com.fedex.rate.stub.HazardousCommodityOptionType _value) {
        this.options[i] = _value;
    }


    /**
     * Gets the hazardousCommodities value for this DangerousGoodsDetail.
     * 
     * @return hazardousCommodities   * Documents the kinds and quantities of all hazardous commodities
     * in the current package.
     */
    public com.fedex.rate.stub.HazardousCommodityContent[] getHazardousCommodities() {
        return hazardousCommodities;
    }


    /**
     * Sets the hazardousCommodities value for this DangerousGoodsDetail.
     * 
     * @param hazardousCommodities   * Documents the kinds and quantities of all hazardous commodities
     * in the current package.
     */
    public void setHazardousCommodities(com.fedex.rate.stub.HazardousCommodityContent[] hazardousCommodities) {
        this.hazardousCommodities = hazardousCommodities;
    }

    public com.fedex.rate.stub.HazardousCommodityContent getHazardousCommodities(int i) {
        return this.hazardousCommodities[i];
    }

    public void setHazardousCommodities(int i, com.fedex.rate.stub.HazardousCommodityContent _value) {
        this.hazardousCommodities[i] = _value;
    }


    /**
     * Gets the packaging value for this DangerousGoodsDetail.
     * 
     * @return packaging   * Description of the packaging of this commodity, suitable for
     * use on OP-900 and OP-950 forms.
     */
    public com.fedex.rate.stub.HazardousCommodityPackagingDetail getPackaging() {
        return packaging;
    }


    /**
     * Sets the packaging value for this DangerousGoodsDetail.
     * 
     * @param packaging   * Description of the packaging of this commodity, suitable for
     * use on OP-900 and OP-950 forms.
     */
    public void setPackaging(com.fedex.rate.stub.HazardousCommodityPackagingDetail packaging) {
        this.packaging = packaging;
    }


    /**
     * Gets the emergencyContactNumber value for this DangerousGoodsDetail.
     * 
     * @return emergencyContactNumber   * Telephone number to use for contact in the event of an emergency.
     */
    public java.lang.String getEmergencyContactNumber() {
        return emergencyContactNumber;
    }


    /**
     * Sets the emergencyContactNumber value for this DangerousGoodsDetail.
     * 
     * @param emergencyContactNumber   * Telephone number to use for contact in the event of an emergency.
     */
    public void setEmergencyContactNumber(java.lang.String emergencyContactNumber) {
        this.emergencyContactNumber = emergencyContactNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DangerousGoodsDetail)) return false;
        DangerousGoodsDetail other = (DangerousGoodsDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accessibility==null && other.getAccessibility()==null) || 
             (this.accessibility!=null &&
              this.accessibility.equals(other.getAccessibility()))) &&
            ((this.cargoAircraftOnly==null && other.getCargoAircraftOnly()==null) || 
             (this.cargoAircraftOnly!=null &&
              this.cargoAircraftOnly.equals(other.getCargoAircraftOnly()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              java.util.Arrays.equals(this.options, other.getOptions()))) &&
            ((this.hazardousCommodities==null && other.getHazardousCommodities()==null) || 
             (this.hazardousCommodities!=null &&
              java.util.Arrays.equals(this.hazardousCommodities, other.getHazardousCommodities()))) &&
            ((this.packaging==null && other.getPackaging()==null) || 
             (this.packaging!=null &&
              this.packaging.equals(other.getPackaging()))) &&
            ((this.emergencyContactNumber==null && other.getEmergencyContactNumber()==null) || 
             (this.emergencyContactNumber!=null &&
              this.emergencyContactNumber.equals(other.getEmergencyContactNumber())));
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
        if (getAccessibility() != null) {
            _hashCode += getAccessibility().hashCode();
        }
        if (getCargoAircraftOnly() != null) {
            _hashCode += getCargoAircraftOnly().hashCode();
        }
        if (getOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHazardousCommodities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHazardousCommodities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHazardousCommodities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPackaging() != null) {
            _hashCode += getPackaging().hashCode();
        }
        if (getEmergencyContactNumber() != null) {
            _hashCode += getEmergencyContactNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DangerousGoodsDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DangerousGoodsDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Accessibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DangerousGoodsAccessibilityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargoAircraftOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CargoAircraftOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Options"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "HazardousCommodityOptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hazardousCommodities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "HazardousCommodities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "HazardousCommodityContent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packaging");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Packaging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "HazardousCommodityPackagingDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emergencyContactNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "EmergencyContactNumber"));
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
