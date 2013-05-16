/*
 * An XML document type.
 * Localname: greenwichLongitude
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GreenwichLongitudeDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one greenwichLongitude(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GreenwichLongitudeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.GreenwichLongitudeDocument
{
    private static final long serialVersionUID = 1L;
    
    public GreenwichLongitudeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GREENWICHLONGITUDE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "greenwichLongitude");
    
    
    /**
     * Gets the "greenwichLongitude" element
     */
    public net.opengis.gml.AngleChoiceType getGreenwichLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AngleChoiceType target = null;
            target = (net.opengis.gml.AngleChoiceType)get_store().find_element_user(GREENWICHLONGITUDE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "greenwichLongitude" element
     */
    @Inject(optional=true) public void setGreenwichLongitude(net.opengis.gml.AngleChoiceType greenwichLongitude)
    {
        generatedSetterHelperImpl(greenwichLongitude, GREENWICHLONGITUDE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "greenwichLongitude" element
     */
    public net.opengis.gml.AngleChoiceType addNewGreenwichLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AngleChoiceType target = null;
            target = (net.opengis.gml.AngleChoiceType)get_store().add_element_user(GREENWICHLONGITUDE$0);
            return target;
        }
    }
}
