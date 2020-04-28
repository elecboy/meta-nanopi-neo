SUMMARY = "nrf52 HCI UART btattch bind service"
DESCRIPTION = "use nrf52 hci uart device, need btattach bind service."
SECTION = "base"
PR = "r1"

inherit systemd

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

DEPENDS = "bluez5"

SRC_URI = "\
    file://nrf52-btattach-hci-uart@.service \
"

S = "${WORKDIR}"

do_install() {
    install -m 0644 -D ${WORKDIR}/nrf52-btattach-hci-uart@.service ${D}${systemd_unitdir}/system/nrf52-btattach-hci-uart@.service
    mkdir -p ${D}${sysconfdir}/systemd/system/multi-user.target.wants
    ln -sf /lib/systemd/system/nrf52-btattach-hci-uart@.service ${D}${sysconfdir}/systemd/system/multi-user.target.wants/nrf52-btattach-hci-uart@platform-1c1d400.usb-usb-0:1:1.0-port0.service
}

SYSTEMD_SERVICE_${PN} = "nrf52-btattach-hci-uart@.service"

PACKAGES = "${PN}"
FILES_${PN} = "/"
