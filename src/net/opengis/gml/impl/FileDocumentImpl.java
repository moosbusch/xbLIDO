/*
 * An XML document type.
 * Localname: File
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.FileDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one File(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class FileDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.FileDocument
{
    private static final long serialVersionUID = 1L;
    
    public FileDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "File");
    
    
    /**
     * Gets the "File" element
     */
    public net.opengis.gml.FileType getFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FileType target = null;
            target = (net.opengis.gml.FileType)get_store().find_element_user(FILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "File" element
     */
    @Inject(optional=true) public void setFile(net.opengis.gml.FileType file)
    {
        generatedSetterHelperImpl(file, FILE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "File" element
     */
    public net.opengis.gml.FileType addNewFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FileType target = null;
            target = (net.opengis.gml.FileType)get_store().add_element_user(FILE$0);
            return target;
        }
    }
}
