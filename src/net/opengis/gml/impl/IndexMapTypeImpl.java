/*
 * XML Type:  IndexMapType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.IndexMapType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML IndexMapType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class IndexMapTypeImpl extends net.opengis.gml.impl.GridFunctionTypeImpl implements net.opengis.gml.IndexMapType
{
    private static final long serialVersionUID = 1L;
    
    public IndexMapTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOOKUPTABLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "lookUpTable");
    
    
    /**
     * Gets the "lookUpTable" element
     */
    public java.util.List getLookUpTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOOKUPTABLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "lookUpTable" element
     */
    public net.opengis.gml.IntegerList xgetLookUpTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IntegerList target = null;
            target = (net.opengis.gml.IntegerList)get_store().find_element_user(LOOKUPTABLE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "lookUpTable" element
     */
    @Inject(optional=true) public void setLookUpTable(java.util.List lookUpTable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOOKUPTABLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOOKUPTABLE$0);
            }
            target.setListValue(lookUpTable);
        }
    }
    
    /**
     * Sets (as xml) the "lookUpTable" element
     */
    public void xsetLookUpTable(net.opengis.gml.IntegerList lookUpTable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IntegerList target = null;
            target = (net.opengis.gml.IntegerList)get_store().find_element_user(LOOKUPTABLE$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.IntegerList)get_store().add_element_user(LOOKUPTABLE$0);
            }
            target.set(lookUpTable);
        }
    }
}
