/*
 * An XML document type.
 * Localname: directedTopoSolid
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DirectedTopoSolidDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one directedTopoSolid(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DirectedTopoSolidDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.DirectedTopoSolidDocument
{
    private static final long serialVersionUID = 1L;
    
    public DirectedTopoSolidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTEDTOPOSOLID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "directedTopoSolid");
    
    
    /**
     * Gets the "directedTopoSolid" element
     */
    public net.opengis.gml.DirectedTopoSolidPropertyType getDirectedTopoSolid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedTopoSolidPropertyType target = null;
            target = (net.opengis.gml.DirectedTopoSolidPropertyType)get_store().find_element_user(DIRECTEDTOPOSOLID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "directedTopoSolid" element
     */
    @Inject(optional=true) public void setDirectedTopoSolid(net.opengis.gml.DirectedTopoSolidPropertyType directedTopoSolid)
    {
        generatedSetterHelperImpl(directedTopoSolid, DIRECTEDTOPOSOLID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "directedTopoSolid" element
     */
    public net.opengis.gml.DirectedTopoSolidPropertyType addNewDirectedTopoSolid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectedTopoSolidPropertyType target = null;
            target = (net.opengis.gml.DirectedTopoSolidPropertyType)get_store().add_element_user(DIRECTEDTOPOSOLID$0);
            return target;
        }
    }
}
