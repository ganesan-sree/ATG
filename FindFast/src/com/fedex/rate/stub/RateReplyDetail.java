/**
 * RateReplyDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;

public class RateReplyDetail  implements java.io.Serializable {
    /* Identifies the FedEx service to use in shipping the package.
     * See ServiceType for list of valid enumerated values. */
    private com.fedex.rate.stub.ServiceType serviceType;

    /* Identifies the packaging used by the requestor for the package.
     * See PackagingType for list of valid enumerated values. */
    private com.fedex.rate.stub.PackagingType packagingType;

    /* Shows the specific combination of service options combined
     * with the service type that produced this committment in the set returned
     * to the caller. */
    private com.fedex.rate.stub.ServiceOptionType[] appliedOptions;

    /* Supporting detail for applied options identified in preceding
     * field. */
    private com.fedex.rate.stub.ServiceSubOptionDetail appliedSubOptions;

    private java.lang.String deliveryStation;

    private com.fedex.rate.stub.DayOfWeekType deliveryDayOfWeek;

    private java.util.Calendar deliveryTimestamp;

    private com.fedex.rate.stub.CommitDetail[] commitDetails;

    /* Identification of an airport, using standard three-letter abbreviations. */
    private java.lang.String destinationAirportId;

    /* Indicates whether or not this shipment is eligible for a money
     * back guarantee. */
    private java.lang.Boolean ineligibleForMoneyBackGuarantee;

    /* Commitment code for the origin. */
    private java.lang.String originServiceArea;

    /* Commitment code for the destination. */
    private java.lang.String destinationServiceArea;

    /* Time in transit from pickup to delivery. */
    private com.fedex.rate.stub.TransitTimeType transitTime;

    /* Maximum expected transit time. */
    private com.fedex.rate.stub.TransitTimeType maximumTransitTime;

    /* The signature option for this package. */
    private com.fedex.rate.stub.SignatureOptionType signatureOption;

    /* The actual rate type of the charges for this package. */
    private com.fedex.rate.stub.ReturnedRateType actualRateType;

    /* Each element contains all rate data for a single rate type. */
    private com.fedex.rate.stub.RatedShipmentDetail[] ratedShipmentDetails;

    public RateReplyDetail() {
    }

    public RateReplyDetail(
           com.fedex.rate.stub.ServiceType serviceType,
           com.fedex.rate.stub.PackagingType packagingType,
           com.fedex.rate.stub.ServiceOptionType[] appliedOptions,
           com.fedex.rate.stub.ServiceSubOptionDetail appliedSubOptions,
           java.lang.String deliveryStation,
           com.fedex.rate.stub.DayOfWeekType deliveryDayOfWeek,
           java.util.Calendar deliveryTimestamp,
           com.fedex.rate.stub.CommitDetail[] commitDetails,
           java.lang.String destinationAirportId,
           java.lang.Boolean ineligibleForMoneyBackGuarantee,
           java.lang.String originServiceArea,
           java.lang.String destinationServiceArea,
           com.fedex.rate.stub.TransitTimeType transitTime,
           com.fedex.rate.stub.TransitTimeType maximumTransitTime,
           com.fedex.rate.stub.SignatureOptionType signatureOption,
           com.fedex.rate.stub.ReturnedRateType actualRateType,
           com.fedex.rate.stub.RatedShipmentDetail[] ratedShipmentDetails) {
           this.serviceType = serviceType;
           this.packagingType = packagingType;
           this.appliedOptions = appliedOptions;
           this.appliedSubOptions = appliedSubOptions;
           this.deliveryStation = deliveryStation;
           this.deliveryDayOfWeek = deliveryDayOfWeek;
           this.deliveryTimestamp = deliveryTimestamp;
           this.commitDetails = commitDetails;
           this.destinationAirportId = destinationAirportId;
           this.ineligibleForMoneyBackGuarantee = ineligibleForMoneyBackGuarantee;
           this.originServiceArea = originServiceArea;
           this.destinationServiceArea = destinationServiceArea;
           this.transitTime = transitTime;
           this.maximumTransitTime = maximumTransitTime;
           this.signatureOption = signatureOption;
           this.actualRateType = actualRateType;
           this.ratedShipmentDetails = ratedShipmentDetails;
    }


    /**
     * Gets the serviceType value for this RateReplyDetail.
     * 
     * @return serviceType   * Identifies the FedEx service to use in shipping the package.
     * See ServiceType for list of valid enumerated values.
     */
    public com.fedex.rate.stub.ServiceType getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this RateReplyDetail.
     * 
     * @param serviceType   * Identifies the FedEx service to use in shipping the package.
     * See ServiceType for list of valid enumerated values.
     */
    public void setServiceType(com.fedex.rate.stub.ServiceType serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the packagingType value for this RateReplyDetail.
     * 
     * @return packagingType   * Identifies the packaging used by the requestor for the package.
     * See PackagingType for list of valid enumerated values.
     */
    public com.fedex.rate.stub.PackagingType getPackagingType() {
        return packagingType;
    }


    /**
     * Sets the packagingType value for this RateReplyDetail.
     * 
     * @param packagingType   * Identifies the packaging used by the requestor for the package.
     * See PackagingType for list of valid enumerated values.
     */
    public void setPackagingType(com.fedex.rate.stub.PackagingType packagingType) {
        this.packagingType = packagingType;
    }


    /**
     * Gets the appliedOptions value for this RateReplyDetail.
     * 
     * @return appliedOptions   * Shows the specific combination of service options combined
     * with the service type that produced this committment in the set returned
     * to the caller.
     */
    public com.fedex.rate.stub.ServiceOptionType[] getAppliedOptions() {
        return appliedOptions;
    }


    /**
     * Sets the appliedOptions value for this RateReplyDetail.
     * 
     * @param appliedOptions   * Shows the specific combination of service options combined
     * with the service type that produced this committment in the set returned
     * to the caller.
     */
    public void setAppliedOptions(com.fedex.rate.stub.ServiceOptionType[] appliedOptions) {
        this.appliedOptions = appliedOptions;
    }

    public com.fedex.rate.stub.ServiceOptionType getAppliedOptions(int i) {
        return this.appliedOptions[i];
    }

    public void setAppliedOptions(int i, com.fedex.rate.stub.ServiceOptionType _value) {
        this.appliedOptions[i] = _value;
    }


    /**
     * Gets the appliedSubOptions value for this RateReplyDetail.
     * 
     * @return appliedSubOptions   * Supporting detail for applied options identified in preceding
     * field.
     */
    public com.fedex.rate.stub.ServiceSubOptionDetail getAppliedSubOptions() {
        return appliedSubOptions;
    }


    /**
     * Sets the appliedSubOptions value for this RateReplyDetail.
     * 
     * @param appliedSubOptions   * Supporting detail for applied options identified in preceding
     * field.
     */
    public void setAppliedSubOptions(com.fedex.rate.stub.ServiceSubOptionDetail appliedSubOptions) {
        this.appliedSubOptions = appliedSubOptions;
    }


    /**
     * Gets the deliveryStation value for this RateReplyDetail.
     * 
     * @return deliveryStation
     */
    public java.lang.String getDeliveryStation() {
        return deliveryStation;
    }


    /**
     * Sets the deliveryStation value for this RateReplyDetail.
     * 
     * @param deliveryStation
     */
    public void setDeliveryStation(java.lang.String deliveryStation) {
        this.deliveryStation = deliveryStation;
    }


    /**
     * Gets the deliveryDayOfWeek value for this RateReplyDetail.
     * 
     * @return deliveryDayOfWeek
     */
    public com.fedex.rate.stub.DayOfWeekType getDeliveryDayOfWeek() {
        return deliveryDayOfWeek;
    }


    /**
     * Sets the deliveryDayOfWeek value for this RateReplyDetail.
     * 
     * @param deliveryDayOfWeek
     */
    public void setDeliveryDayOfWeek(com.fedex.rate.stub.DayOfWeekType deliveryDayOfWeek) {
        this.deliveryDayOfWeek = deliveryDayOfWeek;
    }


    /**
     * Gets the deliveryTimestamp value for this RateReplyDetail.
     * 
     * @return deliveryTimestamp
     */
    public java.util.Calendar getDeliveryTimestamp() {
        return deliveryTimestamp;
    }


    /**
     * Sets the deliveryTimestamp value for this RateReplyDetail.
     * 
     * @param deliveryTimestamp
     */
    public void setDeliveryTimestamp(java.util.Calendar deliveryTimestamp) {
        this.deliveryTimestamp = deliveryTimestamp;
    }


    /**
     * Gets the commitDetails value for this RateReplyDetail.
     * 
     * @return commitDetails
     */
    public com.fedex.rate.stub.CommitDetail[] getCommitDetails() {
        return commitDetails;
    }


    /**
     * Sets the commitDetails value for this RateReplyDetail.
     * 
     * @param commitDetails
     */
    public void setCommitDetails(com.fedex.rate.stub.CommitDetail[] commitDetails) {
        this.commitDetails = commitDetails;
    }

    public com.fedex.rate.stub.CommitDetail getCommitDetails(int i) {
        return this.commitDetails[i];
    }

    public void setCommitDetails(int i, com.fedex.rate.stub.CommitDetail _value) {
        this.commitDetails[i] = _value;
    }


    /**
     * Gets the destinationAirportId value for this RateReplyDetail.
     * 
     * @return destinationAirportId   * Identification of an airport, using standard three-letter abbreviations.
     */
    public java.lang.String getDestinationAirportId() {
        return destinationAirportId;
    }


    /**
     * Sets the destinationAirportId value for this RateReplyDetail.
     * 
     * @param destinationAirportId   * Identification of an airport, using standard three-letter abbreviations.
     */
    public void setDestinationAirportId(java.lang.String destinationAirportId) {
        this.destinationAirportId = destinationAirportId;
    }


    /**
     * Gets the ineligibleForMoneyBackGuarantee value for this RateReplyDetail.
     * 
     * @return ineligibleForMoneyBackGuarantee   * Indicates whether or not this shipment is eligible for a money
     * back guarantee.
     */
    public java.lang.Boolean getIneligibleForMoneyBackGuarantee() {
        return ineligibleForMoneyBackGuarantee;
    }


    /**
     * Sets the ineligibleForMoneyBackGuarantee value for this RateReplyDetail.
     * 
     * @param ineligibleForMoneyBackGuarantee   * Indicates whether or not this shipment is eligible for a money
     * back guarantee.
     */
    public void setIneligibleForMoneyBackGuarantee(java.lang.Boolean ineligibleForMoneyBackGuarantee) {
        this.ineligibleForMoneyBackGuarantee = ineligibleForMoneyBackGuarantee;
    }


    /**
     * Gets the originServiceArea value for this RateReplyDetail.
     * 
     * @return originServiceArea   * Commitment code for the origin.
     */
    public java.lang.String getOriginServiceArea() {
        return originServiceArea;
    }


    /**
     * Sets the originServiceArea value for this RateReplyDetail.
     * 
     * @param originServiceArea   * Commitment code for the origin.
     */
    public void setOriginServiceArea(java.lang.String originServiceArea) {
        this.originServiceArea = originServiceArea;
    }


    /**
     * Gets the destinationServiceArea value for this RateReplyDetail.
     * 
     * @return destinationServiceArea   * Commitment code for the destination.
     */
    public java.lang.String getDestinationServiceArea() {
        return destinationServiceArea;
    }


    /**
     * Sets the destinationServiceArea value for this RateReplyDetail.
     * 
     * @param destinationServiceArea   * Commitment code for the destination.
     */
    public void setDestinationServiceArea(java.lang.String destinationServiceArea) {
        this.destinationServiceArea = destinationServiceArea;
    }


    /**
     * Gets the transitTime value for this RateReplyDetail.
     * 
     * @return transitTime   * Time in transit from pickup to delivery.
     */
    public com.fedex.rate.stub.TransitTimeType getTransitTime() {
        return transitTime;
    }


    /**
     * Sets the transitTime value for this RateReplyDetail.
     * 
     * @param transitTime   * Time in transit from pickup to delivery.
     */
    public void setTransitTime(com.fedex.rate.stub.TransitTimeType transitTime) {
        this.transitTime = transitTime;
    }


    /**
     * Gets the maximumTransitTime value for this RateReplyDetail.
     * 
     * @return maximumTransitTime   * Maximum expected transit time.
     */
    public com.fedex.rate.stub.TransitTimeType getMaximumTransitTime() {
        return maximumTransitTime;
    }


    /**
     * Sets the maximumTransitTime value for this RateReplyDetail.
     * 
     * @param maximumTransitTime   * Maximum expected transit time.
     */
    public void setMaximumTransitTime(com.fedex.rate.stub.TransitTimeType maximumTransitTime) {
        this.maximumTransitTime = maximumTransitTime;
    }


    /**
     * Gets the signatureOption value for this RateReplyDetail.
     * 
     * @return signatureOption   * The signature option for this package.
     */
    public com.fedex.rate.stub.SignatureOptionType getSignatureOption() {
        return signatureOption;
    }


    /**
     * Sets the signatureOption value for this RateReplyDetail.
     * 
     * @param signatureOption   * The signature option for this package.
     */
    public void setSignatureOption(com.fedex.rate.stub.SignatureOptionType signatureOption) {
        this.signatureOption = signatureOption;
    }


    /**
     * Gets the actualRateType value for this RateReplyDetail.
     * 
     * @return actualRateType   * The actual rate type of the charges for this package.
     */
    public com.fedex.rate.stub.ReturnedRateType getActualRateType() {
        return actualRateType;
    }


    /**
     * Sets the actualRateType value for this RateReplyDetail.
     * 
     * @param actualRateType   * The actual rate type of the charges for this package.
     */
    public void setActualRateType(com.fedex.rate.stub.ReturnedRateType actualRateType) {
        this.actualRateType = actualRateType;
    }


    /**
     * Gets the ratedShipmentDetails value for this RateReplyDetail.
     * 
     * @return ratedShipmentDetails   * Each element contains all rate data for a single rate type.
     */
    public com.fedex.rate.stub.RatedShipmentDetail[] getRatedShipmentDetails() {
        return ratedShipmentDetails;
    }


    /**
     * Sets the ratedShipmentDetails value for this RateReplyDetail.
     * 
     * @param ratedShipmentDetails   * Each element contains all rate data for a single rate type.
     */
    public void setRatedShipmentDetails(com.fedex.rate.stub.RatedShipmentDetail[] ratedShipmentDetails) {
        this.ratedShipmentDetails = ratedShipmentDetails;
    }

    public com.fedex.rate.stub.RatedShipmentDetail getRatedShipmentDetails(int i) {
        return this.ratedShipmentDetails[i];
    }

    public void setRatedShipmentDetails(int i, com.fedex.rate.stub.RatedShipmentDetail _value) {
        this.ratedShipmentDetails[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RateReplyDetail)) return false;
        RateReplyDetail other = (RateReplyDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.packagingType==null && other.getPackagingType()==null) || 
             (this.packagingType!=null &&
              this.packagingType.equals(other.getPackagingType()))) &&
            ((this.appliedOptions==null && other.getAppliedOptions()==null) || 
             (this.appliedOptions!=null &&
              java.util.Arrays.equals(this.appliedOptions, other.getAppliedOptions()))) &&
            ((this.appliedSubOptions==null && other.getAppliedSubOptions()==null) || 
             (this.appliedSubOptions!=null &&
              this.appliedSubOptions.equals(other.getAppliedSubOptions()))) &&
            ((this.deliveryStation==null && other.getDeliveryStation()==null) || 
             (this.deliveryStation!=null &&
              this.deliveryStation.equals(other.getDeliveryStation()))) &&
            ((this.deliveryDayOfWeek==null && other.getDeliveryDayOfWeek()==null) || 
             (this.deliveryDayOfWeek!=null &&
              this.deliveryDayOfWeek.equals(other.getDeliveryDayOfWeek()))) &&
            ((this.deliveryTimestamp==null && other.getDeliveryTimestamp()==null) || 
             (this.deliveryTimestamp!=null &&
              this.deliveryTimestamp.equals(other.getDeliveryTimestamp()))) &&
            ((this.commitDetails==null && other.getCommitDetails()==null) || 
             (this.commitDetails!=null &&
              java.util.Arrays.equals(this.commitDetails, other.getCommitDetails()))) &&
            ((this.destinationAirportId==null && other.getDestinationAirportId()==null) || 
             (this.destinationAirportId!=null &&
              this.destinationAirportId.equals(other.getDestinationAirportId()))) &&
            ((this.ineligibleForMoneyBackGuarantee==null && other.getIneligibleForMoneyBackGuarantee()==null) || 
             (this.ineligibleForMoneyBackGuarantee!=null &&
              this.ineligibleForMoneyBackGuarantee.equals(other.getIneligibleForMoneyBackGuarantee()))) &&
            ((this.originServiceArea==null && other.getOriginServiceArea()==null) || 
             (this.originServiceArea!=null &&
              this.originServiceArea.equals(other.getOriginServiceArea()))) &&
            ((this.destinationServiceArea==null && other.getDestinationServiceArea()==null) || 
             (this.destinationServiceArea!=null &&
              this.destinationServiceArea.equals(other.getDestinationServiceArea()))) &&
            ((this.transitTime==null && other.getTransitTime()==null) || 
             (this.transitTime!=null &&
              this.transitTime.equals(other.getTransitTime()))) &&
            ((this.maximumTransitTime==null && other.getMaximumTransitTime()==null) || 
             (this.maximumTransitTime!=null &&
              this.maximumTransitTime.equals(other.getMaximumTransitTime()))) &&
            ((this.signatureOption==null && other.getSignatureOption()==null) || 
             (this.signatureOption!=null &&
              this.signatureOption.equals(other.getSignatureOption()))) &&
            ((this.actualRateType==null && other.getActualRateType()==null) || 
             (this.actualRateType!=null &&
              this.actualRateType.equals(other.getActualRateType()))) &&
            ((this.ratedShipmentDetails==null && other.getRatedShipmentDetails()==null) || 
             (this.ratedShipmentDetails!=null &&
              java.util.Arrays.equals(this.ratedShipmentDetails, other.getRatedShipmentDetails())));
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
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getPackagingType() != null) {
            _hashCode += getPackagingType().hashCode();
        }
        if (getAppliedOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppliedOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppliedOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppliedSubOptions() != null) {
            _hashCode += getAppliedSubOptions().hashCode();
        }
        if (getDeliveryStation() != null) {
            _hashCode += getDeliveryStation().hashCode();
        }
        if (getDeliveryDayOfWeek() != null) {
            _hashCode += getDeliveryDayOfWeek().hashCode();
        }
        if (getDeliveryTimestamp() != null) {
            _hashCode += getDeliveryTimestamp().hashCode();
        }
        if (getCommitDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommitDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommitDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDestinationAirportId() != null) {
            _hashCode += getDestinationAirportId().hashCode();
        }
        if (getIneligibleForMoneyBackGuarantee() != null) {
            _hashCode += getIneligibleForMoneyBackGuarantee().hashCode();
        }
        if (getOriginServiceArea() != null) {
            _hashCode += getOriginServiceArea().hashCode();
        }
        if (getDestinationServiceArea() != null) {
            _hashCode += getDestinationServiceArea().hashCode();
        }
        if (getTransitTime() != null) {
            _hashCode += getTransitTime().hashCode();
        }
        if (getMaximumTransitTime() != null) {
            _hashCode += getMaximumTransitTime().hashCode();
        }
        if (getSignatureOption() != null) {
            _hashCode += getSignatureOption().hashCode();
        }
        if (getActualRateType() != null) {
            _hashCode += getActualRateType().hashCode();
        }
        if (getRatedShipmentDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRatedShipmentDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRatedShipmentDetails(), i);
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
        new org.apache.axis.description.TypeDesc(RateReplyDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RateReplyDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ServiceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packagingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "PackagingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "PackagingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "AppliedOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ServiceOptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedSubOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "AppliedSubOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ServiceSubOptionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryStation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DeliveryStation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryDayOfWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DeliveryDayOfWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DayOfWeekType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DeliveryTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commitDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CommitDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CommitDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationAirportId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DestinationAirportId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ineligibleForMoneyBackGuarantee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "IneligibleForMoneyBackGuarantee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originServiceArea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "OriginServiceArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationServiceArea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DestinationServiceArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transitTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "TransitTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "TransitTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumTransitTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "MaximumTransitTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "TransitTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "SignatureOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "SignatureOptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ActualRateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ReturnedRateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratedShipmentDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RatedShipmentDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RatedShipmentDetail"));
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
