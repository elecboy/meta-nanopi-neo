do_install_append() {
    ln -sf /lib/systemd/system/watchdog.service ${D}${sysconfdir}/systemd/system/multi-user.target.wants/watchdog.service
}
