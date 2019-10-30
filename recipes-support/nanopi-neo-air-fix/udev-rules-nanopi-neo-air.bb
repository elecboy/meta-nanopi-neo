DESCRIPTION = "udev rules for NanoPi Neo air Boards"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = " file://99-rtc.rules \
	    file://99-brcmfmac.rules \
	"

S = "${WORKDIR}"

do_install () {
    install -d ${D}${sysconfdir}/udev/rules.d
    install -m 0644 ${WORKDIR}/99-rtc.rules ${D}${sysconfdir}/udev/rules.d/
    install -m 0644 ${WORKDIR}/99-brcmfmac.rules ${D}${sysconfdir}/udev/rules.d/
}