/**
 * Commodity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;


/**
 * For international multiple piece shipments, commodity information
 * must be passed in the Master and on each child transaction.
 *             If this shipment cotains more than four commodities line
 * items, the four highest valued should be included in the first 4 occurances
 * for this request.
 */
public class Commodity  implements java.io.Serializable {
    /* total number of pieces of this commodity */
    private java.lang.String name;

    /* total number of pieces of this commodity */
    private org.apache.axis.types.NonNegativeInteger numberOfPieces;

    /* Complete and accurate description of this commodity. */
    private java.lang.String description;

    /* Country code where commodity contents were produced or manufactured
     * in their final form. */
    private java.lang.String countryOfManufacture;

    /* Unique alpha/numeric representing commodity item.
     *                 At least one occurrence is required for US Export
     * shipments if the Customs Value is greater than $2500 or if a valid
     * US Export license is required. */
    private java.lang.String harmonizedCode;

    /* Total weight of this commodity. 1 explicit decimal position.
     * Max length 11 including decimal. */
    private com.fedex.rate.stub.Weight weight;

    /* Number of units of a commodity in total number of pieces for
     * this line item. Max length is 9 */
    private org.apache.axis.types.NonNegativeInteger quantity;

    /* Unit of measure used to express the quantity of this commodity
     * line item. */
    private java.lang.String quantityUnits;

    /* Contains only additional quantitative information other than
     * weight and quantity to calculate duties and taxes. */
    private com.fedex.rate.stub.Measure[] additionalMeasures;

    /* Value of each unit in Quantity. Six explicit decimal positions,
     * Max length 18 including decimal. */
    private com.fedex.rate.stub.Money unitPrice;

    /* Total customs value for this line item.
     *                 It should equal the commodity unit quantity times
     * commodity unit value.
     *                 Six explicit decimal positions, max length 18 including
     * decimal. */
    private com.fedex.rate.stub.Money customsValue;

    /* Defines additional characteristic of commodity used to calculate
     * duties and taxes */
    private com.fedex.rate.stub.EdtExciseCondition[] exciseConditions;

    /* Applicable to US export shipping only. */
    private java.lang.String exportLicenseNumber;

    private java.util.Date exportLicenseExpirationDate;

    /* An identifying mark or number used on the packaging of a shipment
     * to help customers identify a particular shipment. */
    private java.lang.String CIMarksAndNumbers;

    /* All data required for this commodity in NAFTA Certificate of
     * Origin. */
    private com.fedex.rate.stub.NaftaCommodityDetail naftaDetail;

    public Commodity() {
    }

    public Commodity(
           java.lang.String name,
           org.apache.axis.types.NonNegativeInteger numberOfPieces,
           java.lang.String description,
           java.lang.String countryOfManufacture,
           java.lang.String harmonizedCode,
           com.fedex.rate.stub.Weight weight,
           org.apache.axis.types.NonNegativeInteger quantity,
           java.lang.String quantityUnits,
           com.fedex.rate.stub.Measure[] additionalMeasures,
           com.fedex.rate.stub.Money unitPrice,
           com.fedex.rate.stub.Money customsValue,
           com.fedex.rate.stub.EdtExciseCondition[] exciseConditions,
           java.lang.String exportLicenseNumber,
           java.util.Date exportLicenseExpirationDate,
           java.lang.String CIMarksAndNumbers,
           com.fedex.rate.stub.NaftaCommodityDetail naftaDetail) {
           this.name = name;
           this.numberOfPieces = numberOfPieces;
           this.description = description;
           this.countryOfManufacture = countryOfManufacture;
           this.harmonizedCode = harmonizedCode;
           this.weight = weight;
           this.quantity = quantity;
           this.quantityUnits = quantityUnits;
           this.additionalMeasures = additionalMeasures;
           this.unitPrice = unitPrice;
           this.customsValue = customsValue;
           this.exciseConditions = exciseConditions;
           this.exportLicenseNumber = exportLicenseNumber;
           this.exportLicenseExpirationDate = exportLicenseExpirationDate;
           this.CIMarksAndNumbers = CIMarksAndNumbers;
           this.naftaDetail = naftaDetail;
    }


    /**
     * Gets the name value for this Commodity.
     * 
     * @return name   * total number of pieces of this commodity
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Commodity.
     * 
     * @param name   * total number of pieces of this commodity
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the numberOfPieces value for this Commodity.
     * 
     * @return numberOfPieces   * total number of pieces of this commodity
     */
    public org.apache.axis.types.NonNegativeInteger getNumberOfPieces() {
        return numberOfPieces;
    }


