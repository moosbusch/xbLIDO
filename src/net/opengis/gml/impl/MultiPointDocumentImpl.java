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
 * A document containing one MultiPoint(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MultiPointDocumentImpl extends net.opengis.gml.impl.GeometricAggregateDocumentImpl implements net.opengis.gml.MultiPointDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIPOINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiPoint");
    
    
    /**
     * Gets the "MultiPoint" element
     */
    public net.opengis.gml.MultiPointType getMultiPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiPointType target = null;
            target = (net.opengis.gml.MultiPointType)get_store().find_element_user(MULTIPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MultiPoint" element
     */
     public void setMultiPoint(net.opengis.gml.MultiPointType multiPoint)
    {
        generatedSetterHelperImpl(multiPoint, MULTIPOINT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MultiPoint" element
     */
    public net.opengis.gml.MultiPointType addNewMultiPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiPointType target = null;
            target = (net.opengis.gml.MultiPointType)get_store().add_element_user(MULTIPOINT$0);
            return target;
        }
    }
}
