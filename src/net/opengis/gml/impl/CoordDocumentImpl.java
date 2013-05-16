/*
 * An XML document type.
 * Localname: coord
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CoordDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one coord(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CoordDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CoordDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoordDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COORD$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "coord");
    
    
    /**
     * Gets the "coord" element
     */
    public net.opengis.gml.CoordType getCoord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordType target = null;
            target = (net.opengis.gml.CoordType)get_store().find_element_user(COORD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "coord" element
     */
    @Inject(optional=true) public void setCoord(net.opengis.gml.CoordType coord)
    {
        generatedSetterHelperImpl(coord, COORD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "coord" element
     */
    public net.opengis.gml.CoordType addNewCoord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordType target = null;
            target = (net.opengis.gml.CoordType)get_store().add_element_user(COORD$0);
            return target;
        }
    }
}
