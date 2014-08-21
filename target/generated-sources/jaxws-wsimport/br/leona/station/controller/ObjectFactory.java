
package br.leona.station.controller;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.leona.station.controller package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SetListaServicos_QNAME = new QName("http://controller.station.leona.br/", "SetListaServicos");
    private final static QName _GetListaServicosResponse_QNAME = new QName("http://controller.station.leona.br/", "GetListaServicosResponse");
    private final static QName _GetListaServicos_QNAME = new QName("http://controller.station.leona.br/", "GetListaServicos");
    private final static QName _SetListaServicosResponse_QNAME = new QName("http://controller.station.leona.br/", "SetListaServicosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.leona.station.controller
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetListaServicos }
     * 
     */
    public SetListaServicos createSetListaServicos() {
        return new SetListaServicos();
    }

    /**
     * Create an instance of {@link SetListaServicosResponse }
     * 
     */
    public SetListaServicosResponse createSetListaServicosResponse() {
        return new SetListaServicosResponse();
    }

    /**
     * Create an instance of {@link GetListaServicosResponse }
     * 
     */
    public GetListaServicosResponse createGetListaServicosResponse() {
        return new GetListaServicosResponse();
    }

    /**
     * Create an instance of {@link GetListaServicos }
     * 
     */
    public GetListaServicos createGetListaServicos() {
        return new GetListaServicos();
    }

    /**
     * Create an instance of {@link Servico }
     * 
     */
    public Servico createServico() {
        return new Servico();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetListaServicos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.station.leona.br/", name = "SetListaServicos")
    public JAXBElement<SetListaServicos> createSetListaServicos(SetListaServicos value) {
        return new JAXBElement<SetListaServicos>(_SetListaServicos_QNAME, SetListaServicos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListaServicosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.station.leona.br/", name = "GetListaServicosResponse")
    public JAXBElement<GetListaServicosResponse> createGetListaServicosResponse(GetListaServicosResponse value) {
        return new JAXBElement<GetListaServicosResponse>(_GetListaServicosResponse_QNAME, GetListaServicosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListaServicos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.station.leona.br/", name = "GetListaServicos")
    public JAXBElement<GetListaServicos> createGetListaServicos(GetListaServicos value) {
        return new JAXBElement<GetListaServicos>(_GetListaServicos_QNAME, GetListaServicos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetListaServicosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.station.leona.br/", name = "SetListaServicosResponse")
    public JAXBElement<SetListaServicosResponse> createSetListaServicosResponse(SetListaServicosResponse value) {
        return new JAXBElement<SetListaServicosResponse>(_SetListaServicosResponse_QNAME, SetListaServicosResponse.class, null, value);
    }

}
