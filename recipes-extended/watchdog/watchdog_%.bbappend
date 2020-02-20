do_install_append() {
    install -d ${D}${sysconfdir}/systemd/system/multi-user.target.wants
    ln -sf /lib/systemd/system/watchdog.service ${D}${sysconfdir}/systemd/system/multi-user.target.wants/watchdog.service
}
