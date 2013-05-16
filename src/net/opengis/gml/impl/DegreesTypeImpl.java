/*
 * XML Type:  DegreesType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DegreesType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML DegreesType(@http://www.opengis.net/gml).
 *
 * This is an atomic type that is a restriction of net.opengis.gml.DegreesType.
 */
public class DegreesTypeImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements net.opengis.gml.DegreesType
{
    private static final long serialVersionUID = 1L;
    
    public DegreesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected DegreesTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName DIRECTION$0 = 
        new javax.xml.namespace.QName("", "direction");
    
    
    /**
     * Gets the "direction" attribute
     */
    public java.lang.String getDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRECTION$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "direction" attribute
     */
    public net.opengis.gml.DegreesType.Direction xgetDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DegreesType.Direction target = null;
            target = (net.opengis.gml.DegreesType.Direction)get_store().find_attribute_user(DIRECTION$0);
            return target;
        }
    }
    
    /**
     * True if has "direction" attribute
     */
    public boolean isSetDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DIRECTION$0) != null;
        }
    }
    
    /**
     * Sets the "direction" attribute
     */
    @Inject(optional=true) public void setDirection(java.lang.String direction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRECTION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIRECTION$0);
            }
            target.setStringValue(direction);
        }
    }
    
    /**
     * Sets (as xml) the "direction" attribute
     */
    public void xsetDirection(net.opengis.gml.DegreesType.Direction direction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DegreesType.Direction target = null;
            target = (net.opengis.gml.DegreesType.Direction)get_store().find_attribute_user(DIRECTION$0);
            if (target == null)
            {
                target = (net.opengis.gml.DegreesType.Direction)get_store().add_attribute_user(DIRECTION$0);
            }
            target.set(direction);
        }
    }
    
    /**
     * Unsets the "direction" attribute
     */
    public void unsetDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DIRECTION$0);
        }
    }
    /**
     * An XML direction(@).
     *
     * This is a union type. Instances are of one of the following types:
     *     net.opengis.gml.DegreesType$Direction$Member
     *     net.opengis.gml.DegreesType$Direction$Member2
     */
    public static class DirectionImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements net.opengis.gml.DegreesType.Direction, net.opengis.gml.DegreesType.Direction.Member, net.opengis.gml.DegreesType.Direction.Member2
    {
        private static final long serialVersionUID = 1L;
        
        public DirectionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DirectionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        /**
         * An anonymous inner XML type.
         *
         * This is an atomic type that is a restriction of net.opengis.gml.DegreesType$Direction$Member.
         */
        public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements net.opengis.gml.DegreesType.Direction.Member
        {
            private static final long serialVersionUID = 1L;
            
            public MemberImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected MemberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An anonymous inner XML type.
         *
         * This is an atomic type that is a restriction of net.opengis.gml.DegreesType$Direction$Member2.
         */
        public static class MemberImpl2 extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements net.opengis.gml.DegreesType.Direction.Member2
        {
            private static final long serialVersionUID = 1L;
            
            public MemberImpl2(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected MemberImpl2(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
