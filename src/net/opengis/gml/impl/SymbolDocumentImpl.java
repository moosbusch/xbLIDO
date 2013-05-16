/*
 * An XML document type.
 * Localname: symbol
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SymbolDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one symbol(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SymbolDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.SymbolDocument
{
    private static final long serialVersionUID = 1L;
    
    public SymbolDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYMBOL$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "symbol");
    
    
    /**
     * Gets the "symbol" element
     */
    public net.opengis.gml.SymbolType getSymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SymbolType target = null;
            target = (net.opengis.gml.SymbolType)get_store().find_element_user(SYMBOL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "symbol" element
     */
    @Inject(optional=true) public void setSymbol(net.opengis.gml.SymbolType symbol)
    {
        generatedSetterHelperImpl(symbol, SYMBOL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "symbol" element
     */
    public net.opengis.gml.SymbolType addNewSymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SymbolType target = null;
            target = (net.opengis.gml.SymbolType)get_store().add_element_user(SYMBOL$0);
            return target;
        }
    }
}
