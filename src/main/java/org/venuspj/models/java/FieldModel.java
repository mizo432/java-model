package org.venuspj.models.java;

import org.venuspj.models.fundamentals.Comment;
import org.venuspj.models.fundamentals.Name;

public interface FieldModel {

  Comment getComment();

  ClassModel getFieldType();

  Name getName();

  AnnotationsModel annotations();

}
