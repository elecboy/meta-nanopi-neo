SUMMARY = "RTL8723DU kernel driver (wifi + bluetooth)"
DESCRIPTION = "RTL8723DU kernel driver"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

PV = "1.0-git"
SRCREV = "29839855beb3b9bcf9c15adfca9c2774704f6b2b"
SRC_URI = "git://github.com/lwfinger/rtl8723du.git;protocol=https \
            0001-force-CFLAGS-Wno-date-time.patch \
           "

S = "${WORKDIR}/git"

DEPENDS = "virtual/kernel"

inherit module

EXTRA_OEMAKE  = "ARCH=${ARCH} \
                 KSRC=${STAGING_KERNEL_BUILDDIR} \
                 USER_EXTRA_CFLAGS='-DCONFIG_IOCTL_CFG80211 -DRTW_USE_CFG80211_STA_EVENT' \
                "

do_compile () {
    oe_runmake
}

do_install () {
    install -d ${D}/lib/modules/${KERNEL_VERSION}
    install -m 0755 ${B}/8723du.ko ${D}/lib/modules/${KERNEL_VERSION}/8723du.ko

    install -d ${D}${sysconfdir}/modprobe.d
    echo "blacklist rtl8xxxu" > ${D}${sysconfdir}/modprobe.d/rtl8723du-blacklist.conf
}

FILES_${PN} += "${sysconfdir}"
