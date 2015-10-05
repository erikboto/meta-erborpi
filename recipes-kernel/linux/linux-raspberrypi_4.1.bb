LINUX_VERSION ?= "4.1"

SRCREV = "d2b2388d05d8a97b0ba14fcf2b71f19f66bc4d02"
SRC_URI = "git://github.com/raspberrypi/linux.git;protocol=git;branch=rpi-4.1.y \
          "

require recipes-kernel/linux/linux-raspberrypi.inc

do_install_prepend() {
    if [ -n "${KERNEL_DEVICETREE}" ]; then
          mkdir -p ${B}/arch/${ARCH}/boot/dts/overlays
    fi
}

