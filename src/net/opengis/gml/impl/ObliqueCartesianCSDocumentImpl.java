/*
 * An XML document type.
 * Localname: ObliqueCartesianCS
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ObliqueCartesianCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one ObliqueCartesianCS(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ObliqueCartesianCSDocumentImpl extends net.opengis.gml.impl.CoordinateSystemDocumentImpl implements net.opengis.gml.ObliqueCartesianCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public ObliqueCartesianCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBLIQUECARTESIANCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ObliqueCartesianCS");
    
    
    /**
     * Gets the "ObliqueCartesianCS" element
     */
    public net.opengis.gml.ObliqueCartesianCSType getObliqueCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ObliqueCartesianCSType target = null;
            target = (net.opengis.gml.ObliqueCartesianCSType)get_store().find_element_user(OBLIQUECARTESIANCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ObliqueCartesianCS" element
     */
    @Inject(optional=true) public void setObliqueCartesianCS(net.opengis.gml.ObliqueCartesianCSType obliqueCartesianCS)
    {
        generatedSetterHelperImpl(obliqueCartesianCS, OBLIQUECARTESIANCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ObliqueCartesianCS" element
     */
    public net.opengis.gml.ObliqueCartesianCSType addNewObliqueCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ObliqueCartesianCSType target = null;
            target = (net.opengis.gml.ObliqueCartesianCSType)get_store().add_element_user(OBLIQUECARTESIANCS$0);
            return target;
        }
    }
}
