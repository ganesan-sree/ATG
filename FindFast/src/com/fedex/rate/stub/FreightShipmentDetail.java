/**
 * FreightShipmentDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;


/**
 * Data applicable to shipments using FEDEX_FREIGHT and FEDEX_NATIONAL_FREIGHT
 * services.
 */
public class FreightShipmentDetail  implements java.io.Serializable {
    /* Account number used with FEDEX_FREIGHT service. */
    private java.lang.String fedExFreightAccountNumber;

    /* Used for validating FedEx Freight account number and (optionally)
     * identifying third party payment on the bill of lading. */
    private com.fedex.rate.stub.ContactAndAddress fedExFreightBillingContactAndAddress;

    /* Account number used with FEDEX_NATIONAL_FREIGHT service. */
    private java.lang.String fedExNationalFreightAccountNumber;

    /* Used for validating FedEx National Freight account number and
     * (optionally) identifying third party payment on the bill of lading. */
    private com.fedex.rate.stub.ContactAndAddress fedExNationalFreightBillingContactAndAddress;

    /* Indicates the role of the party submitting the transaction. */
    private com.fedex.rate.stub.FreightShipmentRoleType role;

    /* Designates which of the requester's tariffs will be used for
     * rating. */
    private com.fedex.rate.stub.FreightAccountPaymentType paymentType;

    /* Identifies the declared value for the shipment */
    private com.fedex.rate.stub.Money declaredValuePerUnit;

    /* Identifies the declared value units corresponding to the above
     * defined declared value */
    private java.lang.String declaredValueUnits;

    private com.fedex.rate.stub.LiabilityCoverageDetail liabilityCoverageDetail;

    /* Identifiers for promotional discounts offered to customers. */
    private java.lang.String[] coupons;

    /* Total number of individual handling units in the entire shipment
     * (for unit pricing). */
    private org.apache.axis.types.NonNegativeInteger totalHandlingUnits;

    /* Estimated discount rate provided by client for unsecured rate
     * quote. */
    private java.math.BigDecimal clientDiscountPercent;

    /* Total weight of pallets used in shipment. */
    private com.fedex.rate.stub.Weight palletWeight;

    /* Overall shipment dimensions. */
    private com.fedex.rate.stub.Dimensions shipmentDimensions;

    /* Description for the shipment. */
    private java.lang.String comment;

    /* Specifies which party will pay surcharges for any special services
     * which support split billing. */
    private com.fedex.rate.stub.FreightSpecialServicePayment[] specialServicePayments;

    /* Details of the commodities in the shipment. */
    private com.fedex.rate.stub.FreightShipmentLineItem[] lineItems;

    public FreightShipmentDetail() {
    }

    public FreightShipmentDetail(
           java.lang.String fedExFreightAccountNumber,
           com.fedex.rate.stub.ContactAndAddress fedExFreightBillingContactAndAddress,
           java.lang.String fedExNationalFreightAccountNumber,
           com.fedex.rate.stub.ContactAndAddress fedExNationalFreightBillingContactAndAddress,
           com.fedex.rate.stub.FreightShipmentRoleType role,
           com.fedex.rate.stub.FreightAccountPaymentType paymentType,
           com.fedex.rate.stub.Money declaredValuePerUnit,
           java.lang.String declaredValueUnits,
           com.fedex.rate.stub.LiabilityCoverageDetail liabilityCoverageDetail,
           java.lang.String[] coupons,
           org.apache.axis.types.NonNegativeInteger totalHandlingUnits,
           java.math.BigDecimal clientDiscountPercent,
           com.fedex.rate.stub.Weight palletWeight,
           com.fedex.rate.stub.Dimensions shipmentDimensions,
           java.lang.String comment,
           com.fedex.rate.stub.FreightSpecialServicePayment[] specialServicePayments,
           com.fedex.rate.stub.FreightShipmentLineItem[] lineItems) {
           this.fedExFreightAccountNumber = fedExFreightAccountNumber;
           this.fedExFreightBillingContactAndAddress = fedExFreightBillingContactAndAddress;
           this.fedExNationalFreightAccountNumber = fedExNationalFreightAccountNumber;
           this.fedExNationalFreightBillingContactAndAddress = fedExNationalFreightBillingContactAndAddress;
           this.role = role;
           this.paymentType = paymentType;
           this.declaredValuePerUnit = declaredValuePerUnit;
           this.declaredValueUnits = declaredValueUnits;
           this.liabilityCoverageDetail = liabilityCoverageDetail;
           this.coupons = coupons;
           this.totalHandlingUnits = totalHandlingUnits;
           this.clientDiscountPercent = clientDiscountPercent;
           this.palletWeight = palletWeight;
           this.shipmentDimensions = shipmentDimensions;
           this.comment = comment;
           this.specialServicePayments = specialServicePayments;
           this.lineItems = lineItems;
    }


