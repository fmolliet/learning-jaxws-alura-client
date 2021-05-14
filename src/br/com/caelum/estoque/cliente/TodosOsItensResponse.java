
package br.com.caelum.estoque.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for todosOsItensResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="todosOsItensResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" type="{http://ws/}listaItens" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "todosOsItensResponse", propOrder = {
    "item"
})
public class TodosOsItensResponse {

    protected ListaItens item;

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link ListaItens }
     *     
     */
    public ListaItens getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaItens }
     *     
     */
    public void setItem(ListaItens value) {
        this.item = value;
    }

}
