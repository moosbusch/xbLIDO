/*
 * An XML document type.
 * Localname: _FeatureCollection
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.FeatureCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _FeatureCollection(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class FeatureCollectionDocumentImpl extends net.opengis.gml.impl.FeatureDocumentImpl implements net.opengis.gml.FeatureCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public FeatureCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FEATURECOLLECTION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_FeatureCollection");
    
    
    /**
     * Gets the "_FeatureCollection" element
     */
    public net.opengis.gml.AbstractFeatureCollectionType getFeatureCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractFeatureCollectionType target = null;
            target = (net.opengis.gml.AbstractFeatureCollectionType)get_store().find_element_user(FEATURECOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_FeatureCollection" element
     */
    @Inject(optional=true) public void setFeatureCollection(net.opengis.gml.AbstractFeatureCollectionType featureCollection)
    {
        generatedSetterHelperImpl(featureCollection, FEATURECOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "_FeatureCollection" element
     */
    public net.opengis.gml.AbstractFeatureCollectionType addNewFeatureCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractFeatureCollectionType target = null;
            target = (net.opengis.gml.AbstractFeatureCollectionType)get_store().add_element_user(FEATURECOLLECTION$0);
            return target;
        }
    }
}
