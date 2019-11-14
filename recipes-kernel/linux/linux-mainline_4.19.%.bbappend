FILESEXTRAPATHS_append := ":${THISDIR}/${PN}"
SRC_URI += "\
    file://defconfig \
    file://0001-nanopi-neo-nanopi-neo-core.patch \
    file://0002-enable-mmc2.patch \
"
