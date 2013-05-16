/*
 * An XML document type.
 * Localname: lineStringMember
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.LineStringMemberDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one lineStringMember(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class LineStringMemberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.LineStringMemberDocument
{
    private static final long serialVersionUID = 1L;
    
    public LineStringMemberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINESTRINGMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "lineStringMember");
    
    
    /**
     * Gets the "lineStringMember" element
     */
    public net.opengis.gml.LineStringPropertyType getLineStringMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringPropertyType target = null;
            target = (net.opengis.gml.LineStringPropertyType)get_store().find_element_user(LINESTRINGMEMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "lineStringMember" element
     */
    @Inject(optional=true) public void setLineStringMember(net.opengis.gml.LineStringPropertyType lineStringMember)
    {
        generatedSetterHelperImpl(lineStringMember, LINESTRINGMEMBER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "lineStringMember" element
     */
    public net.opengis.gml.LineStringPropertyType addNewLineStringMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringPropertyType target = null;
            target = (net.opengis.gml.LineStringPropertyType)get_store().add_element_user(LINESTRINGMEMBER$0);
            return target;
        }
    }
}
