/*
 * Copyright 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.template.soy.shared.restricted;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation that contains a list of {@code Signature}. Soy functions/plugins can use this
 * annotation to get additional type check for the arguments and return types.
 *
 * <p>TODO(b/71386491): Add some examples for external usages.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface SoyFunctionSignature {
  /** The Name of the function. Should be a Soy identifier. */
  String name();

  /**
   * The different signatures that this function supports. There should only be one signature for
   * any number of arguments.
   */
  Signature[] value();
}
