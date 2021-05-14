
package br.com.caelum.estoque.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.caelum.estoque.cliente package. 
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

    private final static QName _AutorizacaoFault_QNAME = new QName("http://ws/", "AutorizacaoFault");
    private final static QName _ListaItens_QNAME = new QName("http://ws/", "listaItens");
    private final static QName _CadastrarItem2Response_QNAME = new QName("http://ws/", "CadastrarItem2Response");
    private final static QName _Filtros_QNAME = new QName("http://ws/", "filtros");
    private final static QName _CadastrarItemResponse_QNAME = new QName("http://ws/", "CadastrarItemResponse");
    private final static QName _TodosOsItens_QNAME = new QName("http://ws/", "todosOsItens");
    private final static QName _CadastrarItem_QNAME = new QName("http://ws/", "CadastrarItem");
    private final static QName _TodosOsItensResponse_QNAME = new QName("http://ws/", "todosOsItensResponse");
    private final static QName _Item_QNAME = new QName("http://ws/", "item");
    private final static QName _TokenUsuario_QNAME = new QName("http://ws/", "tokenUsuario");
    private final static QName _CadastrarItem2_QNAME = new QName("http://ws/", "CadastrarItem2");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.caelum.estoque.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CadastrarItem2 }
     * 
     */
    public CadastrarItem2 createCadastrarItem2() {
        return new CadastrarItem2();
    }

    /**
     * Create an instance of {@link TokenUsuario }
     * 
     */
    public TokenUsuario createTokenUsuario() {
        return new TokenUsuario();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link TodosOsItensResponse }
     * 
     */
    public TodosOsItensResponse createTodosOsItensResponse() {
        return new TodosOsItensResponse();
    }

    /**
     * Create an instance of {@link CadastrarItem }
     * 
     */
    public CadastrarItem createCadastrarItem() {
        return new CadastrarItem();
    }

    /**
     * Create an instance of {@link TodosOsItens }
     * 
     */
    public TodosOsItens createTodosOsItens() {
        return new TodosOsItens();
    }

    /**
     * Create an instance of {@link CadastrarItemResponse }
     * 
     */
    public CadastrarItemResponse createCadastrarItemResponse() {
        return new CadastrarItemResponse();
    }

    /**
     * Create an instance of {@link ListaItens }
     * 
     */
    public ListaItens createListaItens() {
        return new ListaItens();
    }

    /**
     * Create an instance of {@link Filtros }
     * 
     */
    public Filtros createFiltros() {
        return new Filtros();
    }

    /**
     * Create an instance of {@link CadastrarItem2Response }
     * 
     */
    public CadastrarItem2Response createCadastrarItem2Response() {
        return new CadastrarItem2Response();
    }

    /**
     * Create an instance of {@link Filtro }
     * 
     */
    public Filtro createFiltro() {
        return new Filtro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "AutorizacaoFault")
    public JAXBElement<String> createAutorizacaoFault(String value) {
        return new JAXBElement<String>(_AutorizacaoFault_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaItens }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listaItens")
    public JAXBElement<ListaItens> createListaItens(ListaItens value) {
        return new JAXBElement<ListaItens>(_ListaItens_QNAME, ListaItens.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarItem2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "CadastrarItem2Response")
    public JAXBElement<CadastrarItem2Response> createCadastrarItem2Response(CadastrarItem2Response value) {
        return new JAXBElement<CadastrarItem2Response>(_CadastrarItem2Response_QNAME, CadastrarItem2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filtros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "filtros")
    public JAXBElement<Filtros> createFiltros(Filtros value) {
        return new JAXBElement<Filtros>(_Filtros_QNAME, Filtros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "CadastrarItemResponse")
    public JAXBElement<CadastrarItemResponse> createCadastrarItemResponse(CadastrarItemResponse value) {
        return new JAXBElement<CadastrarItemResponse>(_CadastrarItemResponse_QNAME, CadastrarItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TodosOsItens }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "todosOsItens")
    public JAXBElement<TodosOsItens> createTodosOsItens(TodosOsItens value) {
        return new JAXBElement<TodosOsItens>(_TodosOsItens_QNAME, TodosOsItens.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "CadastrarItem")
    public JAXBElement<CadastrarItem> createCadastrarItem(CadastrarItem value) {
        return new JAXBElement<CadastrarItem>(_CadastrarItem_QNAME, CadastrarItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TodosOsItensResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "todosOsItensResponse")
    public JAXBElement<TodosOsItensResponse> createTodosOsItensResponse(TodosOsItensResponse value) {
        return new JAXBElement<TodosOsItensResponse>(_TodosOsItensResponse_QNAME, TodosOsItensResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "item")
    public JAXBElement<Item> createItem(Item value) {
        return new JAXBElement<Item>(_Item_QNAME, Item.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TokenUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "tokenUsuario")
    public JAXBElement<TokenUsuario> createTokenUsuario(TokenUsuario value) {
        return new JAXBElement<TokenUsuario>(_TokenUsuario_QNAME, TokenUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarItem2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "CadastrarItem2")
    public JAXBElement<CadastrarItem2> createCadastrarItem2(CadastrarItem2 value) {
        return new JAXBElement<CadastrarItem2>(_CadastrarItem2_QNAME, CadastrarItem2 .class, null, value);
    }

}
