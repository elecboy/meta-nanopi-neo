FILESEXTRAPATHS_append := ":${THISDIR}/${PN}"
SRC_URI += "\
    file://defconfig \
    file://0001-nanopi-neo-nanopi-neo-core.patch \
    file://0002-enable-mmc2.patch \
    file://0003-enable-usb1-usb2.patch \
    file://0004-enable-i2c0.patch \
    file://0005-add-pcf8563.patch \
"