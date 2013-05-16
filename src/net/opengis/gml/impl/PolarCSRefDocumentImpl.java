/*
 * An XML document type.
 * Localname: polarCSRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.PolarCSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one polarCSRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class PolarCSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.PolarCSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public PolarCSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLARCSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "polarCSRef");
    
    
    /**
     * Gets the "polarCSRef" element
     */
    public net.opengis.gml.PolarCSRefType getPolarCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolarCSRefType target = null;
            target = (net.opengis.gml.PolarCSRefType)get_store().find_element_user(POLARCSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "polarCSRef" element
     */
    @Inject(optional=true) public void setPolarCSRef(net.opengis.gml.PolarCSRefType polarCSRef)
    {
        generatedSetterHelperImpl(polarCSRef, POLARCSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "polarCSRef" element
     */
    public net.opengis.gml.PolarCSRefType addNewPolarCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolarCSRefType target = null;
            target = (net.opengis.gml.PolarCSRefType)get_store().add_element_user(POLARCSREF$0);
            return target;
        }
    }
}
