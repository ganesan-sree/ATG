/**
 * ExpressFreightDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;


/**
 * Details specific to an Express freight shipment.
 */
public class ExpressFreightDetail  implements java.io.Serializable {
    /* Indicates whether or nor a packing list is enclosed. */
    private java.lang.Boolean packingListEnclosed;

    /* Total shipment pieces.
     *                 ie. 3 boxes and 3 pallets of 100 pieces each = Shippers
     * Load and Count of 303.
     *                 Applicable to International Priority Freight and International
     * Economy Freight.
     *                 Values must be in the range of 1 - 99999 */
    private org.apache.axis.types.PositiveInteger shippersLoadAndCount;

    /* Required for International Freight shipping. Values must be
     * 8- 12 characters in length. */
    private java.lang.String bookingConfirmationNumber;

    /* Currently not supported. */
    private java.lang.Boolean referenceLabelRequested;

    /* Currently not supported. */
    private com.fedex.rate.stub.ExpressFreightDetailContact beforeDeliveryContact;

    /* Currently not supported. */
    private com.fedex.rate.stub.ExpressFreightDetailContact undeliverableContact;

    public ExpressFreightDetail() {
    }

    public ExpressFreightDetail(
           java.lang.Boolean packingListEnclosed,
           org.apache.axis.types.PositiveInteger shippersLoadAndCount,
           java.lang.String bookingConfirmationNumber,
           java.lang.Boolean referenceLabelRequested,
           com.fedex.rate.stub.ExpressFreightDetailContact beforeDeliveryContact,
           com.fedex.rate.stub.ExpressFreightDetailContact undeliverableContact) {
           this.packingListEnclosed = packingListEnclosed;
           this.shippersLoadAndCount = shippersLoadAndCount;
           this.bookingConfirmationNumber = bookingConfirmationNumber;
           this.referenceLabelRequested = referenceLabelRequested;
           this.beforeDeliveryContact = beforeDeliveryContact;
           this.undeliverableContact = undeliverableContact;
    }


    /**
     * Gets the packingListEnclosed value for this ExpressFreightDetail.
     * 
     * @return packingListEnclosed   * Indicates whether or nor a packing list is enclosed.
     */
    public java.lang.Boolean getPackingListEnclosed() {
        return packingListEnclosed;
    }


    /**
     * Sets the packingListEnclosed value for this ExpressFreightDetail.
     * 
     * @param packingListEnclosed   * Indicates whether or nor a packing list is enclosed.
     */
    public void setPackingListEnclosed(java.lang.Boolean packingListEnclosed) {
        this.packingListEnclosed = packingListEnclosed;
    }


    /**
     * Gets the shippersLoadAndCount value for this ExpressFreightDetail.
     * 
     * @return shippersLoadAndCount   * Total shipment pieces.
     *                 ie. 3 boxes and 3 pallets of 100 pieces each = Shippers
     * Load and Count of 303.
     *                 Applicable to International Priority Freight and International
     * Economy Freight.
     *                 Values must be in the range of 1 - 99999
     */
    public org.apache.axis.types.PositiveInteger getShippersLoadAndCount() {
        return shippersLoadAndCount;
    }


    /**
     * Sets the shippersLoadAndCount value for this ExpressFreightDetail.
     * 
     * @param shippersLoadAndCount   * Total shipment pieces.
     *                 ie. 3 boxes and 3 pallets of 100 pieces each = Shippers
     * Load and Count of 303.
     *                 Applicable to International Priority Freight and International
     * Economy Freight.
     *                 Values must be in the range of 1 - 99999
     */
    public void setShippersLoadAndCount(org.apache.axis.types.PositiveInteger shippersLoadAndCount) {
        this.shippersLoadAndCount = shippersLoadAndCount;
    }


    /**
     * Gets the bookingConfirmationNumber value for this ExpressFreightDetail.
     * 
     * @return bookingConfirmationNumber   * Required for International Freight shipping. Values must be
     * 8- 12 characters in length.
     */
    public java.lang.String getBookingConfirmationNumber() {
        return bookingConfirmationNumber;
    }


    /**
     * Sets the bookingConfirmationNumber value for this ExpressFreightDetail.
     * 
     * @param bookingConfirmationNumber   * Required for International Freight shipping. Values must be
     * 8- 12 characters in length.
     */
    public void setBookingConfirmationNumber(java.lang.String bookingConfirmationNumber) {
        this.bookingConfirmationNumber = bookingConfirmationNumber;
    }


