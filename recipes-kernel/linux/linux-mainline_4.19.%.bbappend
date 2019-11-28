FILESEXTRAPATHS_append := ":${THISDIR}/${PN}"
SRC_URI_append_nanopi-neo-core += "\
    file://defconfig \
    file://0001-nanopi-neo-nanopi-neo-core.patch \
    file://0002-enable-mmc2.patch \
    file://0003-enable-usb1-usb2.patch \
    file://0004-enable-i2c0.patch \
    file://0005-add-pcf8563.patch \
    file://0006-add-cpu-supply-for-nanopi.patch \
    file://0007-add-912MHz-for-h3.patch \
    file://0009-dt-bindings-update-the-Allwinner-GPADC-device-tree-b.patch \
    file://0011-iio-adc-sun4i-gpadc-iio-rename-A33-specified-registe.patch \
    file://0012-general-h6-new-opp-table.patch \
    file://0012-iio-adc-sun4i-gpadc-iio-rework-sampling-start-end-co.patch \
    file://0013-iio-adc-sun4i-gpadc-iio-rework-support-clocks-and-re.patch \
    file://0014-iio-adc-sun4i-gpadc-iio-rework-support-multible-sens.patch \
    file://0015-iio-adc-sun4i-gpadc-iio-rework-support-nvmem-calibra.patch \
    file://0016-iio-adc-sun4i-gpadc-iio-rework-add-interrupt-support.patch \
    file://0017-iio-adc-sun4i-gpadc-iio-add-support-for-H3-thermal-s.patch \
    file://0020-arm-dts-sun8i-h3-add-support-for-the-thermal-sensor-.patch \
    file://0021-arm-dts-sun8i-h3-add-thermal-zone-to-H3.patch \
    file://0027-iio-adc-sun4i-gpadc-iio-add-support-for-H5-thermal-s.patch \
    file://0030-arm64-dts-allwinner-h5-add-support-for-the-thermal-s.patch \
    file://ths-49-add-h5-cpu-opp-table.patch.disabled \
    file://ths-50-add-h5-opp-table-to-cpu.patch.disabled \
"
