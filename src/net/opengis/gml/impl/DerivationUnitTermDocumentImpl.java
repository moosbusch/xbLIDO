/*
 * An XML document type.
 * Localname: derivationUnitTerm
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DerivationUnitTermDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one derivationUnitTerm(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DerivationUnitTermDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.DerivationUnitTermDocument
{
    private static final long serialVersionUID = 1L;
    
    public DerivationUnitTermDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DERIVATIONUNITTERM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "derivationUnitTerm");
    
    
    /**
     * Gets the "derivationUnitTerm" element
     */
    public net.opengis.gml.DerivationUnitTermType getDerivationUnitTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DerivationUnitTermType target = null;
            target = (net.opengis.gml.DerivationUnitTermType)get_store().find_element_user(DERIVATIONUNITTERM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "derivationUnitTerm" element
     */
    @Inject(optional=true) public void setDerivationUnitTerm(net.opengis.gml.DerivationUnitTermType derivationUnitTerm)
    {
        generatedSetterHelperImpl(derivationUnitTerm, DERIVATIONUNITTERM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "derivationUnitTerm" element
     */
    public net.opengis.gml.DerivationUnitTermType addNewDerivationUnitTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DerivationUnitTermType target = null;
            target = (net.opengis.gml.DerivationUnitTermType)get_store().add_element_user(DERIVATIONUNITTERM$0);
            return target;
        }
    }
}
