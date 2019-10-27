FILESEXTRAPATHS_append := ":${THISDIR}/${PN}"
SRC_URI += "\
    file://defconfig \
    file://0001-add-usb2-usb3-to-nanopi-neo-air.patch \
    file://0002-enable-emmc-and-ap6212-bluetooth-uart3.patch \
    file://0003-enable-neo-air-i2c0.patch \
    file://0004-add-cpufreq-to-neo-air.patch \
    file://0005-add-ds3231-rtc-to-nano-pi-neo-air.patch \
    file://0006-add-rx8010-rtc-to-nanopi-neo-air.patch \
    file://0007-fix-rx8010-rtc-wakeup.patch \
    file://0008-rx8010-reset-err-variable-to-account.patch \
    file://0009-enable-neo-air-uart1.patch \
    file://0010-enable-nanopi-neo-air-emac.patch \
    file://0011-add-pcf8563-rtc-to-nanopi-neo-air.patch \
    file://0012-enable-nanopi-neo-air-usb-otg.patch \
    file://0013-enable-usb-0-1-on-nanopi-neo-core.patch \
"
