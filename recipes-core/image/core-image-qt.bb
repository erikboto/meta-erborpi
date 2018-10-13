DESCRIPTION = "Extend core-image by adding Qt5"

inherit core-image populate_sdk_qt5

IMAGE_FEATURES += "package-management ssh-server-openssh tools-debug"

# System tools
IMAGE_INSTALL += " \
    systemd-analyze \
    network-config \
    openssh-sftp-server \
"

IMAGE_INSTALL += " \
    wiringpi \
    rpi-gpio \
"

# Qt Packages
IMAGE_INSTALL += " \
    qtbase \
    qtbase-plugins \
    qtdeclarative \
    qtdeclarative-tools \
    qtmultimedia \
    qtwebengine \
    qtsvg \
    liberation-fonts \
"

# Example application
IMAGE_INSTALL += " touchpoints "
