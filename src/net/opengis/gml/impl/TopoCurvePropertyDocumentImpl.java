/*
 * An XML document type.
 * Localname: topoCurveProperty
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TopoCurvePropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one topoCurveProperty(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TopoCurvePropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.TopoCurvePropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopoCurvePropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOCURVEPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "topoCurveProperty");
    
    
    /**
     * Gets the "topoCurveProperty" element
     */
    public net.opengis.gml.TopoCurvePropertyType getTopoCurveProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoCurvePropertyType target = null;
            target = (net.opengis.gml.TopoCurvePropertyType)get_store().find_element_user(TOPOCURVEPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "topoCurveProperty" element
     */
    @Inject(optional=true) public void setTopoCurveProperty(net.opengis.gml.TopoCurvePropertyType topoCurveProperty)
    {
        generatedSetterHelperImpl(topoCurveProperty, TOPOCURVEPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "topoCurveProperty" element
     */
    public net.opengis.gml.TopoCurvePropertyType addNewTopoCurveProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoCurvePropertyType target = null;
            target = (net.opengis.gml.TopoCurvePropertyType)get_store().add_element_user(TOPOCURVEPROPERTY$0);
            return target;
        }
    }
}
