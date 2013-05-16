/*
 * An XML document type.
 * Localname: indirectEntry
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.IndirectEntryDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one indirectEntry(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class IndirectEntryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.IndirectEntryDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndirectEntryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDIRECTENTRY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "indirectEntry");
    
    
    /**
     * Gets the "indirectEntry" element
     */
    public net.opengis.gml.IndirectEntryType getIndirectEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IndirectEntryType target = null;
            target = (net.opengis.gml.IndirectEntryType)get_store().find_element_user(INDIRECTENTRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indirectEntry" element
     */
    @Inject(optional=true) public void setIndirectEntry(net.opengis.gml.IndirectEntryType indirectEntry)
    {
        generatedSetterHelperImpl(indirectEntry, INDIRECTENTRY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "indirectEntry" element
     */
    public net.opengis.gml.IndirectEntryType addNewIndirectEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IndirectEntryType target = null;
            target = (net.opengis.gml.IndirectEntryType)get_store().add_element_user(INDIRECTENTRY$0);
            return target;
        }
    }
}
