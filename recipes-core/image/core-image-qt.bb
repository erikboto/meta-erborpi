DESCRIPTION = "Extend core-image by adding Qt5"

inherit core-image populate_sdk_qt5

IMAGE_FEATURES += "package-management ssh-server-dropbear tools-debug"

# Qt Packages
IMAGE_INSTALL += " \
    qtbase \
    qtbase-plugins \
    qtbase-fonts \
    qtdeclarative \
    qtdeclarative-plugins \
    qtdeclarative-qmlplugins \
    qtdeclarative-tools \
    qtmultimedia \
    qtmultimedia-plugins \
    qtmultimedia-qmlplugins \
    qtwebkit \
    qtwebkit-qmlplugins \
    qtsvg \
    qtsvg-plugins \
    "

# Example application
IMAGE_INSTALL += " touchpoints "
