/*
 * An XML document type.
 * Localname: name
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.NameDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one name(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class NameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.NameDocument
{
    private static final long serialVersionUID = 1L;
    
    public NameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "name");
    private static final org.apache.xmlbeans.QNameSet NAME$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ellipsoidName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "meridianName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "coordinateOperationName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "datumName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "methodName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "parameterName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "groupName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "srsName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "csName"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "name"),
    });
    
    
    /**
     * Gets the "name" element
     */
    public net.opengis.gml.CodeType getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(NAME$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    @Inject(optional=true) public void setName(net.opengis.gml.CodeType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(NAME$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.CodeType)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public net.opengis.gml.CodeType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().add_element_user(NAME$0);
            return target;
        }
    }
}
