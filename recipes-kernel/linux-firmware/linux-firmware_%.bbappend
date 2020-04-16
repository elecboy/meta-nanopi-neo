FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://brcmfmac43430-sdio.txt \
	    file://brcmfmac43430-sdio.bin \
	    "

LICENSE_${PN}-rtl-bt = "Firmware-rtlwifi_firmware"

do_install_append() {
	install -D -m 0644 ${WORKDIR}/brcmfmac43430-sdio.txt ${D}/lib/firmware/brcm/brcmfmac43430-sdio.txt
	install -D -m 0644 ${WORKDIR}/brcmfmac43430-sdio.bin ${D}/lib/firmware/brcm/brcmfmac43430-sdio.bin
}

FILES_${PN}-bcm43430 += " \
  /lib/firmware/brcm/brcmfmac43430-sdio.txt \
"
FILES_${PN}-rtl-bt = " \
  ${nonarch_base_libdir}/firmware/rtl_bt/rtl*.bin \
"
RDEPENDS_${PN}-rtl_bt += "${PN}-rtl-license"

PACKAGES += "${PN}-rtl-bt\
			"
