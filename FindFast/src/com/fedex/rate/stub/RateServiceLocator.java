/**
 * RateServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.rate.stub;

public class RateServiceLocator extends org.apache.axis.client.Service implements com.fedex.rate.stub.RateService {

    public RateServiceLocator() {
    }


    public RateServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RateServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RateServicePort
    private java.lang.String RateServicePort_address = "https://wsbeta.fedex.com:443/web-services/rate";

    public java.lang.String getRateServicePortAddress() {
        return RateServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RateServicePortWSDDServiceName = "RateServicePort";

    public java.lang.String getRateServicePortWSDDServiceName() {
        return RateServicePortWSDDServiceName;
    }

    public void setRateServicePortWSDDServiceName(java.lang.String name) {
        RateServicePortWSDDServiceName = name;
    }

    public com.fedex.rate.stub.RatePortType getRateServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RateServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRateServicePort(endpoint);
    }

    public com.fedex.rate.stub.RatePortType getRateServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.fedex.rate.stub.RateServiceSoapBindingStub _stub = new com.fedex.rate.stub.RateServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getRateServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRateServicePortEndpointAddress(java.lang.String address) {
        RateServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.fedex.rate.stub.RatePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.fedex.rate.stub.RateServiceSoapBindingStub _stub = new com.fedex.rate.stub.RateServiceSoapBindingStub(new java.net.URL(RateServicePort_address), this);
                _stub.setPortName(getRateServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("RateServicePort".equals(inputPortName)) {
            return getRateServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RateService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v9", "RateServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RateServicePort".equals(portName)) {
            setRateServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