    /**
     * Gets the fedExFreightAccountNumber value for this FreightShipmentDetail.
     * 
     * @return fedExFreightAccountNumber   * Account number used with FEDEX_FREIGHT service.
     */
    public java.lang.String getFedExFreightAccountNumber() {
        return fedExFreightAccountNumber;
    }


    /**
     * Sets the fedExFreightAccountNumber value for this FreightShipmentDetail.
     * 
     * @param fedExFreightAccountNumber   * Account number used with FEDEX_FREIGHT service.
     */
    public void setFedExFreightAccountNumber(java.lang.String fedExFreightAccountNumber) {
        this.fedExFreightAccountNumber = fedExFreightAccountNumber;
    }


    /**
     * Gets the fedExFreightBillingContactAndAddress value for this FreightShipmentDetail.
     * 
     * @return fedExFreightBillingContactAndAddress   * Used for validating FedEx Freight account number and (optionally)
     * identifying third party payment on the bill of lading.
     */
    public com.fedex.rate.stub.ContactAndAddress getFedExFreightBillingContactAndAddress() {
        return fedExFreightBillingContactAndAddress;
    }


    /**
     * Sets the fedExFreightBillingContactAndAddress value for this FreightShipmentDetail.
     * 
     * @param fedExFreightBillingContactAndAddress   * Used for validating FedEx Freight account number and (optionally)
     * identifying third party payment on the bill of lading.
     */
    public void setFedExFreightBillingContactAndAddress(com.fedex.rate.stub.ContactAndAddress fedExFreightBillingContactAndAddress) {
        this.fedExFreightBillingContactAndAddress = fedExFreightBillingContactAndAddress;
    }


    /**
     * Gets the fedExNationalFreightAccountNumber value for this FreightShipmentDetail.
     * 
     * @return fedExNationalFreightAccountNumber   * Account number used with FEDEX_NATIONAL_FREIGHT service.
     */
    public java.lang.String getFedExNationalFreightAccountNumber() {
        return fedExNationalFreightAccountNumber;
    }


    /**
     * Sets the fedExNationalFreightAccountNumber value for this FreightShipmentDetail.
     * 
     * @param fedExNationalFreightAccountNumber   * Account number used with FEDEX_NATIONAL_FREIGHT service.
     */
    public void setFedExNationalFreightAccountNumber(java.lang.String fedExNationalFreightAccountNumber) {
        this.fedExNationalFreightAccountNumber = fedExNationalFreightAccountNumber;
    }


    /**
     * Gets the fedExNationalFreightBillingContactAndAddress value for this FreightShipmentDetail.
     * 
     * @return fedExNationalFreightBillingContactAndAddress   * Used for validating FedEx National Freight account number and
     * (optionally) identifying third party payment on the bill of lading.
     */
    public com.fedex.rate.stub.ContactAndAddress getFedExNationalFreightBillingContactAndAddress() {
        return fedExNationalFreightBillingContactAndAddress;
    }


    /**
     * Sets the fedExNationalFreightBillingContactAndAddress value for this FreightShipmentDetail.
     * 
     * @param fedExNationalFreightBillingContactAndAddress   * Used for validating FedEx National Freight account number and
     * (optionally) identifying third party payment on the bill of lading.
     */
    public void setFedExNationalFreightBillingContactAndAddress(com.fedex.rate.stub.ContactAndAddress fedExNationalFreightBillingContactAndAddress) {
        this.fedExNationalFreightBillingContactAndAddress = fedExNationalFreightBillingContactAndAddress;
    }


    /**
     * Gets the role value for this FreightShipmentDetail.
     * 
     * @return role   * Indicates the role of the party submitting the transaction.
     */
    public com.fedex.rate.stub.FreightShipmentRoleType getRole() {
        return role;
    }


    /**
     * Sets the role value for this FreightShipmentDetail.
     * 
     * @param role   * Indicates the role of the party submitting the transaction.
     */
    public void setRole(com.fedex.rate.stub.FreightShipmentRoleType role) {
        this.role = role;
    }


