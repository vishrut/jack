package com.rapleaf.jack.queries.where_operators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class WhereOperator<V> implements IWhereOperator<V> {

  protected final List<V> parameters;
  protected String sqlStatement;

  protected WhereOperator(String sqlStatement) {
    this.sqlStatement = sqlStatement;
    this.parameters = new ArrayList<V>();
  }

  protected WhereOperator(String sqlStatement, V parameter) {
    this.sqlStatement = sqlStatement;
    this.parameters = new ArrayList<V>();
    this.parameters.add(parameter);
    ensureNoNullParameter();
  }

  protected WhereOperator(String sqlStatement, V param1, V param2) {
    this.sqlStatement = sqlStatement;
    this.parameters = new ArrayList<V>();
    this.parameters.add(param1);
    this.parameters.add(param2);
    ensureNoNullParameter();
  }

  protected WhereOperator(String sqlStatement, V param1, V... otherParam) {
    this.sqlStatement = sqlStatement;
    this.parameters = new ArrayList<V>();
    this.parameters.add(param1);
    Collections.addAll(this.parameters, otherParam);
    ensureNoNullParameter();
  }

  protected WhereOperator(String sqlStatement, Collection<V> collection) {
    this.sqlStatement = sqlStatement;
    this.parameters = new ArrayList<V>(collection);
    ensureNoNullParameter();
  }

  @Override
  public List<V> getParameters() {
    return parameters;
  }

  @Override
  public String getSqlStatement() {
    return sqlStatement;
  }

  void ensureNoNullParameter() {
    for (V parameter : parameters) {
      if (parameter == null) {
        throw new IllegalArgumentException("You cannot pass null parameters.");
      }
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    WhereOperator that = (WhereOperator)o;

    return parameters.equals(that.parameters);
  }

  @Override
  public int hashCode() {
    return parameters.hashCode();
  }
}
