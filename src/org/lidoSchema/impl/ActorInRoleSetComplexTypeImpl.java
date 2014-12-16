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
package org.lidoSchema.impl;  

/**
 * An XML actorInRoleSetComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class ActorInRoleSetComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.ActorInRoleSetComplexType
{
    private static final long serialVersionUID = 1L;

    public ActorInRoleSetComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName DISPLAYACTORINROLE$0 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "displayActorInRole");
    private static final javax.xml.namespace.QName ACTORINROLE$2 =
        new javax.xml.namespace.QName("http://www.lido-schema.org", "actorInRole");


    /**
     * Gets a List of "displayActorInRole" elements
     */
    public java.util.List<org.lidoSchema.TextComplexType> getDisplayActorInRoleList()
    {
        final class DisplayActorInRoleList extends java.util.AbstractList<org.lidoSchema.TextComplexType>
        {
            @Override
            public org.lidoSchema.TextComplexType get(int i)
                { return ActorInRoleSetComplexTypeImpl.this.getDisplayActorInRoleArray(i); }

            @Override
            public org.lidoSchema.TextComplexType set(int i, org.lidoSchema.TextComplexType o)
            {
                org.lidoSchema.TextComplexType old = ActorInRoleSetComplexTypeImpl.this.getDisplayActorInRoleArray(i);
                ActorInRoleSetComplexTypeImpl.this.setDisplayActorInRoleArray(i, o);
                return old;
            }

            @Override
            public void add(int i, org.lidoSchema.TextComplexType o)
                { ActorInRoleSetComplexTypeImpl.this.insertNewDisplayActorInRole(i).set(o); }

            @Override
            public org.lidoSchema.TextComplexType remove(int i)
            {
                org.lidoSchema.TextComplexType old = ActorInRoleSetComplexTypeImpl.this.getDisplayActorInRoleArray(i);
                ActorInRoleSetComplexTypeImpl.this.removeDisplayActorInRole(i);
                return old;
            }

            @Override
            public int size()
                { return ActorInRoleSetComplexTypeImpl.this.sizeOfDisplayActorInRoleArray(); }

        }

        synchronized (monitor())
        {
            check_orphaned();
            return new DisplayActorInRoleList();
        }
    }

    /**
     * Gets array of all "displayActorInRole" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.TextComplexType[] getDisplayActorInRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.TextComplexType> targetList = new java.util.ArrayList<org.lidoSchema.TextComplexType>();
            get_store().find_all_element_users(DISPLAYACTORINROLE$0, targetList);
            org.lidoSchema.TextComplexType[] result = new org.lidoSchema.TextComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }

    /**
     * Gets ith "displayActorInRole" element
     */
    public org.lidoSchema.TextComplexType getDisplayActorInRoleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().find_element_user(DISPLAYACTORINROLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }

    /**
     * Returns number of "displayActorInRole" element
     */
    public int sizeOfDisplayActorInRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYACTORINROLE$0);
        }
    }

    /**
     * Sets array of all "displayActorInRole" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setDisplayActorInRoleArray(org.lidoSchema.TextComplexType[] displayActorInRoleArray)
    {
        check_orphaned();
        arraySetterHelper(displayActorInRoleArray, DISPLAYACTORINROLE$0);
    }

    /**
     * Sets ith "displayActorInRole" element
     */
     public void setDisplayActorInRoleArray(int i, org.lidoSchema.TextComplexType displayActorInRole)
    {
        generatedSetterHelperImpl(displayActorInRole, DISPLAYACTORINROLE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }

    /**
     * Inserts and returns a new empty value (as xml) as the ith "displayActorInRole" element
     */
    public org.lidoSchema.TextComplexType insertNewDisplayActorInRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().insert_element_user(DISPLAYACTORINROLE$0, i);
            return target;
        }
    }

    /**
     * Appends and returns a new empty value (as xml) as the last "displayActorInRole" element
     */
    public org.lidoSchema.TextComplexType addNewDisplayActorInRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().add_element_user(DISPLAYACTORINROLE$0);
            return target;
        }
    }

    /**
     * Removes the ith "displayActorInRole" element
     */
    public void removeDisplayActorInRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYACTORINROLE$0, i);
        }
    }

    /**
     * Gets the "actorInRole" element
     */
    public org.lidoSchema.ActorInRoleComplexType getActorInRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ActorInRoleComplexType target = null;
            target = (org.lidoSchema.ActorInRoleComplexType)get_store().find_element_user(ACTORINROLE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * True if has "actorInRole" element
     */
    public boolean isSetActorInRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTORINROLE$2) != 0;
        }
    }

    /**
     * Sets the "actorInRole" element
     */
     public void setActorInRole(org.lidoSchema.ActorInRoleComplexType actorInRole)
    {
        generatedSetterHelperImpl(actorInRole, ACTORINROLE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "actorInRole" element
     */
    public org.lidoSchema.ActorInRoleComplexType addNewActorInRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.ActorInRoleComplexType target = null;
            target = (org.lidoSchema.ActorInRoleComplexType)get_store().add_element_user(ACTORINROLE$2);
            return target;
        }
    }

    /**
     * Unsets the "actorInRole" element
     */
    public void unsetActorInRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTORINROLE$2, 0);
        }
    }
}
