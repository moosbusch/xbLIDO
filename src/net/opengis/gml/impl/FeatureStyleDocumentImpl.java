/*
 * An XML document type.
 * Localname: featureStyle
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.FeatureStyleDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one featureStyle(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class FeatureStyleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.FeatureStyleDocument
{
    private static final long serialVersionUID = 1L;
    
    public FeatureStyleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FEATURESTYLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "featureStyle");
    
    
    /**
     * Gets the "featureStyle" element
     */
    public net.opengis.gml.FeatureStylePropertyType getFeatureStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FeatureStylePropertyType target = null;
            target = (net.opengis.gml.FeatureStylePropertyType)get_store().find_element_user(FEATURESTYLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "featureStyle" element
     */
    @Inject(optional=true) public void setFeatureStyle(net.opengis.gml.FeatureStylePropertyType featureStyle)
    {
        generatedSetterHelperImpl(featureStyle, FEATURESTYLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "featureStyle" element
     */
    public net.opengis.gml.FeatureStylePropertyType addNewFeatureStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FeatureStylePropertyType target = null;
            target = (net.opengis.gml.FeatureStylePropertyType)get_store().add_element_user(FEATURESTYLE$0);
            return target;
        }
    }
}
