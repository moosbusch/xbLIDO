/*
 * An XML document type.
 * Localname: datumRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DatumRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one datumRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DatumRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.DatumRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public DatumRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATUMREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "datumRef");
    
    
    /**
     * Gets the "datumRef" element
     */
    public net.opengis.gml.DatumRefType getDatumRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DatumRefType target = null;
            target = (net.opengis.gml.DatumRefType)get_store().find_element_user(DATUMREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "datumRef" element
     */
    @Inject(optional=true) public void setDatumRef(net.opengis.gml.DatumRefType datumRef)
    {
        generatedSetterHelperImpl(datumRef, DATUMREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "datumRef" element
     */
    public net.opengis.gml.DatumRefType addNewDatumRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DatumRefType target = null;
            target = (net.opengis.gml.DatumRefType)get_store().add_element_user(DATUMREF$0);
            return target;
        }
    }
}
