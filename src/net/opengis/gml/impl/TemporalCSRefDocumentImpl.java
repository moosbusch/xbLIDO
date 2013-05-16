/*
 * An XML document type.
 * Localname: temporalCSRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TemporalCSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one temporalCSRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TemporalCSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.TemporalCSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public TemporalCSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEMPORALCSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "temporalCSRef");
    
    
    /**
     * Gets the "temporalCSRef" element
     */
    public net.opengis.gml.TemporalCSRefType getTemporalCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TemporalCSRefType target = null;
            target = (net.opengis.gml.TemporalCSRefType)get_store().find_element_user(TEMPORALCSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "temporalCSRef" element
     */
    @Inject(optional=true) public void setTemporalCSRef(net.opengis.gml.TemporalCSRefType temporalCSRef)
    {
        generatedSetterHelperImpl(temporalCSRef, TEMPORALCSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "temporalCSRef" element
     */
    public net.opengis.gml.TemporalCSRefType addNewTemporalCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TemporalCSRefType target = null;
            target = (net.opengis.gml.TemporalCSRefType)get_store().add_element_user(TEMPORALCSREF$0);
            return target;
        }
    }
}
