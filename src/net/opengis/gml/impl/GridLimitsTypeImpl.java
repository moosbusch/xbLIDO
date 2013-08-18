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
 * An XML GridLimitsType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class GridLimitsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.GridLimitsType
{
    private static final long serialVersionUID = 1L;
    
    public GridLimitsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GRIDENVELOPE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GridEnvelope");
    
    
    /**
     * Gets the "GridEnvelope" element
     */
    public net.opengis.gml.GridEnvelopeType getGridEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GridEnvelopeType target = null;
            target = (net.opengis.gml.GridEnvelopeType)get_store().find_element_user(GRIDENVELOPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GridEnvelope" element
     */
    @Inject(optional=true) public void setGridEnvelope(net.opengis.gml.GridEnvelopeType gridEnvelope)
    {
        generatedSetterHelperImpl(gridEnvelope, GRIDENVELOPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GridEnvelope" element
     */
    public net.opengis.gml.GridEnvelopeType addNewGridEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.GridEnvelopeType target = null;
            target = (net.opengis.gml.GridEnvelopeType)get_store().add_element_user(GRIDENVELOPE$0);
            return target;
        }
    }
}
