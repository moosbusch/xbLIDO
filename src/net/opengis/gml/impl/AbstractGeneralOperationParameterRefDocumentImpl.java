/*
 * An XML document type.
 * Localname: abstractGeneralOperationParameterRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.AbstractGeneralOperationParameterRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one abstractGeneralOperationParameterRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class AbstractGeneralOperationParameterRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.AbstractGeneralOperationParameterRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractGeneralOperationParameterRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTGENERALOPERATIONPARAMETERREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "abstractGeneralOperationParameterRef");
    
    
    /**
     * Gets the "abstractGeneralOperationParameterRef" element
     */
    public net.opengis.gml.AbstractGeneralOperationParameterRefType getAbstractGeneralOperationParameterRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralOperationParameterRefType target = null;
            target = (net.opengis.gml.AbstractGeneralOperationParameterRefType)get_store().find_element_user(ABSTRACTGENERALOPERATIONPARAMETERREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "abstractGeneralOperationParameterRef" element
     */
    @Inject(optional=true) public void setAbstractGeneralOperationParameterRef(net.opengis.gml.AbstractGeneralOperationParameterRefType abstractGeneralOperationParameterRef)
    {
        generatedSetterHelperImpl(abstractGeneralOperationParameterRef, ABSTRACTGENERALOPERATIONPARAMETERREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "abstractGeneralOperationParameterRef" element
     */
    public net.opengis.gml.AbstractGeneralOperationParameterRefType addNewAbstractGeneralOperationParameterRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralOperationParameterRefType target = null;
            target = (net.opengis.gml.AbstractGeneralOperationParameterRefType)get_store().add_element_user(ABSTRACTGENERALOPERATIONPARAMETERREF$0);
            return target;
        }
    }
}