    /**
     * Gets the paymentType value for this FreightShipmentDetail.
     * 
     * @return paymentType   * Designates which of the requester's tariffs will be used for
     * rating.
     */
    public com.fedex.rate.stub.FreightAccountPaymentType getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this FreightShipmentDetail.
     * 
     * @param paymentType   * Designates which of the requester's tariffs will be used for
     * rating.
     */
    public void setPaymentType(com.fedex.rate.stub.FreightAccountPaymentType paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the declaredValuePerUnit value for this FreightShipmentDetail.
     * 
     * @return declaredValuePerUnit   * Identifies the declared value for the shipment
     */
    public com.fedex.rate.stub.Money getDeclaredValuePerUnit() {
        return declaredValuePerUnit;
    }


    /**
     * Sets the declaredValuePerUnit value for this FreightShipmentDetail.
     * 
     * @param declaredValuePerUnit   * Identifies the declared value for the shipment
     */
    public void setDeclaredValuePerUnit(com.fedex.rate.stub.Money declaredValuePerUnit) {
        this.declaredValuePerUnit = declaredValuePerUnit;
    }


    /**
     * Gets the declaredValueUnits value for this FreightShipmentDetail.
     * 
     * @return declaredValueUnits   * Identifies the declared value units corresponding to the above
     * defined declared value
     */
    public java.lang.String getDeclaredValueUnits() {
        return declaredValueUnits;
    }


    /**
     * Sets the declaredValueUnits value for this FreightShipmentDetail.
     * 
     * @param declaredValueUnits   * Identifies the declared value units corresponding to the above
     * defined declared value
     */
    public void setDeclaredValueUnits(java.lang.String declaredValueUnits) {
        this.declaredValueUnits = declaredValueUnits;
    }


    /**
     * Gets the liabilityCoverageDetail value for this FreightShipmentDetail.
     * 
     * @return liabilityCoverageDetail
     */
    public com.fedex.rate.stub.LiabilityCoverageDetail getLiabilityCoverageDetail() {
        return liabilityCoverageDetail;
    }


    /**
     * Sets the liabilityCoverageDetail value for this FreightShipmentDetail.
     * 
     * @param liabilityCoverageDetail
     */
    public void setLiabilityCoverageDetail(com.fedex.rate.stub.LiabilityCoverageDetail liabilityCoverageDetail) {
        this.liabilityCoverageDetail = liabilityCoverageDetail;
    }


    /**
     * Gets the coupons value for this FreightShipmentDetail.
     * 
     * @return coupons   * Identifiers for promotional discounts offered to customers.
     */
    public java.lang.String[] getCoupons() {
        return coupons;
    }


    /**
     * Sets the coupons value for this FreightShipmentDetail.
     * 
     * @param coupons   * Identifiers for promotional discounts offered to customers.
     */
    public void setCoupons(java.lang.String[] coupons) {
        this.coupons = coupons;
    }

    public java.lang.String getCoupons(int i) {
        return this.coupons[i];
    }

    public void setCoupons(int i, java.lang.String _value) {
        this.coupons[i] = _value;
    }


    /**
     * Gets the totalHandlingUnits value for this FreightShipmentDetail.
     * 
     * @return totalHandlingUnits   * Total number of individual handling units in the entire shipment
     * (for unit pricing).
     */
    public org.apache.axis.types.NonNegativeInteger getTotalHandlingUnits() {
        return totalHandlingUnits;
    }


    /**
     * Sets the totalHandlingUnits value for this FreightShipmentDetail.
     * 
     * @param totalHandlingUnits   * Total number of individual handling units in the entire shipment
     * (for unit pricing).
     */
    public void setTotalHandlingUnits(org.apache.axis.types.NonNegativeInteger totalHandlingUnits) {
        this.totalHandlingUnits = totalHandlingUnits;
    }


    /**
     * Gets the clientDiscountPercent value for this FreightShipmentDetail.
     * 
     * @return clientDiscountPercent   * Estimated discount rate provided by client for unsecured rate
     * quote.
     */
    public java.math.BigDecimal getClientDiscountPercent() {
        return clientDiscountPercent;
    }


    /**
     * Sets the clientDiscountPercent value for this FreightShipmentDetail.
     * 
     * @param clientDiscountPercent   * Estimated discount rate provided by client for unsecured rate
     * quote.
     */
    public void setClientDiscountPercent(java.math.BigDecimal clientDiscountPercent) {
        this.clientDiscountPercent = clientDiscountPercent;
    }


    /**
     * Gets the palletWeight value for this FreightShipmentDetail.
     * 
     * @return palletWeight   * Total weight of pallets used in shipment.
     */
    public com.fedex.rate.stub.Weight getPalletWeight() {
        return palletWeight;
    }


    /**
     * Sets the palletWeight value for this FreightShipmentDetail.
     * 
     * @param palletWeight   * Total weight of pallets used in shipment.
     */
    public void setPalletWeight(com.fedex.rate.stub.Weight palletWeight) {
        this.palletWeight = palletWeight;
    }


    /**
     * Gets the shipmentDimensions value for this FreightShipmentDetail.
     * 
     * @return shipmentDimensions   * Overall shipment dimensions.
     */
    public com.fedex.rate.stub.Dimensions getShipmentDimensions() {
        return shipmentDimensions;
    }


    /**
     * Sets the shipmentDimensions value for this FreightShipmentDetail.
     * 
     * @param shipmentDimensions   * Overall shipment dimensions.
     */
    public void setShipmentDimensions(com.fedex.rate.stub.Dimensions shipmentDimensions) {
        this.shipmentDimensions = shipmentDimensions;
    }


    /**
     * Gets the comment value for this FreightShipmentDetail.
     * 
     * @return comment   * Description for the shipment.
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this FreightShipmentDetail.
     * 
     * @param comment   * Description for the shipment.
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the specialServicePayments value for this FreightShipmentDetail.
     * 
     * @return specialServicePayments   * Specifies which party will pay surcharges for any special services
     * which support split billing.
     */
    public com.fedex.rate.stub.FreightSpecialServicePayment[] getSpecialServicePayments() {
        return specialServicePayments;
    }


    /**
     * Sets the specialServicePayments value for this FreightShipmentDetail.
     * 
     * @param specialServicePayments   * Specifies which party will pay surcharges for any special services
     * which support split billing.
     */
    public void setSpecialServicePayments(com.fedex.rate.stub.FreightSpecialServicePayment[] specialServicePayments) {
        this.specialServicePayments = specialServicePayments;
    }

    public com.fedex.rate.stub.FreightSpecialServicePayment getSpecialServicePayments(int i) {
        return this.specialServicePayments[i];
    }

    public void setSpecialServicePayments(int i, com.fedex.rate.stub.FreightSpecialServicePayment _value) {
        this.specialServicePayments[i] = _value;
    }


    /**
     * Gets the lineItems value for this FreightShipmentDetail.
     * 
     * @return lineItems   * Details of the commodities in the shipment.
     */
    public com.fedex.rate.stub.FreightShipmentLineItem[] getLineItems() {
        return lineItems;
    }


    /**
     * Sets the lineItems value for this FreightShipmentDetail.
     * 
     * @param lineItems   * Details of the commodities in the shipment.
     */
    public void setLineItems(com.fedex.rate.stub.FreightShipmentLineItem[] lineItems) {
        this.lineItems = lineItems;
    }

    public com.fedex.rate.stub.FreightShipmentLineItem getLineItems(int i) {
        return this.lineItems[i];
    }

    public void setLineItems(int i, com.fedex.rate.stub.FreightShipmentLineItem _value) {
        this.lineItems[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FreightShipmentDetail)) return false;
        FreightShipmentDetail other = (FreightShipmentDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fedExFreightAccountNumber==null && other.getFedExFreightAccountNumber()==null) || 
             (this.fedExFreightAccountNumber!=null &&
              this.fedExFreightAccountNumber.equals(other.getFedExFreightAccountNumber()))) &&
            ((this.fedExFreightBillingContactAndAddress==null && other.getFedExFreightBillingContactAndAddress()==null) || 
             (this.fedExFreightBillingContactAndAddress!=null &&
              this.fedExFreightBillingContactAndAddress.equals(other.getFedExFreightBillingContactAndAddress()))) &&
            ((this.fedExNationalFreightAccountNumber==null && other.getFedExNationalFreightAccountNumber()==null) || 
             (this.fedExNationalFreightAccountNumber!=null &&
              this.fedExNationalFreightAccountNumber.equals(other.getFedExNationalFreightAccountNumber()))) &&
            ((this.fedExNationalFreightBillingContactAndAddress==null && other.getFedExNationalFreightBillingContactAndAddress()==null) || 
             (this.fedExNationalFreightBillingContactAndAddress!=null &&
              this.fedExNationalFreightBillingContactAndAddress.equals(other.getFedExNationalFreightBillingContactAndAddress()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole()))) &&
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType()))) &&
            ((this.declaredValuePerUnit==null && other.getDeclaredValuePerUnit()==null) || 
             (this.declaredValuePerUnit!=null &&
              this.declaredValuePerUnit.equals(other.getDeclaredValuePerUnit()))) &&
            ((this.declaredValueUnits==null && other.getDeclaredValueUnits()==null) || 
             (this.declaredValueUnits!=null &&
              this.declaredValueUnits.equals(other.getDeclaredValueUnits()))) &&
            ((this.liabilityCoverageDetail==null && other.getLiabilityCoverageDetail()==null) || 
             (this.liabilityCoverageDetail!=null &&
              this.liabilityCoverageDetail.equals(other.getLiabilityCoverageDetail()))) &&
            ((this.coupons==null && other.getCoupons()==null) || 
             (this.coupons!=null &&
              java.util.Arrays.equals(this.coupons, other.getCoupons()))) &&
            ((this.totalHandlingUnits==null && other.getTotalHandlingUnits()==null) || 
             (this.totalHandlingUnits!=null &&
              this.totalHandlingUnits.equals(other.getTotalHandlingUnits()))) &&
            ((this.clientDiscountPercent==null && other.getClientDiscountPercent()==null) || 
             (this.clientDiscountPercent!=null &&
              this.clientDiscountPercent.equals(other.getClientDiscountPercent()))) &&
            ((this.palletWeight==null && other.getPalletWeight()==null) || 
             (this.palletWeight!=null &&
              this.palletWeight.equals(other.getPalletWeight()))) &&
            ((this.shipmentDimensions==null && other.getShipmentDimensions()==null) || 
             (this.shipmentDimensions!=null &&
              this.shipmentDimensions.equals(other.getShipmentDimensions()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.specialServicePayments==null && other.getSpecialServicePayments()==null) || 
             (this.specialServicePayments!=null &&
              java.util.Arrays.equals(this.specialServicePayments, other.getSpecialServicePayments()))) &&
            ((this.lineItems==null && other.getLineItems()==null) || 
             (this.lineItems!=null &&
              java.util.Arrays.equals(this.lineItems, other.getLineItems())));
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
        if (getFedExFreightAccountNumber() != null) {
            _hashCode += getFedExFreightAccountNumber().hashCode();
        }
        if (getFedExFreightBillingContactAndAddress() != null) {
            _hashCode += getFedExFreightBillingContactAndAddress().hashCode();
        }
        if (getFedExNationalFreightAccountNumber() != null) {
            _hashCode += getFedExNationalFreightAccountNumber().hashCode();
        }
        if (getFedExNationalFreightBillingContactAndAddress() != null) {
            _hashCode += getFedExNationalFreightBillingContactAndAddress().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        if (getDeclaredValuePerUnit() != null) {
            _hashCode += getDeclaredValuePerUnit().hashCode();
        }
        if (getDeclaredValueUnits() != null) {
            _hashCode += getDeclaredValueUnits().hashCode();
        }
        if (getLiabilityCoverageDetail() != null) {
            _hashCode += getLiabilityCoverageDetail().hashCode();
        }
        if (getCoupons() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCoupons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCoupons(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalHandlingUnits() != null) {
            _hashCode += getTotalHandlingUnits().hashCode();
        }
        if (getClientDiscountPercent() != null) {
            _hashCode += getClientDiscountPercent().hashCode();
        }
        if (getPalletWeight() != null) {
            _hashCode += getPalletWeight().hashCode();
        }
        if (getShipmentDimensions() != null) {
            _hashCode += getShipmentDimensions().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getSpecialServicePayments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecialServicePayments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpecialServicePayments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLineItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineItems(), i);
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
        new org.apache.axis.description.TypeDesc(FreightShipmentDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FreightShipmentDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fedExFreightAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FedExFreightAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fedExFreightBillingContactAndAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FedExFreightBillingContactAndAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ContactAndAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fedExNationalFreightAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FedExNationalFreightAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fedExNationalFreightBillingContactAndAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FedExNationalFreightBillingContactAndAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ContactAndAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Role"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FreightShipmentRoleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "PaymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FreightAccountPaymentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("declaredValuePerUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DeclaredValuePerUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("declaredValueUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DeclaredValueUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liabilityCoverageDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "LiabilityCoverageDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "LiabilityCoverageDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coupons");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Coupons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalHandlingUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "TotalHandlingUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientDiscountPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ClientDiscountPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("palletWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "PalletWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentDimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ShipmentDimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Dimensions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialServicePayments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "SpecialServicePayments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FreightSpecialServicePayment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "LineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FreightShipmentLineItem"));
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
