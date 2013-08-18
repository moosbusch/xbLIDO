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
import org.moosbusch.museum.lido.inject.annotation.SortOrder;
/**
 * A document containing one sortorder(@http://www.lido-schema.org) attribute.
 *
 * This is a complex type.
 */
public class SortorderAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.SortorderAttribute
{
    private static final long serialVersionUID = 1L;

    public SortorderAttributeImpl(org.apache.xmlbeans.SchemaType sType)
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
    @Inject(optional=true) public void setSortorder(@SortOrder java.math.BigInteger sortorder)
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
