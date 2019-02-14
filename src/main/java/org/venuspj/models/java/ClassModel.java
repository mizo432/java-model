package org.venuspj.models.java;

import org.venuspj.models.fundamentals.Name;

interface ClassModel {
	Name getName();
	AnnotationsModel getAnnotations();
	MethodsModel getMethods();
	FieldsModel getFields();
	PropertiesModel getProperties();
	FunctionsModel getFunctions();

}