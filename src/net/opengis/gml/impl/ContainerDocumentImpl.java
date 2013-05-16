/*
 * An XML document type.
 * Localname: container
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ContainerDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one container(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ContainerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ContainerDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContainerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTAINER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "container");
    
    
    /**
     * Gets the "container" element
     */
    public net.opengis.gml.ContainerPropertyType getContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ContainerPropertyType target = null;
            target = (net.opengis.gml.ContainerPropertyType)get_store().find_element_user(CONTAINER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "container" element
     */
    @Inject(optional=true) public void setContainer(net.opengis.gml.ContainerPropertyType container)
    {
        generatedSetterHelperImpl(container, CONTAINER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "container" element
     */
    public net.opengis.gml.ContainerPropertyType addNewContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ContainerPropertyType target = null;
            target = (net.opengis.gml.ContainerPropertyType)get_store().add_element_user(CONTAINER$0);
            return target;
        }
    }
}
