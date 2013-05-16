/*
 * An XML document type.
 * Localname: _Style
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.StyleDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _Style(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class StyleDocumentImpl extends net.opengis.gml.impl.GMLDocumentImpl implements net.opengis.gml.StyleDocument
{
    private static final long serialVersionUID = 1L;
    
    public StyleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STYLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Style");
    private static final org.apache.xmlbeans.QNameSet STYLE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Style"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Style"),
    });
    
    
    /**
     * Gets the "_Style" element
     */
    public net.opengis.gml.AbstractStyleType getStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractStyleType target = null;
            target = (net.opengis.gml.AbstractStyleType)get_store().find_element_user(STYLE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_Style" element
     */
    @Inject(optional=true) public void setStyle(net.opengis.gml.AbstractStyleType style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractStyleType target = null;
            target = (net.opengis.gml.AbstractStyleType)get_store().find_element_user(STYLE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractStyleType)get_store().add_element_user(STYLE$0);
            }
            target.set(style);
        }
    }
    
    /**
     * Appends and returns a new empty "_Style" element
     */
    public net.opengis.gml.AbstractStyleType addNewStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractStyleType target = null;
            target = (net.opengis.gml.AbstractStyleType)get_store().add_element_user(STYLE$0);
            return target;
        }
    }
}
