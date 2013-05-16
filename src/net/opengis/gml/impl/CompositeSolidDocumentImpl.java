/*
 * An XML document type.
 * Localname: CompositeSolid
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CompositeSolidDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one CompositeSolid(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CompositeSolidDocumentImpl extends net.opengis.gml.impl.SolidDocumentImpl implements net.opengis.gml.CompositeSolidDocument
{
    private static final long serialVersionUID = 1L;
    
    public CompositeSolidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPOSITESOLID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompositeSolid");
    
    
    /**
     * Gets the "CompositeSolid" element
     */
    public net.opengis.gml.CompositeSolidType getCompositeSolid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CompositeSolidType target = null;
            target = (net.opengis.gml.CompositeSolidType)get_store().find_element_user(COMPOSITESOLID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CompositeSolid" element
     */
    @Inject(optional=true) public void setCompositeSolid(net.opengis.gml.CompositeSolidType compositeSolid)
    {
        generatedSetterHelperImpl(compositeSolid, COMPOSITESOLID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CompositeSolid" element
     */
    public net.opengis.gml.CompositeSolidType addNewCompositeSolid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CompositeSolidType target = null;
            target = (net.opengis.gml.CompositeSolidType)get_store().add_element_user(COMPOSITESOLID$0);
            return target;
        }
    }
}
