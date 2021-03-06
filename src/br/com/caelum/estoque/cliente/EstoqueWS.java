
package br.com.caelum.estoque.cliente;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EstoqueWS", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EstoqueWS {


    /**
     * 
     * @param tokenUsuario
     * @param parameters
     * @return
     *     returns br.com.caelum.estoque.cliente.CadastrarItem2Response
     * @throws AutorizacaoException
     */
    @WebMethod(operationName = "CadastrarItem2")
    @WebResult(name = "CadastrarItem2Response", targetNamespace = "http://ws/", partName = "result")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input = "http://ws/EstoqueWS/CadastrarItem2Request", output = "http://ws/EstoqueWS/CadastrarItem2Response", fault = {
        @FaultAction(className = AutorizacaoException.class, value = "http://ws/EstoqueWS/CadastrarItem2/Fault/AutorizacaoException")
    })
    public CadastrarItem2Response cadastrarItem2(
        @WebParam(name = "CadastrarItem2", targetNamespace = "http://ws/", partName = "parameters")
        CadastrarItem2 parameters,
        @WebParam(name = "tokenUsuario", targetNamespace = "http://ws/", header = true, partName = "tokenUsuario")
        TokenUsuario tokenUsuario)
        throws AutorizacaoException
    ;

    /**
     * 
     * @param tokenUsuario
     * @param parameters
     * @return
     *     returns br.com.caelum.estoque.cliente.CadastrarItemResponse
     * @throws AutorizacaoException
     */
    @WebMethod(operationName = "CadastrarItem", action = "CadastrarItem")
    @WebResult(name = "CadastrarItemResponse", targetNamespace = "http://ws/", partName = "result")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input = "CadastrarItem", output = "http://ws/EstoqueWS/CadastrarItemResponse", fault = {
        @FaultAction(className = AutorizacaoException.class, value = "http://ws/EstoqueWS/CadastrarItem/Fault/AutorizacaoException")
    })
    public CadastrarItemResponse cadastrarItem(
        @WebParam(name = "CadastrarItem", targetNamespace = "http://ws/", partName = "parameters")
        CadastrarItem parameters,
        @WebParam(name = "tokenUsuario", targetNamespace = "http://ws/", header = true, partName = "tokenUsuario")
        TokenUsuario tokenUsuario)
        throws AutorizacaoException
    ;

    /**
     * 
     * @param filtros
     * @return
     *     returns br.com.caelum.estoque.cliente.ListaItens
     */
    @WebMethod
    @WebResult(name = "item", targetNamespace = "")
    @RequestWrapper(localName = "todosOsItens", targetNamespace = "http://ws/", className = "br.com.caelum.estoque.cliente.TodosOsItens")
    @ResponseWrapper(localName = "todosOsItensResponse", targetNamespace = "http://ws/", className = "br.com.caelum.estoque.cliente.TodosOsItensResponse")
    @Action(input = "http://ws/EstoqueWS/todosOsItensRequest", output = "http://ws/EstoqueWS/todosOsItensResponse")
    public ListaItens todosOsItens(
        @WebParam(name = "filtros", targetNamespace = "")
        Filtros filtros);

}
