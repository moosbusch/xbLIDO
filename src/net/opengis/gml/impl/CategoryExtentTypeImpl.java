/*
 * XML Type:  CategoryExtentType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CategoryExtentType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML CategoryExtentType(@http://www.opengis.net/gml).
 *
 * This is a list type whose items are net.opengis.gml.NameOrNull.
 */
public class CategoryExtentTypeImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements net.opengis.gml.CategoryExtentType
{
    private static final long serialVersionUID = 1L;
    
    public CategoryExtentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected CategoryExtentTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName CODESPACE$0 = 
        new javax.xml.namespace.QName("", "codeSpace");
    
    
    /**
     * Gets the "codeSpace" attribute
     */
    public java.lang.String getCodeSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESPACE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codeSpace" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetCodeSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(CODESPACE$0);
            return target;
        }
    }
    
    /**
     * True if has "codeSpace" attribute
     */
    public boolean isSetCodeSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CODESPACE$0) != null;
        }
    }
    
    /**
     * Sets the "codeSpace" attribute
     */
    @Inject(optional=true) public void setCodeSpace(java.lang.String codeSpace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESPACE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODESPACE$0);
            }
            target.setStringValue(codeSpace);
        }
    }
    
    /**
     * Sets (as xml) the "codeSpace" attribute
     */
    public void xsetCodeSpace(org.apache.xmlbeans.XmlAnyURI codeSpace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(CODESPACE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(CODESPACE$0);
            }
            target.set(codeSpace);
        }
    }
    
    /**
     * Unsets the "codeSpace" attribute
     */
    public void unsetCodeSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CODESPACE$0);
        }
    }
}
