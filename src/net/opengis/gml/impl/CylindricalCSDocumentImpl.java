/*
 * An XML document type.
 * Localname: CylindricalCS
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CylindricalCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one CylindricalCS(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CylindricalCSDocumentImpl extends net.opengis.gml.impl.CoordinateSystemDocumentImpl implements net.opengis.gml.CylindricalCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public CylindricalCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CYLINDRICALCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CylindricalCS");
    
    
    /**
     * Gets the "CylindricalCS" element
     */
    public net.opengis.gml.CylindricalCSType getCylindricalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CylindricalCSType target = null;
            target = (net.opengis.gml.CylindricalCSType)get_store().find_element_user(CYLINDRICALCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CylindricalCS" element
     */
    @Inject(optional=true) public void setCylindricalCS(net.opengis.gml.CylindricalCSType cylindricalCS)
    {
        generatedSetterHelperImpl(cylindricalCS, CYLINDRICALCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CylindricalCS" element
     */
    public net.opengis.gml.CylindricalCSType addNewCylindricalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CylindricalCSType target = null;
            target = (net.opengis.gml.CylindricalCSType)get_store().add_element_user(CYLINDRICALCS$0);
            return target;
        }
    }
}
