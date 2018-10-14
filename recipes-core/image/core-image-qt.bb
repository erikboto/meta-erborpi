DESCRIPTION = "Extend core-image by adding Qt5"

inherit core-image populate_sdk_qt5

IMAGE_FEATURES += "package-management ssh-server-openssh tools-debug"

# Add 1 GB of rootfs size
IMAGE_ROOTFS_EXTRA_SPACE = "1048576"

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
    qtserialport \
    qtquickcontrols \
    qtmqtt \
    qtimageformats \
    qtxmlpatterns \
    qtwebsockets \
    qtsensors \
    qtlocation \
    qtquickcontrols2 \
    qt3d \
    liberation-fonts \
"

# Example application
IMAGE_INSTALL += " touchpoints "
