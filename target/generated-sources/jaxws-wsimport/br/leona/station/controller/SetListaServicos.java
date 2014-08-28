
package br.leona.station.controller;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SetListaServicos complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SetListaServicos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaServicos" type="{http://controller.station.leona.br/}servico" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetListaServicos", propOrder = {
    "listaServicos"
})
public class SetListaServicos {

    protected List<Servico> listaServicos;

    /**
     * Gets the value of the listaServicos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaServicos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaServicos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Servico }
     * 
     * 
     */
    public List<Servico> getListaServicos() {
        if (listaServicos == null) {
            listaServicos = new ArrayList<Servico>();
        }
        return this.listaServicos;
    }

}
