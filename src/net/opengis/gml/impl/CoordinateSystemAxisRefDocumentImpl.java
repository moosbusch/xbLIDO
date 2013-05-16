/*
 * An XML document type.
 * Localname: coordinateSystemAxisRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CoordinateSystemAxisRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one coordinateSystemAxisRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CoordinateSystemAxisRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CoordinateSystemAxisRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoordinateSystemAxisRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COORDINATESYSTEMAXISREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "coordinateSystemAxisRef");
    
    
    /**
     * Gets the "coordinateSystemAxisRef" element
     */
    public net.opengis.gml.CoordinateSystemAxisRefType getCoordinateSystemAxisRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateSystemAxisRefType target = null;
            target = (net.opengis.gml.CoordinateSystemAxisRefType)get_store().find_element_user(COORDINATESYSTEMAXISREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "coordinateSystemAxisRef" element
     */
    @Inject(optional=true) public void setCoordinateSystemAxisRef(net.opengis.gml.CoordinateSystemAxisRefType coordinateSystemAxisRef)
    {
        generatedSetterHelperImpl(coordinateSystemAxisRef, COORDINATESYSTEMAXISREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "coordinateSystemAxisRef" element
     */
    public net.opengis.gml.CoordinateSystemAxisRefType addNewCoordinateSystemAxisRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateSystemAxisRefType target = null;
            target = (net.opengis.gml.CoordinateSystemAxisRefType)get_store().add_element_user(COORDINATESYSTEMAXISREF$0);
            return target;
        }
    }
}
