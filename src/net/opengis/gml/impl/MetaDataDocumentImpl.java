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
 * A document containing one _MetaData(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MetaDataDocumentImpl extends net.opengis.gml.impl.ObjectDocumentImpl implements net.opengis.gml.MetaDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public MetaDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATA$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_MetaData");
    private static final org.apache.xmlbeans.QNameSet METADATA$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GenericMetaData"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_MetaData"),
    });
    
    
    /**
     * Gets the "_MetaData" element
     */
    public net.opengis.gml.AbstractMetaDataType getMetaData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractMetaDataType target = null;
            target = (net.opengis.gml.AbstractMetaDataType)get_store().find_element_user(METADATA$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_MetaData" element
     */
     public void setMetaData(net.opengis.gml.AbstractMetaDataType metaData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractMetaDataType target = null;
            target = (net.opengis.gml.AbstractMetaDataType)get_store().find_element_user(METADATA$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractMetaDataType)get_store().add_element_user(METADATA$0);
            }
            target.set(metaData);
        }
    }
    
    /**
     * Appends and returns a new empty "_MetaData" element
     */
    public net.opengis.gml.AbstractMetaDataType addNewMetaData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractMetaDataType target = null;
            target = (net.opengis.gml.AbstractMetaDataType)get_store().add_element_user(METADATA$0);
            return target;
        }
    }
}
