/*
 * XML Type:  LabelType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.LabelType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML LabelType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class LabelTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.LabelType
{
    private static final long serialVersionUID = 1L;
    
    public LabelTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABELEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LabelExpression");
    private static final javax.xml.namespace.QName TRANSFORM$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "transform");
    
    
    /**
     * Gets a List of "LabelExpression" elements
     */
    public java.util.List<java.lang.String> getLabelExpressionList()
    {
        final class LabelExpressionList extends java.util.AbstractList<java.lang.String>
        {
            @Override
            public java.lang.String get(int i)
                { return LabelTypeImpl.this.getLabelExpressionArray(i); }
            
            @Override
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = LabelTypeImpl.this.getLabelExpressionArray(i);
                LabelTypeImpl.this.setLabelExpressionArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.lang.String o)
                { LabelTypeImpl.this.insertLabelExpression(i, o); }
            
            @Override
            public java.lang.String remove(int i)
            {
                java.lang.String old = LabelTypeImpl.this.getLabelExpressionArray(i);
                LabelTypeImpl.this.removeLabelExpression(i);
                return old;
            }
            
            @Override
            public int size()
                { return LabelTypeImpl.this.sizeOfLabelExpressionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LabelExpressionList();
        }
    }
    
    /**
     * Gets array of all "LabelExpression" elements
     * @deprecated
     */
    @Deprecated
    public java.lang.String[] getLabelExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(LABELEXPRESSION$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "LabelExpression" element
     */
    public java.lang.String getLabelExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABELEXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "LabelExpression" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetLabelExpressionList()
    {
        final class LabelExpressionList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            @Override
            public org.apache.xmlbeans.XmlString get(int i)
                { return LabelTypeImpl.this.xgetLabelExpressionArray(i); }
            
            @Override
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = LabelTypeImpl.this.xgetLabelExpressionArray(i);
                LabelTypeImpl.this.xsetLabelExpressionArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { LabelTypeImpl.this.insertNewLabelExpression(i).set(o); }
            
            @Override
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = LabelTypeImpl.this.xgetLabelExpressionArray(i);
                LabelTypeImpl.this.removeLabelExpression(i);
                return old;
            }
            
            @Override
            public int size()
                { return LabelTypeImpl.this.sizeOfLabelExpressionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LabelExpressionList();
        }
    }
    
    /**
     * Gets array of all "LabelExpression" elements
     * @deprecated
     */
    @Deprecated
    public org.apache.xmlbeans.XmlString[] xgetLabelExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(LABELEXPRESSION$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "LabelExpression" element
     */
    public org.apache.xmlbeans.XmlString xgetLabelExpressionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LABELEXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "LabelExpression" element
     */
    public int sizeOfLabelExpressionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LABELEXPRESSION$0);
        }
    }
    
    /**
     * Sets array of all "LabelExpression" element
     */
    @Inject(optional=true) public void setLabelExpressionArray(java.lang.String[] labelExpressionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(labelExpressionArray, LABELEXPRESSION$0);
        }
    }
    
    /**
     * Sets ith "LabelExpression" element
     */
    @Inject(optional=true) public void setLabelExpressionArray(int i, java.lang.String labelExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABELEXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(labelExpression);
        }
    }
    
    /**
     * Sets (as xml) array of all "LabelExpression" element
     */
    public void xsetLabelExpressionArray(org.apache.xmlbeans.XmlString[]labelExpressionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(labelExpressionArray, LABELEXPRESSION$0);
        }
    }
    
    /**
     * Sets (as xml) ith "LabelExpression" element
     */
    public void xsetLabelExpressionArray(int i, org.apache.xmlbeans.XmlString labelExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LABELEXPRESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(labelExpression);
        }
    }
    
    /**
     * Inserts the value as the ith "LabelExpression" element
     */
    public void insertLabelExpression(int i, java.lang.String labelExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(LABELEXPRESSION$0, i);
            target.setStringValue(labelExpression);
        }
    }
    
    /**
     * Appends the value as the last "LabelExpression" element
     */
    public void addLabelExpression(java.lang.String labelExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LABELEXPRESSION$0);
            target.setStringValue(labelExpression);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LabelExpression" element
     */
    public org.apache.xmlbeans.XmlString insertNewLabelExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(LABELEXPRESSION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LabelExpression" element
     */
    public org.apache.xmlbeans.XmlString addNewLabelExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LABELEXPRESSION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "LabelExpression" element
     */
    public void removeLabelExpression(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LABELEXPRESSION$0, i);
        }
    }
    
    /**
     * Gets the "transform" attribute
     */
    public java.lang.String getTransform()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSFORM$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "transform" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTransform()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TRANSFORM$2);
            return target;
        }
    }
    
    /**
     * True if has "transform" attribute
     */
    public boolean isSetTransform()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TRANSFORM$2) != null;
        }
    }
    
    /**
     * Sets the "transform" attribute
     */
    @Inject(optional=true) public void setTransform(java.lang.String transform)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSFORM$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRANSFORM$2);
            }
            target.setStringValue(transform);
        }
    }
    
    /**
     * Sets (as xml) the "transform" attribute
     */
    public void xsetTransform(org.apache.xmlbeans.XmlString transform)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TRANSFORM$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TRANSFORM$2);
            }
            target.set(transform);
        }
    }
    
    /**
     * Unsets the "transform" attribute
     */
    public void unsetTransform()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TRANSFORM$2);
        }
    }
}
