/*
 * An XML document type.
 * Localname: coordinates
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CoordinatesDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one coordinates(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CoordinatesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CoordinatesDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoordinatesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COORDINATES$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "coordinates");
    
    
    /**
     * Gets the "coordinates" element
     */
    public net.opengis.gml.CoordinatesType getCoordinates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinatesType target = null;
            target = (net.opengis.gml.CoordinatesType)get_store().find_element_user(COORDINATES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "coordinates" element
     */
    @Inject(optional=true) public void setCoordinates(net.opengis.gml.CoordinatesType coordinates)
    {
        generatedSetterHelperImpl(coordinates, COORDINATES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "coordinates" element
     */
    public net.opengis.gml.CoordinatesType addNewCoordinates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinatesType target = null;
            target = (net.opengis.gml.CoordinatesType)get_store().add_element_user(COORDINATES$0);
            return target;
        }
    }
}
