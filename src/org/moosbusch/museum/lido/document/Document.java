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
package org.moosbusch.museum.lido.document;

import org.lidoSchema.LidoWrapDocument;
import org.lidoSchema.LidoWrapDocument.LidoWrap;
import org.lidoSchema.LidoWrapDocument.LidoWrap.Lido;
import org.moosbusch.museum.document.XmlDocument;
import org.moosbusch.museum.lido.inject.impl.LIDOObjectFactory;

/**
 *
 * @author moosbusch
 */
public interface Document<T extends LIDOObjectFactory>
    extends XmlDocument<LidoWrapDocument, T, LidoWrap, Lido> {
    
    public static final String LIDO_NS_URI = "http://www.lido-schema.org";
    public static final String LIDO_NS_PREFIX = "lido";
    public static final String LIDO_SCHEMA_LOCATION =
            "http://www.lido-schema.org http://www.lido-schema.org/schema/v1.0/lido-v1.0.xsd";
}