    /**
     * Sets the numberOfPieces value for this Commodity.
     * 
     * @param numberOfPieces   * total number of pieces of this commodity
     */
    public void setNumberOfPieces(org.apache.axis.types.NonNegativeInteger numberOfPieces) {
        this.numberOfPieces = numberOfPieces;
    }


    /**
     * Gets the description value for this Commodity.
     * 
     * @return description   * Complete and accurate description of this commodity.
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Commodity.
     * 
     * @param description   * Complete and accurate description of this commodity.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the countryOfManufacture value for this Commodity.
     * 
     * @return countryOfManufacture   * Country code where commodity contents were produced or manufactured
     * in their final form.
     */
    public java.lang.String getCountryOfManufacture() {
        return countryOfManufacture;
    }


    /**
     * Sets the countryOfManufacture value for this Commodity.
     * 
     * @param countryOfManufacture   * Country code where commodity contents were produced or manufactured
     * in their final form.
     */
    public void setCountryOfManufacture(java.lang.String countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }


    /**
     * Gets the harmonizedCode value for this Commodity.
     * 
     * @return harmonizedCode   * Unique alpha/numeric representing commodity item.
     *                 At least one occurrence is required for US Export
     * shipments if the Customs Value is greater than $2500 or if a valid
     * US Export license is required.
     */
    public java.lang.String getHarmonizedCode() {
        return harmonizedCode;
    }


    /**
     * Sets the harmonizedCode value for this Commodity.
     * 
     * @param harmonizedCode   * Unique alpha/numeric representing commodity item.
     *                 At least one occurrence is required for US Export
     * shipments if the Customs Value is greater than $2500 or if a valid
     * US Export license is required.
     */
    public void setHarmonizedCode(java.lang.String harmonizedCode) {
        this.harmonizedCode = harmonizedCode;
    }


    /**
     * Gets the weight value for this Commodity.
     * 
     * @return weight   * Total weight of this commodity. 1 explicit decimal position.
     * Max length 11 including decimal.
     */
    public com.fedex.rate.stub.Weight getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this Commodity.
     * 
     * @param weight   * Total weight of this commodity. 1 explicit decimal position.
     * Max length 11 including decimal.
     */
    public void setWeight(com.fedex.rate.stub.Weight weight) {
        this.weight = weight;
    }


