/*

 *
 */
package org.moosbusch.museum.lido.document;

import org.lidoSchema.LidoWrapDocument;
import org.lidoSchema.LidoWrapDocument.LidoWrap;
import org.lidoSchema.LidoWrapDocument.LidoWrap.Lido;
import org.moosbusch.museum.document.MuseumXmlDocument;
import org.moosbusch.museum.lido.inject.impl.LIDOObjectFactory;

/**
 *
 * @author moosbusch
 */
public interface Document<T extends LIDOObjectFactory>
    extends MuseumXmlDocument<LidoWrapDocument, T, LidoWrap, Lido> {
}
