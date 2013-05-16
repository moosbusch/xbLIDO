/*
 * An XML document type.
 * Localname: _positionalAccuracy
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.PositionalAccuracyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _positionalAccuracy(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class PositionalAccuracyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.PositionalAccuracyDocument
{
    private static final long serialVersionUID = 1L;
    
    public PositionalAccuracyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSITIONALACCURACY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_positionalAccuracy");
    private static final org.apache.xmlbeans.QNameSet POSITIONALACCURACY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_positionalAccuracy"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "absoluteExternalPositionalAccuracy"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "relativeInternalPositionalAccuracy"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "covarianceMatrix"),
    });
    
    
    /**
     * Gets the "_positionalAccuracy" element
     */
    public net.opengis.gml.AbstractPositionalAccuracyType getPositionalAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractPositionalAccuracyType target = null;
            target = (net.opengis.gml.AbstractPositionalAccuracyType)get_store().find_element_user(POSITIONALACCURACY$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_positionalAccuracy" element
     */
    @Inject(optional=true) public void setPositionalAccuracy(net.opengis.gml.AbstractPositionalAccuracyType positionalAccuracy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractPositionalAccuracyType target = null;
            target = (net.opengis.gml.AbstractPositionalAccuracyType)get_store().find_element_user(POSITIONALACCURACY$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractPositionalAccuracyType)get_store().add_element_user(POSITIONALACCURACY$0);
            }
            target.set(positionalAccuracy);
        }
    }
    
    /**
     * Appends and returns a new empty "_positionalAccuracy" element
     */
    public net.opengis.gml.AbstractPositionalAccuracyType addNewPositionalAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractPositionalAccuracyType target = null;
            target = (net.opengis.gml.AbstractPositionalAccuracyType)get_store().add_element_user(POSITIONALACCURACY$0);
            return target;
        }
    }
}
