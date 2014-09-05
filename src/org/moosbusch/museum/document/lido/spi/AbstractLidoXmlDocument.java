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
package org.moosbusch.museum.document.lido.spi;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import org.apache.xmlbeans.XmlException;
import org.lidoSchema.LidoWrapDocument;
import org.lidoSchema.LidoWrapDocument.LidoWrap;
import org.lidoSchema.LidoWrapDocument.LidoWrap.Lido;
import org.moosbusch.museum.document.spi.AbstractMuseumXmlDocument;
import org.moosbusch.museum.document.lido.LidoXmlDocument;
import org.moosbusch.museum.document.spi.AbstractMuseumXmlDocument;
import org.moosbusch.museum.inject.lido.impl.DefaultLidoObjectFactory;

/**
 *
 * @author moosbusch
 */
public abstract class AbstractLidoXmlDocument<T extends DefaultLidoObjectFactory>
        extends AbstractMuseumXmlDocument<LidoWrapDocument,T, LidoWrap,
        Lido> implements LidoXmlDocument<T> {

    public AbstractLidoXmlDocument() {
    }

    public AbstractLidoXmlDocument(InputStream in)
            throws IOException, XmlException {
        super(in);
    }

    protected abstract void addSchemaLocation(LidoWrapDocument lidoWrapDocument);

    @Override
    public LidoWrap getRootElement() {
        return getRootWrapperElement().getLidoWrap();
    }

    @Override
    public Collection<Lido> getRecords() {
        return getRootWrapperElement().getLidoWrap().getLidoList();
    }
}
