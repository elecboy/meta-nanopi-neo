FILESEXTRAPATHS_append := ":${THISDIR}/${PN}"
SRC_URI += "\
    file://defconfig \
    file://0001-nanopi-neo-nanopi-neo-core.patch \
    file://0002-enable-mmc2.patch \
    file://0003-enable-usb1-usb2.patch \
    file://0004-enable-i2c0.patch \
    file://0005-add-pcf8563.patch \
    file://0006-add-cpu-supply-for-nanopi.patch \
    file://0007-add-912MHz-for-h3.patch \
    file://0008-add-thermal-for-allwinner-h3-h5-h6.patch \
    file://0009-add-ths-for-allwinner-h3.patch \
    file://0010-enable-ths-for-allwinner-h3.patch \
"
