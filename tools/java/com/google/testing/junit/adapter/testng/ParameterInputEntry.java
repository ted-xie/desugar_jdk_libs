/*
 * Copyright (c) 2021 Google LLC
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Google designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Google in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package com.google.testing.junit.adapter.testng;

import com.google.auto.value.AutoValue;

/** Describes an entry that can be passed into an method as a parameter input. */
@AutoValue
abstract class ParameterInputEntry {

  abstract DatasetEntry<Object[]> datasetEntry();

  static ParameterInputEntry create(ParameterizedMemberTag tag, Object[] payload) {
    return new AutoValue_ParameterInputEntry(DatasetEntry.create(tag, payload));
  }

  public ParameterizedMemberTag tag() {
    return datasetEntry().tag();
  }

  public Object[] payload() {
    return datasetEntry().payload();
  }

  @Override
  public String toString() {
    return datasetEntry().toString();
  }
}
