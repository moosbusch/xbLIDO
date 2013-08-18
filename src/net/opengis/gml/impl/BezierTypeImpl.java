/* 
 * Copyright 2013 Gunnar Kappei.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML BezierType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class BezierTypeImpl extends net.opengis.gml.impl.BSplineTypeImpl implements net.opengis.gml.BezierType
{
    private static final long serialVersionUID = 1L;
    
    public BezierTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KNOT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "knot");
    private static final javax.xml.namespace.QName ISPOLYNOMIAL$2 = 
        new javax.xml.namespace.QName("", "isPolynomial");
    
    
    /**
     * Gets a List of "knot" elements
     */
    public java.util.List<net.opengis.gml.KnotPropertyType> getKnotList()
    {
        final class KnotList extends java.util.AbstractList<net.opengis.gml.KnotPropertyType>
        {
            @Override
            public net.opengis.gml.KnotPropertyType get(int i)
                { return BezierTypeImpl.this.getKnotArray(i); }
            
            @Override
            public net.opengis.gml.KnotPropertyType set(int i, net.opengis.gml.KnotPropertyType o)
            {
                net.opengis.gml.KnotPropertyType old = BezierTypeImpl.this.getKnotArray(i);
                BezierTypeImpl.this.setKnotArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.KnotPropertyType o)
                { BezierTypeImpl.this.insertNewKnot(i).set(o); }
            
            @Override
            public net.opengis.gml.KnotPropertyType remove(int i)
            {
                net.opengis.gml.KnotPropertyType old = BezierTypeImpl.this.getKnotArray(i);
                BezierTypeImpl.this.removeKnot(i);
                return old;
            }
            
            @Override
            public int size()
                { return BezierTypeImpl.this.sizeOfKnotArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new KnotList();
        }
    }
    
    /**
     * Gets array of all "knot" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.KnotPropertyType[] getKnotArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.KnotPropertyType> targetList = new java.util.ArrayList<net.opengis.gml.KnotPropertyType>();
            get_store().find_all_element_users(KNOT$0, targetList);
            net.opengis.gml.KnotPropertyType[] result = new net.opengis.gml.KnotPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "knot" element
     */
    public net.opengis.gml.KnotPropertyType getKnotArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.KnotPropertyType target = null;
            target = (net.opengis.gml.KnotPropertyType)get_store().find_element_user(KNOT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "knot" element
     */
    public int sizeOfKnotArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KNOT$0);
        }
    }
    
    /**
     * Sets array of all "knot" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setKnotArray(net.opengis.gml.KnotPropertyType[] knotArray)
    {
        check_orphaned();
        arraySetterHelper(knotArray, KNOT$0);
    }
    
    /**
     * Sets ith "knot" element
     */
    @Inject(optional=true) public void setKnotArray(int i, net.opengis.gml.KnotPropertyType knot)
    {
        generatedSetterHelperImpl(knot, KNOT$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "knot" element
     */
    public net.opengis.gml.KnotPropertyType insertNewKnot(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.KnotPropertyType target = null;
            target = (net.opengis.gml.KnotPropertyType)get_store().insert_element_user(KNOT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "knot" element
     */
    public net.opengis.gml.KnotPropertyType addNewKnot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.KnotPropertyType target = null;
            target = (net.opengis.gml.KnotPropertyType)get_store().add_element_user(KNOT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "knot" element
     */
    public void removeKnot(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KNOT$0, i);
        }
    }
    
    /**
     * Gets the "isPolynomial" attribute
     */
    public boolean getIsPolynomial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISPOLYNOMIAL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISPOLYNOMIAL$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isPolynomial" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsPolynomial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISPOLYNOMIAL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISPOLYNOMIAL$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "isPolynomial" attribute
     */
    public boolean isSetIsPolynomial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISPOLYNOMIAL$2) != null;
        }
    }
    
    /**
     * Sets the "isPolynomial" attribute
     */
    @Inject(optional=true) public void setIsPolynomial(boolean isPolynomial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISPOLYNOMIAL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISPOLYNOMIAL$2);
            }
            target.setBooleanValue(isPolynomial);
        }
    }
    
    /**
     * Sets (as xml) the "isPolynomial" attribute
     */
    public void xsetIsPolynomial(org.apache.xmlbeans.XmlBoolean isPolynomial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISPOLYNOMIAL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISPOLYNOMIAL$2);
            }
            target.set(isPolynomial);
        }
    }
    
    /**
     * Unsets the "isPolynomial" attribute
     */
    public void unsetIsPolynomial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISPOLYNOMIAL$2);
        }
    }
}
