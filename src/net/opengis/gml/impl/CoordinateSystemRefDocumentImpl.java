/*
 * An XML document type.
 * Localname: coordinateSystemRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CoordinateSystemRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one coordinateSystemRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CoordinateSystemRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CoordinateSystemRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoordinateSystemRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COORDINATESYSTEMREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "coordinateSystemRef");
    
    
    /**
     * Gets the "coordinateSystemRef" element
     */
    public net.opengis.gml.CoordinateSystemRefType getCoordinateSystemRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateSystemRefType target = null;
            target = (net.opengis.gml.CoordinateSystemRefType)get_store().find_element_user(COORDINATESYSTEMREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "coordinateSystemRef" element
     */
    @Inject(optional=true) public void setCoordinateSystemRef(net.opengis.gml.CoordinateSystemRefType coordinateSystemRef)
    {
        generatedSetterHelperImpl(coordinateSystemRef, COORDINATESYSTEMREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "coordinateSystemRef" element
     */
    public net.opengis.gml.CoordinateSystemRefType addNewCoordinateSystemRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateSystemRefType target = null;
            target = (net.opengis.gml.CoordinateSystemRefType)get_store().add_element_user(COORDINATESYSTEMREF$0);
            return target;
        }
    }
}
