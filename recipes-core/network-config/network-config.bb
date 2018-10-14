DESCRIPTION = "Network configuration files"
LICENSE = "MIT"
SRC_URI = "file://20-eth-static.network"
LIC_FILES_CHKSUM = "file://20-eth-static.network;md5=b1d47c2074f0ae69f1150caf0cbe2bf6"
S = "${WORKDIR}"

do_configure[noexec] = "1"
do_compile[noexec] = "1"
do_install() {
    install -Dm0644 ${WORKDIR}/20-eth-static.network ${D}/lib/systemd/network/20-eth-static.network
}

FILES_${PN} = "/lib/systemd/network/*"
