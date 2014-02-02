/**
 * HazardousCommodityContent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;


/**
 * Documents the kind and quantity of an individual hazardous commodity
 * in a package.
 */
public class HazardousCommodityContent  implements java.io.Serializable {
    /* Identifies and describes an individual hazardous commodity. */
    private com.fedex.rate.stub.HazardousCommodityDescription description;

    /* Specifies the amount of the commodity in alternate units. */
    private com.fedex.rate.stub.HazardousCommodityQuantityDetail quantity;

    /* Customer-provided specifications for handling individual commodities. */
    private com.fedex.rate.stub.HazardousCommodityOptionDetail options;

    public HazardousCommodityContent() {
    }

    public HazardousCommodityContent(
           com.fedex.rate.stub.HazardousCommodityDescription description,
           com.fedex.rate.stub.HazardousCommodityQuantityDetail quantity,
           com.fedex.rate.stub.HazardousCommodityOptionDetail options) {
           this.description = description;
           this.quantity = quantity;
           this.options = options;
    }


    /**
     * Gets the description value for this HazardousCommodityContent.
     * 
     * @return description   * Identifies and describes an individual hazardous commodity.
     */
    public com.fedex.rate.stub.HazardousCommodityDescription getDescription() {
        return description;
    }


    /**
     * Sets the description value for this HazardousCommodityContent.
     * 
     * @param description   * Identifies and describes an individual hazardous commodity.
     */
    public void setDescription(com.fedex.rate.stub.HazardousCommodityDescription description) {
        this.description = description;
    }


    /**
     * Gets the quantity value for this HazardousCommodityContent.
     * 
     * @return quantity   * Specifies the amount of the commodity in alternate units.
     */
    public com.fedex.rate.stub.HazardousCommodityQuantityDetail getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this HazardousCommodityContent.
     * 
     * @param quantity   * Specifies the amount of the commodity in alternate units.
     */
    public void setQuantity(com.fedex.rate.stub.HazardousCommodityQuantityDetail quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the options value for this HazardousCommodityContent.
     * 
     * @return options   * Customer-provided specifications for handling individual commodities.
     */
    public com.fedex.rate.stub.HazardousCommodityOptionDetail getOptions() {
        return options;
    }


    /**
     * Sets the options value for this HazardousCommodityContent.
     * 
     * @param options   * Customer-provided specifications for handling individual commodities.
     */
    public void setOptions(com.fedex.rate.stub.HazardousCommodityOptionDetail options) {
        this.options = options;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HazardousCommodityContent)) return false;
        HazardousCommodityContent other = (HazardousCommodityContent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              this.options.equals(other.getOptions())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HazardousCommodityContent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "HazardousCommodityContent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "HazardousCommodityDescription"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "HazardousCommodityQuantityDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Options"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "HazardousCommodityOptionDetail"));
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
