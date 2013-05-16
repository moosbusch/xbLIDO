/*
 * An XML document type.
 * Localname: featureMembers
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.FeatureMembersDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one featureMembers(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class FeatureMembersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.FeatureMembersDocument
{
    private static final long serialVersionUID = 1L;
    
    public FeatureMembersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FEATUREMEMBERS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "featureMembers");
    
    
    /**
     * Gets the "featureMembers" element
     */
    public net.opengis.gml.FeatureArrayPropertyType getFeatureMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FeatureArrayPropertyType target = null;
            target = (net.opengis.gml.FeatureArrayPropertyType)get_store().find_element_user(FEATUREMEMBERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "featureMembers" element
     */
    @Inject(optional=true) public void setFeatureMembers(net.opengis.gml.FeatureArrayPropertyType featureMembers)
    {
        generatedSetterHelperImpl(featureMembers, FEATUREMEMBERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "featureMembers" element
     */
    public net.opengis.gml.FeatureArrayPropertyType addNewFeatureMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FeatureArrayPropertyType target = null;
            target = (net.opengis.gml.FeatureArrayPropertyType)get_store().add_element_user(FEATUREMEMBERS$0);
            return target;
        }
    }
}
