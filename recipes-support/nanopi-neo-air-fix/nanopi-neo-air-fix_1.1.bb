SUMMARY = "Nanopi-NEO-Air service func fix"
DESCRIPTION = "Mtsports nanopi-neo-air some fix service."
SECTION = "base"
PR = "r1"

inherit systemd

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://GPL-2;md5=94d55d512a9ba36caa9b7df079bae19f"

SRC_URI = "\
    file://nanopi-neo-air-cpufreq.service \
    file://wifi_power.sh \
    file://wifi_power_manager.service \
    file://GPL-2 \
"
SRC_URI[md5sum] = "6a028ff62f492475ba72533325da7524"

S = "${WORKDIR}"

SYSTEMD_AUTO_ENABLE_${PN} = "enable"

do_install() {
    install -m 0644 -D ${WORKDIR}/wifi_power.sh ${D}${libdir}/wifi_manager/wifi_power.sh
    install -m 0644 -D ${WORKDIR}/nanopi-neo-air-cpufreq.service ${D}${systemd_unitdir}/system/nanopi-neo-air-cpufreq.service
    install -m 0644 ${WORKDIR}/wifi_power_manager.service ${D}${systemd_unitdir}/system
    sed -i -e 's,@SBINDIR@,${sbindir},g' -e 's,@SYSCONFDIR@,${sysconfdir},g' ${D}${systemd_unitdir}/system/nanopi-neo-air-cpufreq.service
    install -m 0755 -d ${D}${sysconfdir}/systemd/system/multi-user.target.wants
    ln -sf /lib/systemd/system/nanopi-neo-air-cpufreq.service ${D}${sysconfdir}/systemd/system/multi-user.target.wants/nanopi-neo-air-cpufreq.service
    ln -sf /lib/systemd/system/wifi_power_manager.service ${D}${sysconfdir}/systemd/system/multi-user.target.wants/wifi_power_manager.service
}

SYSTEMD_SERVICE_${PN} = "nanopi-neo-air-cpufreq.service"

PACKAGES = "${PN}"
FILES_${PN} = "/"
