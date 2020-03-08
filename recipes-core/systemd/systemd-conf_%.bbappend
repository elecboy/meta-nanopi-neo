FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://user-1000.slice \
"

FILES_${PN} += "${sysconfdir}/systemd/system/user-1000.slice "

do_install_append() {
  install -m 0644 -D ${WORKDIR}/user-1000.slice ${D}${sysconfdir}/systemd/system/user-1000.slice
}
