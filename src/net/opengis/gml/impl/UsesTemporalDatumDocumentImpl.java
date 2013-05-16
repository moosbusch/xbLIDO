/*
 * An XML document type.
 * Localname: usesTemporalDatum
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.UsesTemporalDatumDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one usesTemporalDatum(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class UsesTemporalDatumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.UsesTemporalDatumDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesTemporalDatumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESTEMPORALDATUM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesTemporalDatum");
    
    
    /**
     * Gets the "usesTemporalDatum" element
     */
    public net.opengis.gml.TemporalDatumRefType getUsesTemporalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TemporalDatumRefType target = null;
            target = (net.opengis.gml.TemporalDatumRefType)get_store().find_element_user(USESTEMPORALDATUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesTemporalDatum" element
     */
    @Inject(optional=true) public void setUsesTemporalDatum(net.opengis.gml.TemporalDatumRefType usesTemporalDatum)
    {
        generatedSetterHelperImpl(usesTemporalDatum, USESTEMPORALDATUM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesTemporalDatum" element
     */
    public net.opengis.gml.TemporalDatumRefType addNewUsesTemporalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TemporalDatumRefType target = null;
            target = (net.opengis.gml.TemporalDatumRefType)get_store().add_element_user(USESTEMPORALDATUM$0);
            return target;
        }
    }
}
