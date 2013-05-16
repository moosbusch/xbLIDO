/*
 * An XML document type.
 * Localname: absoluteExternalPositionalAccuracy
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.AbsoluteExternalPositionalAccuracyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one absoluteExternalPositionalAccuracy(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class AbsoluteExternalPositionalAccuracyDocumentImpl extends net.opengis.gml.impl.PositionalAccuracyDocumentImpl implements net.opengis.gml.AbsoluteExternalPositionalAccuracyDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbsoluteExternalPositionalAccuracyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSOLUTEEXTERNALPOSITIONALACCURACY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "absoluteExternalPositionalAccuracy");
    
    
    /**
     * Gets the "absoluteExternalPositionalAccuracy" element
     */
    public net.opengis.gml.AbsoluteExternalPositionalAccuracyType getAbsoluteExternalPositionalAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbsoluteExternalPositionalAccuracyType target = null;
            target = (net.opengis.gml.AbsoluteExternalPositionalAccuracyType)get_store().find_element_user(ABSOLUTEEXTERNALPOSITIONALACCURACY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "absoluteExternalPositionalAccuracy" element
     */
    @Inject(optional=true) public void setAbsoluteExternalPositionalAccuracy(net.opengis.gml.AbsoluteExternalPositionalAccuracyType absoluteExternalPositionalAccuracy)
    {
        generatedSetterHelperImpl(absoluteExternalPositionalAccuracy, ABSOLUTEEXTERNALPOSITIONALACCURACY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "absoluteExternalPositionalAccuracy" element
     */
    public net.opengis.gml.AbsoluteExternalPositionalAccuracyType addNewAbsoluteExternalPositionalAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbsoluteExternalPositionalAccuracyType target = null;
            target = (net.opengis.gml.AbsoluteExternalPositionalAccuracyType)get_store().add_element_user(ABSOLUTEEXTERNALPOSITIONALACCURACY$0);
            return target;
        }
    }
}
