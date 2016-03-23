
// DO NOT EDIT THIS FILE - it is machine generated -*- c++ -*-

#ifndef __gnu_awt_xlib_XFontMetrics__
#define __gnu_awt_xlib_XFontMetrics__

#pragma interface

#include <java/awt/FontMetrics.h>
extern "Java"
{
  namespace gnu
  {
    namespace awt
    {
      namespace xlib
      {
          class XFontMetrics;
      }
    }
    namespace gcj
    {
      namespace xlib
      {
          class Font;
      }
    }
  }
  namespace java
  {
    namespace awt
    {
        class Font;
    }
  }
}

class gnu::awt::xlib::XFontMetrics : public ::java::awt::FontMetrics
{

public:
  XFontMetrics(::gnu::gcj::xlib::Font *, ::java::awt::Font *);
  virtual jint getAscent();
  virtual jint getDescent();
  virtual jint getMaxAscent();
  virtual jint getMaxDescent();
  virtual jint stringWidth(::java::lang::String *);
public: // actually package-private
  ::gnu::gcj::xlib::Font * __attribute__((aligned(__alignof__( ::java::awt::FontMetrics)))) xfont;
public:
  static ::java::lang::Class class$;
};

#endif // __gnu_awt_xlib_XFontMetrics__