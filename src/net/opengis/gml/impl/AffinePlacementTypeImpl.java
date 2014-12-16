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
package net.opengis.gml.impl; 
/**
 * An XML AffinePlacementType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class AffinePlacementTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.AffinePlacementType
{
    private static final long serialVersionUID = 1L;
    
    public AffinePlacementTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "location");
    private static final javax.xml.namespace.QName REFDIRECTION$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "refDirection");
    private static final javax.xml.namespace.QName INDIMENSION$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "inDimension");
    private static final javax.xml.namespace.QName OUTDIMENSION$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "outDimension");
    
    
    /**
     * Gets the "location" element
     */
    public net.opengis.gml.DirectPositionType getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectPositionType target = null;
            target = (net.opengis.gml.DirectPositionType)get_store().find_element_user(LOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "location" element
     */
     public void setLocation(net.opengis.gml.DirectPositionType location)
    {
        generatedSetterHelperImpl(location, LOCATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "location" element
     */
    public net.opengis.gml.DirectPositionType addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectPositionType target = null;
            target = (net.opengis.gml.DirectPositionType)get_store().add_element_user(LOCATION$0);
            return target;
        }
    }
    
    /**
     * Gets a List of "refDirection" elements
     */
    public java.util.List<net.opengis.gml.VectorType> getRefDirectionList()
    {
        final class RefDirectionList extends java.util.AbstractList<net.opengis.gml.VectorType>
        {
            @Override
            public net.opengis.gml.VectorType get(int i)
                { return AffinePlacementTypeImpl.this.getRefDirectionArray(i); }
            
            @Override
            public net.opengis.gml.VectorType set(int i, net.opengis.gml.VectorType o)
            {
                net.opengis.gml.VectorType old = AffinePlacementTypeImpl.this.getRefDirectionArray(i);
                AffinePlacementTypeImpl.this.setRefDirectionArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.VectorType o)
                { AffinePlacementTypeImpl.this.insertNewRefDirection(i).set(o); }
            
            @Override
            public net.opengis.gml.VectorType remove(int i)
            {
                net.opengis.gml.VectorType old = AffinePlacementTypeImpl.this.getRefDirectionArray(i);
                AffinePlacementTypeImpl.this.removeRefDirection(i);
                return old;
            }
            
            @Override
            public int size()
                { return AffinePlacementTypeImpl.this.sizeOfRefDirectionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RefDirectionList();
        }
    }
    
    /**
     * Gets array of all "refDirection" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.VectorType[] getRefDirectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.VectorType> targetList = new java.util.ArrayList<net.opengis.gml.VectorType>();
            get_store().find_all_element_users(REFDIRECTION$2, targetList);
            net.opengis.gml.VectorType[] result = new net.opengis.gml.VectorType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "refDirection" element
     */
    public net.opengis.gml.VectorType getRefDirectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VectorType target = null;
            target = (net.opengis.gml.VectorType)get_store().find_element_user(REFDIRECTION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "refDirection" element
     */
    public int sizeOfRefDirectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFDIRECTION$2);
        }
    }
    
    /**
     * Sets array of all "refDirection" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setRefDirectionArray(net.opengis.gml.VectorType[] refDirectionArray)
    {
        check_orphaned();
        arraySetterHelper(refDirectionArray, REFDIRECTION$2);
    }
    
    /**
     * Sets ith "refDirection" element
     */
     public void setRefDirectionArray(int i, net.opengis.gml.VectorType refDirection)
    {
        generatedSetterHelperImpl(refDirection, REFDIRECTION$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "refDirection" element
     */
    public net.opengis.gml.VectorType insertNewRefDirection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VectorType target = null;
            target = (net.opengis.gml.VectorType)get_store().insert_element_user(REFDIRECTION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "refDirection" element
     */
    public net.opengis.gml.VectorType addNewRefDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.VectorType target = null;
            target = (net.opengis.gml.VectorType)get_store().add_element_user(REFDIRECTION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "refDirection" element
     */
    public void removeRefDirection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFDIRECTION$2, i);
        }
    }
    
    /**
     * Gets the "inDimension" element
     */
    public java.math.BigInteger getInDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDIMENSION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "inDimension" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetInDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(INDIMENSION$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "inDimension" element
     */
     public void setInDimension(java.math.BigInteger inDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDIMENSION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INDIMENSION$4);
            }
            target.setBigIntegerValue(inDimension);
        }
    }
    
    /**
     * Sets (as xml) the "inDimension" element
     */
    public void xsetInDimension(org.apache.xmlbeans.XmlPositiveInteger inDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(INDIMENSION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(INDIMENSION$4);
            }
            target.set(inDimension);
        }
    }
    
    /**
     * Gets the "outDimension" element
     */
    public java.math.BigInteger getOutDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTDIMENSION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "outDimension" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetOutDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(OUTDIMENSION$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "outDimension" element
     */
     public void setOutDimension(java.math.BigInteger outDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTDIMENSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OUTDIMENSION$6);
            }
            target.setBigIntegerValue(outDimension);
        }
    }
    
    /**
     * Sets (as xml) the "outDimension" element
     */
    public void xsetOutDimension(org.apache.xmlbeans.XmlPositiveInteger outDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(OUTDIMENSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(OUTDIMENSION$6);
            }
            target.set(outDimension);
        }
    }
}
