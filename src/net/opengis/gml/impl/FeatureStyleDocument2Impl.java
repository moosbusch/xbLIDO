/*
 * An XML document type.
 * Localname: FeatureStyle
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.FeatureStyleDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one FeatureStyle(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class FeatureStyleDocument2Impl extends net.opengis.gml.impl.GMLDocumentImpl implements net.opengis.gml.FeatureStyleDocument2
{
    private static final long serialVersionUID = 1L;
    
    public FeatureStyleDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FEATURESTYLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "FeatureStyle");
    
    
    /**
     * Gets the "FeatureStyle" element
     */
    public net.opengis.gml.FeatureStyleType getFeatureStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FeatureStyleType target = null;
            target = (net.opengis.gml.FeatureStyleType)get_store().find_element_user(FEATURESTYLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "FeatureStyle" element
     */
    @Inject(optional=true) public void setFeatureStyle(net.opengis.gml.FeatureStyleType featureStyle)
    {
        generatedSetterHelperImpl(featureStyle, FEATURESTYLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FeatureStyle" element
     */
    public net.opengis.gml.FeatureStyleType addNewFeatureStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FeatureStyleType target = null;
            target = (net.opengis.gml.FeatureStyleType)get_store().add_element_user(FEATURESTYLE$0);
            return target;
        }
    }
}
