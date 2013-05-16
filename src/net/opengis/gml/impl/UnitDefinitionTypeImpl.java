/*
 * XML Type:  UnitDefinitionType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.UnitDefinitionType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML UnitDefinitionType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class UnitDefinitionTypeImpl extends net.opengis.gml.impl.DefinitionTypeImpl implements net.opengis.gml.UnitDefinitionType
{
    private static final long serialVersionUID = 1L;
    
    public UnitDefinitionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUANTITYTYPE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "quantityType");
    private static final javax.xml.namespace.QName CATALOGSYMBOL$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "catalogSymbol");
    
    
    /**
     * Gets the "quantityType" element
     */
    public net.opengis.gml.StringOrRefType getQuantityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().find_element_user(QUANTITYTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "quantityType" element
     */
    @Inject(optional=true) public void setQuantityType(net.opengis.gml.StringOrRefType quantityType)
    {
        generatedSetterHelperImpl(quantityType, QUANTITYTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "quantityType" element
     */
    public net.opengis.gml.StringOrRefType addNewQuantityType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().add_element_user(QUANTITYTYPE$0);
            return target;
        }
    }
    
    /**
     * Gets the "catalogSymbol" element
     */
    public net.opengis.gml.CodeType getCatalogSymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(CATALOGSYMBOL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "catalogSymbol" element
     */
    public boolean isSetCatalogSymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATALOGSYMBOL$2) != 0;
        }
    }
    
    /**
     * Sets the "catalogSymbol" element
     */
    @Inject(optional=true) public void setCatalogSymbol(net.opengis.gml.CodeType catalogSymbol)
    {
        generatedSetterHelperImpl(catalogSymbol, CATALOGSYMBOL$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "catalogSymbol" element
     */
    public net.opengis.gml.CodeType addNewCatalogSymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().add_element_user(CATALOGSYMBOL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "catalogSymbol" element
     */
    public void unsetCatalogSymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATALOGSYMBOL$2, 0);
        }
    }
}
