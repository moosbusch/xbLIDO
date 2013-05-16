/*
 * An XML document type.
 * Localname: FeatureCollection
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.FeatureCollectionDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one FeatureCollection(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class FeatureCollectionDocument2Impl extends net.opengis.gml.impl.FeatureDocumentImpl implements net.opengis.gml.FeatureCollectionDocument2
{
    private static final long serialVersionUID = 1L;
    
    public FeatureCollectionDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FEATURECOLLECTION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "FeatureCollection");
    
    
    /**
     * Gets the "FeatureCollection" element
     */
    public net.opengis.gml.FeatureCollectionType getFeatureCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FeatureCollectionType target = null;
            target = (net.opengis.gml.FeatureCollectionType)get_store().find_element_user(FEATURECOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "FeatureCollection" element
     */
    @Inject(optional=true) public void setFeatureCollection(net.opengis.gml.FeatureCollectionType featureCollection)
    {
        generatedSetterHelperImpl(featureCollection, FEATURECOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FeatureCollection" element
     */
    public net.opengis.gml.FeatureCollectionType addNewFeatureCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FeatureCollectionType target = null;
            target = (net.opengis.gml.FeatureCollectionType)get_store().add_element_user(FEATURECOLLECTION$0);
            return target;
        }
    }
}
