/*
 * An XML document type.
 * Localname: datumID
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DatumIDDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one datumID(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DatumIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.DatumIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public DatumIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATUMID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "datumID");
    
    
    /**
     * Gets the "datumID" element
     */
    public net.opengis.gml.IdentifierType getDatumID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().find_element_user(DATUMID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "datumID" element
     */
    @Inject(optional=true) public void setDatumID(net.opengis.gml.IdentifierType datumID)
    {
        generatedSetterHelperImpl(datumID, DATUMID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "datumID" element
     */
    public net.opengis.gml.IdentifierType addNewDatumID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().add_element_user(DATUMID$0);
            return target;
        }
    }
}