    /**
     * Gets the quantity value for this Commodity.
     * 
     * @return quantity   * Number of units of a commodity in total number of pieces for
     * this line item. Max length is 9
     */
    public org.apache.axis.types.NonNegativeInteger getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this Commodity.
     * 
     * @param quantity   * Number of units of a commodity in total number of pieces for
     * this line item. Max length is 9
     */
    public void setQuantity(org.apache.axis.types.NonNegativeInteger quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the quantityUnits value for this Commodity.
     * 
     * @return quantityUnits   * Unit of measure used to express the quantity of this commodity
     * line item.
     */
    public java.lang.String getQuantityUnits() {
        return quantityUnits;
    }


    /**
     * Sets the quantityUnits value for this Commodity.
     * 
     * @param quantityUnits   * Unit of measure used to express the quantity of this commodity
     * line item.
     */
    public void setQuantityUnits(java.lang.String quantityUnits) {
        this.quantityUnits = quantityUnits;
    }


    /**
     * Gets the additionalMeasures value for this Commodity.
     * 
     * @return additionalMeasures   * Contains only additional quantitative information other than
     * weight and quantity to calculate duties and taxes.
     */
    public com.fedex.rate.stub.Measure[] getAdditionalMeasures() {
        return additionalMeasures;
    }


    /**
     * Sets the additionalMeasures value for this Commodity.
     * 
     * @param additionalMeasures   * Contains only additional quantitative information other than
     * weight and quantity to calculate duties and taxes.
     */
    public void setAdditionalMeasures(com.fedex.rate.stub.Measure[] additionalMeasures) {
        this.additionalMeasures = additionalMeasures;
    }

    public com.fedex.rate.stub.Measure getAdditionalMeasures(int i) {
        return this.additionalMeasures[i];
    }

    public void setAdditionalMeasures(int i, com.fedex.rate.stub.Measure _value) {
        this.additionalMeasures[i] = _value;
    }


    /**
     * Gets the unitPrice value for this Commodity.
     * 
     * @return unitPrice   * Value of each unit in Quantity. Six explicit decimal positions,
     * Max length 18 including decimal.
     */
    public com.fedex.rate.stub.Money getUnitPrice() {
        return unitPrice;
    }


    /**
     * Sets the unitPrice value for this Commodity.
     * 
     * @param unitPrice   * Value of each unit in Quantity. Six explicit decimal positions,
     * Max length 18 including decimal.
     */
    public void setUnitPrice(com.fedex.rate.stub.Money unitPrice) {
        this.unitPrice = unitPrice;
    }


    /**
     * Gets the customsValue value for this Commodity.
     * 
     * @return customsValue   * Total customs value for this line item.
     *                 It should equal the commodity unit quantity times
     * commodity unit value.
     *                 Six explicit decimal positions, max length 18 including
     * decimal.
     */
    public com.fedex.rate.stub.Money getCustomsValue() {
        return customsValue;
    }


    /**
     * Sets the customsValue value for this Commodity.
     * 
     * @param customsValue   * Total customs value for this line item.
     *                 It should equal the commodity unit quantity times
     * commodity unit value.
     *                 Six explicit decimal positions, max length 18 including
     * decimal.
     */
    public void setCustomsValue(com.fedex.rate.stub.Money customsValue) {
        this.customsValue = customsValue;
    }


    /**
     * Gets the exciseConditions value for this Commodity.
     * 
     * @return exciseConditions   * Defines additional characteristic of commodity used to calculate
     * duties and taxes
     */
    public com.fedex.rate.stub.EdtExciseCondition[] getExciseConditions() {
        return exciseConditions;
    }


    /**
     * Sets the exciseConditions value for this Commodity.
     * 
     * @param exciseConditions   * Defines additional characteristic of commodity used to calculate
     * duties and taxes
     */
    public void setExciseConditions(com.fedex.rate.stub.EdtExciseCondition[] exciseConditions) {
        this.exciseConditions = exciseConditions;
    }

    public com.fedex.rate.stub.EdtExciseCondition getExciseConditions(int i) {
        return this.exciseConditions[i];
    }

    public void setExciseConditions(int i, com.fedex.rate.stub.EdtExciseCondition _value) {
        this.exciseConditions[i] = _value;
    }


    /**
     * Gets the exportLicenseNumber value for this Commodity.
     * 
     * @return exportLicenseNumber   * Applicable to US export shipping only.
     */
    public java.lang.String getExportLicenseNumber() {
        return exportLicenseNumber;
    }


    /**
     * Sets the exportLicenseNumber value for this Commodity.
     * 
     * @param exportLicenseNumber   * Applicable to US export shipping only.
     */
    public void setExportLicenseNumber(java.lang.String exportLicenseNumber) {
        this.exportLicenseNumber = exportLicenseNumber;
    }


    /**
     * Gets the exportLicenseExpirationDate value for this Commodity.
     * 
     * @return exportLicenseExpirationDate
     */
    public java.util.Date getExportLicenseExpirationDate() {
        return exportLicenseExpirationDate;
    }


    /**
     * Sets the exportLicenseExpirationDate value for this Commodity.
     * 
     * @param exportLicenseExpirationDate
     */
    public void setExportLicenseExpirationDate(java.util.Date exportLicenseExpirationDate) {
        this.exportLicenseExpirationDate = exportLicenseExpirationDate;
    }


    /**
     * Gets the CIMarksAndNumbers value for this Commodity.
     * 
     * @return CIMarksAndNumbers   * An identifying mark or number used on the packaging of a shipment
     * to help customers identify a particular shipment.
     */
    public java.lang.String getCIMarksAndNumbers() {
        return CIMarksAndNumbers;
    }


    /**
     * Sets the CIMarksAndNumbers value for this Commodity.
     * 
     * @param CIMarksAndNumbers   * An identifying mark or number used on the packaging of a shipment
     * to help customers identify a particular shipment.
     */
    public void setCIMarksAndNumbers(java.lang.String CIMarksAndNumbers) {
        this.CIMarksAndNumbers = CIMarksAndNumbers;
    }


    /**
     * Gets the naftaDetail value for this Commodity.
     * 
     * @return naftaDetail   * All data required for this commodity in NAFTA Certificate of
     * Origin.
     */
    public com.fedex.rate.stub.NaftaCommodityDetail getNaftaDetail() {
        return naftaDetail;
    }


    /**
     * Sets the naftaDetail value for this Commodity.
     * 
     * @param naftaDetail   * All data required for this commodity in NAFTA Certificate of
     * Origin.
     */
    public void setNaftaDetail(com.fedex.rate.stub.NaftaCommodityDetail naftaDetail) {
        this.naftaDetail = naftaDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Commodity)) return false;
        Commodity other = (Commodity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.numberOfPieces==null && other.getNumberOfPieces()==null) || 
             (this.numberOfPieces!=null &&
              this.numberOfPieces.equals(other.getNumberOfPieces()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.countryOfManufacture==null && other.getCountryOfManufacture()==null) || 
             (this.countryOfManufacture!=null &&
              this.countryOfManufacture.equals(other.getCountryOfManufacture()))) &&
            ((this.harmonizedCode==null && other.getHarmonizedCode()==null) || 
             (this.harmonizedCode!=null &&
              this.harmonizedCode.equals(other.getHarmonizedCode()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.quantityUnits==null && other.getQuantityUnits()==null) || 
             (this.quantityUnits!=null &&
              this.quantityUnits.equals(other.getQuantityUnits()))) &&
            ((this.additionalMeasures==null && other.getAdditionalMeasures()==null) || 
             (this.additionalMeasures!=null &&
              java.util.Arrays.equals(this.additionalMeasures, other.getAdditionalMeasures()))) &&
            ((this.unitPrice==null && other.getUnitPrice()==null) || 
             (this.unitPrice!=null &&
              this.unitPrice.equals(other.getUnitPrice()))) &&
            ((this.customsValue==null && other.getCustomsValue()==null) || 
             (this.customsValue!=null &&
              this.customsValue.equals(other.getCustomsValue()))) &&
            ((this.exciseConditions==null && other.getExciseConditions()==null) || 
             (this.exciseConditions!=null &&
              java.util.Arrays.equals(this.exciseConditions, other.getExciseConditions()))) &&
            ((this.exportLicenseNumber==null && other.getExportLicenseNumber()==null) || 
             (this.exportLicenseNumber!=null &&
              this.exportLicenseNumber.equals(other.getExportLicenseNumber()))) &&
            ((this.exportLicenseExpirationDate==null && other.getExportLicenseExpirationDate()==null) || 
             (this.exportLicenseExpirationDate!=null &&
              this.exportLicenseExpirationDate.equals(other.getExportLicenseExpirationDate()))) &&
            ((this.CIMarksAndNumbers==null && other.getCIMarksAndNumbers()==null) || 
             (this.CIMarksAndNumbers!=null &&
              this.CIMarksAndNumbers.equals(other.getCIMarksAndNumbers()))) &&
            ((this.naftaDetail==null && other.getNaftaDetail()==null) || 
             (this.naftaDetail!=null &&
              this.naftaDetail.equals(other.getNaftaDetail())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNumberOfPieces() != null) {
            _hashCode += getNumberOfPieces().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCountryOfManufacture() != null) {
            _hashCode += getCountryOfManufacture().hashCode();
        }
        if (getHarmonizedCode() != null) {
            _hashCode += getHarmonizedCode().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getQuantityUnits() != null) {
            _hashCode += getQuantityUnits().hashCode();
        }
        if (getAdditionalMeasures() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalMeasures());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalMeasures(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnitPrice() != null) {
            _hashCode += getUnitPrice().hashCode();
        }
        if (getCustomsValue() != null) {
            _hashCode += getCustomsValue().hashCode();
        }
        if (getExciseConditions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExciseConditions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExciseConditions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExportLicenseNumber() != null) {
            _hashCode += getExportLicenseNumber().hashCode();
        }
        if (getExportLicenseExpirationDate() != null) {
            _hashCode += getExportLicenseExpirationDate().hashCode();
        }
        if (getCIMarksAndNumbers() != null) {
            _hashCode += getCIMarksAndNumbers().hashCode();
        }
        if (getNaftaDetail() != null) {
            _hashCode += getNaftaDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Commodity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Commodity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfPieces");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "NumberOfPieces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryOfManufacture");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CountryOfManufacture"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("harmonizedCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "HarmonizedCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "QuantityUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalMeasures");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "AdditionalMeasures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Measure"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "UnitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Money"));
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
        elemField.setFieldName("exciseConditions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ExciseConditions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "EdtExciseCondition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exportLicenseNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ExportLicenseNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exportLicenseExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ExportLicenseExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CIMarksAndNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CIMarksAndNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naftaDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "NaftaDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "NaftaCommodityDetail"));
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
