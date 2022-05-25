/*
 * Copyright (c) 2021 BSI Business Systems Integration AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Distribution License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/org/documents/edl-v10.html
 *
 * Contributors:
 *     BSI Business Systems Integration AG - initial API and implementation
 */
package org.eclipse.scout.docs.snippets.person;

import java.math.BigDecimal;
import java.util.Date;

import javax.annotation.Generated;

import org.eclipse.scout.rt.platform.classid.ClassId;
import org.eclipse.scout.rt.platform.extension.Extends;
import org.eclipse.scout.rt.shared.data.form.fields.AbstractFormFieldData;
import org.eclipse.scout.rt.shared.data.form.fields.AbstractValueFieldData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
// tag::PersonFormMainBoxExtensionData[]
@Extends(PersonFormData.class)
@Generated(value = "org.eclipse.scout.docs.snippets.person.PersonFormMainBoxExtension", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class PersonFormMainBoxExtensionData extends AbstractFormFieldData {
  private static final long serialVersionUID = 1L;

  public Birthday getBirthday() {
    return getFieldByClass(Birthday.class);
  }

  public Salary getSalary() {
    return getFieldByClass(Salary.class);
  }

  @ClassId("478037fb-759f-4fa1-b737-c77f903c6881-formdata")
  public static class Birthday extends AbstractValueFieldData<Date> {
    private static final long serialVersionUID = 1L;
  }

  @ClassId("fda7cd67-0df1-4194-9d70-22a9b3ce890d-formdata")
  public static class Salary extends AbstractValueFieldData<BigDecimal> {
    private static final long serialVersionUID = 1L;
  }
}
// end::PersonFormMainBoxExtensionData[]
