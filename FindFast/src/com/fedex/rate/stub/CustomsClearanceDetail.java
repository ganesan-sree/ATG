/**
 * CustomsClearanceDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;

public class CustomsClearanceDetail  implements java.io.Serializable {
    /* Descriptive data identifying the Broker responsible for the
     * shipmet.
     *                 Required if BROKER_SELECT_OPTION is requested in Special
     * Services. */
    private com.fedex.rate.stub.Party broker;

    /* Interacts both with properties of the shipment and contractual
     * relationship with the shipper. */
    private com.fedex.rate.stub.ClearanceBrokerageType clearanceBrokerage;

    /* Applicable only for Commercial Invoice. If the consignee and
     * importer are not the same, the Following importer fields are required.
     * Importer/Contact/PersonName
     *                 Importer/Contact/CompanyName
     *                 Importer/Contact/PhoneNumber
     *                 Importer/Address/StreetLine[0]
     *                 Importer/Address/City
     *                 Importer/Address/StateOrProvinceCode - if Importer
     * Country Code is US or CA
     *                 Importer/Address/PostalCode - if Importer Country
     * Code is US or CA
     *                 Importer/Address/CountryCode */
    private com.fedex.rate.stub.Party importerOfRecord;

    /* Specifies how the recipient is identified for customs purposes;
     * the requirements on this information vary with destination country. */
    private com.fedex.rate.stub.RecipientCustomsId recipientCustomsId;

    /* Indicates how payment of duties for the shipment will be made. */
    private com.fedex.rate.stub.Payment dutiesPayment;

    /* Indicates whether this shipment contains documents only or
     * non-documents. */
    private com.fedex.rate.stub.InternationalDocumentContentType documentContent;

    /* The total customs value for the shipment. This total will rrepresent
     * th esum of the values of all commodities, and may include freight,
     * miscellaneous, and insurance charges. Must contain 2 explicit decimal
     * positions with a max length of 17 including the decimal. For Express
     * International MPS, the Total Customs Value is in the master transaction
     * and all child transactions */
    private com.fedex.rate.stub.Money customsValue;

    /* Identifies responsibilities with respect to loss, damage, etc. */
    private com.fedex.rate.stub.FreightOnValueType freightOnValue;

    /* Documents amount paid to third party for coverage of shipment
     * content. */
    private com.fedex.rate.stub.Money insuranceCharges;

    private java.lang.Boolean partiesToTransactionAreRelated;

    /* CommercialInvoice element is required for electronic upload
     * of CI data. It will serve to create/transmit an Electronic Commercial
     * Invoice through FedEx System. Customers are responsible for printing
     * their own Commercial Invoice. Commercial Invoice support consists
     * of a maximum of 20 commodity line items. */
    private com.fedex.rate.stub.CommercialInvoice commercialInvoice;

    /* For international multiple piece shipments, commodity information
     * must be passed in the Master and on each child transaction.
     *                 If this shipment cotains more than four commodities
     * line items, the four highest valued should be included in the first
     * 4 occurances for this request. */
    private com.fedex.rate.stub.Commodity[] commodities;

    /* Country specific details of an International shipment. */
    private com.fedex.rate.stub.ExportDetail exportDetail;

    /* FOOD_OR_PERISHABLE is required by FDA/BTA; must be true for
     * food/perishable items coming to US or PR from non-US/non-PR origin. */
    private com.fedex.rate.stub.RegulatoryControlType[] regulatoryControls;

    public CustomsClearanceDetail() {
    }

    public CustomsClearanceDetail(
           com.fedex.rate.stub.Party broker,
           com.fedex.rate.stub.ClearanceBrokerageType clearanceBrokerage,
           com.fedex.rate.stub.Party importerOfRecord,
           com.fedex.rate.stub.RecipientCustomsId recipientCustomsId,
           com.fedex.rate.stub.Payment dutiesPayment,
           com.fedex.rate.stub.InternationalDocumentContentType documentContent,
           com.fedex.rate.stub.Money customsValue,
           com.fedex.rate.stub.FreightOnValueType freightOnValue,
           com.fedex.rate.stub.Money insuranceCharges,
           java.lang.Boolean partiesToTransactionAreRelated,
           com.fedex.rate.stub.CommercialInvoice commercialInvoice,
           com.fedex.rate.stub.Commodity[] commodities,
           com.fedex.rate.stub.ExportDetail exportDetail,
           com.fedex.rate.stub.RegulatoryControlType[] regulatoryControls) {
           this.broker = broker;
           this.clearanceBrokerage = clearanceBrokerage;
           this.importerOfRecord = importerOfRecord;
           this.recipientCustomsId = recipientCustomsId;
           this.dutiesPayment = dutiesPayment;
           this.documentContent = documentContent;
           this.customsValue = customsValue;
           this.freightOnValue = freightOnValue;
           this.insuranceCharges = insuranceCharges;
           this.partiesToTransactionAreRelated = partiesToTransactionAreRelated;
           this.commercialInvoice = commercialInvoice;
           this.commodities = commodities;
           this.exportDetail = exportDetail;
           this.regulatoryControls = regulatoryControls;
    }


    /**
     * Gets the broker value for this CustomsClearanceDetail.
     * 
     * @return broker   * Descriptive data identifying the Broker responsible for the
     * shipmet.
     *                 Required if BROKER_SELECT_OPTION is requested in Special
     * Services.
     */
    public com.fedex.rate.stub.Party getBroker() {
        return broker;
    }


    /**
     * Sets the broker value for this CustomsClearanceDetail.
     * 
     * @param broker   * Descriptive data identifying the Broker responsible for the
     * shipmet.
     *                 Required if BROKER_SELECT_OPTION is requested in Special
     * Services.
     */
    public void setBroker(com.fedex.rate.stub.Party broker) {
        this.broker = broker;
    }


    /**
     * Gets the clearanceBrokerage value for this CustomsClearanceDetail.
     * 
     * @return clearanceBrokerage   * Interacts both with properties of the shipment and contractual
     * relationship with the shipper.
     */
    public com.fedex.rate.stub.ClearanceBrokerageType getClearanceBrokerage() {
        return clearanceBrokerage;
    }


    /**
     * Sets the clearanceBrokerage value for this CustomsClearanceDetail.
     * 
     * @param clearanceBrokerage   * Interacts both with properties of the shipment and contractual
     * relationship with the shipper.
     */
    public void setClearanceBrokerage(com.fedex.rate.stub.ClearanceBrokerageType clearanceBrokerage) {
        this.clearanceBrokerage = clearanceBrokerage;
    }


    /**
     * Gets the importerOfRecord value for this CustomsClearanceDetail.
     * 
     * @return importerOfRecord   * Applicable only for Commercial Invoice. If the consignee and
     * importer are not the same, the Following importer fields are required.
     * Importer/Contact/PersonName
     *                 Importer/Contact/CompanyName
     *                 Importer/Contact/PhoneNumber
     *                 Importer/Address/StreetLine[0]
     *                 Importer/Address/City
     *                 Importer/Address/StateOrProvinceCode - if Importer
     * Country Code is US or CA
     *                 Importer/Address/PostalCode - if Importer Country
     * Code is US or CA
     *                 Importer/Address/CountryCode
     */
    public com.fedex.rate.stub.Party getImporterOfRecord() {
        return importerOfRecord;
    }


    /**
     * Sets the importerOfRecord value for this CustomsClearanceDetail.
     * 
     * @param importerOfRecord   * Applicable only for Commercial Invoice. If the consignee and
     * importer are not the same, the Following importer fields are required.
     * Importer/Contact/PersonName
     *                 Importer/Contact/CompanyName
     *                 Importer/Contact/PhoneNumber
     *                 Importer/Address/StreetLine[0]
     *                 Importer/Address/City
     *                 Importer/Address/StateOrProvinceCode - if Importer
     * Country Code is US or CA
     *                 Importer/Address/PostalCode - if Importer Country
     * Code is US or CA
     *                 Importer/Address/CountryCode
     */
    public void setImporterOfRecord(com.fedex.rate.stub.Party importerOfRecord) {
        this.importerOfRecord = importerOfRecord;
    }


    /**
     * Gets the recipientCustomsId value for this CustomsClearanceDetail.
     * 
     * @return recipientCustomsId   * Specifies how the recipient is identified for customs purposes;
     * the requirements on this information vary with destination country.
     */
    public com.fedex.rate.stub.RecipientCustomsId getRecipientCustomsId() {
        return recipientCustomsId;
    }


    /**
     * Sets the recipientCustomsId value for this CustomsClearanceDetail.
     * 
     * @param recipientCustomsId   * Specifies how the recipient is identified for customs purposes;
     * the requirements on this information vary with destination country.
     */
    public void setRecipientCustomsId(com.fedex.rate.stub.RecipientCustomsId recipientCustomsId) {
        this.recipientCustomsId = recipientCustomsId;
    }


    /**
     * Gets the dutiesPayment value for this CustomsClearanceDetail.
     * 
     * @return dutiesPayment   * Indicates how payment of duties for the shipment will be made.
     */
    public com.fedex.rate.stub.Payment getDutiesPayment() {
        return dutiesPayment;
    }


    /**
     * Sets the dutiesPayment value for this CustomsClearanceDetail.
     * 
     * @param dutiesPayment   * Indicates how payment of duties for the shipment will be made.
     */
    public void setDutiesPayment(com.fedex.rate.stub.Payment dutiesPayment) {
        this.dutiesPayment = dutiesPayment;
    }


    /**
     * Gets the documentContent value for this CustomsClearanceDetail.
     * 
     * @return documentContent   * Indicates whether this shipment contains documents only or
     * non-documents.
     */
    public com.fedex.rate.stub.InternationalDocumentContentType getDocumentContent() {
        return documentContent;
    }


    /**
     * Sets the documentContent value for this CustomsClearanceDetail.
     * 
     * @param documentContent   * Indicates whether this shipment contains documents only or
     * non-documents.
     */
    public void setDocumentContent(com.fedex.rate.stub.InternationalDocumentContentType documentContent) {
        this.documentContent = documentContent;
    }


    /**
     * Gets the customsValue value for this CustomsClearanceDetail.
     * 
     * @return customsValue   * The total customs value for the shipment. This total will rrepresent
     * th esum of the values of all commodities, and may include freight,
     * miscellaneous, and insurance charges. Must contain 2 explicit decimal
     * positions with a max length of 17 including the decimal. For Express
     * International MPS, the Total Customs Value is in the master transaction
     * and all child transactions
     */
    public com.fedex.rate.stub.Money getCustomsValue() {
        return customsValue;
    }


    /**
     * Sets the customsValue value for this CustomsClearanceDetail.
     * 
     * @param customsValue   * The total customs value for the shipment. This total will rrepresent
     * th esum of the values of all commodities, and may include freight,
     * miscellaneous, and insurance charges. Must contain 2 explicit decimal
     * positions with a max length of 17 including the decimal. For Express
     * International MPS, the Total Customs Value is in the master transaction
     * and all child transactions
     */
    public void setCustomsValue(com.fedex.rate.stub.Money customsValue) {
        this.customsValue = customsValue;
    }


    /**
     * Gets the freightOnValue value for this CustomsClearanceDetail.
     * 
     * @return freightOnValue   * Identifies responsibilities with respect to loss, damage, etc.
     */
    public com.fedex.rate.stub.FreightOnValueType getFreightOnValue() {
        return freightOnValue;
    }


    /**
     * Sets the freightOnValue value for this CustomsClearanceDetail.
     * 
     * @param freightOnValue   * Identifies responsibilities with respect to loss, damage, etc.
     */
    public void setFreightOnValue(com.fedex.rate.stub.FreightOnValueType freightOnValue) {
        this.freightOnValue = freightOnValue;
    }


    /**
     * Gets the insuranceCharges value for this CustomsClearanceDetail.
     * 
     * @return insuranceCharges   * Documents amount paid to third party for coverage of shipment
     * content.
     */
    public com.fedex.rate.stub.Money getInsuranceCharges() {
        return insuranceCharges;
    }


    /**
     * Sets the insuranceCharges value for this CustomsClearanceDetail.
     * 
     * @param insuranceCharges   * Documents amount paid to third party for coverage of shipment
     * content.
     */
    public void setInsuranceCharges(com.fedex.rate.stub.Money insuranceCharges) {
        this.insuranceCharges = insuranceCharges;
    }


    /**
     * Gets the partiesToTransactionAreRelated value for this CustomsClearanceDetail.
     * 
     * @return partiesToTransactionAreRelated
     */
    public java.lang.Boolean getPartiesToTransactionAreRelated() {
        return partiesToTransactionAreRelated;
    }


    /**
     * Sets the partiesToTransactionAreRelated value for this CustomsClearanceDetail.
     * 
     * @param partiesToTransactionAreRelated
     */
    public void setPartiesToTransactionAreRelated(java.lang.Boolean partiesToTransactionAreRelated) {
        this.partiesToTransactionAreRelated = partiesToTransactionAreRelated;
    }


    /**
     * Gets the commercialInvoice value for this CustomsClearanceDetail.
     * 
     * @return commercialInvoice   * CommercialInvoice element is required for electronic upload
     * of CI data. It will serve to create/transmit an Electronic Commercial
     * Invoice through FedEx System. Customers are responsible for printing
     * their own Commercial Invoice. Commercial Invoice support consists
     * of a maximum of 20 commodity line items.
     */
    public com.fedex.rate.stub.CommercialInvoice getCommercialInvoice() {
        return commercialInvoice;
    }


    /**
     * Sets the commercialInvoice value for this CustomsClearanceDetail.
     * 
     * @param commercialInvoice   * CommercialInvoice element is required for electronic upload
     * of CI data. It will serve to create/transmit an Electronic Commercial
     * Invoice through FedEx System. Customers are responsible for printing
     * their own Commercial Invoice. Commercial Invoice support consists
     * of a maximum of 20 commodity line items.
     */
    public void setCommercialInvoice(com.fedex.rate.stub.CommercialInvoice commercialInvoice) {
        this.commercialInvoice = commercialInvoice;
    }


    /**
     * Gets the commodities value for this CustomsClearanceDetail.
     * 
     * @return commodities   * For international multiple piece shipments, commodity information
     * must be passed in the Master and on each child transaction.
     *                 If this shipment cotains more than four commodities
     * line items, the four highest valued should be included in the first
     * 4 occurances for this request.
     */
    public com.fedex.rate.stub.Commodity[] getCommodities() {
        return commodities;
    }


    /**
     * Sets the commodities value for this CustomsClearanceDetail.
     * 
     * @param commodities   * For international multiple piece shipments, commodity information
     * must be passed in the Master and on each child transaction.
     *                 If this shipment cotains more than four commodities
     * line items, the four highest valued should be included in the first
     * 4 occurances for this request.
     */
    public void setCommodities(com.fedex.rate.stub.Commodity[] commodities) {
        this.commodities = commodities;
    }

    public com.fedex.rate.stub.Commodity getCommodities(int i) {
        return this.commodities[i];
    }

    public void setCommodities(int i, com.fedex.rate.stub.Commodity _value) {
        this.commodities[i] = _value;
    }


    /**
     * Gets the exportDetail value for this CustomsClearanceDetail.
     * 
     * @return exportDetail   * Country specific details of an International shipment.
     */
    public com.fedex.rate.stub.ExportDetail getExportDetail() {
        return exportDetail;
    }


    /**
     * Sets the exportDetail value for this CustomsClearanceDetail.
     * 
     * @param exportDetail   * Country specific details of an International shipment.
     */
    public void setExportDetail(com.fedex.rate.stub.ExportDetail exportDetail) {
        this.exportDetail = exportDetail;
    }


    /**
     * Gets the regulatoryControls value for this CustomsClearanceDetail.
     * 
     * @return regulatoryControls   * FOOD_OR_PERISHABLE is required by FDA/BTA; must be true for
     * food/perishable items coming to US or PR from non-US/non-PR origin.
     */
    public com.fedex.rate.stub.RegulatoryControlType[] getRegulatoryControls() {
        return regulatoryControls;
    }


    /**
     * Sets the regulatoryControls value for this CustomsClearanceDetail.
     * 
     * @param regulatoryControls   * FOOD_OR_PERISHABLE is required by FDA/BTA; must be true for
     * food/perishable items coming to US or PR from non-US/non-PR origin.
     */
    public void setRegulatoryControls(com.fedex.rate.stub.RegulatoryControlType[] regulatoryControls) {
        this.regulatoryControls = regulatoryControls;
    }

    public com.fedex.rate.stub.RegulatoryControlType getRegulatoryControls(int i) {
        return this.regulatoryControls[i];
    }

    public void setRegulatoryControls(int i, com.fedex.rate.stub.RegulatoryControlType _value) {
        this.regulatoryControls[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomsClearanceDetail)) return false;
        CustomsClearanceDetail other = (CustomsClearanceDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.broker==null && other.getBroker()==null) || 
             (this.broker!=null &&
              this.broker.equals(other.getBroker()))) &&
            ((this.clearanceBrokerage==null && other.getClearanceBrokerage()==null) || 
             (this.clearanceBrokerage!=null &&
              this.clearanceBrokerage.equals(other.getClearanceBrokerage()))) &&
            ((this.importerOfRecord==null && other.getImporterOfRecord()==null) || 
             (this.importerOfRecord!=null &&
              this.importerOfRecord.equals(other.getImporterOfRecord()))) &&
            ((this.recipientCustomsId==null && other.getRecipientCustomsId()==null) || 
             (this.recipientCustomsId!=null &&
              this.recipientCustomsId.equals(other.getRecipientCustomsId()))) &&
            ((this.dutiesPayment==null && other.getDutiesPayment()==null) || 
             (this.dutiesPayment!=null &&
              this.dutiesPayment.equals(other.getDutiesPayment()))) &&
            ((this.documentContent==null && other.getDocumentContent()==null) || 
             (this.documentContent!=null &&
              this.documentContent.equals(other.getDocumentContent()))) &&
            ((this.customsValue==null && other.getCustomsValue()==null) || 
             (this.customsValue!=null &&
              this.customsValue.equals(other.getCustomsValue()))) &&
            ((this.freightOnValue==null && other.getFreightOnValue()==null) || 
             (this.freightOnValue!=null &&
              this.freightOnValue.equals(other.getFreightOnValue()))) &&
            ((this.insuranceCharges==null && other.getInsuranceCharges()==null) || 
             (this.insuranceCharges!=null &&
              this.insuranceCharges.equals(other.getInsuranceCharges()))) &&
            ((this.partiesToTransactionAreRelated==null && other.getPartiesToTransactionAreRelated()==null) || 
             (this.partiesToTransactionAreRelated!=null &&
              this.partiesToTransactionAreRelated.equals(other.getPartiesToTransactionAreRelated()))) &&
            ((this.commercialInvoice==null && other.getCommercialInvoice()==null) || 
             (this.commercialInvoice!=null &&
              this.commercialInvoice.equals(other.getCommercialInvoice()))) &&
            ((this.commodities==null && other.getCommodities()==null) || 
             (this.commodities!=null &&
              java.util.Arrays.equals(this.commodities, other.getCommodities()))) &&
            ((this.exportDetail==null && other.getExportDetail()==null) || 
             (this.exportDetail!=null &&
              this.exportDetail.equals(other.getExportDetail()))) &&
            ((this.regulatoryControls==null && other.getRegulatoryControls()==null) || 
             (this.regulatoryControls!=null &&
              java.util.Arrays.equals(this.regulatoryControls, other.getRegulatoryControls())));
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
        if (getBroker() != null) {
            _hashCode += getBroker().hashCode();
        }
        if (getClearanceBrokerage() != null) {
            _hashCode += getClearanceBrokerage().hashCode();
        }
        if (getImporterOfRecord() != null) {
            _hashCode += getImporterOfRecord().hashCode();
        }
        if (getRecipientCustomsId() != null) {
            _hashCode += getRecipientCustomsId().hashCode();
        }
        if (getDutiesPayment() != null) {
            _hashCode += getDutiesPayment().hashCode();
        }
        if (getDocumentContent() != null) {
            _hashCode += getDocumentContent().hashCode();
        }
        if (getCustomsValue() != null) {
            _hashCode += getCustomsValue().hashCode();
        }
        if (getFreightOnValue() != null) {
            _hashCode += getFreightOnValue().hashCode();
        }
        if (getInsuranceCharges() != null) {
            _hashCode += getInsuranceCharges().hashCode();
        }
        if (getPartiesToTransactionAreRelated() != null) {
            _hashCode += getPartiesToTransactionAreRelated().hashCode();
        }
        if (getCommercialInvoice() != null) {
            _hashCode += getCommercialInvoice().hashCode();
        }
        if (getCommodities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommodities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommodities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExportDetail() != null) {
            _hashCode += getExportDetail().hashCode();
        }
        if (getRegulatoryControls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegulatoryControls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegulatoryControls(), i);
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
        new org.apache.axis.description.TypeDesc(CustomsClearanceDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomsClearanceDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("broker");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Broker"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Party"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearanceBrokerage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ClearanceBrokerage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ClearanceBrokerageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importerOfRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ImporterOfRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Party"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientCustomsId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RecipientCustomsId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RecipientCustomsId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dutiesPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DutiesPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Payment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DocumentContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "InternationalDocumentContentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomsValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freightOnValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FreightOnValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FreightOnValueType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuranceCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "InsuranceCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partiesToTransactionAreRelated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "PartiesToTransactionAreRelated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commercialInvoice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CommercialInvoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CommercialInvoice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commodities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Commodities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Commodity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exportDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ExportDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ExportDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regulatoryControls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RegulatoryControls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RegulatoryControlType"));
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
