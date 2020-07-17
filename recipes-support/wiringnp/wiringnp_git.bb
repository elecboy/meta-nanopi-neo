# This is a GPIO access library for NanoPi. 

DESCRIPTION = "This is a GPIO access library for NanoPi."
HOMEPAGE = "https://github.com/friendlyarm/WiringNP"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"
SECTION = "libs"

PV = "1.0+git${SRCPV}"

SRC_URI = "\
          git://github.com/friendlyarm/WiringNP.git;protocol=https \
          file://0001-yocto-build.patch \
          file://0002-fix-sys-info.patch \
          file://sys_info \
          file://sudo_gpio \
"
SRCREV = "78f7feeae3989aaae6114ee3f7609c21debcd80f"

S="${WORKDIR}/git"

do_compile() {
     cd ${S}/devLib
     make
     ln -sf libwiringPiDev.so.2.0 libwiringPiDev.so
     
     cd ${S}/wiringPi
     make
     ln -sf libwiringPi.so.2.0 libwiringPi.so
     
     cd ${S}/gpio
     make
}

do_install() {
     install -m 0755 -d ${D}${libdir}
     install -m 0755 ${S}/devLib/libwiringPiDev.so.2.0 ${D}${libdir}
     ln -sf libwiringPiDev.so.2.0 ${D}${libdir}/libwiringPiDev.so

     install -m 0755 ${S}/wiringPi/libwiringPi.so.2.0 ${D}${libdir}
     ln -sf libwiringPi.so.2.0 ${D}${libdir}/libwiringPi.so
     
     install -m 0755 -d ${D}${bindir}
     install -m 0755 ${S}/gpio/gpio ${D}${bindir}
     
     install -m 0644 -D ${WORKDIR}/sys_info ${D}${sysconfdir}/sys_info
     install -m 0600 -D ${WORKDIR}/sudo_gpio ${D}${sysconfdir}/sudoers.d/gpio

}

#PACKAGES = "${PN}"
#FILES_${PN} = "/"
FILES_${PN}-dbg = "${bindir}/.debug ${libdir}/.debug ${libdir}/*.so"