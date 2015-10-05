
do_deploy_append() {
    echo 'dtoverlay=rpi-ft5406' >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
}
