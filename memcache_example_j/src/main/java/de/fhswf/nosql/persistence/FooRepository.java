package de.fhswf.nosql.persistence;

import de.fhswf.nosql.model.Foo;
import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.exception.MemcachedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

public class FooRepository {

  private static final Logger log = LoggerFactory.getLogger(FooRepository.class);

  private static final String SELECT_ALL_FOOS = "SELECT * FROM FOO";
  private static final String SELECT_FOO = "SELECT * FROM FOO WHERE id = ?";

  private final Connection mySqlConnection;
  private final MemcachedClient memcachedClient;

  public FooRepository(Connection mySqlConnection, MemcachedClient memcachedClient) {
    this.mySqlConnection = mySqlConnection;
    this.memcachedClient = memcachedClient;
  }

  public List<Foo> selectAllFoos() {
    List<Foo> foos = new ArrayList<>();

    // TODO: Hier ist Platz für Ihre Lösung

    return foos;
  }

  public Foo selectFooById(Long id) {
    Foo foo = null;

    // TODO: Hier ist Platz für Ihre Lösung

    return foo;
  }
}
