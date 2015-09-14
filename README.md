grails-material-design-iconic-font [![Build Status](https://travis-ci.org/donbeave/grails-material-design-iconic-font.svg)](https://travis-ci.org/donbeave/grails-material-design-iconic-font)
=============================

Provides the Material Design Iconic Font as a [Asset-Pipeline](http://grails.org/plugin/asset-pipeline) or [Grails resource](http://grails.org/plugin/resources).

## Summary
[Material Design Iconic Font and CSS toolkit](https://github.com/zavoloklom/material-design-iconic-font) is a full suite of official material design icons and community icons for easy scalable vector graphics on websites or desktop.

Installation
------------

In `BuildConfig.groovy`, add the dependency to "plugins" section:

```groovy
plugins {
    //...
    runtime ':material-design-iconic-font:1.1.1.1'
    //...
}
```

Change the version to reflect the actual version you would like to use.

## Usage

## Including the resources with Asset-Pipeline plugin

The recommended way is to use the [asset-pipeline plugin](http://grails.org/plugin/asset-pipeline) (minimal 0.1.7). It is
the default since Grails 2.4.0 and replaces the resources plugin.

To include material-design-iconic-font resources add the following to your application's css.

Stylesheet `grails-app/assets/javascripts/application.css`:
```css
/*
*= require material-design-iconic-font
*/
```

#### LESS Support

In you LESS stylesheet file just add following code at the top:

```less
@import 'material-design-iconic-font';
```

## Resources plugin

With Grails version 2.3.8 and later, you should set compile ":resources:1.2.8" rather than runtime ":resources:1.2.8" in BuildConfig.groovy in order to avoid an exception.

* Reference the material-design-iconic-font resource from within your ApplicationResources file or directly in a gsp page/layout
Example

```groovy
// ApplicationResources.groovy
customRe {
    dependsOn 'material-design-iconic-font'

    // ...
}
```

#### Usage in Grails Resources support

A font-awesome resource depends on `material-design-iconic-font-css` or `material-design-iconic-font-less` (if less plugin installed).

Declare bootstrap resource module in GSP page header:
```gsp
<r:require modules="material-design-iconic-font"/>
```

#### Usage in GSP page with Resource support
```gsp
<html>
    <head>
        <meta name="layout" content="main"/>
        <r:require modules="material-design-iconic-font"/>
    </head>
<body>
    <h1> Hello World </h1>
</body>
</html>
```

## Icons usage
You can include an icon in your HTML using the appropriate css class. See the [Material Design Iconic Font](http://zavoloklom.github.io/material-design-iconic-font/icons.html) for a list of the icons and their corresponding class names.

Example

```html
<i class="zmdi zmdi-apple"></i>
```

Copyright and License
===

material-design-iconic-font plugin:

Copyright 2015 [Alexey Zhokhov][zhokhov] under the [Apache License, Version 2.0](LICENSE).

Material Design Iconic Font files:

```
http://zavoloklom.github.io/material-design-iconic-font/license.html (Font: SIL OFL 1.1, CSS: MIT License)
```

[zhokhov]: http://www.zhokhov.com
