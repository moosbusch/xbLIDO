/*

 *
 */
package org.moosbusch.museum.lido.document.spi;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import org.apache.xmlbeans.XmlException;
import org.lidoSchema.LidoWrapDocument;
import org.lidoSchema.LidoWrapDocument.LidoWrap;
import org.lidoSchema.LidoWrapDocument.LidoWrap.Lido;
import org.moosbusch.museum.document.spi.AbstractMuseumXmlDocument;
import org.moosbusch.museum.lido.document.Document;
import org.moosbusch.museum.lido.inject.impl.LIDOObjectFactory;

/**
 *
 * @author moosbusch
 */
public abstract class AbstractDocument<T extends LIDOObjectFactory>
        extends AbstractMuseumXmlDocument<LidoWrapDocument,T, LidoWrap,
        Lido> implements Document<T> {

    public AbstractDocument() {
    }

    public AbstractDocument(InputStream in)
            throws IOException, XmlException {
        super(in);
    }

    protected abstract void addSchemaLocation(LidoWrapDocument lidoWrapDocument);

    @Override
    public LidoWrap getRootElement() {
        return getRootWrapperElement().getLidoWrap();
    }

    @Override
    public Collection<Lido> getItems() {
        return getRootWrapperElement().getLidoWrap().getLidoList();
    }
}
