/*
 * An XML document type.
 * Localname: GenericMetaData
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GenericMetaDataDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one GenericMetaData(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GenericMetaDataDocumentImpl extends net.opengis.gml.impl.MetaDataDocumentImpl implements net.opengis.gml.GenericMetaDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public GenericMetaDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERICMETADATA$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GenericMetaData");
    
    
    /**
     * Gets the "GenericMetaData" element
     */
    public net.opengis.gml.GenericMetaDataType getGenericMetaData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GenericMetaDataType target = null;
            target = (net.opengis.gml.GenericMetaDataType)get_store().find_element_user(GENERICMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GenericMetaData" element
     */
    @Inject(optional=true) public void setGenericMetaData(net.opengis.gml.GenericMetaDataType genericMetaData)
    {
        generatedSetterHelperImpl(genericMetaData, GENERICMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GenericMetaData" element
     */
    public net.opengis.gml.GenericMetaDataType addNewGenericMetaData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GenericMetaDataType target = null;
            target = (net.opengis.gml.GenericMetaDataType)get_store().add_element_user(GENERICMETADATA$0);
            return target;
        }
    }
}
