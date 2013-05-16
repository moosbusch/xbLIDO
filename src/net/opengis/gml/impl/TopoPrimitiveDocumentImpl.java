/*
 * An XML document type.
 * Localname: _TopoPrimitive
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TopoPrimitiveDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _TopoPrimitive(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TopoPrimitiveDocumentImpl extends net.opengis.gml.impl.TopologyDocumentImpl implements net.opengis.gml.TopoPrimitiveDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopoPrimitiveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOPRIMITIVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TopoPrimitive");
    private static final org.apache.xmlbeans.QNameSet TOPOPRIMITIVE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Edge"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Face"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TopoSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TopoPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Node"),
    });
    
    
    /**
     * Gets the "_TopoPrimitive" element
     */
    public net.opengis.gml.AbstractTopoPrimitiveType getTopoPrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTopoPrimitiveType target = null;
            target = (net.opengis.gml.AbstractTopoPrimitiveType)get_store().find_element_user(TOPOPRIMITIVE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_TopoPrimitive" element
     */
    @Inject(optional=true) public void setTopoPrimitive(net.opengis.gml.AbstractTopoPrimitiveType topoPrimitive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTopoPrimitiveType target = null;
            target = (net.opengis.gml.AbstractTopoPrimitiveType)get_store().find_element_user(TOPOPRIMITIVE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractTopoPrimitiveType)get_store().add_element_user(TOPOPRIMITIVE$0);
            }
            target.set(topoPrimitive);
        }
    }
    
    /**
     * Appends and returns a new empty "_TopoPrimitive" element
     */
    public net.opengis.gml.AbstractTopoPrimitiveType addNewTopoPrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractTopoPrimitiveType target = null;
            target = (net.opengis.gml.AbstractTopoPrimitiveType)get_store().add_element_user(TOPOPRIMITIVE$0);
            return target;
        }
    }
}
