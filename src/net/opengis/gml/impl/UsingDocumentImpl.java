/*
 * An XML document type.
 * Localname: using
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.UsingDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one using(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class UsingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.UsingDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USING$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "using");
    
    
    /**
     * Gets the "using" element
     */
    public net.opengis.gml.FeaturePropertyType getUsing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FeaturePropertyType target = null;
            target = (net.opengis.gml.FeaturePropertyType)get_store().find_element_user(USING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "using" element
     */
    @Inject(optional=true) public void setUsing(net.opengis.gml.FeaturePropertyType using)
    {
        generatedSetterHelperImpl(using, USING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "using" element
     */
    public net.opengis.gml.FeaturePropertyType addNewUsing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FeaturePropertyType target = null;
            target = (net.opengis.gml.FeaturePropertyType)get_store().add_element_user(USING$0);
            return target;
        }
    }
}
