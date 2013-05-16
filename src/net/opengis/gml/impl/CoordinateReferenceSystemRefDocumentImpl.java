/*
 * An XML document type.
 * Localname: coordinateReferenceSystemRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CoordinateReferenceSystemRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one coordinateReferenceSystemRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CoordinateReferenceSystemRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CoordinateReferenceSystemRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoordinateReferenceSystemRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COORDINATEREFERENCESYSTEMREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "coordinateReferenceSystemRef");
    
    
    /**
     * Gets the "coordinateReferenceSystemRef" element
     */
    public net.opengis.gml.CoordinateReferenceSystemRefType getCoordinateReferenceSystemRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateReferenceSystemRefType target = null;
            target = (net.opengis.gml.CoordinateReferenceSystemRefType)get_store().find_element_user(COORDINATEREFERENCESYSTEMREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "coordinateReferenceSystemRef" element
     */
    @Inject(optional=true) public void setCoordinateReferenceSystemRef(net.opengis.gml.CoordinateReferenceSystemRefType coordinateReferenceSystemRef)
    {
        generatedSetterHelperImpl(coordinateReferenceSystemRef, COORDINATEREFERENCESYSTEMREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "coordinateReferenceSystemRef" element
     */
    public net.opengis.gml.CoordinateReferenceSystemRefType addNewCoordinateReferenceSystemRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateReferenceSystemRefType target = null;
            target = (net.opengis.gml.CoordinateReferenceSystemRefType)get_store().add_element_user(COORDINATEREFERENCESYSTEMREF$0);
            return target;
        }
    }
}
