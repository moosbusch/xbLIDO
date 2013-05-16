/*
 * An XML document type.
 * Localname: _SingleOperation
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SingleOperationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _SingleOperation(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SingleOperationDocumentImpl extends net.opengis.gml.impl.CoordinateOperationDocumentImpl implements net.opengis.gml.SingleOperationDocument
{
    private static final long serialVersionUID = 1L;
    
    public SingleOperationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SINGLEOPERATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_SingleOperation");
    private static final org.apache.xmlbeans.QNameSet SINGLEOPERATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Conversion"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "PassThroughOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralTransformation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Operation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_SingleOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Transformation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralConversion"),
    });
    
    
    /**
     * Gets the "_SingleOperation" element
     */
    public net.opengis.gml.AbstractCoordinateOperationType getSingleOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCoordinateOperationType target = null;
            target = (net.opengis.gml.AbstractCoordinateOperationType)get_store().find_element_user(SINGLEOPERATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_SingleOperation" element
     */
    @Inject(optional=true) public void setSingleOperation(net.opengis.gml.AbstractCoordinateOperationType singleOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCoordinateOperationType target = null;
            target = (net.opengis.gml.AbstractCoordinateOperationType)get_store().find_element_user(SINGLEOPERATION$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractCoordinateOperationType)get_store().add_element_user(SINGLEOPERATION$0);
            }
            target.set(singleOperation);
        }
    }
    
    /**
     * Appends and returns a new empty "_SingleOperation" element
     */
    public net.opengis.gml.AbstractCoordinateOperationType addNewSingleOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCoordinateOperationType target = null;
            target = (net.opengis.gml.AbstractCoordinateOperationType)get_store().add_element_user(SINGLEOPERATION$0);
            return target;
        }
    }
}