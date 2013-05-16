/*
 * An XML document type.
 * Localname: cylindricalCSRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CylindricalCSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one cylindricalCSRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CylindricalCSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CylindricalCSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public CylindricalCSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CYLINDRICALCSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "cylindricalCSRef");
    
    
    /**
     * Gets the "cylindricalCSRef" element
     */
    public net.opengis.gml.CylindricalCSRefType getCylindricalCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CylindricalCSRefType target = null;
            target = (net.opengis.gml.CylindricalCSRefType)get_store().find_element_user(CYLINDRICALCSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cylindricalCSRef" element
     */
    @Inject(optional=true) public void setCylindricalCSRef(net.opengis.gml.CylindricalCSRefType cylindricalCSRef)
    {
        generatedSetterHelperImpl(cylindricalCSRef, CYLINDRICALCSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "cylindricalCSRef" element
     */
    public net.opengis.gml.CylindricalCSRefType addNewCylindricalCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CylindricalCSRefType target = null;
            target = (net.opengis.gml.CylindricalCSRefType)get_store().add_element_user(CYLINDRICALCSREF$0);
            return target;
        }
    }
}
