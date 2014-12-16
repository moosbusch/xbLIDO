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
 * An XML AbstractCoordinateSystemType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class AbstractCoordinateSystemTypeImpl extends net.opengis.gml.impl.AbstractCoordinateSystemBaseTypeImpl implements net.opengis.gml.AbstractCoordinateSystemType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractCoordinateSystemTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CSID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "csID");
    private static final javax.xml.namespace.QName REMARKS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "remarks");
    private static final javax.xml.namespace.QName USESAXIS$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesAxis");
    
    
    /**
     * Gets a List of "csID" elements
     */
    public java.util.List<net.opengis.gml.IdentifierType> getCsIDList()
    {
        final class CsIDList extends java.util.AbstractList<net.opengis.gml.IdentifierType>
        {
            @Override
            public net.opengis.gml.IdentifierType get(int i)
                { return AbstractCoordinateSystemTypeImpl.this.getCsIDArray(i); }
            
            @Override
            public net.opengis.gml.IdentifierType set(int i, net.opengis.gml.IdentifierType o)
            {
                net.opengis.gml.IdentifierType old = AbstractCoordinateSystemTypeImpl.this.getCsIDArray(i);
                AbstractCoordinateSystemTypeImpl.this.setCsIDArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.IdentifierType o)
                { AbstractCoordinateSystemTypeImpl.this.insertNewCsID(i).set(o); }
            
            @Override
            public net.opengis.gml.IdentifierType remove(int i)
            {
                net.opengis.gml.IdentifierType old = AbstractCoordinateSystemTypeImpl.this.getCsIDArray(i);
                AbstractCoordinateSystemTypeImpl.this.removeCsID(i);
                return old;
            }
            
            @Override
            public int size()
                { return AbstractCoordinateSystemTypeImpl.this.sizeOfCsIDArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CsIDList();
        }
    }
    
    /**
     * Gets array of all "csID" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.IdentifierType[] getCsIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.IdentifierType> targetList = new java.util.ArrayList<net.opengis.gml.IdentifierType>();
            get_store().find_all_element_users(CSID$0, targetList);
            net.opengis.gml.IdentifierType[] result = new net.opengis.gml.IdentifierType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "csID" element
     */
    public net.opengis.gml.IdentifierType getCsIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().find_element_user(CSID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "csID" element
     */
    public int sizeOfCsIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CSID$0);
        }
    }
    
    /**
     * Sets array of all "csID" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setCsIDArray(net.opengis.gml.IdentifierType[] csIDArray)
    {
        check_orphaned();
        arraySetterHelper(csIDArray, CSID$0);
    }
    
    /**
     * Sets ith "csID" element
     */
     public void setCsIDArray(int i, net.opengis.gml.IdentifierType csID)
    {
        generatedSetterHelperImpl(csID, CSID$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "csID" element
     */
    public net.opengis.gml.IdentifierType insertNewCsID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().insert_element_user(CSID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "csID" element
     */
    public net.opengis.gml.IdentifierType addNewCsID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().add_element_user(CSID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "csID" element
     */
    public void removeCsID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CSID$0, i);
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
     * Gets a List of "usesAxis" elements
     */
    public java.util.List<net.opengis.gml.CoordinateSystemAxisRefType> getUsesAxisList()
    {
        final class UsesAxisList extends java.util.AbstractList<net.opengis.gml.CoordinateSystemAxisRefType>
        {
            @Override
            public net.opengis.gml.CoordinateSystemAxisRefType get(int i)
                { return AbstractCoordinateSystemTypeImpl.this.getUsesAxisArray(i); }
            
            @Override
            public net.opengis.gml.CoordinateSystemAxisRefType set(int i, net.opengis.gml.CoordinateSystemAxisRefType o)
            {
                net.opengis.gml.CoordinateSystemAxisRefType old = AbstractCoordinateSystemTypeImpl.this.getUsesAxisArray(i);
                AbstractCoordinateSystemTypeImpl.this.setUsesAxisArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.CoordinateSystemAxisRefType o)
                { AbstractCoordinateSystemTypeImpl.this.insertNewUsesAxis(i).set(o); }
            
            @Override
            public net.opengis.gml.CoordinateSystemAxisRefType remove(int i)
            {
                net.opengis.gml.CoordinateSystemAxisRefType old = AbstractCoordinateSystemTypeImpl.this.getUsesAxisArray(i);
                AbstractCoordinateSystemTypeImpl.this.removeUsesAxis(i);
                return old;
            }
            
            @Override
            public int size()
                { return AbstractCoordinateSystemTypeImpl.this.sizeOfUsesAxisArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new UsesAxisList();
        }
    }
    
    /**
     * Gets array of all "usesAxis" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.CoordinateSystemAxisRefType[] getUsesAxisArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.CoordinateSystemAxisRefType> targetList = new java.util.ArrayList<net.opengis.gml.CoordinateSystemAxisRefType>();
            get_store().find_all_element_users(USESAXIS$4, targetList);
            net.opengis.gml.CoordinateSystemAxisRefType[] result = new net.opengis.gml.CoordinateSystemAxisRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "usesAxis" element
     */
    public net.opengis.gml.CoordinateSystemAxisRefType getUsesAxisArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateSystemAxisRefType target = null;
            target = (net.opengis.gml.CoordinateSystemAxisRefType)get_store().find_element_user(USESAXIS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "usesAxis" element
     */
    public int sizeOfUsesAxisArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USESAXIS$4);
        }
    }
    
    /**
     * Sets array of all "usesAxis" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setUsesAxisArray(net.opengis.gml.CoordinateSystemAxisRefType[] usesAxisArray)
    {
        check_orphaned();
        arraySetterHelper(usesAxisArray, USESAXIS$4);
    }
    
    /**
     * Sets ith "usesAxis" element
     */
     public void setUsesAxisArray(int i, net.opengis.gml.CoordinateSystemAxisRefType usesAxis)
    {
        generatedSetterHelperImpl(usesAxis, USESAXIS$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "usesAxis" element
     */
    public net.opengis.gml.CoordinateSystemAxisRefType insertNewUsesAxis(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateSystemAxisRefType target = null;
            target = (net.opengis.gml.CoordinateSystemAxisRefType)get_store().insert_element_user(USESAXIS$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "usesAxis" element
     */
    public net.opengis.gml.CoordinateSystemAxisRefType addNewUsesAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateSystemAxisRefType target = null;
            target = (net.opengis.gml.CoordinateSystemAxisRefType)get_store().add_element_user(USESAXIS$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "usesAxis" element
     */
    public void removeUsesAxis(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USESAXIS$4, i);
        }
    }
}
