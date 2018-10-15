DESCRIPTION = "QmlLive Module Target Runtime "

require recipes-qt/qt5/qt5.inc
require recipes-qt/qt5/qt5-git.inc

DEPENDS = "qtbase qtdeclarative"

LICENSE = "GPL-3.0 | The-Qt-Company-Commercial"
LIC_FILES_CHKSUM = "file://LICENSE.GPL3;md5=75cd0dbc6f2d24e7eeb128ff59b74f4c"

QT_GIT_PROJECT = "qt-apps"
SRCREV = "a239d45ce6e185eb0a3b5e947698a8f08e783189"
PV = "5.11+git${SRCPV}"

EXTRA_QMAKEVARS_PRE += "CONFIG+=skip-tests CONFIG+=skip-examples"
EXTRA_QMAKEVARS_POST += "QMAKE_RPATHDIR="

do_install_append() {
    rm -rf ${D}/${bindir}/qmllivebench
    rm -rf ${D}//usr/libexec
}
