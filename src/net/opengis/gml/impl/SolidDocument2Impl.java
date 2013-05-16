/*
 * An XML document type.
 * Localname: Solid
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SolidDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one Solid(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SolidDocument2Impl extends net.opengis.gml.impl.SolidDocumentImpl implements net.opengis.gml.SolidDocument2
{
    private static final long serialVersionUID = 1L;
    
    public SolidDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOLID2$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Solid");
    
    
    /**
     * Gets the "Solid" element
     */
    public net.opengis.gml.SolidType getSolid2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SolidType target = null;
            target = (net.opengis.gml.SolidType)get_store().find_element_user(SOLID2$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Solid" element
     */
    @Inject(optional=true) public void setSolid2(net.opengis.gml.SolidType solid2)
    {
        generatedSetterHelperImpl(solid2, SOLID2$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Solid" element
     */
    public net.opengis.gml.SolidType addNewSolid2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SolidType target = null;
            target = (net.opengis.gml.SolidType)get_store().add_element_user(SOLID2$0);
            return target;
        }
    }
}