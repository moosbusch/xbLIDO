/*
 * An XML document type.
 * Localname: usesObliqueCartesianCS
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.UsesObliqueCartesianCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one usesObliqueCartesianCS(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class UsesObliqueCartesianCSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.UsesObliqueCartesianCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesObliqueCartesianCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESOBLIQUECARTESIANCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesObliqueCartesianCS");
    
    
    /**
     * Gets the "usesObliqueCartesianCS" element
     */
    public net.opengis.gml.ObliqueCartesianCSRefType getUsesObliqueCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ObliqueCartesianCSRefType target = null;
            target = (net.opengis.gml.ObliqueCartesianCSRefType)get_store().find_element_user(USESOBLIQUECARTESIANCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesObliqueCartesianCS" element
     */
    @Inject(optional=true) public void setUsesObliqueCartesianCS(net.opengis.gml.ObliqueCartesianCSRefType usesObliqueCartesianCS)
    {
        generatedSetterHelperImpl(usesObliqueCartesianCS, USESOBLIQUECARTESIANCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesObliqueCartesianCS" element
     */
    public net.opengis.gml.ObliqueCartesianCSRefType addNewUsesObliqueCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ObliqueCartesianCSRefType target = null;
            target = (net.opengis.gml.ObliqueCartesianCSRefType)get_store().add_element_user(USESOBLIQUECARTESIANCS$0);
            return target;
        }
    }
}
