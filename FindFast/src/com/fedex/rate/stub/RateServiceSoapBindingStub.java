/**
 * RateServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;

public class RateServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.fedex.rate.stub.RatePortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RateRequest"), com.fedex.rate.stub.RateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RateReply"));
        oper.setReturnClass(com.fedex.rate.stub.RateReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RateReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

    }

    public RateServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public RateServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public RateServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", ">Dimensions>Height");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.NonNegativeInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", ">Dimensions>Length");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.NonNegativeInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", ">Dimensions>Width");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.NonNegativeInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "AdditionalLabelsDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.AdditionalLabelsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "AdditionalLabelsType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.AdditionalLabelsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Address");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "B13AFilingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.B13AFilingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "BarcodeSymbologyType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.BarcodeSymbologyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CarrierCodeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.CarrierCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CertificateOfOriginDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.CertificateOfOriginDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ClearanceBrokerageType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ClearanceBrokerageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ClientDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ClientDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CodAddTransportationChargesType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.CodAddTransportationChargesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CodCollectionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.CodCollectionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CodDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.CodDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CodReturnReferenceIndicatorType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.CodReturnReferenceIndicatorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CommercialInvoice");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.CommercialInvoice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CommercialInvoiceDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.CommercialInvoiceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CommitDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.CommitDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CommitmentDelayType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.CommitmentDelayType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Commodity");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.Commodity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ConfigurableLabelReferenceEntry");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ConfigurableLabelReferenceEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Contact");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.Contact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ContactAndAddress");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ContactAndAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ContentRecord");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ContentRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CurrencyExchangeRate");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.CurrencyExchangeRate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomDeliveryWindowDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.CustomDeliveryWindowDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomDeliveryWindowType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.CustomDeliveryWindowType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomDocumentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.CustomDocumentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomerImageUsage");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.CustomerImageUsage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomerImageUsageType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.CustomerImageUsageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomerReference");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.CustomerReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomerReferenceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.CustomerReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomerSpecifiedLabelDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.CustomerSpecifiedLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomLabelBarcodeEntry");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.CustomLabelBarcodeEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomLabelBoxEntry");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.CustomLabelBoxEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomLabelCoordinateUnits");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.CustomLabelCoordinateUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomLabelDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.CustomLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomLabelGraphicEntry");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.CustomLabelGraphicEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomLabelPosition");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.CustomLabelPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomLabelTextEntry");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.CustomLabelTextEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "CustomsClearanceDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.CustomsClearanceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DangerousGoodsAccessibilityType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.DangerousGoodsAccessibilityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DangerousGoodsDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.DangerousGoodsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DateRange");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.DateRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DayOfWeekType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.DayOfWeekType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DelayDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.DelayDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DelayLevelType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.DelayLevelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DelayPointType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.DelayPointType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DestinationControlDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.DestinationControlDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DestinationControlStatementType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.DestinationControlStatementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Dimensions");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.Dimensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Distance");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.Distance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DistanceUnits");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.DistanceUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DocTabContent");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.DocTabContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DocTabContentBarcoded");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.DocTabContentBarcoded.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DocTabContentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.DocTabContentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DocTabContentZone001");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.DocTabContentZone001.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DocTabZoneJustificationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.DocTabZoneJustificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DocTabZoneSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.DocTabZoneSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "DropoffType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.DropoffType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "EdtCommodityTax");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.EdtCommodityTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "EdtExciseCondition");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.EdtExciseCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "EdtRequestType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.EdtRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "EdtTaxDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.EdtTaxDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "EdtTaxType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.EdtTaxType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "EMailLabelDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.EMailLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "EMailNotificationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.EMailNotificationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "EMailNotificationFormatType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.EMailNotificationFormatType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "EMailNotificationRecipient");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.EMailNotificationRecipient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "EMailNotificationRecipientType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.EMailNotificationRecipientType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "EtdDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.EtdDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ExportDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ExportDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ExpressFreightDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ExpressFreightDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ExpressFreightDetailContact");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ExpressFreightDetailContact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ExpressRegionCode");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ExpressRegionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FedExLocationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.FedExLocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FlatbedTrailerDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.FlatbedTrailerDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FlatbedTrailerOption");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.FlatbedTrailerOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FreightAccountPaymentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.FreightAccountPaymentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FreightBaseCharge");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.FreightBaseCharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FreightBaseChargeCalculationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.FreightBaseChargeCalculationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FreightChargeBasisType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.FreightChargeBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FreightClassType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.FreightClassType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FreightCommitDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.FreightCommitDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FreightGuaranteeDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.FreightGuaranteeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FreightGuaranteeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.FreightGuaranteeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FreightOnValueType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.FreightOnValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FreightRateDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.FreightRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FreightRateNotation");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.FreightRateNotation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FreightServiceCenterDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.FreightServiceCenterDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FreightServiceSchedulingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.FreightServiceSchedulingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FreightShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.FreightShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FreightShipmentLineItem");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.FreightShipmentLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FreightShipmentRoleType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.FreightShipmentRoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "FreightSpecialServicePayment");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.FreightSpecialServicePayment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "GeneralAgencyAgreementDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.GeneralAgencyAgreementDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "HazardousCommodityContent");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.HazardousCommodityContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "HazardousCommodityDescription");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.HazardousCommodityDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "HazardousCommodityLabelTextOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.HazardousCommodityLabelTextOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "HazardousCommodityOptionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.HazardousCommodityOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "HazardousCommodityOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.HazardousCommodityOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "HazardousCommodityPackagingDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.HazardousCommodityPackagingDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "HazardousCommodityPackingGroupType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.HazardousCommodityPackingGroupType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "HazardousCommodityQuantityDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.HazardousCommodityQuantityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "HoldAtLocationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.HoldAtLocationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "HomeDeliveryPremiumDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.HomeDeliveryPremiumDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "HomeDeliveryPremiumType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.HomeDeliveryPremiumType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ImageId");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ImageId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "InternationalDocumentContentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.InternationalDocumentContentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "LabelFormatType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.LabelFormatType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "LabelMaskableDataType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.LabelMaskableDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "LabelPrintingOrientationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.LabelPrintingOrientationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "LabelRotationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.LabelRotationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "LabelSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.LabelSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "LabelStockType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.LabelStockType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "LiabilityCoverageDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.LiabilityCoverageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "LiabilityCoverageType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.LiabilityCoverageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "LinearMeasure");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.LinearMeasure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "LinearUnits");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.LinearUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Localization");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.Localization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Measure");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.Measure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "MinimumChargeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.MinimumChargeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Money");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.Money.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "NaftaCertificateOfOriginDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.NaftaCertificateOfOriginDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "NaftaCommodityDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.NaftaCommodityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "NaftaImporterSpecificationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.NaftaImporterSpecificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "NaftaNetCostMethodCode");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.NaftaNetCostMethodCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "NaftaPreferenceCriterionCode");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.NaftaPreferenceCriterionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "NaftaProducer");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.NaftaProducer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "NaftaProducerDeterminationCode");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.NaftaProducerDeterminationCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "NaftaProducerSpecificationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.NaftaProducerSpecificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Notification");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.Notification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "NotificationParameter");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.NotificationParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "NotificationSeverityType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.NotificationSeverityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Op900Detail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.Op900Detail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "OversizeClassType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.OversizeClassType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "PackageRateDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.PackageRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "PackageSpecialServicesRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.PackageSpecialServicesRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "PackageSpecialServiceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.PackageSpecialServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "PackagingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.PackagingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Party");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.Party.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Payment");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.Payment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "PaymentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.PaymentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Payor");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.Payor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "PendingShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.PendingShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "PendingShipmentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.PendingShipmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "PhysicalPackagingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.PhysicalPackagingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "PickupDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.PickupDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "PickupRequestSourceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.PickupRequestSourceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "PickupRequestType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.PickupRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "PricingCodeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.PricingCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "PriorityAlertDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.PriorityAlertDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "PurposeOfShipmentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.PurposeOfShipmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RateDimensionalDivisorType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.RateDimensionalDivisorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RateDiscount");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.RateDiscount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RateDiscountType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.RateDiscountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RatedPackageDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.RatedPackageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RatedShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.RatedShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RatedWeightMethod");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.RatedWeightMethod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RateReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.RateReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RateReplyDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.RateReplyDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RateRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.RateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RateRequestType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.RateRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Rebate");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.Rebate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RebateType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.RebateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RecipientCustomsId");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.RecipientCustomsId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RecipientCustomsIdType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.RecipientCustomsIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RegulatoryControlType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.RegulatoryControlType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RequestedPackageDetailType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.RequestedPackageDetailType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RequestedPackageLineItem");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.RequestedPackageLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RequestedShipment");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.RequestedShipment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RequestedShippingDocumentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.RequestedShippingDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RequiredShippingDocumentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.RequiredShippingDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ReturnedRateType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ReturnedRateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ReturnEMailAllowedSpecialServiceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ReturnEMailAllowedSpecialServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ReturnEMailDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ReturnEMailDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ReturnShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ReturnShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ReturnType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ReturnType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Rma");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.Rma.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ServiceOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ServiceOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ServiceSubOptionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ServiceSubOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ServiceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ShipmentDryIceDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ShipmentDryIceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ShipmentRateDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ShipmentRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ShipmentSpecialServicesRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ShipmentSpecialServicesRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ShipmentSpecialServiceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ShipmentSpecialServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ShippingDocumentDispositionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ShippingDocumentDispositionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ShippingDocumentDispositionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ShippingDocumentDispositionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ShippingDocumentEMailDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ShippingDocumentEMailDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ShippingDocumentEMailGroupingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ShippingDocumentEMailGroupingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ShippingDocumentEMailRecipient");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ShippingDocumentEMailRecipient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ShippingDocumentFormat");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ShippingDocumentFormat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ShippingDocumentGroupingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ShippingDocumentGroupingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ShippingDocumentImageType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ShippingDocumentImageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ShippingDocumentPrintDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ShippingDocumentPrintDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ShippingDocumentSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ShippingDocumentSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "ShippingDocumentStockType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.ShippingDocumentStockType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "SignatureOptionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.SignatureOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "SignatureOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.SignatureOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "SmartPostAncillaryEndorsementType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.SmartPostAncillaryEndorsementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "SmartPostIndiciaType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.SmartPostIndiciaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "SmartPostShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.SmartPostShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "SpecialRatingAppliedType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.SpecialRatingAppliedType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Surcharge");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.Surcharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "SurchargeLevelType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.SurchargeLevelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "SurchargeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.SurchargeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Tax");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.Tax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "TaxpayerIdentification");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.TaxpayerIdentification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "TaxType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.TaxType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "TermsOfSaleType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.TermsOfSaleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "TinType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.TinType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "TrackingId");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.TrackingId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "TrackingIdType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.TrackingIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "TransactionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.TransactionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "TransitTimeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.TransitTimeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "UploadDocumentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.UploadDocumentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "UploadDocumentIdProducer");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.UploadDocumentIdProducer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "UploadDocumentProducerType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.UploadDocumentProducerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "UploadDocumentReferenceDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.UploadDocumentReferenceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "UploadDocumentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.UploadDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "VariableHandlingChargeDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.VariableHandlingChargeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "VariableHandlingCharges");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.VariableHandlingCharges.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "VariableHandlingChargeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.VariableHandlingChargeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "VersionId");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.VersionId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Volume");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.Volume.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "VolumeUnits");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.VolumeUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "WebAuthenticationCredential");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.WebAuthenticationCredential.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "WebAuthenticationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.WebAuthenticationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "Weight");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.Weight.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "WeightUnits");
            cachedSerQNames.add(qName);
            cls = com.fedex.rate.stub.WeightUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.fedex.rate.stub.RateReply getRates(com.fedex.rate.stub.RateRequest rateRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getRates");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getRates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.rate.stub.RateReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.rate.stub.RateReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.rate.stub.RateReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
