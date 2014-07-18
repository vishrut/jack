
/**
 * Autogenerated by Jack
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.rapleaf.jack.test_project.database_1.iface;

import com.rapleaf.jack.test_project.database_1.models.User;
import com.rapleaf.jack.test_project.database_1.query.UserQuery;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

import com.rapleaf.jack.IModelPersistence;

public interface IUserPersistence extends IModelPersistence<User> {
  public User create(final String handle, final Long created_at_millis, final int num_posts, final Long some_date, final Long some_datetime, final String bio, final byte[] some_binary, final Double some_float, final Double some_decimal, final Boolean some_boolean) throws IOException;
  public User create(final String handle, final int num_posts) throws IOException;

  public User createDefaultInstance() throws IOException;
  public Set<User> findByHandle(String value)  throws IOException;
  public Set<User> findByCreatedAtMillis(Long value)  throws IOException;
  public Set<User> findByNumPosts(int value)  throws IOException;
  public Set<User> findBySomeDate(Long value)  throws IOException;
  public Set<User> findBySomeDatetime(Long value)  throws IOException;
  public Set<User> findByBio(String value)  throws IOException;
  public Set<User> findBySomeBinary(byte[] value)  throws IOException;
  public Set<User> findBySomeFloat(Double value)  throws IOException;
  public Set<User> findBySomeDecimal(Double value)  throws IOException;
  public Set<User> findBySomeBoolean(Boolean value)  throws IOException;

  public UserQuery query();
}
