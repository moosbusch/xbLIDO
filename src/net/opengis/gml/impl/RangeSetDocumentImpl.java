/*
 * An XML document type.
 * Localname: rangeSet
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.RangeSetDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one rangeSet(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class RangeSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.RangeSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public RangeSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RANGESET$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "rangeSet");
    
    
    /**
     * Gets the "rangeSet" element
     */
    public net.opengis.gml.RangeSetType getRangeSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RangeSetType target = null;
            target = (net.opengis.gml.RangeSetType)get_store().find_element_user(RANGESET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rangeSet" element
     */
    @Inject(optional=true) public void setRangeSet(net.opengis.gml.RangeSetType rangeSet)
    {
        generatedSetterHelperImpl(rangeSet, RANGESET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "rangeSet" element
     */
    public net.opengis.gml.RangeSetType addNewRangeSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.RangeSetType target = null;
            target = (net.opengis.gml.RangeSetType)get_store().add_element_user(RANGESET$0);
            return target;
        }
    }
}
