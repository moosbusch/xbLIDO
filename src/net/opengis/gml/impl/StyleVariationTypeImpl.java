/*
 * XML Type:  StyleVariationType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.StyleVariationType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML StyleVariationType(@http://www.opengis.net/gml).
 *
 * This is an atomic type that is a restriction of net.opengis.gml.StyleVariationType.
 */
public class StyleVariationTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements net.opengis.gml.StyleVariationType
{
    private static final long serialVersionUID = 1L;
    
    public StyleVariationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected StyleVariationTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName STYLEPROPERTY$0 = 
        new javax.xml.namespace.QName("", "styleProperty");
    private static final javax.xml.namespace.QName FEATUREPROPERTYRANGE$2 = 
        new javax.xml.namespace.QName("", "featurePropertyRange");
    
    
    /**
     * Gets the "styleProperty" attribute
     */
    public java.lang.String getStyleProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLEPROPERTY$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "styleProperty" attribute
     */
    public org.apache.xmlbeans.XmlString xgetStyleProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STYLEPROPERTY$0);
            return target;
        }
    }
    
    /**
     * Sets the "styleProperty" attribute
     */
    @Inject(optional=true) public void setStyleProperty(java.lang.String styleProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLEPROPERTY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLEPROPERTY$0);
            }
            target.setStringValue(styleProperty);
        }
    }
    
    /**
     * Sets (as xml) the "styleProperty" attribute
     */
    public void xsetStyleProperty(org.apache.xmlbeans.XmlString styleProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STYLEPROPERTY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STYLEPROPERTY$0);
            }
            target.set(styleProperty);
        }
    }
    
    /**
     * Gets the "featurePropertyRange" attribute
     */
    public java.lang.String getFeaturePropertyRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FEATUREPROPERTYRANGE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "featurePropertyRange" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFeaturePropertyRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FEATUREPROPERTYRANGE$2);
            return target;
        }
    }
    
    /**
     * True if has "featurePropertyRange" attribute
     */
    public boolean isSetFeaturePropertyRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FEATUREPROPERTYRANGE$2) != null;
        }
    }
    
    /**
     * Sets the "featurePropertyRange" attribute
     */
    @Inject(optional=true) public void setFeaturePropertyRange(java.lang.String featurePropertyRange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FEATUREPROPERTYRANGE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FEATUREPROPERTYRANGE$2);
            }
            target.setStringValue(featurePropertyRange);
        }
    }
    
    /**
     * Sets (as xml) the "featurePropertyRange" attribute
     */
    public void xsetFeaturePropertyRange(org.apache.xmlbeans.XmlString featurePropertyRange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FEATUREPROPERTYRANGE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FEATUREPROPERTYRANGE$2);
            }
            target.set(featurePropertyRange);
        }
    }
    
    /**
     * Unsets the "featurePropertyRange" attribute
     */
    public void unsetFeaturePropertyRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FEATUREPROPERTYRANGE$2);
        }
    }
}
