package com.example.query;

import com.example.GeneralDescriptor;
import io.ebean.EbeanServer;
import io.ebean.typequery.PArray;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PJson;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;
import java.lang.String;

/**
 * Query bean for GeneralDescriptor.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QGeneralDescriptor extends TQRootBean<GeneralDescriptor,QGeneralDescriptor> {

  private static final QGeneralDescriptor _alias = new QGeneralDescriptor(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QGeneralDescriptor alias() {
    return _alias;
  }

  public PInteger<QGeneralDescriptor> optimisticVersion;
  public PLong<QGeneralDescriptor> id;
  public PString<QGeneralDescriptor> type;
  public PString<QGeneralDescriptor> severity;
  public PString<QGeneralDescriptor> providerHttpLocation;
  public PString<QGeneralDescriptor> jsonPath;
  public PArray<QGeneralDescriptor,String> argsJsonPaths;
  public PJson<QGeneralDescriptor> request;


  /**
   * Construct with a given EbeanServer.
   */
  public QGeneralDescriptor(EbeanServer server) {
    super(GeneralDescriptor.class, server);
  }

  /**
   * Construct using the default EbeanServer.
   */
  public QGeneralDescriptor() {
    super(GeneralDescriptor.class);
  }

  /**
   * Construct for Alias.
   */
  private QGeneralDescriptor(boolean dummy) {
    super(dummy);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PInteger<QGeneralDescriptor> optimisticVersion = _alias.optimisticVersion;
    public static PLong<QGeneralDescriptor> id = _alias.id;
    public static PString<QGeneralDescriptor> type = _alias.type;
    public static PString<QGeneralDescriptor> severity = _alias.severity;
    public static PString<QGeneralDescriptor> providerHttpLocation = _alias.providerHttpLocation;
    public static PString<QGeneralDescriptor> jsonPath = _alias.jsonPath;
    public static PArray<QGeneralDescriptor,String> argsJsonPaths = _alias.argsJsonPaths;
    public static PJson<QGeneralDescriptor> request = _alias.request;
  }
}
