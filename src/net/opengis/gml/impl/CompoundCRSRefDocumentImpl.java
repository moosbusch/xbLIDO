/*
 * An XML document type.
 * Localname: compoundCRSRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CompoundCRSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one compoundCRSRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CompoundCRSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CompoundCRSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public CompoundCRSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPOUNDCRSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "compoundCRSRef");
    
    
    /**
     * Gets the "compoundCRSRef" element
     */
    public net.opengis.gml.CompoundCRSRefType getCompoundCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CompoundCRSRefType target = null;
            target = (net.opengis.gml.CompoundCRSRefType)get_store().find_element_user(COMPOUNDCRSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "compoundCRSRef" element
     */
    @Inject(optional=true) public void setCompoundCRSRef(net.opengis.gml.CompoundCRSRefType compoundCRSRef)
    {
        generatedSetterHelperImpl(compoundCRSRef, COMPOUNDCRSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "compoundCRSRef" element
     */
    public net.opengis.gml.CompoundCRSRefType addNewCompoundCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CompoundCRSRefType target = null;
            target = (net.opengis.gml.CompoundCRSRefType)get_store().add_element_user(COMPOUNDCRSREF$0);
            return target;
        }
    }
}
