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
 * A document containing one MultiLineString(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MultiLineStringDocumentImpl extends net.opengis.gml.impl.GeometricAggregateDocumentImpl implements net.opengis.gml.MultiLineStringDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiLineStringDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTILINESTRING$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiLineString");
    
    
    /**
     * Gets the "MultiLineString" element
     */
    public net.opengis.gml.MultiLineStringType getMultiLineString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiLineStringType target = null;
            target = (net.opengis.gml.MultiLineStringType)get_store().find_element_user(MULTILINESTRING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MultiLineString" element
     */
     public void setMultiLineString(net.opengis.gml.MultiLineStringType multiLineString)
    {
        generatedSetterHelperImpl(multiLineString, MULTILINESTRING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MultiLineString" element
     */
    public net.opengis.gml.MultiLineStringType addNewMultiLineString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiLineStringType target = null;
            target = (net.opengis.gml.MultiLineStringType)get_store().add_element_user(MULTILINESTRING$0);
            return target;
        }
    }
}