    /**
     * Gets the referenceLabelRequested value for this ExpressFreightDetail.
     * 
     * @return referenceLabelRequested   * Currently not supported.
     */
    public java.lang.Boolean getReferenceLabelRequested() {
        return referenceLabelRequested;
    }


    /**
     * Sets the referenceLabelRequested value for this ExpressFreightDetail.
     * 
     * @param referenceLabelRequested   * Currently not supported.
     */
    public void setReferenceLabelRequested(java.lang.Boolean referenceLabelRequested) {
        this.referenceLabelRequested = referenceLabelRequested;
    }


    /**
     * Gets the beforeDeliveryContact value for this ExpressFreightDetail.
     * 
     * @return beforeDeliveryContact   * Currently not supported.
     */
    public com.fedex.rate.stub.ExpressFreightDetailContact getBeforeDeliveryContact() {
        return beforeDeliveryContact;
    }


    /**
     * Sets the beforeDeliveryContact value for this ExpressFreightDetail.
     * 
     * @param beforeDeliveryContact   * Currently not supported.
     */
    public void setBeforeDeliveryContact(com.fedex.rate.stub.ExpressFreightDetailContact beforeDeliveryContact) {
        this.beforeDeliveryContact = beforeDeliveryContact;
    }


    /**
     * Gets the undeliverableContact value for this ExpressFreightDetail.
     * 
     * @return undeliverableContact   * Currently not supported.
     */
    public com.fedex.rate.stub.ExpressFreightDetailContact getUndeliverableContact() {
        return undeliverableContact;
    }


    /**
     * Sets the undeliverableContact value for this ExpressFreightDetail.
     * 
     * @param undeliverableContact   * Currently not supported.
     */
    public void setUndeliverableContact(com.fedex.rate.stub.ExpressFreightDetailContact undeliverableContact) {
        this.undeliverableContact = undeliverableContact;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExpressFreightDetail)) return false;
        ExpressFreightDetail other = (ExpressFreightDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.packingListEnclosed==null && other.getPackingListEnclosed()==null) || 
             (this.packingListEnclosed!=null &&
              this.packingListEnclosed.equals(other.getPackingListEnclosed()))) &&
            ((this.shippersLoadAndCount==null && other.getShippersLoadAndCount()==null) || 
             (this.shippersLoadAndCount!=null &&
              this.shippersLoadAndCount.equals(other.getShippersLoadAndCount()))) &&
            ((this.bookingConfirmationNumber==null && other.getBookingConfirmationNumber()==null) || 
             (this.bookingConfirmationNumber!=null &&
              this.bookingConfirmationNumber.equals(other.getBookingConfirmationNumber()))) &&
            ((this.referenceLabelRequested==null && other.getReferenceLabelRequested()==null) || 
             (this.referenceLabelRequested!=null &&
              this.referenceLabelRequested.equals(other.getReferenceLabelRequested()))) &&
            ((this.beforeDeliveryContact==null && other.getBeforeDeliveryContact()==null) || 
             (this.beforeDeliveryContact!=null &&
              this.beforeDeliveryContact.equals(other.getBeforeDeliveryContact()))) &&
            ((this.undeliverableContact==null && other.getUndeliverableContact()==null) || 
             (this.undeliverableContact!=null &&
              this.undeliverableContact.equals(other.getUndeliverableContact())));
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
        if (getPackingListEnclosed() != null) {
            _hashCode += getPackingListEnclosed().hashCode();
        }
        if (getShippersLoadAndCount() != null) {
            _hashCode += getShippersLoadAndCount().hashCode();
        }
        if (getBookingConfirmationNumber() != null) {
            _hashCode += getBookingConfirmationNumber().hashCode();
        }
        if (getReferenceLabelRequested() != null) {
            _hashCode += getReferenceLabelRequested().hashCode();
        }
        if (getBeforeDeliveryContact() != null) {
            _hashCode += getBeforeDeliveryContact().hashCode();
        }
        if (getUndeliverableContact() != null) {
            _hashCode += getUndeliverableContact().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExpressFreightDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ExpressFreightDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packingListEnclosed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "PackingListEnclosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippersLoadAndCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ShippersLoadAndCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingConfirmationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "BookingConfirmationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceLabelRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ReferenceLabelRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beforeDeliveryContact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "BeforeDeliveryContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ExpressFreightDetailContact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undeliverableContact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "UndeliverableContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ExpressFreightDetailContact"));
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
