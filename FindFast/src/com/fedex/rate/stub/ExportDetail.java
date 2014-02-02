/**
 * ExportDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;


/**
 * Country specific details of an International shipment.
 */
public class ExportDetail  implements java.io.Serializable {
    /* Specifies which filing option is being exercised by the customer.
     * Required for non-document shipments originating in Canada destined
     * for any country other than Canada, the United States, Puerto Rico
     * or the U.S. Virgin Islands. */
    private com.fedex.rate.stub.B13AFilingOptionType b13AFilingOption;

    /* Required only if B13AFilingOption is one of the following:
     *                 FILED_ELECTRONICALLY
     *                 MANUALLY_ATTACHED
     *                 SUMMARY_REPORTING
     *                 If B13AFilingOption = NOT_REQUIRED, this field should
     * contain a valid B13A Exception Number. */
    private java.lang.String exportComplianceStatement;

    /* This field is applicable only to Canada export non-document
     * shipments of any value to any destination. No special characters allowed. */
    private java.lang.String permitNumber;

    /* Department of Commerce/Department of State information about
     * this shipment. */
    private com.fedex.rate.stub.DestinationControlDetail destinationControlDetail;

    public ExportDetail() {
    }

    public ExportDetail(
           com.fedex.rate.stub.B13AFilingOptionType b13AFilingOption,
           java.lang.String exportComplianceStatement,
           java.lang.String permitNumber,
           com.fedex.rate.stub.DestinationControlDetail destinationControlDetail) {
           this.b13AFilingOption = b13AFilingOption;
           this.exportComplianceStatement = exportComplianceStatement;
           this.permitNumber = permitNumber;
           this.destinationControlDetail = destinationControlDetail;
    }


    /**
     * Gets the b13AFilingOption value for this ExportDetail.
     * 
     * @return b13AFilingOption   * Specifies which filing option is being exercised by the customer.
     * Required for non-document shipments originating in Canada destined
     * for any country other than Canada, the United States, Puerto Rico
     * or the U.S. Virgin Islands.
     */
    public com.fedex.rate.stub.B13AFilingOptionType getB13AFilingOption() {
        return b13AFilingOption;
    }


    /**
     * Sets the b13AFilingOption value for this ExportDetail.
     * 
     * @param b13AFilingOption   * Specifies which filing option is being exercised by the customer.
     * Required for non-document shipments originating in Canada destined
     * for any country other than Canada, the United States, Puerto Rico
     * or the U.S. Virgin Islands.
     */
    public void setB13AFilingOption(com.fedex.rate.stub.B13AFilingOptionType b13AFilingOption) {
        this.b13AFilingOption = b13AFilingOption;
    }


    /**
     * Gets the exportComplianceStatement value for this ExportDetail.
     * 
     * @return exportComplianceStatement   * Required only if B13AFilingOption is one of the following:
     *                 FILED_ELECTRONICALLY
     *                 MANUALLY_ATTACHED
     *                 SUMMARY_REPORTING
     *                 If B13AFilingOption = NOT_REQUIRED, this field should
     * contain a valid B13A Exception Number.
     */
    public java.lang.String getExportComplianceStatement() {
        return exportComplianceStatement;
    }


    /**
     * Sets the exportComplianceStatement value for this ExportDetail.
     * 
     * @param exportComplianceStatement   * Required only if B13AFilingOption is one of the following:
     *                 FILED_ELECTRONICALLY
     *                 MANUALLY_ATTACHED
     *                 SUMMARY_REPORTING
     *                 If B13AFilingOption = NOT_REQUIRED, this field should
     * contain a valid B13A Exception Number.
     */
    public void setExportComplianceStatement(java.lang.String exportComplianceStatement) {
        this.exportComplianceStatement = exportComplianceStatement;
    }


    /**
     * Gets the permitNumber value for this ExportDetail.
     * 
     * @return permitNumber   * This field is applicable only to Canada export non-document
     * shipments of any value to any destination. No special characters allowed.
     */
    public java.lang.String getPermitNumber() {
        return permitNumber;
    }


    /**
     * Sets the permitNumber value for this ExportDetail.
     * 
     * @param permitNumber   * This field is applicable only to Canada export non-document
     * shipments of any value to any destination. No special characters allowed.
     */
    public void setPermitNumber(java.lang.String permitNumber) {
        this.permitNumber = permitNumber;
    }


    /**
     * Gets the destinationControlDetail value for this ExportDetail.
     * 
     * @return destinationControlDetail   * Department of Commerce/Department of State information about
     * this shipment.
     */
    public com.fedex.rate.stub.DestinationControlDetail getDestinationControlDetail() {
        return destinationControlDetail;
    }


    /**
     * Sets the destinationControlDetail value for this ExportDetail.
     * 
     * @param destinationControlDetail   * Department of Commerce/Department of State information about
     * this shipment.
     */
    public void setDestinationControlDetail(com.fedex.rate.stub.DestinationControlDetail destinationControlDetail) {
        this.destinationControlDetail = destinationControlDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExportDetail)) return false;
        ExportDetail other = (ExportDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.b13AFilingOption==null && other.getB13AFilingOption()==null) || 
             (this.b13AFilingOption!=null &&
              this.b13AFilingOption.equals(other.getB13AFilingOption()))) &&
            ((this.exportComplianceStatement==null && other.getExportComplianceStatement()==null) || 
             (this.exportComplianceStatement!=null &&
              this.exportComplianceStatement.equals(other.getExportComplianceStatement()))) &&
            ((this.permitNumber==null && other.getPermitNumber()==null) || 
             (this.permitNumber!=null &&
              this.permitNumber.equals(other.getPermitNumber()))) &&
            ((this.destinationControlDetail==null && other.getDestinationControlDetail()==null) || 
             (this.destinationControlDetail!=null &&
              this.destinationControlDetail.equals(other.getDestinationControlDetail())));
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
        if (getB13AFilingOption() != null) {
            _hashCode += getB13AFilingOption().hashCode();
        }
        if (getExportComplianceStatement() != null) {
            _hashCode += getExportComplianceStatement().hashCode();
        }
        if (getPermitNumber() != null) {
            _hashCode += getPermitNumber().hashCode();
        }
        if (getDestinationControlDetail() != null) {
            _hashCode += getDestinationControlDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExportDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ExportDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("b13AFilingOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "B13AFilingOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "B13AFilingOptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exportComplianceStatement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ExportComplianceStatement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permitNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "PermitNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationControlDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DestinationControlDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DestinationControlDetail"));
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
