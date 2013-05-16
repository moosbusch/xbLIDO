/*
 * An XML document type.
 * Localname: _GeneralDerivedCRS
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GeneralDerivedCRSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _GeneralDerivedCRS(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GeneralDerivedCRSDocumentImpl extends net.opengis.gml.impl.CoordinateReferenceSystemDocumentImpl implements net.opengis.gml.GeneralDerivedCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeneralDerivedCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERALDERIVEDCRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralDerivedCRS");
    private static final org.apache.xmlbeans.QNameSet GENERALDERIVEDCRS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DerivedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralDerivedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ProjectedCRS"),
    });
    
    
    /**
     * Gets the "_GeneralDerivedCRS" element
     */
    public net.opengis.gml.AbstractGeneralDerivedCRSType getGeneralDerivedCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralDerivedCRSType target = null;
            target = (net.opengis.gml.AbstractGeneralDerivedCRSType)get_store().find_element_user(GENERALDERIVEDCRS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_GeneralDerivedCRS" element
     */
    @Inject(optional=true) public void setGeneralDerivedCRS(net.opengis.gml.AbstractGeneralDerivedCRSType generalDerivedCRS)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralDerivedCRSType target = null;
            target = (net.opengis.gml.AbstractGeneralDerivedCRSType)get_store().find_element_user(GENERALDERIVEDCRS$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractGeneralDerivedCRSType)get_store().add_element_user(GENERALDERIVEDCRS$0);
            }
            target.set(generalDerivedCRS);
        }
    }
    
    /**
     * Appends and returns a new empty "_GeneralDerivedCRS" element
     */
    public net.opengis.gml.AbstractGeneralDerivedCRSType addNewGeneralDerivedCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralDerivedCRSType target = null;
            target = (net.opengis.gml.AbstractGeneralDerivedCRSType)get_store().add_element_user(GENERALDERIVEDCRS$0);
            return target;
        }
    }
}
