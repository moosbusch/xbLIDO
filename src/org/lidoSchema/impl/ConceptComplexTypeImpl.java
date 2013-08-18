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
package org.lidoSchema.impl;  import com.google.inject.Inject;
/**
 * An XML conceptComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class ConceptComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.ConceptComplexType
{
    private static final long serialVersionUID = 1L;
    
    public ConceptComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONCEPTID$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "conceptID");
    private static final javax.xml.namespace.QName TERM$2 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "term");
    
    
    /**
     * Gets a List of "conceptID" elements
     */
    public java.util.List<org.lidoSchema.IdentifierComplexType> getConceptIDList()
    {
        final class ConceptIDList extends java.util.AbstractList<org.lidoSchema.IdentifierComplexType>
        {
            @Override
            public org.lidoSchema.IdentifierComplexType get(int i)
                { return ConceptComplexTypeImpl.this.getConceptIDArray(i); }
            
            @Override
            public org.lidoSchema.IdentifierComplexType set(int i, org.lidoSchema.IdentifierComplexType o)
            {
                org.lidoSchema.IdentifierComplexType old = ConceptComplexTypeImpl.this.getConceptIDArray(i);
                ConceptComplexTypeImpl.this.setConceptIDArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.IdentifierComplexType o)
                { ConceptComplexTypeImpl.this.insertNewConceptID(i).set(o); }
            
            @Override
            public org.lidoSchema.IdentifierComplexType remove(int i)
            {
                org.lidoSchema.IdentifierComplexType old = ConceptComplexTypeImpl.this.getConceptIDArray(i);
                ConceptComplexTypeImpl.this.removeConceptID(i);
                return old;
            }
            
            @Override
            public int size()
                { return ConceptComplexTypeImpl.this.sizeOfConceptIDArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ConceptIDList();
        }
    }
    
    /**
     * Gets array of all "conceptID" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.IdentifierComplexType[] getConceptIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.IdentifierComplexType> targetList = new java.util.ArrayList<org.lidoSchema.IdentifierComplexType>();
            get_store().find_all_element_users(CONCEPTID$0, targetList);
            org.lidoSchema.IdentifierComplexType[] result = new org.lidoSchema.IdentifierComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "conceptID" element
     */
    public org.lidoSchema.IdentifierComplexType getConceptIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().find_element_user(CONCEPTID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "conceptID" element
     */
    public int sizeOfConceptIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPTID$0);
        }
    }
    
    /**
     * Sets array of all "conceptID" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setConceptIDArray(org.lidoSchema.IdentifierComplexType[] conceptIDArray)
    {
        check_orphaned();
        arraySetterHelper(conceptIDArray, CONCEPTID$0);
    }
    
    /**
     * Sets ith "conceptID" element
     */
    @Inject(optional=true) public void setConceptIDArray(int i, org.lidoSchema.IdentifierComplexType conceptID)
    {
        generatedSetterHelperImpl(conceptID, CONCEPTID$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "conceptID" element
     */
    public org.lidoSchema.IdentifierComplexType insertNewConceptID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().insert_element_user(CONCEPTID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "conceptID" element
     */
    public org.lidoSchema.IdentifierComplexType addNewConceptID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().add_element_user(CONCEPTID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "conceptID" element
     */
    public void removeConceptID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPTID$0, i);
        }
    }
    
    /**
     * Gets a List of "term" elements
     */
    public java.util.List<org.lidoSchema.TermComplexType> getTermList()
    {
        final class TermList extends java.util.AbstractList<org.lidoSchema.TermComplexType>
        {
            @Override
            public org.lidoSchema.TermComplexType get(int i)
                { return ConceptComplexTypeImpl.this.getTermArray(i); }
            
            @Override
            public org.lidoSchema.TermComplexType set(int i, org.lidoSchema.TermComplexType o)
            {
                org.lidoSchema.TermComplexType old = ConceptComplexTypeImpl.this.getTermArray(i);
                ConceptComplexTypeImpl.this.setTermArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.TermComplexType o)
                { ConceptComplexTypeImpl.this.insertNewTerm(i).set(o); }
            
            @Override
            public org.lidoSchema.TermComplexType remove(int i)
            {
                org.lidoSchema.TermComplexType old = ConceptComplexTypeImpl.this.getTermArray(i);
                ConceptComplexTypeImpl.this.removeTerm(i);
                return old;
            }
            
            @Override
            public int size()
                { return ConceptComplexTypeImpl.this.sizeOfTermArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TermList();
        }
    }
    
    /**
     * Gets array of all "term" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.TermComplexType[] getTermArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.TermComplexType> targetList = new java.util.ArrayList<org.lidoSchema.TermComplexType>();
            get_store().find_all_element_users(TERM$2, targetList);
            org.lidoSchema.TermComplexType[] result = new org.lidoSchema.TermComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "term" element
     */
    public org.lidoSchema.TermComplexType getTermArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TermComplexType target = null;
            target = (org.lidoSchema.TermComplexType)get_store().find_element_user(TERM$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "term" element
     */
    public int sizeOfTermArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TERM$2);
        }
    }
    
    /**
     * Sets array of all "term" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setTermArray(org.lidoSchema.TermComplexType[] termArray)
    {
        check_orphaned();
        arraySetterHelper(termArray, TERM$2);
    }
    
    /**
     * Sets ith "term" element
     */
    @Inject(optional=true) public void setTermArray(int i, org.lidoSchema.TermComplexType term)
    {
        generatedSetterHelperImpl(term, TERM$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "term" element
     */
    public org.lidoSchema.TermComplexType insertNewTerm(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TermComplexType target = null;
            target = (org.lidoSchema.TermComplexType)get_store().insert_element_user(TERM$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "term" element
     */
    public org.lidoSchema.TermComplexType addNewTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TermComplexType target = null;
            target = (org.lidoSchema.TermComplexType)get_store().add_element_user(TERM$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "term" element
     */
    public void removeTerm(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TERM$2, i);
        }
    }
}
