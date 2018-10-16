DESCRIPTION = "Network configuration files"
LICENSE = "MIT"
SRC_URI = " \
    file://20-eth0.network \
    file://25-wlan0.network \
    file://wpa_supplicant-wlan0.conf \
"
LIC_FILES_CHKSUM = "file://20-eth0.network;md5=c8b3bdd8ab8bf2b8690f755bf581d199"
S = "${WORKDIR}"

QTIPI_SSID = "example-ssid"
QTIPI_PASSKEY = "example-passkey"

do_configure[noexec] = "1"
do_compile[noexec] = "1"
do_install() {
    install -Dm0644 ${WORKDIR}/20-eth0.network ${D}/lib/systemd/network/20-eth0.network
    install -m0644 ${WORKDIR}/25-wlan0.network ${D}/lib/systemd/network/25-wlan0.network
    install -Dm0644 ${WORKDIR}/wpa_supplicant-wlan0.conf ${D}/etc/wpa_supplicant/wpa_supplicant-wlan0.conf
    sed 's,####SSID####,${QTIPI_SSID},' -i ${D}/etc/wpa_supplicant/wpa_supplicant-wlan0.conf
    sed 's,####PASSKEY####,${QTIPI_PASSKEY},' -i ${D}/etc/wpa_supplicant/wpa_supplicant-wlan0.conf

    install -d ${D}/${systemd_unitdir}/system/multi-user.target.wants/
    ln -sf /lib/systemd/system/wpa_supplicant@.service ${D}/${systemd_unitdir}/system/multi-user.target.wants/wpa_supplicant@wlan0.service
}

FILES_${PN} = " \
    /lib/systemd/* \
    /etc/wpa_supplicant/* \
"
