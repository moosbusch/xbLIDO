/*
 * An XML document type.
 * Localname: temporalCRSRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TemporalCRSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one temporalCRSRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TemporalCRSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.TemporalCRSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public TemporalCRSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEMPORALCRSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "temporalCRSRef");
    
    
    /**
     * Gets the "temporalCRSRef" element
     */
    public net.opengis.gml.TemporalCRSRefType getTemporalCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TemporalCRSRefType target = null;
            target = (net.opengis.gml.TemporalCRSRefType)get_store().find_element_user(TEMPORALCRSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "temporalCRSRef" element
     */
    @Inject(optional=true) public void setTemporalCRSRef(net.opengis.gml.TemporalCRSRefType temporalCRSRef)
    {
        generatedSetterHelperImpl(temporalCRSRef, TEMPORALCRSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "temporalCRSRef" element
     */
    public net.opengis.gml.TemporalCRSRefType addNewTemporalCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TemporalCRSRefType target = null;
            target = (net.opengis.gml.TemporalCRSRefType)get_store().add_element_user(TEMPORALCRSREF$0);
            return target;
        }
    }
}
