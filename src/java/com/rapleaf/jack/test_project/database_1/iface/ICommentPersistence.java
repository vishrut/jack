
/**
 * Autogenerated by Jack
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.rapleaf.jack.test_project.database_1.iface;

import com.rapleaf.jack.test_project.database_1.models.Comment;
import com.rapleaf.jack.test_project.database_1.query.CommentQuery;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

import com.rapleaf.jack.IModelPersistence;

public interface ICommentPersistence extends IModelPersistence<Comment> {
  public Comment create(final String content, final int commenter_id, final long commented_on_id, final long created_at) throws IOException;
  public Comment create(final int commenter_id, final long commented_on_id, final long created_at) throws IOException;

  public Comment createDefaultInstance() throws IOException;
  public Set<Comment> findByContent(String value)  throws IOException;
  public Set<Comment> findByCommenterId(int value)  throws IOException;
  public Set<Comment> findByCommentedOnId(long value)  throws IOException;
  public Set<Comment> findByCreatedAt(long value)  throws IOException;

  public CommentQuery query();
}
