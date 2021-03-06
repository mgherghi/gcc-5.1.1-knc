/* ObjectValue.java -- JDWP wrapper class for an Object value
   Copyright (C) 2007 Free Software Foundation

This file is part of GNU Classpath.

GNU Classpath is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

GNU Classpath is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with GNU Classpath; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */

package gnu.classpath.jdwp.value;

import gnu.classpath.jdwp.JdwpConstants;
import gnu.classpath.jdwp.VMIdManager;
import gnu.classpath.jdwp.id.ObjectId;

import java.io.DataOutputStream;
import java.io.IOException;

/**
 * Wrapper for an Array value.
 *
 * @author Kyle Galloway <kgallowa@redhat.com>
 */
public class ArrayValue
    extends Value
{
  // The Array wrapped by this class represented as a Object
  Object _value;

  /**
   * Create a new ArrayValue from an Object
   *
   * @param value the Object to wrap
   */
  public ArrayValue(Object value)
  {
    super(JdwpConstants.Tag.ARRAY);
    _value = value;
  }

  /**
   * Return an object representing this type
   *
   * @return an Object represntation of this value
   */
  @Override
  protected Object getObject()
  {
    return _value;
  }

  /**
   * Write the wrapped object to the given DataOutputStream.
   *
   * @param os the output stream to write to
   */
  @Override
  protected void write(DataOutputStream os)
    throws IOException
  {
    ObjectId oid = VMIdManager.getDefault().getObjectId(_value);
    oid.write(os);
  }
}
