DESCRIPTION = "MultiTouch Test app"
LICENSE = "LGPLv2.1"

inherit systemd

SRC_URI = " \
	file://touchpoints.qml \
	file://touchpoints.service \
	"

S = "${WORKDIR}"
LIC_FILES_CHKSUM = "file://touchpoints.qml;md5=a74e4a71b3df70526e8cf28a9e53e637"
do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
	install -Dm0644 ${WORKDIR}/touchpoints.qml ${D}/opt/example/touchpoints.qml
	install -Dm0644 ${WORKDIR}/touchpoints.service ${D}/${systemd_unitdir}/system/touchpoints.service
}

FILES_${PN} += " \
	/opt/example/ \
	/lib/systemd/ \
	"

RDEPENDS_${PN} += "qtdeclarative-tools"
