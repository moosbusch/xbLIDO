/*
 * An XML document type.
 * Localname: ArcByBulge
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ArcByBulgeDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one ArcByBulge(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ArcByBulgeDocumentImpl extends net.opengis.gml.impl.ArcStringByBulgeDocumentImpl implements net.opengis.gml.ArcByBulgeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArcByBulgeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARCBYBULGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ArcByBulge");
    
    
    /**
     * Gets the "ArcByBulge" element
     */
    public net.opengis.gml.ArcByBulgeType getArcByBulge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcByBulgeType target = null;
            target = (net.opengis.gml.ArcByBulgeType)get_store().find_element_user(ARCBYBULGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ArcByBulge" element
     */
    @Inject(optional=true) public void setArcByBulge(net.opengis.gml.ArcByBulgeType arcByBulge)
    {
        generatedSetterHelperImpl(arcByBulge, ARCBYBULGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArcByBulge" element
     */
    public net.opengis.gml.ArcByBulgeType addNewArcByBulge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcByBulgeType target = null;
            target = (net.opengis.gml.ArcByBulgeType)get_store().add_element_user(ARCBYBULGE$0);
            return target;
        }
    }
}
