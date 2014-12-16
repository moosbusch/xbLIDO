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
 * An XML DerivedUnitType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class DerivedUnitTypeImpl extends net.opengis.gml.impl.UnitDefinitionTypeImpl implements net.opengis.gml.DerivedUnitType
{
    private static final long serialVersionUID = 1L;
    
    public DerivedUnitTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DERIVATIONUNITTERM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "derivationUnitTerm");
    
    
    /**
     * Gets a List of "derivationUnitTerm" elements
     */
    public java.util.List<net.opengis.gml.DerivationUnitTermType> getDerivationUnitTermList()
    {
        final class DerivationUnitTermList extends java.util.AbstractList<net.opengis.gml.DerivationUnitTermType>
        {
            @Override
            public net.opengis.gml.DerivationUnitTermType get(int i)
                { return DerivedUnitTypeImpl.this.getDerivationUnitTermArray(i); }
            
            @Override
            public net.opengis.gml.DerivationUnitTermType set(int i, net.opengis.gml.DerivationUnitTermType o)
            {
                net.opengis.gml.DerivationUnitTermType old = DerivedUnitTypeImpl.this.getDerivationUnitTermArray(i);
                DerivedUnitTypeImpl.this.setDerivationUnitTermArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.DerivationUnitTermType o)
                { DerivedUnitTypeImpl.this.insertNewDerivationUnitTerm(i).set(o); }
            
            @Override
            public net.opengis.gml.DerivationUnitTermType remove(int i)
            {
                net.opengis.gml.DerivationUnitTermType old = DerivedUnitTypeImpl.this.getDerivationUnitTermArray(i);
                DerivedUnitTypeImpl.this.removeDerivationUnitTerm(i);
                return old;
            }
            
            @Override
            public int size()
                { return DerivedUnitTypeImpl.this.sizeOfDerivationUnitTermArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DerivationUnitTermList();
        }
    }
    
    /**
     * Gets array of all "derivationUnitTerm" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.DerivationUnitTermType[] getDerivationUnitTermArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.DerivationUnitTermType> targetList = new java.util.ArrayList<net.opengis.gml.DerivationUnitTermType>();
            get_store().find_all_element_users(DERIVATIONUNITTERM$0, targetList);
            net.opengis.gml.DerivationUnitTermType[] result = new net.opengis.gml.DerivationUnitTermType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "derivationUnitTerm" element
     */
    public net.opengis.gml.DerivationUnitTermType getDerivationUnitTermArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DerivationUnitTermType target = null;
            target = (net.opengis.gml.DerivationUnitTermType)get_store().find_element_user(DERIVATIONUNITTERM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "derivationUnitTerm" element
     */
    public int sizeOfDerivationUnitTermArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DERIVATIONUNITTERM$0);
        }
    }
    
    /**
     * Sets array of all "derivationUnitTerm" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setDerivationUnitTermArray(net.opengis.gml.DerivationUnitTermType[] derivationUnitTermArray)
    {
        check_orphaned();
        arraySetterHelper(derivationUnitTermArray, DERIVATIONUNITTERM$0);
    }
    
    /**
     * Sets ith "derivationUnitTerm" element
     */
     public void setDerivationUnitTermArray(int i, net.opengis.gml.DerivationUnitTermType derivationUnitTerm)
    {
        generatedSetterHelperImpl(derivationUnitTerm, DERIVATIONUNITTERM$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "derivationUnitTerm" element
     */
    public net.opengis.gml.DerivationUnitTermType insertNewDerivationUnitTerm(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DerivationUnitTermType target = null;
            target = (net.opengis.gml.DerivationUnitTermType)get_store().insert_element_user(DERIVATIONUNITTERM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "derivationUnitTerm" element
     */
    public net.opengis.gml.DerivationUnitTermType addNewDerivationUnitTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DerivationUnitTermType target = null;
            target = (net.opengis.gml.DerivationUnitTermType)get_store().add_element_user(DERIVATIONUNITTERM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "derivationUnitTerm" element
     */
    public void removeDerivationUnitTerm(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DERIVATIONUNITTERM$0, i);
        }
    }
}
