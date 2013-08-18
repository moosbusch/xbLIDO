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
 * A document containing one TemporalDatum(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TemporalDatumDocumentImpl extends net.opengis.gml.impl.DatumDocumentImpl implements net.opengis.gml.TemporalDatumDocument
{
    private static final long serialVersionUID = 1L;
    
    public TemporalDatumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEMPORALDATUM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TemporalDatum");
    
    
    /**
     * Gets the "TemporalDatum" element
     */
    public net.opengis.gml.TemporalDatumType getTemporalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TemporalDatumType target = null;
            target = (net.opengis.gml.TemporalDatumType)get_store().find_element_user(TEMPORALDATUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TemporalDatum" element
     */
    @Inject(optional=true) public void setTemporalDatum(net.opengis.gml.TemporalDatumType temporalDatum)
    {
        generatedSetterHelperImpl(temporalDatum, TEMPORALDATUM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TemporalDatum" element
     */
    public net.opengis.gml.TemporalDatumType addNewTemporalDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TemporalDatumType target = null;
            target = (net.opengis.gml.TemporalDatumType)get_store().add_element_user(TEMPORALDATUM$0);
            return target;
        }
    }
}
