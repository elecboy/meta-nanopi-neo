SUMMARY = "RTL8821CU kernel driver (wifi 2.4G/5.8G + bluetooth)"
DESCRIPTION = "RTL8821CU kernel driver"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

PV = "1.0-git"
SRCREV = "5c510c9f14352fed4906a10921040b9e46b58346"
SRC_URI = "git://github.com/brektrou/rtl8821CU.git;protocol=https \
            file://0001-build-for-armhf.patch \
            file://8821cu.conf \
           "

S = "${WORKDIR}/git"

DEPENDS = "virtual/kernel bc-native"

inherit module

EXTRA_OEMAKE  = "ARCH=${ARCH} \
                 KSRC=${STAGING_KERNEL_BUILDDIR} \
                "

do_compile () {
    oe_runmake
}

do_install () {
    install -d ${D}/lib/modules/${KERNEL_VERSION}
    install -m 0755 ${B}/8821cu.ko ${D}/lib/modules/${KERNEL_VERSION}/8821cu.ko

    install -d ${D}${sysconfdir}/modprobe.d
    echo "blacklist rtl8xxxu" > ${D}${sysconfdir}/modprobe.d/rtl8821cu-blacklist.conf
    install -m 0644 ${WORKDIR}/8821cu.conf ${D}${sysconfdir}/modprobe.d/
}

FILES_${PN} += "${sysconfdir}"
