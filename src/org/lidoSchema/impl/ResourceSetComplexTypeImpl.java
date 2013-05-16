/*
 * XML Type:  resourceSetComplexType
 * Namespace: http://www.lido-schema.org
 * Java type: org.lidoSchema.ResourceSetComplexType
 *
 * Automatically generated - do not modify.
 */
package org.lidoSchema.impl;  import com.google.inject.Inject;
/**
 * An XML resourceSetComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class ResourceSetComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.ResourceSetComplexType
{
    private static final long serialVersionUID = 1L;
    
    public ResourceSetComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEID$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "resourceID");
    private static final javax.xml.namespace.QName RESOURCEREPRESENTATION$2 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "resourceRepresentation");
    private static final javax.xml.namespace.QName RESOURCETYPE$4 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "resourceType");
    private static final javax.xml.namespace.QName RESOURCERELTYPE$6 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "resourceRelType");
    private static final javax.xml.namespace.QName RESOURCEPERSPECTIVE$8 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "resourcePerspective");
    private static final javax.xml.namespace.QName RESOURCEDESCRIPTION$10 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "resourceDescription");
    private static final javax.xml.namespace.QName RESOURCEDATETAKEN$12 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "resourceDateTaken");
    private static final javax.xml.namespace.QName RESOURCESOURCE$14 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "resourceSource");
    private static final javax.xml.namespace.QName RIGHTSRESOURCE$16 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "rightsResource");
    
    
    /**
     * Gets the "resourceID" element
     */
    public org.lidoSchema.IdentifierComplexType getResourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().find_element_user(RESOURCEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "resourceID" element
     */
    public boolean isSetResourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEID$0) != 0;
        }
    }
    
    /**
     * Sets the "resourceID" element
     */
    @Inject(optional=true) public void setResourceID(org.lidoSchema.IdentifierComplexType resourceID)
    {
        generatedSetterHelperImpl(resourceID, RESOURCEID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resourceID" element
     */
    public org.lidoSchema.IdentifierComplexType addNewResourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.IdentifierComplexType target = null;
            target = (org.lidoSchema.IdentifierComplexType)get_store().add_element_user(RESOURCEID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "resourceID" element
     */
    public void unsetResourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEID$0, 0);
        }
    }
    
    /**
     * Gets a List of "resourceRepresentation" elements
     */
    public java.util.List<org.lidoSchema.ResourceSetComplexType.ResourceRepresentation> getResourceRepresentationList()
    {
        final class ResourceRepresentationList extends java.util.AbstractList<org.lidoSchema.ResourceSetComplexType.ResourceRepresentation>
        {
            @Override
            public org.lidoSchema.ResourceSetComplexType.ResourceRepresentation get(int i)
                { return ResourceSetComplexTypeImpl.this.getResourceRepresentationArray(i); }
            
            @Override
            public org.lidoSchema.ResourceSetComplexType.ResourceRepresentation set(int i, org.lidoSchema.ResourceSetComplexType.ResourceRepresentation o)
            {
                org.lidoSchema.ResourceSetComplexType.ResourceRepresentation old = ResourceSetComplexTypeImpl.this.getResourceRepresentationArray(i);
                ResourceSetComplexTypeImpl.this.setResourceRepresentationArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.ResourceSetComplexType.ResourceRepresentation o)
                { ResourceSetComplexTypeImpl.this.insertNewResourceRepresentation(i).set(o); }
            
            @Override
            public org.lidoSchema.ResourceSetComplexType.ResourceRepresentation remove(int i)
            {
                org.lidoSchema.ResourceSetComplexType.ResourceRepresentation old = ResourceSetComplexTypeImpl.this.getResourceRepresentationArray(i);
                ResourceSetComplexTypeImpl.this.removeResourceRepresentation(i);
                return old;
            }
            
            @Override
            public int size()
                { return ResourceSetComplexTypeImpl.this.sizeOfResourceRepresentationArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ResourceRepresentationList();
        }
    }
    
    /**
     * Gets array of all "resourceRepresentation" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.ResourceSetComplexType.ResourceRepresentation[] getResourceRepresentationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.ResourceSetComplexType.ResourceRepresentation> targetList = new java.util.ArrayList<org.lidoSchema.ResourceSetComplexType.ResourceRepresentation>();
            get_store().find_all_element_users(RESOURCEREPRESENTATION$2, targetList);
            org.lidoSchema.ResourceSetComplexType.ResourceRepresentation[] result = new org.lidoSchema.ResourceSetComplexType.ResourceRepresentation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resourceRepresentation" element
     */
    public org.lidoSchema.ResourceSetComplexType.ResourceRepresentation getResourceRepresentationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ResourceSetComplexType.ResourceRepresentation target = null;
            target = (org.lidoSchema.ResourceSetComplexType.ResourceRepresentation)get_store().find_element_user(RESOURCEREPRESENTATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resourceRepresentation" element
     */
    public int sizeOfResourceRepresentationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEREPRESENTATION$2);
        }
    }
    
    /**
     * Sets array of all "resourceRepresentation" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setResourceRepresentationArray(org.lidoSchema.ResourceSetComplexType.ResourceRepresentation[] resourceRepresentationArray)
    {
        check_orphaned();
        arraySetterHelper(resourceRepresentationArray, RESOURCEREPRESENTATION$2);
    }
    
    /**
     * Sets ith "resourceRepresentation" element
     */
    @Inject(optional=true) public void setResourceRepresentationArray(int i, org.lidoSchema.ResourceSetComplexType.ResourceRepresentation resourceRepresentation)
    {
        generatedSetterHelperImpl(resourceRepresentation, RESOURCEREPRESENTATION$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resourceRepresentation" element
     */
    public org.lidoSchema.ResourceSetComplexType.ResourceRepresentation insertNewResourceRepresentation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ResourceSetComplexType.ResourceRepresentation target = null;
            target = (org.lidoSchema.ResourceSetComplexType.ResourceRepresentation)get_store().insert_element_user(RESOURCEREPRESENTATION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resourceRepresentation" element
     */
    public org.lidoSchema.ResourceSetComplexType.ResourceRepresentation addNewResourceRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ResourceSetComplexType.ResourceRepresentation target = null;
            target = (org.lidoSchema.ResourceSetComplexType.ResourceRepresentation)get_store().add_element_user(RESOURCEREPRESENTATION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "resourceRepresentation" element
     */
    public void removeResourceRepresentation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEREPRESENTATION$2, i);
        }
    }
    
    /**
     * Gets the "resourceType" element
     */
    public org.lidoSchema.ConceptComplexType getResourceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ConceptComplexType target = null;
            target = (org.lidoSchema.ConceptComplexType)get_store().find_element_user(RESOURCETYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "resourceType" element
     */
    public boolean isSetResourceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCETYPE$4) != 0;
        }
    }
    
    /**
     * Sets the "resourceType" element
     */
    @Inject(optional=true) public void setResourceType(org.lidoSchema.ConceptComplexType resourceType)
    {
        generatedSetterHelperImpl(resourceType, RESOURCETYPE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resourceType" element
     */
    public org.lidoSchema.ConceptComplexType addNewResourceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ConceptComplexType target = null;
            target = (org.lidoSchema.ConceptComplexType)get_store().add_element_user(RESOURCETYPE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "resourceType" element
     */
    public void unsetResourceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCETYPE$4, 0);
        }
    }
    
    /**
     * Gets a List of "resourceRelType" elements
     */
    public java.util.List<org.lidoSchema.ConceptComplexType> getResourceRelTypeList()
    {
        final class ResourceRelTypeList extends java.util.AbstractList<org.lidoSchema.ConceptComplexType>
        {
            @Override
            public org.lidoSchema.ConceptComplexType get(int i)
                { return ResourceSetComplexTypeImpl.this.getResourceRelTypeArray(i); }
            
            @Override
            public org.lidoSchema.ConceptComplexType set(int i, org.lidoSchema.ConceptComplexType o)
            {
                org.lidoSchema.ConceptComplexType old = ResourceSetComplexTypeImpl.this.getResourceRelTypeArray(i);
                ResourceSetComplexTypeImpl.this.setResourceRelTypeArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.ConceptComplexType o)
                { ResourceSetComplexTypeImpl.this.insertNewResourceRelType(i).set(o); }
            
            @Override
            public org.lidoSchema.ConceptComplexType remove(int i)
            {
                org.lidoSchema.ConceptComplexType old = ResourceSetComplexTypeImpl.this.getResourceRelTypeArray(i);
                ResourceSetComplexTypeImpl.this.removeResourceRelType(i);
                return old;
            }
            
            @Override
            public int size()
                { return ResourceSetComplexTypeImpl.this.sizeOfResourceRelTypeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ResourceRelTypeList();
        }
    }
    
    /**
     * Gets array of all "resourceRelType" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.ConceptComplexType[] getResourceRelTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.ConceptComplexType> targetList = new java.util.ArrayList<org.lidoSchema.ConceptComplexType>();
            get_store().find_all_element_users(RESOURCERELTYPE$6, targetList);
            org.lidoSchema.ConceptComplexType[] result = new org.lidoSchema.ConceptComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resourceRelType" element
     */
    public org.lidoSchema.ConceptComplexType getResourceRelTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ConceptComplexType target = null;
            target = (org.lidoSchema.ConceptComplexType)get_store().find_element_user(RESOURCERELTYPE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resourceRelType" element
     */
    public int sizeOfResourceRelTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCERELTYPE$6);
        }
    }
    
    /**
     * Sets array of all "resourceRelType" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setResourceRelTypeArray(org.lidoSchema.ConceptComplexType[] resourceRelTypeArray)
    {
        check_orphaned();
        arraySetterHelper(resourceRelTypeArray, RESOURCERELTYPE$6);
    }
    
    /**
     * Sets ith "resourceRelType" element
     */
    @Inject(optional=true) public void setResourceRelTypeArray(int i, org.lidoSchema.ConceptComplexType resourceRelType)
    {
        generatedSetterHelperImpl(resourceRelType, RESOURCERELTYPE$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resourceRelType" element
     */
    public org.lidoSchema.ConceptComplexType insertNewResourceRelType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ConceptComplexType target = null;
            target = (org.lidoSchema.ConceptComplexType)get_store().insert_element_user(RESOURCERELTYPE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resourceRelType" element
     */
    public org.lidoSchema.ConceptComplexType addNewResourceRelType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ConceptComplexType target = null;
            target = (org.lidoSchema.ConceptComplexType)get_store().add_element_user(RESOURCERELTYPE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "resourceRelType" element
     */
    public void removeResourceRelType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCERELTYPE$6, i);
        }
    }
    
    /**
     * Gets a List of "resourcePerspective" elements
     */
    public java.util.List<org.lidoSchema.ConceptComplexType> getResourcePerspectiveList()
    {
        final class ResourcePerspectiveList extends java.util.AbstractList<org.lidoSchema.ConceptComplexType>
        {
            @Override
            public org.lidoSchema.ConceptComplexType get(int i)
                { return ResourceSetComplexTypeImpl.this.getResourcePerspectiveArray(i); }
            
            @Override
            public org.lidoSchema.ConceptComplexType set(int i, org.lidoSchema.ConceptComplexType o)
            {
                org.lidoSchema.ConceptComplexType old = ResourceSetComplexTypeImpl.this.getResourcePerspectiveArray(i);
                ResourceSetComplexTypeImpl.this.setResourcePerspectiveArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.ConceptComplexType o)
                { ResourceSetComplexTypeImpl.this.insertNewResourcePerspective(i).set(o); }
            
            @Override
            public org.lidoSchema.ConceptComplexType remove(int i)
            {
                org.lidoSchema.ConceptComplexType old = ResourceSetComplexTypeImpl.this.getResourcePerspectiveArray(i);
                ResourceSetComplexTypeImpl.this.removeResourcePerspective(i);
                return old;
            }
            
            @Override
            public int size()
                { return ResourceSetComplexTypeImpl.this.sizeOfResourcePerspectiveArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ResourcePerspectiveList();
        }
    }
    
    /**
     * Gets array of all "resourcePerspective" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.ConceptComplexType[] getResourcePerspectiveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.ConceptComplexType> targetList = new java.util.ArrayList<org.lidoSchema.ConceptComplexType>();
            get_store().find_all_element_users(RESOURCEPERSPECTIVE$8, targetList);
            org.lidoSchema.ConceptComplexType[] result = new org.lidoSchema.ConceptComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resourcePerspective" element
     */
    public org.lidoSchema.ConceptComplexType getResourcePerspectiveArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ConceptComplexType target = null;
            target = (org.lidoSchema.ConceptComplexType)get_store().find_element_user(RESOURCEPERSPECTIVE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resourcePerspective" element
     */
    public int sizeOfResourcePerspectiveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEPERSPECTIVE$8);
        }
    }
    
    /**
     * Sets array of all "resourcePerspective" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setResourcePerspectiveArray(org.lidoSchema.ConceptComplexType[] resourcePerspectiveArray)
    {
        check_orphaned();
        arraySetterHelper(resourcePerspectiveArray, RESOURCEPERSPECTIVE$8);
    }
    
    /**
     * Sets ith "resourcePerspective" element
     */
    @Inject(optional=true) public void setResourcePerspectiveArray(int i, org.lidoSchema.ConceptComplexType resourcePerspective)
    {
        generatedSetterHelperImpl(resourcePerspective, RESOURCEPERSPECTIVE$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resourcePerspective" element
     */
    public org.lidoSchema.ConceptComplexType insertNewResourcePerspective(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ConceptComplexType target = null;
            target = (org.lidoSchema.ConceptComplexType)get_store().insert_element_user(RESOURCEPERSPECTIVE$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resourcePerspective" element
     */
    public org.lidoSchema.ConceptComplexType addNewResourcePerspective()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ConceptComplexType target = null;
            target = (org.lidoSchema.ConceptComplexType)get_store().add_element_user(RESOURCEPERSPECTIVE$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "resourcePerspective" element
     */
    public void removeResourcePerspective(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEPERSPECTIVE$8, i);
        }
    }
    
    /**
     * Gets a List of "resourceDescription" elements
     */
    public java.util.List<org.lidoSchema.ResourceSetComplexType.ResourceDescription> getResourceDescriptionList()
    {
        final class ResourceDescriptionList extends java.util.AbstractList<org.lidoSchema.ResourceSetComplexType.ResourceDescription>
        {
            @Override
            public org.lidoSchema.ResourceSetComplexType.ResourceDescription get(int i)
                { return ResourceSetComplexTypeImpl.this.getResourceDescriptionArray(i); }
            
            @Override
            public org.lidoSchema.ResourceSetComplexType.ResourceDescription set(int i, org.lidoSchema.ResourceSetComplexType.ResourceDescription o)
            {
                org.lidoSchema.ResourceSetComplexType.ResourceDescription old = ResourceSetComplexTypeImpl.this.getResourceDescriptionArray(i);
                ResourceSetComplexTypeImpl.this.setResourceDescriptionArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.ResourceSetComplexType.ResourceDescription o)
                { ResourceSetComplexTypeImpl.this.insertNewResourceDescription(i).set(o); }
            
            @Override
            public org.lidoSchema.ResourceSetComplexType.ResourceDescription remove(int i)
            {
                org.lidoSchema.ResourceSetComplexType.ResourceDescription old = ResourceSetComplexTypeImpl.this.getResourceDescriptionArray(i);
                ResourceSetComplexTypeImpl.this.removeResourceDescription(i);
                return old;
            }
            
            @Override
            public int size()
                { return ResourceSetComplexTypeImpl.this.sizeOfResourceDescriptionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ResourceDescriptionList();
        }
    }
    
    /**
     * Gets array of all "resourceDescription" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.ResourceSetComplexType.ResourceDescription[] getResourceDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.ResourceSetComplexType.ResourceDescription> targetList = new java.util.ArrayList<org.lidoSchema.ResourceSetComplexType.ResourceDescription>();
            get_store().find_all_element_users(RESOURCEDESCRIPTION$10, targetList);
            org.lidoSchema.ResourceSetComplexType.ResourceDescription[] result = new org.lidoSchema.ResourceSetComplexType.ResourceDescription[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resourceDescription" element
     */
    public org.lidoSchema.ResourceSetComplexType.ResourceDescription getResourceDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ResourceSetComplexType.ResourceDescription target = null;
            target = (org.lidoSchema.ResourceSetComplexType.ResourceDescription)get_store().find_element_user(RESOURCEDESCRIPTION$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resourceDescription" element
     */
    public int sizeOfResourceDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEDESCRIPTION$10);
        }
    }
    
    /**
     * Sets array of all "resourceDescription" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setResourceDescriptionArray(org.lidoSchema.ResourceSetComplexType.ResourceDescription[] resourceDescriptionArray)
    {
        check_orphaned();
        arraySetterHelper(resourceDescriptionArray, RESOURCEDESCRIPTION$10);
    }
    
    /**
     * Sets ith "resourceDescription" element
     */
    @Inject(optional=true) public void setResourceDescriptionArray(int i, org.lidoSchema.ResourceSetComplexType.ResourceDescription resourceDescription)
    {
        generatedSetterHelperImpl(resourceDescription, RESOURCEDESCRIPTION$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resourceDescription" element
     */
    public org.lidoSchema.ResourceSetComplexType.ResourceDescription insertNewResourceDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ResourceSetComplexType.ResourceDescription target = null;
            target = (org.lidoSchema.ResourceSetComplexType.ResourceDescription)get_store().insert_element_user(RESOURCEDESCRIPTION$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resourceDescription" element
     */
    public org.lidoSchema.ResourceSetComplexType.ResourceDescription addNewResourceDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ResourceSetComplexType.ResourceDescription target = null;
            target = (org.lidoSchema.ResourceSetComplexType.ResourceDescription)get_store().add_element_user(RESOURCEDESCRIPTION$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "resourceDescription" element
     */
    public void removeResourceDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEDESCRIPTION$10, i);
        }
    }
    
    /**
     * Gets the "resourceDateTaken" element
     */
    public org.lidoSchema.DateSetComplexType getResourceDateTaken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.DateSetComplexType target = null;
            target = (org.lidoSchema.DateSetComplexType)get_store().find_element_user(RESOURCEDATETAKEN$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "resourceDateTaken" element
     */
    public boolean isSetResourceDateTaken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEDATETAKEN$12) != 0;
        }
    }
    
    /**
     * Sets the "resourceDateTaken" element
     */
    @Inject(optional=true) public void setResourceDateTaken(org.lidoSchema.DateSetComplexType resourceDateTaken)
    {
        generatedSetterHelperImpl(resourceDateTaken, RESOURCEDATETAKEN$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resourceDateTaken" element
     */
    public org.lidoSchema.DateSetComplexType addNewResourceDateTaken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.DateSetComplexType target = null;
            target = (org.lidoSchema.DateSetComplexType)get_store().add_element_user(RESOURCEDATETAKEN$12);
            return target;
        }
    }
    
    /**
     * Unsets the "resourceDateTaken" element
     */
    public void unsetResourceDateTaken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEDATETAKEN$12, 0);
        }
    }
    
    /**
     * Gets a List of "resourceSource" elements
     */
    public java.util.List<org.lidoSchema.ResourceSetComplexType.ResourceSource> getResourceSourceList()
    {
        final class ResourceSourceList extends java.util.AbstractList<org.lidoSchema.ResourceSetComplexType.ResourceSource>
        {
            @Override
            public org.lidoSchema.ResourceSetComplexType.ResourceSource get(int i)
                { return ResourceSetComplexTypeImpl.this.getResourceSourceArray(i); }
            
            @Override
            public org.lidoSchema.ResourceSetComplexType.ResourceSource set(int i, org.lidoSchema.ResourceSetComplexType.ResourceSource o)
            {
                org.lidoSchema.ResourceSetComplexType.ResourceSource old = ResourceSetComplexTypeImpl.this.getResourceSourceArray(i);
                ResourceSetComplexTypeImpl.this.setResourceSourceArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.ResourceSetComplexType.ResourceSource o)
                { ResourceSetComplexTypeImpl.this.insertNewResourceSource(i).set(o); }
            
            @Override
            public org.lidoSchema.ResourceSetComplexType.ResourceSource remove(int i)
            {
                org.lidoSchema.ResourceSetComplexType.ResourceSource old = ResourceSetComplexTypeImpl.this.getResourceSourceArray(i);
                ResourceSetComplexTypeImpl.this.removeResourceSource(i);
                return old;
            }
            
            @Override
            public int size()
                { return ResourceSetComplexTypeImpl.this.sizeOfResourceSourceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ResourceSourceList();
        }
    }
    
    /**
     * Gets array of all "resourceSource" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.ResourceSetComplexType.ResourceSource[] getResourceSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.ResourceSetComplexType.ResourceSource> targetList = new java.util.ArrayList<org.lidoSchema.ResourceSetComplexType.ResourceSource>();
            get_store().find_all_element_users(RESOURCESOURCE$14, targetList);
            org.lidoSchema.ResourceSetComplexType.ResourceSource[] result = new org.lidoSchema.ResourceSetComplexType.ResourceSource[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resourceSource" element
     */
    public org.lidoSchema.ResourceSetComplexType.ResourceSource getResourceSourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ResourceSetComplexType.ResourceSource target = null;
            target = (org.lidoSchema.ResourceSetComplexType.ResourceSource)get_store().find_element_user(RESOURCESOURCE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resourceSource" element
     */
    public int sizeOfResourceSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCESOURCE$14);
        }
    }
    
    /**
     * Sets array of all "resourceSource" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setResourceSourceArray(org.lidoSchema.ResourceSetComplexType.ResourceSource[] resourceSourceArray)
    {
        check_orphaned();
        arraySetterHelper(resourceSourceArray, RESOURCESOURCE$14);
    }
    
    /**
     * Sets ith "resourceSource" element
     */
    @Inject(optional=true) public void setResourceSourceArray(int i, org.lidoSchema.ResourceSetComplexType.ResourceSource resourceSource)
    {
        generatedSetterHelperImpl(resourceSource, RESOURCESOURCE$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resourceSource" element
     */
    public org.lidoSchema.ResourceSetComplexType.ResourceSource insertNewResourceSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ResourceSetComplexType.ResourceSource target = null;
            target = (org.lidoSchema.ResourceSetComplexType.ResourceSource)get_store().insert_element_user(RESOURCESOURCE$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resourceSource" element
     */
    public org.lidoSchema.ResourceSetComplexType.ResourceSource addNewResourceSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ResourceSetComplexType.ResourceSource target = null;
            target = (org.lidoSchema.ResourceSetComplexType.ResourceSource)get_store().add_element_user(RESOURCESOURCE$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "resourceSource" element
     */
    public void removeResourceSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCESOURCE$14, i);
        }
    }
    
    /**
     * Gets a List of "rightsResource" elements
     */
    public java.util.List<org.lidoSchema.ResourceSetComplexType.RightsResource> getRightsResourceList()
    {
        final class RightsResourceList extends java.util.AbstractList<org.lidoSchema.ResourceSetComplexType.RightsResource>
        {
            @Override
            public org.lidoSchema.ResourceSetComplexType.RightsResource get(int i)
                { return ResourceSetComplexTypeImpl.this.getRightsResourceArray(i); }
            
            @Override
            public org.lidoSchema.ResourceSetComplexType.RightsResource set(int i, org.lidoSchema.ResourceSetComplexType.RightsResource o)
            {
                org.lidoSchema.ResourceSetComplexType.RightsResource old = ResourceSetComplexTypeImpl.this.getRightsResourceArray(i);
                ResourceSetComplexTypeImpl.this.setRightsResourceArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.ResourceSetComplexType.RightsResource o)
                { ResourceSetComplexTypeImpl.this.insertNewRightsResource(i).set(o); }
            
            @Override
            public org.lidoSchema.ResourceSetComplexType.RightsResource remove(int i)
            {
                org.lidoSchema.ResourceSetComplexType.RightsResource old = ResourceSetComplexTypeImpl.this.getRightsResourceArray(i);
                ResourceSetComplexTypeImpl.this.removeRightsResource(i);
                return old;
            }
            
            @Override
            public int size()
                { return ResourceSetComplexTypeImpl.this.sizeOfRightsResourceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RightsResourceList();
        }
    }
    
    /**
     * Gets array of all "rightsResource" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.ResourceSetComplexType.RightsResource[] getRightsResourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.ResourceSetComplexType.RightsResource> targetList = new java.util.ArrayList<org.lidoSchema.ResourceSetComplexType.RightsResource>();
            get_store().find_all_element_users(RIGHTSRESOURCE$16, targetList);
            org.lidoSchema.ResourceSetComplexType.RightsResource[] result = new org.lidoSchema.ResourceSetComplexType.RightsResource[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rightsResource" element
     */
    public org.lidoSchema.ResourceSetComplexType.RightsResource getRightsResourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ResourceSetComplexType.RightsResource target = null;
            target = (org.lidoSchema.ResourceSetComplexType.RightsResource)get_store().find_element_user(RIGHTSRESOURCE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rightsResource" element
     */
    public int sizeOfRightsResourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RIGHTSRESOURCE$16);
        }
    }
    
    /**
     * Sets array of all "rightsResource" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setRightsResourceArray(org.lidoSchema.ResourceSetComplexType.RightsResource[] rightsResourceArray)
    {
        check_orphaned();
        arraySetterHelper(rightsResourceArray, RIGHTSRESOURCE$16);
    }
    
    /**
     * Sets ith "rightsResource" element
     */
    @Inject(optional=true) public void setRightsResourceArray(int i, org.lidoSchema.ResourceSetComplexType.RightsResource rightsResource)
    {
        generatedSetterHelperImpl(rightsResource, RIGHTSRESOURCE$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rightsResource" element
     */
    public org.lidoSchema.ResourceSetComplexType.RightsResource insertNewRightsResource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ResourceSetComplexType.RightsResource target = null;
            target = (org.lidoSchema.ResourceSetComplexType.RightsResource)get_store().insert_element_user(RIGHTSRESOURCE$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rightsResource" element
     */
    public org.lidoSchema.ResourceSetComplexType.RightsResource addNewRightsResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ResourceSetComplexType.RightsResource target = null;
            target = (org.lidoSchema.ResourceSetComplexType.RightsResource)get_store().add_element_user(RIGHTSRESOURCE$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "rightsResource" element
     */
    public void removeRightsResource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RIGHTSRESOURCE$16, i);
        }
    }
    /**
     * An XML resourceRepresentation(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class ResourceRepresentationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.ResourceSetComplexType.ResourceRepresentation
    {
        private static final long serialVersionUID = 1L;
        
        public ResourceRepresentationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LINKRESOURCE$0 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "linkResource");
        private static final javax.xml.namespace.QName RESOURCEMEASUREMENTSSET$2 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "resourceMeasurementsSet");
        private static final javax.xml.namespace.QName TYPE$4 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "type");
        
        
        /**
         * Gets the "linkResource" element
         */
        public org.lidoSchema.ResourceSetComplexType.ResourceRepresentation.LinkResource getLinkResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.ResourceSetComplexType.ResourceRepresentation.LinkResource target = null;
                target = (org.lidoSchema.ResourceSetComplexType.ResourceRepresentation.LinkResource)get_store().find_element_user(LINKRESOURCE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "linkResource" element
         */
        @Inject(optional=true) public void setLinkResource(org.lidoSchema.ResourceSetComplexType.ResourceRepresentation.LinkResource linkResource)
        {
            generatedSetterHelperImpl(linkResource, LINKRESOURCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "linkResource" element
         */
        public org.lidoSchema.ResourceSetComplexType.ResourceRepresentation.LinkResource addNewLinkResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.ResourceSetComplexType.ResourceRepresentation.LinkResource target = null;
                target = (org.lidoSchema.ResourceSetComplexType.ResourceRepresentation.LinkResource)get_store().add_element_user(LINKRESOURCE$0);
                return target;
            }
        }
        
        /**
         * Gets a List of "resourceMeasurementsSet" elements
         */
        public java.util.List<org.lidoSchema.MeasurementsSetComplexType> getResourceMeasurementsSetList()
        {
            final class ResourceMeasurementsSetList extends java.util.AbstractList<org.lidoSchema.MeasurementsSetComplexType>
            {
                @Override
                public org.lidoSchema.MeasurementsSetComplexType get(int i)
                    { return ResourceRepresentationImpl.this.getResourceMeasurementsSetArray(i); }
                
                @Override
                public org.lidoSchema.MeasurementsSetComplexType set(int i, org.lidoSchema.MeasurementsSetComplexType o)
                {
                    org.lidoSchema.MeasurementsSetComplexType old = ResourceRepresentationImpl.this.getResourceMeasurementsSetArray(i);
                    ResourceRepresentationImpl.this.setResourceMeasurementsSetArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.lidoSchema.MeasurementsSetComplexType o)
                    { ResourceRepresentationImpl.this.insertNewResourceMeasurementsSet(i).set(o); }
                
                @Override
                public org.lidoSchema.MeasurementsSetComplexType remove(int i)
                {
                    org.lidoSchema.MeasurementsSetComplexType old = ResourceRepresentationImpl.this.getResourceMeasurementsSetArray(i);
                    ResourceRepresentationImpl.this.removeResourceMeasurementsSet(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ResourceRepresentationImpl.this.sizeOfResourceMeasurementsSetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ResourceMeasurementsSetList();
            }
        }
        
        /**
         * Gets array of all "resourceMeasurementsSet" elements
         * @deprecated
         */
        @Deprecated
        public org.lidoSchema.MeasurementsSetComplexType[] getResourceMeasurementsSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.lidoSchema.MeasurementsSetComplexType> targetList = new java.util.ArrayList<org.lidoSchema.MeasurementsSetComplexType>();
                get_store().find_all_element_users(RESOURCEMEASUREMENTSSET$2, targetList);
                org.lidoSchema.MeasurementsSetComplexType[] result = new org.lidoSchema.MeasurementsSetComplexType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "resourceMeasurementsSet" element
         */
        public org.lidoSchema.MeasurementsSetComplexType getResourceMeasurementsSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.MeasurementsSetComplexType target = null;
                target = (org.lidoSchema.MeasurementsSetComplexType)get_store().find_element_user(RESOURCEMEASUREMENTSSET$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "resourceMeasurementsSet" element
         */
        public int sizeOfResourceMeasurementsSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCEMEASUREMENTSSET$2);
            }
        }
        
        /**
         * Sets array of all "resourceMeasurementsSet" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setResourceMeasurementsSetArray(org.lidoSchema.MeasurementsSetComplexType[] resourceMeasurementsSetArray)
        {
            check_orphaned();
            arraySetterHelper(resourceMeasurementsSetArray, RESOURCEMEASUREMENTSSET$2);
        }
        
        /**
         * Sets ith "resourceMeasurementsSet" element
         */
        @Inject(optional=true) public void setResourceMeasurementsSetArray(int i, org.lidoSchema.MeasurementsSetComplexType resourceMeasurementsSet)
        {
            generatedSetterHelperImpl(resourceMeasurementsSet, RESOURCEMEASUREMENTSSET$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resourceMeasurementsSet" element
         */
        public org.lidoSchema.MeasurementsSetComplexType insertNewResourceMeasurementsSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.MeasurementsSetComplexType target = null;
                target = (org.lidoSchema.MeasurementsSetComplexType)get_store().insert_element_user(RESOURCEMEASUREMENTSSET$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resourceMeasurementsSet" element
         */
        public org.lidoSchema.MeasurementsSetComplexType addNewResourceMeasurementsSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.lidoSchema.MeasurementsSetComplexType target = null;
                target = (org.lidoSchema.MeasurementsSetComplexType)get_store().add_element_user(RESOURCEMEASUREMENTSSET$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "resourceMeasurementsSet" element
         */
        public void removeResourceMeasurementsSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCEMEASUREMENTSSET$2, i);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$4);
                return target;
            }
        }
        
        /**
         * True if has "type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$4) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        @Inject(optional=true) public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(org.apache.xmlbeans.XmlString type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$4);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$4);
            }
        }
        /**
         * An XML linkResource(@http://www.lido-schema.org).
         *
         * This is an atomic type that is a restriction of org.lidoSchema.ResourceSetComplexType$ResourceRepresentation$LinkResource.
         */
        public static class LinkResourceImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.lidoSchema.ResourceSetComplexType.ResourceRepresentation.LinkResource
        {
            private static final long serialVersionUID = 1L;
            
            public LinkResourceImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected LinkResourceImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName PREF$0 = 
                new javax.xml.namespace.QName("http://www.lido-schema.org", "pref");
            private static final javax.xml.namespace.QName FORMATRESOURCE$2 = 
                new javax.xml.namespace.QName("http://www.lido-schema.org", "formatResource");
            private static final javax.xml.namespace.QName LANG$4 = 
                new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
            private static final javax.xml.namespace.QName ENCODINGANALOG$6 = 
                new javax.xml.namespace.QName("http://www.lido-schema.org", "encodinganalog");
            private static final javax.xml.namespace.QName LABEL$8 = 
                new javax.xml.namespace.QName("http://www.lido-schema.org", "label");
            private static final javax.xml.namespace.QName CODECRESOURCE$10 = 
                new javax.xml.namespace.QName("http://www.lido-schema.org", "codecResource");
            
            
            /**
             * Gets the "pref" attribute
             */
            public java.lang.String getPref()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREF$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "pref" attribute
             */
            public org.apache.xmlbeans.XmlString xgetPref()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PREF$0);
                    return target;
                }
            }
            
            /**
             * True if has "pref" attribute
             */
            public boolean isSetPref()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(PREF$0) != null;
                }
            }
            
            /**
             * Sets the "pref" attribute
             */
            @Inject(optional=true) public void setPref(java.lang.String pref)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREF$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PREF$0);
                    }
                    target.setStringValue(pref);
                }
            }
            
            /**
             * Sets (as xml) the "pref" attribute
             */
            public void xsetPref(org.apache.xmlbeans.XmlString pref)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PREF$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PREF$0);
                    }
                    target.set(pref);
                }
            }
            
            /**
             * Unsets the "pref" attribute
             */
            public void unsetPref()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(PREF$0);
                }
            }
            
            /**
             * Gets the "formatResource" attribute
             */
            public java.lang.String getFormatResource()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMATRESOURCE$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "formatResource" attribute
             */
            public org.apache.xmlbeans.XmlString xgetFormatResource()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMATRESOURCE$2);
                    return target;
                }
            }
            
            /**
             * True if has "formatResource" attribute
             */
            public boolean isSetFormatResource()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(FORMATRESOURCE$2) != null;
                }
            }
            
            /**
             * Sets the "formatResource" attribute
             */
            @Inject(optional=true) public void setFormatResource(java.lang.String formatResource)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMATRESOURCE$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMATRESOURCE$2);
                    }
                    target.setStringValue(formatResource);
                }
            }
            
            /**
             * Sets (as xml) the "formatResource" attribute
             */
            public void xsetFormatResource(org.apache.xmlbeans.XmlString formatResource)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMATRESOURCE$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FORMATRESOURCE$2);
                    }
                    target.set(formatResource);
                }
            }
            
            /**
             * Unsets the "formatResource" attribute
             */
            public void unsetFormatResource()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(FORMATRESOURCE$2);
                }
            }
            
            /**
             * Gets the "lang" attribute
             */
            public java.lang.String getLang()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "lang" attribute
             */
            public org.apache.xmlbeans.XmlLanguage xgetLang()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlLanguage target = null;
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$4);
                    return target;
                }
            }
            
            /**
             * True if has "lang" attribute
             */
            public boolean isSetLang()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(LANG$4) != null;
                }
            }
            
            /**
             * Sets the "lang" attribute
             */
            @Inject(optional=true) public void setLang(java.lang.String lang)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$4);
                    }
                    target.setStringValue(lang);
                }
            }
            
            /**
             * Sets (as xml) the "lang" attribute
             */
            public void xsetLang(org.apache.xmlbeans.XmlLanguage lang)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlLanguage target = null;
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$4);
                    }
                    target.set(lang);
                }
            }
            
            /**
             * Unsets the "lang" attribute
             */
            public void unsetLang()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(LANG$4);
                }
            }
            
            /**
             * Gets the "encodinganalog" attribute
             */
            public java.lang.String getEncodinganalog()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$6);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "encodinganalog" attribute
             */
            public org.apache.xmlbeans.XmlString xgetEncodinganalog()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$6);
                    return target;
                }
            }
            
            /**
             * True if has "encodinganalog" attribute
             */
            public boolean isSetEncodinganalog()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(ENCODINGANALOG$6) != null;
                }
            }
            
            /**
             * Sets the "encodinganalog" attribute
             */
            @Inject(optional=true) public void setEncodinganalog(java.lang.String encodinganalog)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODINGANALOG$6);
                    }
                    target.setStringValue(encodinganalog);
                }
            }
            
            /**
             * Sets (as xml) the "encodinganalog" attribute
             */
            public void xsetEncodinganalog(org.apache.xmlbeans.XmlString encodinganalog)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENCODINGANALOG$6);
                    }
                    target.set(encodinganalog);
                }
            }
            
            /**
             * Unsets the "encodinganalog" attribute
             */
            public void unsetEncodinganalog()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(ENCODINGANALOG$6);
                }
            }
            
            /**
             * Gets the "label" attribute
             */
            public java.lang.String getLabel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$8);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "label" attribute
             */
            public org.apache.xmlbeans.XmlString xgetLabel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$8);
                    return target;
                }
            }
            
            /**
             * True if has "label" attribute
             */
            public boolean isSetLabel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(LABEL$8) != null;
                }
            }
            
            /**
             * Sets the "label" attribute
             */
            @Inject(optional=true) public void setLabel(java.lang.String label)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$8);
                    }
                    target.setStringValue(label);
                }
            }
            
            /**
             * Sets (as xml) the "label" attribute
             */
            public void xsetLabel(org.apache.xmlbeans.XmlString label)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LABEL$8);
                    }
                    target.set(label);
                }
            }
            
            /**
             * Unsets the "label" attribute
             */
            public void unsetLabel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(LABEL$8);
                }
            }
            
            /**
             * Gets the "codecResource" attribute
             */
            public java.lang.String getCodecResource()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECRESOURCE$10);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "codecResource" attribute
             */
            public org.apache.xmlbeans.XmlString xgetCodecResource()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODECRESOURCE$10);
                    return target;
                }
            }
            
            /**
             * True if has "codecResource" attribute
             */
            public boolean isSetCodecResource()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(CODECRESOURCE$10) != null;
                }
            }
            
            /**
             * Sets the "codecResource" attribute
             */
            @Inject(optional=true) public void setCodecResource(java.lang.String codecResource)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODECRESOURCE$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODECRESOURCE$10);
                    }
                    target.setStringValue(codecResource);
                }
            }
            
            /**
             * Sets (as xml) the "codecResource" attribute
             */
            public void xsetCodecResource(org.apache.xmlbeans.XmlString codecResource)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODECRESOURCE$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CODECRESOURCE$10);
                    }
                    target.set(codecResource);
                }
            }
            
            /**
             * Unsets the "codecResource" attribute
             */
            public void unsetCodecResource()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(CODECRESOURCE$10);
                }
            }
        }
    }
    /**
     * An XML resourceDescription(@http://www.lido-schema.org).
     *
     * This is an atomic type that is a restriction of org.lidoSchema.ResourceSetComplexType$ResourceDescription.
     */
    public static class ResourceDescriptionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.lidoSchema.ResourceSetComplexType.ResourceDescription
    {
        private static final long serialVersionUID = 1L;
        
        public ResourceDescriptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected ResourceDescriptionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName LANG$0 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        private static final javax.xml.namespace.QName ENCODINGANALOG$2 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "encodinganalog");
        private static final javax.xml.namespace.QName LABEL$4 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "label");
        private static final javax.xml.namespace.QName TYPE$6 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "type");
        private static final javax.xml.namespace.QName SORTORDER$8 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "sortorder");
        
        
        /**
         * Gets the "lang" attribute
         */
        public java.lang.String getLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "lang" attribute
         */
        public org.apache.xmlbeans.XmlLanguage xgetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$0);
                return target;
            }
        }
        
        /**
         * True if has "lang" attribute
         */
        public boolean isSetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LANG$0) != null;
            }
        }
        
        /**
         * Sets the "lang" attribute
         */
        @Inject(optional=true) public void setLang(java.lang.String lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$0);
                }
                target.setStringValue(lang);
            }
        }
        
        /**
         * Sets (as xml) the "lang" attribute
         */
        public void xsetLang(org.apache.xmlbeans.XmlLanguage lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$0);
                }
                target.set(lang);
            }
        }
        
        /**
         * Unsets the "lang" attribute
         */
        public void unsetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LANG$0);
            }
        }
        
        /**
         * Gets the "encodinganalog" attribute
         */
        public java.lang.String getEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "encodinganalog" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$2);
                return target;
            }
        }
        
        /**
         * True if has "encodinganalog" attribute
         */
        public boolean isSetEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENCODINGANALOG$2) != null;
            }
        }
        
        /**
         * Sets the "encodinganalog" attribute
         */
        @Inject(optional=true) public void setEncodinganalog(java.lang.String encodinganalog)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODINGANALOG$2);
                }
                target.setStringValue(encodinganalog);
            }
        }
        
        /**
         * Sets (as xml) the "encodinganalog" attribute
         */
        public void xsetEncodinganalog(org.apache.xmlbeans.XmlString encodinganalog)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENCODINGANALOG$2);
                }
                target.set(encodinganalog);
            }
        }
        
        /**
         * Unsets the "encodinganalog" attribute
         */
        public void unsetEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENCODINGANALOG$2);
            }
        }
        
        /**
         * Gets the "label" attribute
         */
        public java.lang.String getLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "label" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$4);
                return target;
            }
        }
        
        /**
         * True if has "label" attribute
         */
        public boolean isSetLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LABEL$4) != null;
            }
        }
        
        /**
         * Sets the "label" attribute
         */
        @Inject(optional=true) public void setLabel(java.lang.String label)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$4);
                }
                target.setStringValue(label);
            }
        }
        
        /**
         * Sets (as xml) the "label" attribute
         */
        public void xsetLabel(org.apache.xmlbeans.XmlString label)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LABEL$4);
                }
                target.set(label);
            }
        }
        
        /**
         * Unsets the "label" attribute
         */
        public void unsetLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LABEL$4);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$6);
                return target;
            }
        }
        
        /**
         * True if has "type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$6) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        @Inject(optional=true) public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$6);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(org.apache.xmlbeans.XmlString type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$6);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$6);
            }
        }
        
        /**
         * Gets the "sortorder" attribute
         */
        public java.math.BigInteger getSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$8);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "sortorder" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$8);
                return target;
            }
        }
        
        /**
         * True if has "sortorder" attribute
         */
        public boolean isSetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SORTORDER$8) != null;
            }
        }
        
        /**
         * Sets the "sortorder" attribute
         */
        @Inject(optional=true) public void setSortorder(java.math.BigInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTORDER$8);
                }
                target.setBigIntegerValue(sortorder);
            }
        }
        
        /**
         * Sets (as xml) the "sortorder" attribute
         */
        public void xsetSortorder(org.apache.xmlbeans.XmlInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SORTORDER$8);
                }
                target.set(sortorder);
            }
        }
        
        /**
         * Unsets the "sortorder" attribute
         */
        public void unsetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SORTORDER$8);
            }
        }
    }
    /**
     * An XML resourceSource(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class ResourceSourceImpl extends org.lidoSchema.impl.LegalBodyRefComplexTypeImpl implements org.lidoSchema.ResourceSetComplexType.ResourceSource
    {
        private static final long serialVersionUID = 1L;
        
        public ResourceSourceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "type");
        private static final javax.xml.namespace.QName SORTORDER$2 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "sortorder");
        
        
        /**
         * Gets the "type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * True if has "type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$0) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        @Inject(optional=true) public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(org.apache.xmlbeans.XmlString type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$0);
            }
        }
        
        /**
         * Gets the "sortorder" attribute
         */
        public java.math.BigInteger getSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$2);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "sortorder" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$2);
                return target;
            }
        }
        
        /**
         * True if has "sortorder" attribute
         */
        public boolean isSetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SORTORDER$2) != null;
            }
        }
        
        /**
         * Sets the "sortorder" attribute
         */
        @Inject(optional=true) public void setSortorder(java.math.BigInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTORDER$2);
                }
                target.setBigIntegerValue(sortorder);
            }
        }
        
        /**
         * Sets (as xml) the "sortorder" attribute
         */
        public void xsetSortorder(org.apache.xmlbeans.XmlInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SORTORDER$2);
                }
                target.set(sortorder);
            }
        }
        
        /**
         * Unsets the "sortorder" attribute
         */
        public void unsetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SORTORDER$2);
            }
        }
    }
    /**
     * An XML rightsResource(@http://www.lido-schema.org).
     *
     * This is a complex type.
     */
    public static class RightsResourceImpl extends org.lidoSchema.impl.RightsComplexTypeImpl implements org.lidoSchema.ResourceSetComplexType.RightsResource
    {
        private static final long serialVersionUID = 1L;
        
        public RightsResourceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SORTORDER$0 = 
            new javax.xml.namespace.QName("http://www.lido-schema.org", "sortorder");
        
        
        /**
         * Gets the "sortorder" attribute
         */
        public java.math.BigInteger getSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "sortorder" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$0);
                return target;
            }
        }
        
        /**
         * True if has "sortorder" attribute
         */
        public boolean isSetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SORTORDER$0) != null;
            }
        }
        
        /**
         * Sets the "sortorder" attribute
         */
        @Inject(optional=true) public void setSortorder(java.math.BigInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTORDER$0);
                }
                target.setBigIntegerValue(sortorder);
            }
        }
        
        /**
         * Sets (as xml) the "sortorder" attribute
         */
        public void xsetSortorder(org.apache.xmlbeans.XmlInteger sortorder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SORTORDER$0);
                }
                target.set(sortorder);
            }
        }
        
        /**
         * Unsets the "sortorder" attribute
         */
        public void unsetSortorder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SORTORDER$0);
            }
        }
    }
}
