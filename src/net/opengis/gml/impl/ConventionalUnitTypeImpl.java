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
 * An XML ConventionalUnitType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class ConventionalUnitTypeImpl extends net.opengis.gml.impl.UnitDefinitionTypeImpl implements net.opengis.gml.ConventionalUnitType
{
    private static final long serialVersionUID = 1L;
    
    public ConventionalUnitTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONVERSIONTOPREFERREDUNIT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "conversionToPreferredUnit");
    private static final javax.xml.namespace.QName ROUGHCONVERSIONTOPREFERREDUNIT$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "roughConversionToPreferredUnit");
    private static final javax.xml.namespace.QName DERIVATIONUNITTERM$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "derivationUnitTerm");
    
    
    /**
     * Gets the "conversionToPreferredUnit" element
     */
    public net.opengis.gml.ConversionToPreferredUnitType getConversionToPreferredUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ConversionToPreferredUnitType target = null;
            target = (net.opengis.gml.ConversionToPreferredUnitType)get_store().find_element_user(CONVERSIONTOPREFERREDUNIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "conversionToPreferredUnit" element
     */
    public boolean isSetConversionToPreferredUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONVERSIONTOPREFERREDUNIT$0) != 0;
        }
    }
    
    /**
     * Sets the "conversionToPreferredUnit" element
     */
    @Inject(optional=true) public void setConversionToPreferredUnit(net.opengis.gml.ConversionToPreferredUnitType conversionToPreferredUnit)
    {
        generatedSetterHelperImpl(conversionToPreferredUnit, CONVERSIONTOPREFERREDUNIT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "conversionToPreferredUnit" element
     */
    public net.opengis.gml.ConversionToPreferredUnitType addNewConversionToPreferredUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ConversionToPreferredUnitType target = null;
            target = (net.opengis.gml.ConversionToPreferredUnitType)get_store().add_element_user(CONVERSIONTOPREFERREDUNIT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "conversionToPreferredUnit" element
     */
    public void unsetConversionToPreferredUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONVERSIONTOPREFERREDUNIT$0, 0);
        }
    }
    
    /**
     * Gets the "roughConversionToPreferredUnit" element
     */
    public net.opengis.gml.ConversionToPreferredUnitType getRoughConversionToPreferredUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ConversionToPreferredUnitType target = null;
            target = (net.opengis.gml.ConversionToPreferredUnitType)get_store().find_element_user(ROUGHCONVERSIONTOPREFERREDUNIT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "roughConversionToPreferredUnit" element
     */
    public boolean isSetRoughConversionToPreferredUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROUGHCONVERSIONTOPREFERREDUNIT$2) != 0;
        }
    }
    
    /**
     * Sets the "roughConversionToPreferredUnit" element
     */
    @Inject(optional=true) public void setRoughConversionToPreferredUnit(net.opengis.gml.ConversionToPreferredUnitType roughConversionToPreferredUnit)
    {
        generatedSetterHelperImpl(roughConversionToPreferredUnit, ROUGHCONVERSIONTOPREFERREDUNIT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "roughConversionToPreferredUnit" element
     */
    public net.opengis.gml.ConversionToPreferredUnitType addNewRoughConversionToPreferredUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ConversionToPreferredUnitType target = null;
            target = (net.opengis.gml.ConversionToPreferredUnitType)get_store().add_element_user(ROUGHCONVERSIONTOPREFERREDUNIT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "roughConversionToPreferredUnit" element
     */
    public void unsetRoughConversionToPreferredUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROUGHCONVERSIONTOPREFERREDUNIT$2, 0);
        }
    }
    
    /**
     * Gets a List of "derivationUnitTerm" elements
     */
    public java.util.List<net.opengis.gml.DerivationUnitTermType> getDerivationUnitTermList()
    {
        final class DerivationUnitTermList extends java.util.AbstractList<net.opengis.gml.DerivationUnitTermType>
        {
            @Override
            public net.opengis.gml.DerivationUnitTermType get(int i)
                { return ConventionalUnitTypeImpl.this.getDerivationUnitTermArray(i); }
            
            @Override
            public net.opengis.gml.DerivationUnitTermType set(int i, net.opengis.gml.DerivationUnitTermType o)
            {
                net.opengis.gml.DerivationUnitTermType old = ConventionalUnitTypeImpl.this.getDerivationUnitTermArray(i);
                ConventionalUnitTypeImpl.this.setDerivationUnitTermArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.DerivationUnitTermType o)
                { ConventionalUnitTypeImpl.this.insertNewDerivationUnitTerm(i).set(o); }
            
            @Override
            public net.opengis.gml.DerivationUnitTermType remove(int i)
            {
                net.opengis.gml.DerivationUnitTermType old = ConventionalUnitTypeImpl.this.getDerivationUnitTermArray(i);
                ConventionalUnitTypeImpl.this.removeDerivationUnitTerm(i);
                return old;
            }
            
            @Override
            public int size()
                { return ConventionalUnitTypeImpl.this.sizeOfDerivationUnitTermArray(); }
            
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
            get_store().find_all_element_users(DERIVATIONUNITTERM$4, targetList);
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
            target = (net.opengis.gml.DerivationUnitTermType)get_store().find_element_user(DERIVATIONUNITTERM$4, i);
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
            return get_store().count_elements(DERIVATIONUNITTERM$4);
        }
    }
    
    /**
     * Sets array of all "derivationUnitTerm" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setDerivationUnitTermArray(net.opengis.gml.DerivationUnitTermType[] derivationUnitTermArray)
    {
        check_orphaned();
        arraySetterHelper(derivationUnitTermArray, DERIVATIONUNITTERM$4);
    }
    
    /**
     * Sets ith "derivationUnitTerm" element
     */
    @Inject(optional=true) public void setDerivationUnitTermArray(int i, net.opengis.gml.DerivationUnitTermType derivationUnitTerm)
    {
        generatedSetterHelperImpl(derivationUnitTerm, DERIVATIONUNITTERM$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
            target = (net.opengis.gml.DerivationUnitTermType)get_store().insert_element_user(DERIVATIONUNITTERM$4, i);
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
            target = (net.opengis.gml.DerivationUnitTermType)get_store().add_element_user(DERIVATIONUNITTERM$4);
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
            get_store().remove_element(DERIVATIONUNITTERM$4, i);
        }
    }
}
