package com.example.query.assoc;

import com.example.GeneralDescriptor;
import com.example.query.QGeneralDescriptor;
import io.ebean.typequery.PArray;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PJson;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;
import java.lang.String;

/**
 * Association query bean for AssocGeneralDescriptor.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QAssocGeneralDescriptor<R> extends TQAssocBean<GeneralDescriptor,R> {

  public PInteger<R> optimisticVersion;
  public PLong<R> id;
  public PString<R> type;
  public PString<R> severity;
  public PString<R> providerHttpLocation;
  public PString<R> jsonPath;
  public PArray<R,String> argsJsonPaths;
  public PJson<R> request;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetch(TQProperty<QGeneralDescriptor>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs
  public final R fetchQuery(TQProperty<QGeneralDescriptor>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetchLazy(TQProperty<QGeneralDescriptor>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocGeneralDescriptor(String name, R root) {
    super(name, root);
  }
}
