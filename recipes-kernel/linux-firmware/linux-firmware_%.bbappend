FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://brcmfmac43430-sdio.txt \
	    file://brcmfmac43430-sdio.bin \
	    "

do_install_append() {
	install -D -m 0644 ${WORKDIR}/brcmfmac43430-sdio.txt ${D}/lib/firmware/brcm/brcmfmac43430-sdio.txt
	install -D -m 0644 ${WORKDIR}/brcmfmac43430-sdio.bin ${D}/lib/firmware/brcm/brcmfmac43430-sdio.bin
}

FILES_${PN}-bcm43430 += " \
  /lib/firmware/brcm/brcmfmac43430-sdio.txt \
"
FILES_${PN}-rtl8723 += " \
  ${nonarch_base_libdir}/firmware/rtl_bt/rtl8723*.bin \
"
FILES_${PN}-rtl8821 += " \
  ${nonarch_base_libdir}/firmware/rtl_bt/rtl8821*.bin \
"
