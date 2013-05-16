/*
 * An XML document type.
 * Localname: usesCartesianCS
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.UsesCartesianCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one usesCartesianCS(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class UsesCartesianCSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.UsesCartesianCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesCartesianCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESCARTESIANCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesCartesianCS");
    
    
    /**
     * Gets the "usesCartesianCS" element
     */
    public net.opengis.gml.CartesianCSRefType getUsesCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CartesianCSRefType target = null;
            target = (net.opengis.gml.CartesianCSRefType)get_store().find_element_user(USESCARTESIANCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesCartesianCS" element
     */
    @Inject(optional=true) public void setUsesCartesianCS(net.opengis.gml.CartesianCSRefType usesCartesianCS)
    {
        generatedSetterHelperImpl(usesCartesianCS, USESCARTESIANCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesCartesianCS" element
     */
    public net.opengis.gml.CartesianCSRefType addNewUsesCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CartesianCSRefType target = null;
            target = (net.opengis.gml.CartesianCSRefType)get_store().add_element_user(USESCARTESIANCS$0);
            return target;
        }
    }
}
