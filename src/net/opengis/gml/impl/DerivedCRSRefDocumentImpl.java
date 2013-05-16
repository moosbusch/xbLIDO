/*
 * An XML document type.
 * Localname: derivedCRSRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DerivedCRSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one derivedCRSRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DerivedCRSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.DerivedCRSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public DerivedCRSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DERIVEDCRSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "derivedCRSRef");
    
    
    /**
     * Gets the "derivedCRSRef" element
     */
    public net.opengis.gml.DerivedCRSRefType getDerivedCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DerivedCRSRefType target = null;
            target = (net.opengis.gml.DerivedCRSRefType)get_store().find_element_user(DERIVEDCRSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "derivedCRSRef" element
     */
    @Inject(optional=true) public void setDerivedCRSRef(net.opengis.gml.DerivedCRSRefType derivedCRSRef)
    {
        generatedSetterHelperImpl(derivedCRSRef, DERIVEDCRSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "derivedCRSRef" element
     */
    public net.opengis.gml.DerivedCRSRefType addNewDerivedCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DerivedCRSRefType target = null;
            target = (net.opengis.gml.DerivedCRSRefType)get_store().add_element_user(DERIVEDCRSREF$0);
            return target;
        }
    }
}
