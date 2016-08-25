COMPATIBLE_MACHINE = "(raspberrypi3|raspberrypi2|raspberrypi)"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI_append = " \
	file://0001-fix-rasp-build.patch \
	file://0002-fix-rasp-build-eglfs.patch \
"

PACKAGECONFIG = " \
    ${PACKAGECONFIG_RELEASE} \
    ${PACKAGECONFIG_DEFAULT} \
    ${PACKAGECONFIG_OPENSSL} \
    ${PACKAGECONFIG_GL} \
    ${PACKAGECONFIG_FB} \
    ${PACKAGECONFIG_X11} \
    ${PACKAGECONFIG_FONTS} \
    ${PACKAGECONFIG_SYSTEM} \
    ${PACKAGECONFIG_MULTIMEDIA} \
    ${PACKAGECONFIG_DISTRO} \
    gles2 icu alsa eglfs \
"

EXTRA_OECONF += "'-I${STAGING_DIR_TARGET}/usr/include/interface/vcos/pthreads/' \
                 '-I${STAGING_DIR_TARGET}/usr/include/interface/vmcs_host/linux/'" 
