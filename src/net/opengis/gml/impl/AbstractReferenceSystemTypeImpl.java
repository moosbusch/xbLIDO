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
 * An XML AbstractReferenceSystemType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class AbstractReferenceSystemTypeImpl extends net.opengis.gml.impl.AbstractReferenceSystemBaseTypeImpl implements net.opengis.gml.AbstractReferenceSystemType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractReferenceSystemTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SRSID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "srsID");
    private static final javax.xml.namespace.QName REMARKS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "remarks");
    private static final javax.xml.namespace.QName VALIDAREA$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "validArea");
    private static final javax.xml.namespace.QName SCOPE$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "scope");
    
    
    /**
     * Gets a List of "srsID" elements
     */
    public java.util.List<net.opengis.gml.IdentifierType> getSrsIDList()
    {
        final class SrsIDList extends java.util.AbstractList<net.opengis.gml.IdentifierType>
        {
            @Override
            public net.opengis.gml.IdentifierType get(int i)
                { return AbstractReferenceSystemTypeImpl.this.getSrsIDArray(i); }
            
            @Override
            public net.opengis.gml.IdentifierType set(int i, net.opengis.gml.IdentifierType o)
            {
                net.opengis.gml.IdentifierType old = AbstractReferenceSystemTypeImpl.this.getSrsIDArray(i);
                AbstractReferenceSystemTypeImpl.this.setSrsIDArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.IdentifierType o)
                { AbstractReferenceSystemTypeImpl.this.insertNewSrsID(i).set(o); }
            
            @Override
            public net.opengis.gml.IdentifierType remove(int i)
            {
                net.opengis.gml.IdentifierType old = AbstractReferenceSystemTypeImpl.this.getSrsIDArray(i);
                AbstractReferenceSystemTypeImpl.this.removeSrsID(i);
                return old;
            }
            
            @Override
            public int size()
                { return AbstractReferenceSystemTypeImpl.this.sizeOfSrsIDArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SrsIDList();
        }
    }
    
    /**
     * Gets array of all "srsID" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.IdentifierType[] getSrsIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.IdentifierType> targetList = new java.util.ArrayList<net.opengis.gml.IdentifierType>();
            get_store().find_all_element_users(SRSID$0, targetList);
            net.opengis.gml.IdentifierType[] result = new net.opengis.gml.IdentifierType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "srsID" element
     */
    public net.opengis.gml.IdentifierType getSrsIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().find_element_user(SRSID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "srsID" element
     */
    public int sizeOfSrsIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SRSID$0);
        }
    }
    
    /**
     * Sets array of all "srsID" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setSrsIDArray(net.opengis.gml.IdentifierType[] srsIDArray)
    {
        check_orphaned();
        arraySetterHelper(srsIDArray, SRSID$0);
    }
    
    /**
     * Sets ith "srsID" element
     */
     public void setSrsIDArray(int i, net.opengis.gml.IdentifierType srsID)
    {
        generatedSetterHelperImpl(srsID, SRSID$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "srsID" element
     */
    public net.opengis.gml.IdentifierType insertNewSrsID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().insert_element_user(SRSID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "srsID" element
     */
    public net.opengis.gml.IdentifierType addNewSrsID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().add_element_user(SRSID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "srsID" element
     */
    public void removeSrsID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SRSID$0, i);
        }
    }
    
    /**
     * Gets the "remarks" element
     */
    public net.opengis.gml.StringOrRefType getRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().find_element_user(REMARKS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "remarks" element
     */
    public boolean isSetRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REMARKS$2) != 0;
        }
    }
    
    /**
     * Sets the "remarks" element
     */
     public void setRemarks(net.opengis.gml.StringOrRefType remarks)
    {
        generatedSetterHelperImpl(remarks, REMARKS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "remarks" element
     */
    public net.opengis.gml.StringOrRefType addNewRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().add_element_user(REMARKS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "remarks" element
     */
    public void unsetRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REMARKS$2, 0);
        }
    }
    
    /**
     * Gets the "validArea" element
     */
    public net.opengis.gml.ExtentType getValidArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ExtentType target = null;
            target = (net.opengis.gml.ExtentType)get_store().find_element_user(VALIDAREA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "validArea" element
     */
    public boolean isSetValidArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDAREA$4) != 0;
        }
    }
    
    /**
     * Sets the "validArea" element
     */
     public void setValidArea(net.opengis.gml.ExtentType validArea)
    {
        generatedSetterHelperImpl(validArea, VALIDAREA$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "validArea" element
     */
    public net.opengis.gml.ExtentType addNewValidArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ExtentType target = null;
            target = (net.opengis.gml.ExtentType)get_store().add_element_user(VALIDAREA$4);
            return target;
        }
    }
    
    /**
     * Unsets the "validArea" element
     */
    public void unsetValidArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDAREA$4, 0);
        }
    }
    
    /**
     * Gets the "scope" element
     */
    public java.lang.String getScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "scope" element
     */
    public org.apache.xmlbeans.XmlString xgetScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOPE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "scope" element
     */
    public boolean isSetScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCOPE$6) != 0;
        }
    }
    
    /**
     * Sets the "scope" element
     */
     public void setScope(java.lang.String scope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCOPE$6);
            }
            target.setStringValue(scope);
        }
    }
    
    /**
     * Sets (as xml) the "scope" element
     */
    public void xsetScope(org.apache.xmlbeans.XmlString scope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCOPE$6);
            }
            target.set(scope);
        }
    }
    
    /**
     * Unsets the "scope" element
     */
    public void unsetScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCOPE$6, 0);
        }
    }
}
