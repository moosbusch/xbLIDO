/*
 * An XML document type.
 * Localname: featureMember
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.FeatureMemberDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one featureMember(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class FeatureMemberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.FeatureMemberDocument
{
    private static final long serialVersionUID = 1L;
    
    public FeatureMemberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FEATUREMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "featureMember");
    
    
    /**
     * Gets the "featureMember" element
     */
    public net.opengis.gml.FeaturePropertyType getFeatureMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FeaturePropertyType target = null;
            target = (net.opengis.gml.FeaturePropertyType)get_store().find_element_user(FEATUREMEMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "featureMember" element
     */
    @Inject(optional=true) public void setFeatureMember(net.opengis.gml.FeaturePropertyType featureMember)
    {
        generatedSetterHelperImpl(featureMember, FEATUREMEMBER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "featureMember" element
     */
    public net.opengis.gml.FeaturePropertyType addNewFeatureMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FeaturePropertyType target = null;
            target = (net.opengis.gml.FeaturePropertyType)get_store().add_element_user(FEATUREMEMBER$0);
            return target;
        }
    }
}
