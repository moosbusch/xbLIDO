/*
 * An XML document type.
 * Localname: history
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.HistoryDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one history(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class HistoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.HistoryDocument
{
    private static final long serialVersionUID = 1L;
    
    public HistoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HISTORY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "history");
    private static final org.apache.xmlbeans.QNameSet HISTORY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "track"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "history"),
    });
    
    
    /**
     * Gets the "history" element
     */
    public net.opengis.gml.HistoryPropertyType getHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.HistoryPropertyType target = null;
            target = (net.opengis.gml.HistoryPropertyType)get_store().find_element_user(HISTORY$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "history" element
     */
    @Inject(optional=true) public void setHistory(net.opengis.gml.HistoryPropertyType history)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.HistoryPropertyType target = null;
            target = (net.opengis.gml.HistoryPropertyType)get_store().find_element_user(HISTORY$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.HistoryPropertyType)get_store().add_element_user(HISTORY$0);
            }
            target.set(history);
        }
    }
    
    /**
     * Appends and returns a new empty "history" element
     */
    public net.opengis.gml.HistoryPropertyType addNewHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.HistoryPropertyType target = null;
            target = (net.opengis.gml.HistoryPropertyType)get_store().add_element_user(HISTORY$0);
            return target;
        }
    }
}
