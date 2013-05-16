/*
 * An XML document type.
 * Localname: LocationKeyWord
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.LocationKeyWordDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one LocationKeyWord(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class LocationKeyWordDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.LocationKeyWordDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationKeyWordDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONKEYWORD$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LocationKeyWord");
    
    
    /**
     * Gets the "LocationKeyWord" element
     */
    public net.opengis.gml.CodeType getLocationKeyWord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(LOCATIONKEYWORD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LocationKeyWord" element
     */
    @Inject(optional=true) public void setLocationKeyWord(net.opengis.gml.CodeType locationKeyWord)
    {
        generatedSetterHelperImpl(locationKeyWord, LOCATIONKEYWORD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LocationKeyWord" element
     */
    public net.opengis.gml.CodeType addNewLocationKeyWord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().add_element_user(LOCATIONKEYWORD$0);
            return target;
        }
    }
}
